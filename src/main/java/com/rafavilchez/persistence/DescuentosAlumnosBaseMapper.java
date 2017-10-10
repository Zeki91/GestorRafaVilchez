package com.rafavilchez.persistence;

import com.rafavilchez.model.DescuentosAlumnosBase;
import com.rafavilchez.model.DescuentosAlumnosBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DescuentosAlumnosBaseMapper {
    int countByExample(DescuentosAlumnosBaseExample example);

    int deleteByExample(DescuentosAlumnosBaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DescuentosAlumnosBase record);

    int insertSelective(DescuentosAlumnosBase record);

    List<DescuentosAlumnosBase> selectByExample(DescuentosAlumnosBaseExample example);

    DescuentosAlumnosBase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DescuentosAlumnosBase record, @Param("example") DescuentosAlumnosBaseExample example);

    int updateByExample(@Param("record") DescuentosAlumnosBase record, @Param("example") DescuentosAlumnosBaseExample example);

    int updateByPrimaryKeySelective(DescuentosAlumnosBase record);

    int updateByPrimaryKey(DescuentosAlumnosBase record);
}