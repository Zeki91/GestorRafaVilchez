package com.rafavilchez.controller;

import com.rafavilchez.model.impl.Usuario;
import com.rafavilchez.repository.UserRepository;
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

@Controller
public class AuthController {

    private final static Logger logger = LoggerFactory.getLogger(AuthController.class);

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login(@RequestParam(value = "login_error", required = false) boolean error,
                        Model model, HttpServletRequest request) throws IOException, Exception {
        try {
            if (error) {
                model.addAttribute("error", "Email y/o contraseña incorrectos.");
            }
        } catch(Exception e){
            logger.error( e.getMessage() );
        }

        return "/auth/login";
    }

	/*@RequestMapping(value = "/populate", method = RequestMethod.GET)
	public String populate(Model model, HttpServletRequest request){

		Usuario operator = new Usuario();
		operator.setEmail("fjurado");
		operator.setPasswordEncoded("7epB1i");
		operator.setRol(Usuario.ROLE_OPERATOR);
		userRepository.save(operator);

        Usuario admin = new Usuario();
        admin.setEmail("rvilchez");
        admin.setPasswordEncoded("UwytQU");
        admin.setRol(Usuario.ROLE_ADMIN);
        userRepository.save(admin);

        Usuario system = new Usuario();
        system.setEmail("ejimenez");
        system.setPasswordEncoded("RW9kQr");
        system.setRol(Usuario.ROLE_SYSTEM);
        userRepository.save(system);

		return "/auth/login";
	}*/

}
