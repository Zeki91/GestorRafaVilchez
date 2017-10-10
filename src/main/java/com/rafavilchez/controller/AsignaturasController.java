package com.rafavilchez.controller;

import com.rafavilchez.model.impl.Alumno;
import com.rafavilchez.model.impl.Asignatura;
import com.rafavilchez.services.AlumnoAsignaturaService;
import com.rafavilchez.services.AsignaturaService;
import com.rafavilchez.services.DescuentosAlumnosService;
import com.rafavilchez.services.ProfesorService;
import com.rafavilchez.utils.RespuestaAjax;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class AsignaturasController {

    private final static Logger logger = LoggerFactory.getLogger(AsignaturasController.class);

    @Autowired
    private AsignaturaService asignaturaService;

    @Autowired
    private ProfesorService profesorService;

    @Autowired
    private AlumnoAsignaturaService alumnoAsignaturaService;

    @Autowired
    private DescuentosAlumnosService descuentosAlumnosService;

    @RequestMapping(value = "/asignatura/listado", method = RequestMethod.GET)
    public String listaAsignaturas(Model model, HttpServletRequest request) throws Exception {

        model.addAttribute("menuItemActive", "3");

        List<Asignatura> asignaturas = asignaturaService.getAll();

        model.addAttribute("asignaturas", asignaturas);
        model.addAttribute("numAsignaturas", asignaturas.size());

        return "/asignaturas/list";
    }

    @RequestMapping(value = "/asignatura/editar", method = RequestMethod.GET)
    public String editarAsignatura(@RequestParam(value = "idAsignatura", required = false) Integer idAsignatura,
                               Model model, HttpServletRequest request) throws Exception {

        model.addAttribute("menuItemActive", "3");
        Asignatura asignatura = null;

        if(idAsignatura != null) asignatura = asignaturaService.getById(idAsignatura);

        if (asignatura != null) {
            model.addAttribute("asignatura", asignatura);
        }

        model.addAttribute("profesores", profesorService.getAll());

        return "/asignaturas/edit";
    }

    @RequestMapping(value = "/asignatura/ver", method = RequestMethod.GET)
    public String verAsignatura(@RequestParam(value = "idAsignatura", required = false) Integer idAsignatura,
                            Model model, HttpServletRequest request) throws Exception {

        model.addAttribute("menuItemActive", "3");
        Asignatura asignatura = null;

        if(idAsignatura != null) asignatura = asignaturaService.getById(idAsignatura);

        if (asignatura != null) {
            model.addAttribute("asignatura", asignatura);
        }

        return "/asignaturas/view";
    }

    @RequestMapping(value = "/asignatura/guardar", method = RequestMethod.POST)
    public String guardarAsignatura(@RequestParam (value = "nombre") String nombre,
                                  @RequestParam (value = "precio") float precio,
                                  @RequestParam (value = "profesor") int idProfesor,
                                  @RequestParam (value = "descuento", required = false) boolean descuento,
                                  @RequestParam (value = "idAsignatura") Integer idAsignatura,
                                  Model model, HttpServletRequest request) throws Exception {

        Asignatura asignatura = new Asignatura();
        float importe = 0;
        
        if (idAsignatura != null) {
            asignatura = asignaturaService.getById(idAsignatura);
            importe = asignatura.getPrecioBruto();
        }
        
        asignatura.setNombre(nombre);
        asignatura.setPrecioBruto(precio);
        asignatura.setIdProfesor(idProfesor);
        asignatura.setDescuento(descuento);

        if (idAsignatura != null) {
            asignaturaService.update(asignatura);
        } else {
            asignaturaService.insert(asignatura);
        }

        if (importe != precio) {
            alumnoAsignaturaService.marcarMatriculaModificada(asignatura.getIdAsignatura());
        }

        return "redirect:/asignatura/ver/?idAsignatura=" + asignatura.getIdAsignatura();
    }

    @RequestMapping(value = "/asignatura/desmatricular-alumnos", method = RequestMethod.POST)
    @ResponseBody
    public RespuestaAjax<Asignatura> desmatricularAlumnos(
                        @RequestParam(value = "idAsignatura", required = false) Integer idAsignatura,
                        Model model) throws Exception
    {

        RespuestaAjax<Asignatura> res = new RespuestaAjax<>();

        List<Alumno> alumnos = alumnoAsignaturaService.getAlumnosMatriculados(idAsignatura);

        for (Alumno a : alumnos) {
            alumnoAsignaturaService.desmatricularAsignatura(idAsignatura, a.getIdAlumno());
            descuentosAlumnosService.calcularDescuentos(a.getIdAlumno());
        }

        res.setObj(null);
        res.setMensaje("Cambios guardados correctamente");
        res.setTitulo("Alumnos desmatriculados");
        res.setEstado(true);

        return res;
    }
}
