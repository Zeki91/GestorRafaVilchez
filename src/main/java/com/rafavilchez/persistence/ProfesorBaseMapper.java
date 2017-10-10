package com.rafavilchez.persistence;

import com.rafavilchez.model.ProfesorBase;
import com.rafavilchez.model.ProfesorBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProfesorBaseMapper {
    int countByExample(ProfesorBaseExample example);

    int deleteByExample(ProfesorBaseExample example);

    int deleteByPrimaryKey(Integer idProfesor);

    int insert(ProfesorBase record);

    int insertSelective(ProfesorBase record);

    List<ProfesorBase> selectByExample(ProfesorBaseExample example);

    ProfesorBase selectByPrimaryKey(Integer idProfesor);

    int updateByExampleSelective(@Param("record") ProfesorBase record, @Param("example") ProfesorBaseExample example);

    int updateByExample(@Param("record") ProfesorBase record, @Param("example") ProfesorBaseExample example);

    int updateByPrimaryKeySelective(ProfesorBase record);

    int updateByPrimaryKey(ProfesorBase record);
}