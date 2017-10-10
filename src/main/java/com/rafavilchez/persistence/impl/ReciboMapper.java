package com.rafavilchez.persistence.impl;

import com.rafavilchez.model.impl.Recibo;
import com.rafavilchez.persistence.ReciboBaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReciboMapper extends ReciboBaseMapper {

    List<Recibo> selectAll();

    List<Recibo> getFiltered(@Param(value = "page") Integer page
                            ,@Param(value = "filtroPagado") Integer filtroPagado
                            ,@Param(value = "filtroAnyo") Integer filtroAnyo
                            ,@Param(value = "filtroMes") Integer filtroMes
                            ,@Param(value = "filtroAlumno") Integer filtroAlumno);

    Recibo getReciboPorId(@Param(value = "codRecibo") String codRecibo);

    List<Recibo> getRecibosPorIdAlumno(@Param(value = "idAlumno") int idAlumno);

    int actualizarImporteTotal (@Param(value = "codRecibo") String codRecibo);

}