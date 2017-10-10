package com.rafavilchez.persistence.impl;

import com.rafavilchez.model.impl.Movimiento;
import com.rafavilchez.persistence.CajaBaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CajaMapper extends CajaBaseMapper {

    Float getImporteTotal();

    void actualizarImporteTotal(@Param(value = "cantidad") float cantidad);
}