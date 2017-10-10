package com.rafavilchez.persistence;

import com.rafavilchez.model.AlumnoAsignaturaBase;
import com.rafavilchez.model.AlumnoAsignaturaBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlumnoAsignaturaBaseMapper {
    int countByExample(AlumnoAsignaturaBaseExample example);

    int deleteByExample(AlumnoAsignaturaBaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AlumnoAsignaturaBase record);

    int insertSelective(AlumnoAsignaturaBase record);

    List<AlumnoAsignaturaBase> selectByExample(AlumnoAsignaturaBaseExample example);

    AlumnoAsignaturaBase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AlumnoAsignaturaBase record, @Param("example") AlumnoAsignaturaBaseExample example);

    int updateByExample(@Param("record") AlumnoAsignaturaBase record, @Param("example") AlumnoAsignaturaBaseExample example);

    int updateByPrimaryKeySelective(AlumnoAsignaturaBase record);

    int updateByPrimaryKey(AlumnoAsignaturaBase record);
}