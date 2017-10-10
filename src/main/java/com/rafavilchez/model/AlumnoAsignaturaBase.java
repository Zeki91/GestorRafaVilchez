package com.rafavilchez.model;

import java.util.Date;

public class AlumnoAsignaturaBase {
    private Integer id;

    private Integer idAlumno;

    private Integer idAsignatura;

    private Date fecha_inicio;

    private Date fecha_fin;

    private Float importeEditado;

    private Date fechaMod;

    private Date observaciones;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Integer getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(Integer idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public Float getImporteEditado() {
        return importeEditado;
    }

    public void setImporteEditado(Float importeEditado) {
        this.importeEditado = importeEditado;
    }

    public Date getFechaMod() {
        return fechaMod;
    }

    public void setFechaMod(Date fechaMod) {
        this.fechaMod = fechaMod;
    }

    public Date getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(Date observaciones) {
        this.observaciones = observaciones;
    }
}