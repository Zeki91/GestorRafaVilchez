package com.rafavilchez.persistence.impl;

import com.rafavilchez.model.impl.Usuario;
import com.rafavilchez.persistence.UsuarioBaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioMapper extends UsuarioBaseMapper {

    Usuario getPorId(@Param(value = "nombreUsuario") String nombreUsuario);

}