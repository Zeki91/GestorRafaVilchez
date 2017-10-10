package com.rafavilchez.persistence;

import com.rafavilchez.model.ReciboBase;
import com.rafavilchez.model.ReciboBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReciboBaseMapper {
    int countByExample(ReciboBaseExample example);

    int deleteByExample(ReciboBaseExample example);

    int deleteByPrimaryKey(String codRecibo);

    int insert(ReciboBase record);

    int insertSelective(ReciboBase record);

    List<ReciboBase> selectByExample(ReciboBaseExample example);

    ReciboBase selectByPrimaryKey(String codRecibo);

    int updateByExampleSelective(@Param("record") ReciboBase record, @Param("example") ReciboBaseExample example);

    int updateByExample(@Param("record") ReciboBase record, @Param("example") ReciboBaseExample example);

    int updateByPrimaryKeySelective(ReciboBase record);

    int updateByPrimaryKey(ReciboBase record);
}