package com.rafavilchez.model.impl;

import org.springframework.security.core.userdetails.User;


public class UserLogin extends User {

	private static final long serialVersionUID = -6974635661170587436L;

	private Usuario user;

    public UserLogin(Usuario user) {

        super(user.getEmail(), user.getPassword(), user.getEnabled(), true, true, true, user.getAuthorities());
        this.setUser(user);
    }



    public int getIdUsuario() {
        return user.getIdUsuario();
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object rhs) {
        if ( rhs instanceof UserLogin ) {
            return ( ( UserLogin ) rhs ).user.getIdUsuario() == this.user.getIdUsuario();

        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return user != null && user.getIdUsuario() != null ? user.getIdUsuario().hashCode() : super.hashCode();
    }

}
