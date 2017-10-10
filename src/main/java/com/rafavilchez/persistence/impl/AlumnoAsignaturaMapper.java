package com.rafavilchez.persistence.impl;

import com.rafavilchez.model.impl.Alumno;
import com.rafavilchez.model.impl.AlumnoAsignatura;
import com.rafavilchez.persistence.AlumnoAsignaturaBaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlumnoAsignaturaMapper extends AlumnoAsignaturaBaseMapper {

    List<AlumnoAsignatura> getPorIdAlumno(@Param(value = "idAlumno") int idAlumno);

    List<AlumnoAsignatura> getPorIdAsignatura(@Param(value = "idAsignatura") int idAsignatura);

    AlumnoAsignatura getPorIdAsignaturaAndIdAlumno(@Param(value = "idAsignatura") int idAsignatura,
                                                         @Param(value = "idAlumno") int idAlumno);

    List<Alumno> getAlumnosMatriculados(@Param(value = "idAsignatura") int idAsignatura);

    void desmatricularAlumnos(@Param(value = "idAsignatura") int idAsignatura);

}