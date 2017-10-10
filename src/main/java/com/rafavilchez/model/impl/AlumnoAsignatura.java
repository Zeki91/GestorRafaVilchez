package com.rafavilchez.model.impl;

import com.rafavilchez.model.AlumnoAsignaturaBase;
import com.rafavilchez.model.AlumnoBase;
import org.springframework.util.ReflectionUtils;

import java.util.List;

public class AlumnoAsignatura extends AlumnoAsignaturaBase {

    private Asignatura asignatura;

    public AlumnoAsignatura(AlumnoAsignaturaBase user) {
        ReflectionUtils.shallowCopyFieldState(user, this);
    }

    public AlumnoAsignatura() {}

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
}
