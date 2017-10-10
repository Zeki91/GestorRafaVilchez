package com.rafavilchez.model;

public class DescuentosAlumnosBase {
    private Integer id;

    private Integer idDescuento;

    private Integer idAsignatura;

    private Integer idAlumno;

    private Boolean activo;

    private Float cantidad;

    private Float porcentaje;

    private Integer referidoPor;

    private Integer refiereA;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdDescuento() {
        return idDescuento;
    }

    public void setIdDescuento(Integer idDescuento) {
        this.idDescuento = idDescuento;
    }

    public Integer getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(Integer idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Float getCantidad() {
        return cantidad;
    }

    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }

    public Float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Float porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Integer getReferidoPor() {
        return referidoPor;
    }

    public void setReferidoPor(Integer referidoPor) {
        this.referidoPor = referidoPor;
    }

    public Integer getRefiereA() {
        return refiereA;
    }

    public void setRefiereA(Integer refiereA) {
        this.refiereA = refiereA;
    }
}