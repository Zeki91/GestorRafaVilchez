package com.rafavilchez.controller;

import com.rafavilchez.model.impl.Alumno;
import com.rafavilchez.model.impl.Recibo;
import com.rafavilchez.model.impl.Usuario;
import com.rafavilchez.services.*;
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
import java.util.ArrayList;
import java.util.List;

@Controller
public class DashboardController {

    private final static Logger logger = LoggerFactory.getLogger(DashboardController.class);

    @Autowired
    ReciboService reciboService;

    @Autowired
    AsignaturaService asignaturaService;

    @Autowired
    AlumnoAsignaturaService alumnoAsignaturaService;

    @Autowired
    AlumnoService alumnoService;

    @Autowired
    UserService userService;


    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String login(Model model, HttpServletRequest request) throws IOException, Exception {

        model.addAttribute("menuItemActive", 0);

        model.addAttribute("asignaturas", asignaturaService.getAll());

        request.getSession().setAttribute("loggedUser", userService.getLoggedUser());

        return "/dashboard/dashboard";
    }

    @RequestMapping(value = "/generar-recibos", method = RequestMethod.POST)
    public String generarRecibos(@RequestParam(value = "mes") int mes,
                                 @RequestParam(value = "asignatura") int idAsignatura,
                                    Model model) throws Exception {

        String[] nombreMeses = {"", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        model.addAttribute("nombreMeses", nombreMeses);
        model.addAttribute("menuItemActive", 0);

//        Recibo r = reciboService.generarRecibo(idAlumno);
            List<Recibo> recibos = new ArrayList<>();

        List<Alumno> alumnos = new ArrayList<>();

        if (idAsignatura == 0) {
            alumnos.addAll(alumnoService.getAll());
        } else {
            alumnos.addAll(alumnoAsignaturaService.getAlumnosMatriculados(idAsignatura));
        }

        for (Alumno a : alumnos) {

            if (a.getAsignaturasMatriculadas() != null && !a.getAsignaturasMatriculadas().isEmpty()) {
                Recibo r = reciboService.generarRecibo(a.getIdAlumno(), mes);
                if (r != null) recibos.add(r);
            }

        }

        model.addAttribute("recibos", recibos);

        return "/dashboard/notas-de-pago";
    }


}
