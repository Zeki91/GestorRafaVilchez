package com.rafavilchez.persistence.impl;

import com.rafavilchez.model.impl.EntradaRecibo;
import com.rafavilchez.model.impl.Recibo;
import com.rafavilchez.persistence.EntradaReciboBaseMapper;
import com.rafavilchez.persistence.ReciboBaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntradaReciboMapper extends EntradaReciboBaseMapper {

    List<EntradaRecibo> getEntradasReciboPorCodRecibo (@Param(value = "codRecibo") String codRecibo);

    EntradaRecibo getEntradaReciboPorId (@Param(value = "id") int id);

    int deleteWithCodRecibo (@Param(value = "codRecibo") String codRecibo);

}