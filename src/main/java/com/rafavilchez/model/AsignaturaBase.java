package com.rafavilchez.model;

import java.util.Date;

public class AsignaturaBase {
    private Integer idAsignatura;

    private String nombre;

    private Float precioBruto;

    private Integer idProfesor;

    private Boolean descuento;

    private Date createdAt;

    public Integer getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(Integer idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecioBruto() {
        return precioBruto;
    }

    public void setPrecioBruto(Float precioBruto) {
        this.precioBruto = precioBruto;
    }

    public Integer getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Integer idProfesor) {
        this.idProfesor = idProfesor;
    }

    public Boolean getDescuento() {
        return descuento;
    }

    public void setDescuento(Boolean descuento) {
        this.descuento = descuento;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}