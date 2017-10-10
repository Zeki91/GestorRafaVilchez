package com.rafavilchez.persistence;

import com.rafavilchez.model.AlumnoBase;
import com.rafavilchez.model.AlumnoBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlumnoBaseMapper {
    int countByExample(AlumnoBaseExample example);

    int deleteByExample(AlumnoBaseExample example);

    int deleteByPrimaryKey(Integer idAlumno);

    int insert(AlumnoBase record);

    int insertSelective(AlumnoBase record);

    List<AlumnoBase> selectByExample(AlumnoBaseExample example);

    AlumnoBase selectByPrimaryKey(Integer idAlumno);

    int updateByExampleSelective(@Param("record") AlumnoBase record, @Param("example") AlumnoBaseExample example);

    int updateByExample(@Param("record") AlumnoBase record, @Param("example") AlumnoBaseExample example);

    int updateByPrimaryKeySelective(AlumnoBase record);

    int updateByPrimaryKey(AlumnoBase record);
}