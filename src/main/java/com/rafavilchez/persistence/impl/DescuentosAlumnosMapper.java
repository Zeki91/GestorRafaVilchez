package com.rafavilchez.persistence.impl;

import com.rafavilchez.model.impl.DescuentosAlumnos;
import com.rafavilchez.persistence.DescuentosAlumnosBaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DescuentosAlumnosMapper extends DescuentosAlumnosBaseMapper {

    List<DescuentosAlumnos> getPorIdAlumno(@Param(value = "idAlumno") int idAlumno);

    DescuentosAlumnos getPorIdAsignaturaIdAlumno(@Param(value = "idAsignatura") int idAsignatura
                                              ,@Param(value = "idAlumno") int idAlumno);

    List<DescuentosAlumnos> getDescuentosExtraPorIdAlumno(@Param(value = "idAlumno") int idAlumno);

    DescuentosAlumnos getDescuentoAmigoPorIdAlumno(@Param(value = "idAlumno") int idAlumno);

    void eliminarDescuentos(@Param("idAlumno") int idAlumno,
                            @Param("idAsignatura") int idAsignatura);
}