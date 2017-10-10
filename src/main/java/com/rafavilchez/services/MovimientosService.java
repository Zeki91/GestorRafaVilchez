package com.rafavilchez.services;

import com.rafavilchez.model.impl.Movimiento;
import com.rafavilchez.persistence.impl.MovimientoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimientosService {

    @Autowired
    MovimientoMapper movimientoMapper;

    public List<Movimiento> getAll() {
        return movimientoMapper.selectAll();
    }

    public Movimiento get(Integer id) { return new Movimiento(movimientoMapper.selectByPrimaryKey(id)); }

    public List<Movimiento> selectBetweenDates(String desde, String hasta) {
        return movimientoMapper.selectBetweenDates(desde, hasta);
    }

    public int save(Movimiento mov) {
        if (mov.getIdMovimiento() == null) {
            return movimientoMapper.insert(mov);
        } else {
            return movimientoMapper.updateByPrimaryKey(mov);
        }
    }

}
