package com.rafavilchez.repository;


import com.rafavilchez.model.UsuarioBase;
import com.rafavilchez.model.UsuarioBaseExample;
import com.rafavilchez.model.impl.UserLogin;
import com.rafavilchez.model.impl.Usuario;
import com.rafavilchez.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository implements UserDetailsService {
	
	@Autowired
	UserService userService;

	@Override
	public UserDetails loadUserByUsername(String email )
			throws UsernameNotFoundException {

		Usuario admin = getUserByEmail(email);
		
		if (admin==null){
            throw new UsernameNotFoundException("No se ha encontrado al usuario");
        }
		
		return new UserLogin(admin);
	}
	
	public Usuario getUserByEmail( String email ) {
		
		UsuarioBaseExample example = new UsuarioBaseExample();
		
		example.createCriteria().andEmailEqualTo(email);
		List<UsuarioBase> users = userService.selectByExample(example);
		Usuario u = null;
		
		if (users != null && users.size() == 1) {
			u = new Usuario(users.get(0));
		}
		
		return u;
		
	}
	
	public void save( Usuario user ) {
    	userService.insert(user);
    }
}
	
