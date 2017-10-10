package com.rafavilchez.persistence;

import com.rafavilchez.model.EntradaReciboBase;
import com.rafavilchez.model.EntradaReciboBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EntradaReciboBaseMapper {
    int countByExample(EntradaReciboBaseExample example);

    int deleteByExample(EntradaReciboBaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EntradaReciboBase record);

    int insertSelective(EntradaReciboBase record);

    List<EntradaReciboBase> selectByExampleWithBLOBs(EntradaReciboBaseExample example);

    List<EntradaReciboBase> selectByExample(EntradaReciboBaseExample example);

    EntradaReciboBase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EntradaReciboBase record, @Param("example") EntradaReciboBaseExample example);

    int updateByExampleWithBLOBs(@Param("record") EntradaReciboBase record, @Param("example") EntradaReciboBaseExample example);

    int updateByExample(@Param("record") EntradaReciboBase record, @Param("example") EntradaReciboBaseExample example);

    int updateByPrimaryKeySelective(EntradaReciboBase record);

    int updateByPrimaryKeyWithBLOBs(EntradaReciboBase record);

    int updateByPrimaryKey(EntradaReciboBase record);
}