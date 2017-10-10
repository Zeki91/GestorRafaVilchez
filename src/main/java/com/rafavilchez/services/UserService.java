package com.rafavilchez.services;


import com.rafavilchez.model.UsuarioBase;
import com.rafavilchez.model.UsuarioBaseExample;
import com.rafavilchez.model.impl.UserLogin;
import com.rafavilchez.model.impl.Usuario;
import com.rafavilchez.persistence.impl.UsuarioMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
	
	@Autowired
	UsuarioMapper usuarioMapper;
	
	
	public Integer insert (Usuario p) {
		return usuarioMapper.insert(p);
	}
	
	public List<UsuarioBase> selectByExample(UsuarioBaseExample example){
		return usuarioMapper.selectByExample(example);
	}

	public Usuario getLoggedUser() {

		SecurityContext context = SecurityContextHolder.getContext();
		Authentication authentication = context.getAuthentication();
		if (authentication != null) {
			Object principal = authentication.getPrincipal();
			if (principal != null && principal instanceof UserLogin) {
				UserLogin userDetails = (UserLogin) principal;
				return userDetails.getUser();
			}
		}

		return null;
	}

}
