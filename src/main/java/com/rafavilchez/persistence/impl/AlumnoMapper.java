package com.rafavilchez.persistence.impl;

import com.rafavilchez.model.impl.Alumno;
import com.rafavilchez.model.impl.AlumnoAsignatura;
import com.rafavilchez.persistence.AlumnoBaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlumnoMapper extends AlumnoBaseMapper {

    Alumno getAlumnoPorId(@Param (value = "idAlumno") Integer idAlumno);

    Alumno getAlumnoPorNIF(@Param (value = "nif") String nif);

    List<AlumnoAsignatura> getAsignaturasMatriculadas(@Param (value = "idAlumno") Integer idAlumno);

    List<AlumnoAsignatura> getHistoricoAsignaturas(@Param (value = "idAlumno") Integer idAlumno);

    List<Alumno> getAll();

    List<Alumno> getFiltered(@Param (value = "filtroNombre") String filtroNombre
                            ,@Param (value = "filtroAsignatura") Integer filtroAsignatura);

    List<Alumno> getAllOthers(@Param (value = "idAlumno") Integer idAlumno);

    int desactivarAlumno (@Param (value = "idAlumno") Integer idAlumno);
}