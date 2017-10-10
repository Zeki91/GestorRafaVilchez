package com.rafavilchez.persistence;

import com.rafavilchez.model.DescuentoBase;
import com.rafavilchez.model.DescuentoBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DescuentoBaseMapper {
    int countByExample(DescuentoBaseExample example);

    int deleteByExample(DescuentoBaseExample example);

    int deleteByPrimaryKey(Integer idDescuento);

    int insert(DescuentoBase record);

    int insertSelective(DescuentoBase record);

    List<DescuentoBase> selectByExample(DescuentoBaseExample example);

    DescuentoBase selectByPrimaryKey(Integer idDescuento);

    int updateByExampleSelective(@Param("record") DescuentoBase record, @Param("example") DescuentoBaseExample example);

    int updateByExample(@Param("record") DescuentoBase record, @Param("example") DescuentoBaseExample example);

    int updateByPrimaryKeySelective(DescuentoBase record);

    int updateByPrimaryKey(DescuentoBase record);
}