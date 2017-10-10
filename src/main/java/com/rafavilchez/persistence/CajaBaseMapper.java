package com.rafavilchez.persistence;

import com.rafavilchez.model.CajaBase;
import com.rafavilchez.model.CajaBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CajaBaseMapper {
    int countByExample(CajaBaseExample example);

    int deleteByExample(CajaBaseExample example);

    int deleteByPrimaryKey(String id);

    int insert(CajaBase record);

    int insertSelective(CajaBase record);

    List<CajaBase> selectByExample(CajaBaseExample example);

    CajaBase selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CajaBase record, @Param("example") CajaBaseExample example);

    int updateByExample(@Param("record") CajaBase record, @Param("example") CajaBaseExample example);

    int updateByPrimaryKeySelective(CajaBase record);

    int updateByPrimaryKey(CajaBase record);
}