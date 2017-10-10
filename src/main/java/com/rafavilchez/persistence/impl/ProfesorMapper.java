package com.rafavilchez.persistence.impl;

import com.rafavilchez.model.impl.Profesor;
import com.rafavilchez.persistence.ProfesorBaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorMapper extends ProfesorBaseMapper {

    Profesor getPorId (@Param(value = "idProfesor") int idProfesor);

}