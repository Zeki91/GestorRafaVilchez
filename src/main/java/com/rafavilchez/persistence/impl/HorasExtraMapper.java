package com.rafavilchez.persistence.impl;

import com.rafavilchez.model.impl.DescuentosAlumnos;
import com.rafavilchez.model.impl.HorasExtra;
import com.rafavilchez.persistence.DescuentosAlumnosBaseMapper;
import com.rafavilchez.persistence.HorasExtraBaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HorasExtraMapper extends HorasExtraBaseMapper {

    HorasExtra getPorId(@Param(value = "id") Integer id);

    List<HorasExtra> getPorIdAlumno(@Param(value = "idAlumno") int idAlumno);

    List<HorasExtra> getPorIdAsignatura(@Param(value = "idAsignatura") int idAsignatura);

    HorasExtra getPorIdAlumnoIdAsignatura(@Param(value = "idAlumno") int idAlumno
                                         ,@Param(value = "idAsignatura") int idAsignatura);
}