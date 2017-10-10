package com.rafavilchez.model.impl;

import com.rafavilchez.model.HorasExtraBase;
import org.springframework.util.ReflectionUtils;

public class HorasExtra extends HorasExtraBase {

    private Asignatura asignatura;
    private Alumno alumno;

    public HorasExtra(HorasExtraBase horasExtra) {
        ReflectionUtils.shallowCopyFieldState(horasExtra, this);
    }

    public HorasExtra() {}

    public Asignatura getAsignatura() { return asignatura; }

    public Alumno getAlumno() { return alumno; }
}
