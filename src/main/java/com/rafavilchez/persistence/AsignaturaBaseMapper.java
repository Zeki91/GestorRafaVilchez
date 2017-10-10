package com.rafavilchez.persistence;

import com.rafavilchez.model.AsignaturaBase;
import com.rafavilchez.model.AsignaturaBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AsignaturaBaseMapper {
    int countByExample(AsignaturaBaseExample example);

    int deleteByExample(AsignaturaBaseExample example);

    int deleteByPrimaryKey(Integer idAsignatura);

    int insert(AsignaturaBase record);

    int insertSelective(AsignaturaBase record);

    List<AsignaturaBase> selectByExample(AsignaturaBaseExample example);

    AsignaturaBase selectByPrimaryKey(Integer idAsignatura);

    int updateByExampleSelective(@Param("record") AsignaturaBase record, @Param("example") AsignaturaBaseExample example);

    int updateByExample(@Param("record") AsignaturaBase record, @Param("example") AsignaturaBaseExample example);

    int updateByPrimaryKeySelective(AsignaturaBase record);

    int updateByPrimaryKey(AsignaturaBase record);
}