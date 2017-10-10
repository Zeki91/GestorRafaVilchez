package com.rafavilchez.utils;

public class RespuestaAjax<T> {

    private Boolean estado;
    private String mensaje;
    private String titulo;
    private T obj;

    public Boolean getEstado() {
        return estado;
    }
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getMensaje() {
        return mensaje;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public T getObj() {
        return obj;
    }
    public void setObj(T obj) {
        this.obj = obj;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
