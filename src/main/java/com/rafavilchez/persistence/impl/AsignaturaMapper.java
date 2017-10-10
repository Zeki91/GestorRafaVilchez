package com.rafavilchez.persistence.impl;

import com.rafavilchez.model.impl.Asignatura;
import com.rafavilchez.persistence.AsignaturaBaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AsignaturaMapper extends AsignaturaBaseMapper {

    Asignatura getAsignaturaPorId(@Param("idAsignatura") int idAsignatura);

    List<Asignatura> getAll();
}