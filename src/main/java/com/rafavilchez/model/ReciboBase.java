package com.rafavilchez.model;

import java.util.Date;

public class ReciboBase {
    private String codRecibo;

    private Integer idAlumno;

    private Integer mes;

    private Integer anyo;

    private Date fechaEmision;

    private Date fechaPago;

    private Float cantidadTotal;

    private Float observaciones;

    public String getCodRecibo() {
        return codRecibo;
    }

    public void setCodRecibo(String codRecibo) {
        this.codRecibo = codRecibo;
    }

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAnyo() {
        return anyo;
    }

    public void setAnyo(Integer anyo) {
        this.anyo = anyo;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Float getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(Float cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public Float getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(Float observaciones) {
        this.observaciones = observaciones;
    }
}