package com.rafavilchez.persistence;

import com.rafavilchez.model.UsuarioBase;
import com.rafavilchez.model.UsuarioBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsuarioBaseMapper {
    int countByExample(UsuarioBaseExample example);

    int deleteByExample(UsuarioBaseExample example);

    int deleteByPrimaryKey(Integer idUsuario);

    int insert(UsuarioBase record);

    int insertSelective(UsuarioBase record);

    List<UsuarioBase> selectByExample(UsuarioBaseExample example);

    UsuarioBase selectByPrimaryKey(Integer idUsuario);

    int updateByExampleSelective(@Param("record") UsuarioBase record, @Param("example") UsuarioBaseExample example);

    int updateByExample(@Param("record") UsuarioBase record, @Param("example") UsuarioBaseExample example);

    int updateByPrimaryKeySelective(UsuarioBase record);

    int updateByPrimaryKey(UsuarioBase record);
}