package com.rafavilchez.persistence.impl;

import com.rafavilchez.model.impl.Descuento;
import com.rafavilchez.persistence.DescuentoBaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DescuentoMapper extends DescuentoBaseMapper {

    Descuento getDescuentoPorId(@Param(value = "idDescuento") int idDescuento);

}