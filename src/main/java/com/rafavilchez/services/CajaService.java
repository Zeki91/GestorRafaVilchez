package com.rafavilchez.services;

import com.rafavilchez.persistence.impl.CajaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CajaService {

    @Autowired
    CajaMapper cajaMapper;

    public Float getTotal() { return cajaMapper.getImporteTotal(); }

    public void sumarCantidad (float cantidad) {

        cajaMapper.actualizarImporteTotal(cantidad + getTotal());
    }

    public void restarCantidad (float cantidad) {
        cajaMapper.actualizarImporteTotal(getTotal() - cantidad);
    }

    public void setImporteTotal (float cantidad) {
        cajaMapper.actualizarImporteTotal(cantidad);
    }

}
