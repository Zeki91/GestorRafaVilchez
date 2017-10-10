package com.rafavilchez.model.impl;

import com.rafavilchez.model.AlumnoBase;
import org.springframework.util.ReflectionUtils;

import java.util.ArrayList;
import java.util.List;

public class Alumno extends AlumnoBase {

    private List<AlumnoAsignatura> asignaturasMatriculadas;
    private List<AlumnoAsignatura> historicoAsignaturas;
    private List<DescuentosAlumnos> descuentos;

    public Alumno(AlumnoBase user) {
        ReflectionUtils.shallowCopyFieldState(user, this);
    }

    public Alumno() {}

    public String getNombreApellidos() {
        return getNombre() + " " + getApellidos();
    }

    public String getApellidosNombre() {
        return getApellidos() + " " + getNombre();
    }

    @Override
    public boolean equals(Object rhs) {
        if ( rhs instanceof Alumno ) {
            return ( ( Alumno) rhs ).getIdAlumno().equals(this.getIdAlumno());

        } else {
            return false;
        }
    }

    public List<DescuentosAlumnos> getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(List<DescuentosAlumnos> descuentos) {
        this.descuentos = descuentos;
    }

    public List<AlumnoAsignatura> getAsignaturasMatriculadas() {
        return asignaturasMatriculadas;
    }

    public void setAsignaturasMatriculadas(List<AlumnoAsignatura> asignaturasMatriculadas) {
        this.asignaturasMatriculadas = asignaturasMatriculadas;
    }

    public List<Asignatura> getAsignaturas() {
        List<Asignatura> asignaturas = new ArrayList<>();

        for(AlumnoAsignatura aa : asignaturasMatriculadas) {
            if(aa.getFecha_fin() == null) asignaturas.add(aa.getAsignatura());
        }

        return asignaturas;
    }

    public List<AlumnoAsignatura> getHistoricoAsignaturas() { return historicoAsignaturas; }
}
