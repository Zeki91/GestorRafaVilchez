package com.rafavilchez.model.impl;

import com.rafavilchez.model.AsignaturaBase;
import org.springframework.util.ReflectionUtils;

/**
 * Created by Ezequiel J. on 21/08/16.
 */
public class Asignatura extends AsignaturaBase {

    private Profesor profesor;

    public Asignatura(AsignaturaBase user) {
        ReflectionUtils.shallowCopyFieldState(user, this);
    }

    public Asignatura() {};

    public Profesor getProfesor() { return profesor; }

    public void setProfesor (Profesor profesor) { this.profesor = new Profesor(profesor); }
}
