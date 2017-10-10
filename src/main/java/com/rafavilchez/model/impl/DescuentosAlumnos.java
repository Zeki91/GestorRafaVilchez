package com.rafavilchez.model.impl;

import com.rafavilchez.model.DescuentosAlumnosBase;
import org.springframework.util.ReflectionUtils;

public class DescuentosAlumnos extends DescuentosAlumnosBase {

    private Descuento descuento;
    private Asignatura asignatura;
    private Alumno alumno;

    public DescuentosAlumnos(DescuentosAlumnosBase descuentos) {
        ReflectionUtils.shallowCopyFieldState(descuentos, this);
    }

    public DescuentosAlumnos() {}

    public Descuento getDescuento() {
        return descuento;
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
}
