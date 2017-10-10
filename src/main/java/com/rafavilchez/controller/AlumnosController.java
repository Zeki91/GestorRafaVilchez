package com.rafavilchez.controller;

import com.rafavilchez.model.impl.*;
import com.rafavilchez.services.*;
import com.rafavilchez.utils.RespuestaAjax;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class AlumnosController {

    private final static Logger logger = LoggerFactory.getLogger(AlumnosController.class);

    @Autowired private AlumnoService alumnoService;
    @Autowired private AsignaturaService asignaturaService;
    @Autowired private AlumnoAsignaturaService alumnoAsignaturaService;
    @Autowired private DescuentosAlumnosService descuentosAlumnosService;
    @Autowired private HorasExtraService horasExtraService;
    @Autowired private ReciboService reciboService;

    @RequestMapping(value = "/alumno/listado", method = RequestMethod.GET)
    public String listaAlumnos(@RequestParam(value = "result", required = false) Integer result,
                               Model model, HttpServletRequest request) throws IOException, Exception {

        model.addAttribute("menuItemActive", "1");

        List<Alumno> alumnos = alumnoService.getAll();

        model.addAttribute("alumnos", alumnos);
        model.addAttribute("numAlumnos", alumnos.size());
        model.addAttribute("asignaturas", asignaturaService.getAll());

        if (result != null) {
            if (result == 0) {
                model.addAttribute("title", "Ha ocurrido un error");
                model.addAttribute("msg", "Inténtalo de nuevo más tarde.");
            }
        }

        return "/alumnos/list";
    }

    @RequestMapping(value = "/alumno/listado", method = RequestMethod.POST)
    public String listaAlumnosFiltro(Model model, HttpServletRequest request
                                    ,@RequestParam(value = "result", required = false) Integer result
                                    ,@RequestParam(value = "filtroNombre", required = false, defaultValue = "") String filtroNombre
                                    ,@RequestParam(value = "filtroAsignatura", required = false) Integer filtroAsignatura) throws IOException {

        model.addAttribute("menuItemActive", "1");

        List<Alumno> alumnos = alumnoService.getFiltered(filtroNombre, filtroAsignatura);

        model.addAttribute("alumnos", alumnos);
        model.addAttribute("numAlumnos", alumnos.size());
        model.addAttribute("asignaturas", asignaturaService.getAll());
        model.addAttribute("nombreFiltrado", filtroNombre);
        model.addAttribute("asignaturaFiltrada", filtroAsignatura);

        if (result != null) {
            if (result == 0) {
                model.addAttribute("title", "Ha ocurrido un error");
                model.addAttribute("msg", "Inténtalo de nuevo más tarde.");
            }
        }

        return "/alumnos/list";
    }

    @RequestMapping(value = "/alumno/editar", method = RequestMethod.GET)
    public String editarAlumno(@RequestParam(value = "idAlumno", required = false) Integer idAlumno,
                                 Model model, HttpServletRequest request) throws IOException, Exception {

        model.addAttribute("menuItemActive", "1");
        Alumno alumno = null;

        if(idAlumno != null) alumno = alumnoService.getById(idAlumno);

        if (alumno != null) {
            model.addAttribute("alumno", alumno);
            model.addAttribute("restoAlumnos", alumnoService.getRestoAlumnos(idAlumno));
            model.addAttribute("descuentoAmigo", descuentosAlumnosService.getDescuentoAmigoPorIdAlumno(idAlumno));
        } else {
            model.addAttribute("restoAlumnos", alumnoService.getAll());
        }

        return "/alumnos/edit";
    }

    @RequestMapping(value = "/alumno/ver", method = RequestMethod.GET)
    public String verAlumno(@RequestParam(value = "idAlumno", required = false) Integer idAlumno,
                            @RequestParam(value = "result", required = false) Integer result,
                                 Model model, HttpServletRequest request) throws IOException, Exception {

        model.addAttribute("menuItemActive", "1");
        Alumno alumno = null;

        if(idAlumno != null) alumno = alumnoService.getById(idAlumno);

        if (alumno != null) {
            model.addAttribute("alumno", alumno);
            model.addAttribute("descuentosExtra", descuentosAlumnosService.getDescuentosExtraPorIdAlumno(idAlumno));
            model.addAttribute("horasExtra", horasExtraService.getPorIdAlumno(alumno.getIdAlumno()));
            model.addAttribute("recibos", reciboService.getRecibosPorIdAlumno(alumno.getIdAlumno()));
        }

        model.addAttribute("asignaturas", asignaturaService.getAll());

        DateTime dt = new DateTime();

        model.addAttribute("mesActual", dt.getMonthOfYear());
        model.addAttribute("anyoActual", dt.getYear());

        if (result != null) {
            if (result == 1) {
                model.addAttribute("title", "Alumno matriculado");
                model.addAttribute("msg", "Cambios guardados correctamente.");
            } else if (result == 2) {
                model.addAttribute("title", "Alumno actualizado");
                model.addAttribute("msg", "Cambios guardados correctamente.");
            } else if (result == 3) {
                model.addAttribute("title", "Asignatura matriculada");
                model.addAttribute("msg", "Cambios guardados correctamente.");
            } else if (result == 7) {
                model.addAttribute("title", "Asignatura desmatriculada");
                model.addAttribute("msg", "Cambios guardados correctamente.");
            } else if (result == 4) {
                model.addAttribute("title", "Descuento añadido");
                model.addAttribute("msg", "Cambios guardados correctamente.");
            } else if(result == 8) {
                model.addAttribute("title", "Descuento eliminado");
                model.addAttribute("msg", "Cambios guardados correctamente.");
            } else if (result == 5) {
                model.addAttribute("title", "Horas extra añadidas");
                model.addAttribute("msg", "Cambios guardados correctamente.");
            } else if (result == 9) {
                model.addAttribute("title", "Horas extra eliminadas");
                model.addAttribute("msg", "Cambios guardados correctamente.");
            } else {
                model.addAttribute("title", "Ha ocurrido un error");
                model.addAttribute("msg", "Inténtalo de nuevo más tarde.");
            }
        }

        return "/alumnos/view";
    }

    @RequestMapping(value = "/alumno/eliminar", method = RequestMethod.POST)
    @ResponseBody
    public RespuestaAjax<List<Integer>> eliminarAlumno (@RequestParam (value = "ids") List<Integer> ids)
    {

        RespuestaAjax<List<Integer>> res = new RespuestaAjax<>();
        List<Integer> idsBorrados = new ArrayList<>();

        for (Integer idAlumno : ids) {

            Alumno alumno = alumnoService.getById(idAlumno);

            if (alumno.getAsignaturasMatriculadas().isEmpty() && !reciboService.tieneRecibosSinPagar(idAlumno)) {
                idsBorrados.add(idAlumno);
                alumnoService.delete(alumno);
            }

        }

        if (idsBorrados.size() == ids.size()) {

            res.setEstado(true);
            res.setTitulo("Alumno(s) eliminado(s)");
            res.setMensaje("Cambios guardados correctamente");
            res.setObj(idsBorrados);

        } else if (idsBorrados.isEmpty()){

            res.setEstado(false);
            res.setTitulo("Alumno(s) no eliminado(s)");
            res.setMensaje("Por estar matriculado(s) en asignaturas y/o tener recibos pendientes de pagar");
            res.setObj(null);

        } else if (idsBorrados.size() != ids.size()) {

            res.setEstado(false);
            res.setTitulo("Alguno(s) de los alumnos seleccionado no se pudieron eliminar");
            res.setMensaje("Por estar matriculado(s) en asignaturas y/o tener recibos pendientes de pagar");
            res.setObj(idsBorrados);

        }

        return res;
    }

    @RequestMapping(value = "/alumno/guardar", method = RequestMethod.POST)
    public String guardarProfesor(@RequestParam (value = "nombre") String nombre,
                                  @RequestParam (value = "apellidos") String apellidos,
                                  @RequestParam (value = "email", required = false) String email,
                                  @RequestParam (value = "telefono") String telefono,
                                  @RequestParam (value = "nif", required = false) String nif,
                                  @RequestParam (value = "direccion", required = false) String direccion,
                                  @RequestParam (value = "cp", required = false) String cp,
                                  @RequestParam (value = "provincia", required = false) String provincia,
                                  @RequestParam (value = "poblacion", required = false) String poblacion,
                                  @RequestParam (value = "rrss", required = false) Boolean rrss,
                                  @RequestParam (value = "vulebu", required = false) Boolean vulebu,
                                  @RequestParam (value = "referred", required = false) Integer referidoPor,
                                  @RequestParam (value = "oldReferred", required = false) Integer oldReferidoPor,
                                  @RequestParam (value = "id") Integer idAlumno,
                                  Model model, HttpServletRequest request) throws IOException, Exception {

        Alumno alumno = new Alumno();

        if (idAlumno != null) {
            alumno = alumnoService.getById(idAlumno);
        }

        alumno.setNombre(nombre.trim());
        alumno.setApellidos(apellidos.trim());
        alumno.setTelefono(telefono.trim());
        if (email != null) alumno.setEmail(email.trim());
        if (nif != null) alumno.setNif(nif.trim());
        if (direccion != null) alumno.setDireccion(direccion.trim());
        if (cp != null) alumno.setCp(cp.trim());
        if (provincia != null) alumno.setProvincia(provincia.trim());
        if (poblacion != null) alumno.setPoblacion(poblacion.trim());
        if (rrss != null) {
            alumno.setRrss(rrss);
        } else {
            alumno.setRrss(false);
        }

        if (vulebu != null) {
            alumno.setVulebu(vulebu);
            //TODO Revisa esto
            if (idAlumno != null) descuentosAlumnosService.actualizarVulebu(idAlumno, true);
        } else {
            alumno.setVulebu(false);
            if (idAlumno != null) descuentosAlumnosService.actualizarVulebu(idAlumno, false);
        }

        int result = 0;
        int ge = 0;

        if (idAlumno != null) {
            result = alumnoService.update(alumno);
            ge = 2;
        } else {
            result = alumnoService.insert(alumno);
            ge = 1;
        }

        return result == 1 ? "redirect:/alumno/ver/?idAlumno=" + alumno.getIdAlumno() + "&result=" + ge : "redirect:/alumno/listado?result=0";
    }

    @RequestMapping(value = "/alumno/matricular-asignatura", method = RequestMethod.POST)
    public String matricularAsignatura(Model model, HttpServletRequest request,
                                       @RequestParam(value = "idAlumno") Integer idAlumno,
                                       @RequestParam(value = "idAsignatura") Integer idAsignatura,
                                       @RequestParam(value = "descuento", required = false) Float descuento ) throws  Exception
    {


        try {

            AlumnoAsignatura matricula = new AlumnoAsignatura();
            Asignatura asignatura = asignaturaService.getById(idAsignatura);

            matricula.setIdAlumno(idAlumno);
            matricula.setIdAsignatura(idAsignatura);
            matricula.setFecha_inicio(new Date());

            int result = 0;
            int msg = 0;

            alumnoAsignaturaService.insert(matricula);

            if (descuento != null) {

                DescuentosAlumnos descuentoAsignatura = new DescuentosAlumnos();
                descuentoAsignatura.setIdDescuento(Descuento.DESCUENTO_ASIGNATURAS);
                descuentoAsignatura.setIdAlumno(idAlumno);
                descuentoAsignatura.setActivo(true);
                descuentoAsignatura.setPorcentaje(descuento);
                descuentoAsignatura.setIdAsignatura(asignatura.getIdAsignatura());

                descuentosAlumnosService.insert(descuentoAsignatura);

            }

            msg = 3;

            /*if (result == 1) {
                descuentosAlumnosService.calcularDescuentos(idAlumno);
                msg = 3;
            }*/

            return "redirect:/alumno/ver?idAlumno=" + idAlumno + "&result=" + msg + "#tabAsignaturas";

        } catch (Exception e) {
            logger.error(e.getMessage());
            return "redirect:/alumno/ver?idAlumno=" + idAlumno + "&result=0#tabAsignaturas";
        }

    }

    @RequestMapping(value = "/alumno/desmatricular-asignatura", method = RequestMethod.GET)
    public String desmatricularAsignatura(@RequestParam(value = "idAlumno") Integer idAlumno,
                                       @RequestParam(value = "idAsignatura") Integer idAsignatura,
                                       Model model, HttpServletRequest request) throws Exception {


        try {

            AlumnoAsignatura aa = alumnoAsignaturaService.getPorIdAsignaturaAndIdAlumno(idAsignatura, idAlumno);

            int msg = 0;
            int result = 0;

            if (aa != null) {
                result = alumnoAsignaturaService.desmatricularAsignatura(aa.getIdAsignatura(), aa.getIdAlumno());
                descuentosAlumnosService.eliminarDescuentos(idAlumno, idAsignatura);
                //descuentosAlumnosService.calcularDescuentos(idAlumno);
            }

            if (result == 1) msg = 7;

            return "redirect:/alumno/ver?idAlumno=" + idAlumno + "&result=" + msg + "#tabAsignaturas";

        }catch (Exception e) {
            logger.error(e.getMessage());
            return "redirect:/alumno/ver?idAlumno=" + idAlumno + "&result=0#tabAsignaturas";
        }

    }

    @RequestMapping(value = "/alumno/anadir-descuento", method = RequestMethod.POST)
    public String anadirDescuento(@RequestParam(value = "idAlumno") Integer idAlumno,
                                  @RequestParam(value = "idDescuento") Integer idDescuento,
                                  @RequestParam(value = "cantidadDescuento", required = false) Float cantidadDescuento,
                                  @RequestParam(value = "tipoDescuento", required = false) Integer tipoDescuento,
                                  Model model, HttpServletRequest request) {


        try {

            DescuentosAlumnos da = new DescuentosAlumnos();

            da.setIdDescuento(idDescuento);
            da.setActivo(true);
            if (tipoDescuento != null) {
                if (idDescuento == 1) {
                    da.setCantidad((float)10);
                } else if (tipoDescuento == 1) {
                    da.setPorcentaje(cantidadDescuento);
                } else {
                    da.setCantidad(cantidadDescuento);
                }
            }
            da.setIdAlumno(idAlumno);

            int result = descuentosAlumnosService.insert(da);
            int msg = 0;

            if (result == 1) msg = 4;

            return "redirect:/alumno/ver?idAlumno=" + idAlumno + "&result=" + msg + "#tabDescuentos";

        } catch (Exception e) {
            logger.error(e.getMessage());
            return "redirect:/alumno/ver?idAlumno=" + idAlumno + "&result=0#tabDescuentos";
        }
    }

    @RequestMapping(value = "/alumno/eliminar-descuento", method = RequestMethod.GET)
    public String eliminarDescuento(@RequestParam(value = "idAlumno") Integer idAlumno,
                                          @RequestParam(value = "id") Integer id) throws Exception {

        try {

            DescuentosAlumnos da = descuentosAlumnosService.getPorId(id);
            int result = 0;
            int msg = 0;

            if (da != null) {
                result = descuentosAlumnosService.delete(da);
            }

            if (result == 1) msg = 8;

            return "redirect:/alumno/ver?idAlumno=" + idAlumno + "&result=" + msg + "#tabDescuentos";

        } catch (Exception e) {
            logger.error(e.getMessage());
            return "redirect:/alumno/ver?idAlumno=" + idAlumno + "&result=0#tabDescuentos";
        }
    }

    @RequestMapping(value = "/alumno/anadir-horas-extra", method = RequestMethod.POST)
    public String anadirHorasExtra(@RequestParam(value = "idAlumno") Integer idAlumno,
                                   @RequestParam(value = "idAsignatura") Integer idAsignatura,
                                   @RequestParam(value = "precio", required = false) Float precio,
                                   @RequestParam(value = "numHoras", required = false) Float numHoras,
                                   @RequestParam(value = "mes", required = false) Integer mes,
                                   @RequestParam(value = "anyo", required = false) Integer anyo,
                                   @RequestParam(value = "tipoDescuento", required = false) Integer tipoDescuento) throws Exception {


        try {

            HorasExtra he = horasExtraService.getPorIdAlumnoIdAsignatura(idAlumno, idAsignatura);
            int result ;

            DateTime dt = new DateTime();

            if (he == null || !he.getPrecio().equals(precio)) {
                he = new HorasExtra();
                he.setIdAlumno(idAlumno);
                he.setIdAsignatura(idAsignatura);
                he.setNumHoras(numHoras);
                he.setPrecio(precio);
                he.setMes(mes != null ? mes : dt.getMonthOfYear());
                he.setAnyo(anyo != null ? anyo : dt.getYear());

                result = horasExtraService.insert(he);
            } else {
                he.setNumHoras(he.getNumHoras() + numHoras);
                result = horasExtraService.update(he);
            }

            int msg = 0;

            if (result == 1) msg = 5;

            return "redirect:/alumno/ver?idAlumno=" + idAlumno + "&result=" + msg + "#tabHorasExtra";

        } catch (Exception e) {
            logger.error(e.getMessage());
            return "redirect:/alumno/ver?idAlumno=" + idAlumno + "&result=0#tabHorasExtra";
        }

    }

    @RequestMapping(value = "/alumno/eliminar-horas-extra", method = RequestMethod.GET)
    public String eliminarHorasExtra(@RequestParam(value = "id") Integer id,
                                     @RequestParam(value = "idAlumno") Integer idAlumno) throws Exception {


        try {

            HorasExtra he = horasExtraService.getPorId(id);
            int result = 0;
            int msg = 0;

            if (he != null) {
                result = horasExtraService.delete(he);
            }

            if (result == 1) msg = 9;

            return "redirect:/alumno/ver?idAlumno=" + idAlumno + "&result=" + msg + "#tabHorasExtra";

        } catch (Exception e) {
            logger.error(e.getMessage());
            return "redirect:/alumno/ver?idAlumno=" + idAlumno + "&result=0#tabHorasExtra";
        }
    }

    @RequestMapping(value = "/alumno/actualizar-asignatura-matriculada", method = RequestMethod.POST)
    @ResponseBody
    public RespuestaAjax<AlumnoAsignatura> modificarPrecioAsignaturaMatriculada(@RequestParam(value = "precioEditado") Float precioEditado
                                                       ,@RequestParam(value = "fechaInicioEditada") String fechaInicioEditada
                                                       ,@RequestParam(value = "id") Integer id) {

        RespuestaAjax<AlumnoAsignatura> respuesta = new RespuestaAjax<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            
            AlumnoAsignatura as = alumnoAsignaturaService.getPorId(id);

            as.setImporteEditado(precioEditado);
            as.setFecha_inicio(sdf.parse(fechaInicioEditada));

            as.setFechaMod(new Date());

            int result = alumnoAsignaturaService.update(as);

            if (result == 1) {
                respuesta.setEstado(true);
                respuesta.setTitulo("Matrícula editada");
                respuesta.setMensaje("Los cambios se han guardado correctamente.");
                respuesta.setObj(as);
            } else {
                respuesta.setEstado(false);
                respuesta.setTitulo("Ha ocurrido un error");
                respuesta.setMensaje("Inténtalo de nuevo más tarde.");
                respuesta.setObj(null);
            }
            
            return respuesta;
            
        } catch (Exception e) {
            respuesta.setEstado(false);
            respuesta.setTitulo("Ha ocurido un error");
            respuesta.setMensaje("Inténtalo de nuevo más tarde.");
            respuesta.setObj(null);
            
            return respuesta;
        }
        
        
        
        
    }
}
