package com.rafavilchez.persistence.impl;

import com.rafavilchez.model.impl.Movimiento;
import com.rafavilchez.model.impl.Recibo;
import com.rafavilchez.persistence.MovimientoBaseMapper;
import com.rafavilchez.persistence.ReciboBaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovimientoMapper extends MovimientoBaseMapper {

    List<Movimiento> selectAll();

    List<Movimiento> selectBetweenDates(@Param(value = "desde") String desde,
                                        @Param(value = "hasta") String hasta);
}