package com.rafavilchez.model.impl;

import com.rafavilchez.model.UsuarioBase;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.util.ReflectionUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ezequiel J. on 21/08/16.
 */
public class Usuario extends UsuarioBase implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    public static final String ROLE_SYSTEM = "ROLE_SYSTEM";
    public static final String ROLE_ADMIN = "ROLE_ADMIN";
    public static final String ROLE_OPERATOR = "ROLE_OPERATOR";

    private final String SALT = "GestorAcademiaRafaVilchez";

    private List<GrantedAuthority> authorities;

    public Usuario(UsuarioBase user) {
        ReflectionUtils.shallowCopyFieldState(user, this);
        this.reloadAuthorities(user.getRol());
    }

    public Usuario() {

    }

    public List<GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getRol() {
        return this.authorities.get(0).toString();
    }

    @Override
    public void setRol(String rol) {
        this.authorities = new ArrayList<GrantedAuthority>();
        this.authorities.add(new SimpleGrantedAuthority(rol));
        super.setRol(rol);
    }

    public void reloadAuthorities(String rol) {
        this.authorities = new ArrayList<GrantedAuthority>();

        if ( super.getRol() != null ) {
            this.authorities.add(new SimpleGrantedAuthority(super.getRol()));
        }

        this.authorities.add(new SimpleGrantedAuthority(rol));
    }

    public void setPasswordEncoded(String password) {
        super.setPassword(encode(password));
    }

    public boolean getEnabled() { return true; }

    private String encode(String password) {
        return new Md5PasswordEncoder().encodePassword(password, SALT);
    }
}
