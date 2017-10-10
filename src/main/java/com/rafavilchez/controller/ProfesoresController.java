package com.rafavilchez.controller;

import com.rafavilchez.model.impl.Profesor;
import com.rafavilchez.services.ProfesorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

@Controller
public class ProfesoresController {

    private final static Logger logger = LoggerFactory.getLogger(ProfesoresController.class);

    @Autowired
    ProfesorService profesorService;

    @RequestMapping(value = "/profesor/listado", method = RequestMethod.GET)
    public String listaProfesores(Model model, HttpServletRequest request) throws IOException, Exception {

        model.addAttribute("menuItemActive", "2");

        List<Profesor> list = profesorService.getAll();

        model.addAttribute("profesores", list);
        model.addAttribute("numProfesores", list.size());

        return "/profesor/list";
    }

    @RequestMapping(value = "/profesor/editar", method = RequestMethod.GET)
    public String editarProfesor(@RequestParam(value = "idProfesor", required = false) Integer idProfesor,
                                 Model model, HttpServletRequest request) throws IOException, Exception {

        model.addAttribute("menuItemActive", "2");
        Profesor profesor = null;

        if(idProfesor != null) profesor = profesorService.getById(idProfesor);

        if (profesor != null) {
            model.addAttribute("profesor", profesor);
        }

        return "/profesor/edit";
    }

    @RequestMapping(value = "/profesor/guardar", method = RequestMethod.POST)
    public String guardarProfesor(@RequestParam (value = "nombre") String nombre,
                                  @RequestParam (value = "apellidos") String apellidos,
                                  @RequestParam (value = "fechaNacimiento") String fechaNacimiento,
                                  @RequestParam (value = "telefono") String telefono,
                                  @RequestParam (value = "sueldo") float sueldo,
                                  @RequestParam (value = "cuentaBancaria") String cuentaBancaria,
                                  @RequestParam (value = "id") Integer idProfesor,
                                 Model model, HttpServletRequest request) throws IOException, Exception {

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Profesor profesor = new Profesor();

        if (idProfesor != null) {
            profesor = profesorService.getById(idProfesor);
        }

        profesor.setNombre(nombre);
        profesor.setApellidos(apellidos);
        profesor.setTelefono(telefono);
        profesor.setFechaNacimiento(formatter.parse(fechaNacimiento));
        profesor.setCuentaBancaria(cuentaBancaria);
        profesor.setSueldo(sueldo);
        profesor.setCreatedAt(cal.getTime());


        if (idProfesor != null) {
           profesorService.update(profesor);
        } else {
            profesorService.insert(profesor);
        }

        return "redirect:/profesor/listado";
    }
}