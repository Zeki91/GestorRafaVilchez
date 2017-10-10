package com.rafavilchez.persistence;

import com.rafavilchez.model.HorasExtraBase;
import com.rafavilchez.model.HorasExtraBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HorasExtraBaseMapper {
    int countByExample(HorasExtraBaseExample example);

    int deleteByExample(HorasExtraBaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HorasExtraBase record);

    int insertSelective(HorasExtraBase record);

    List<HorasExtraBase> selectByExample(HorasExtraBaseExample example);

    HorasExtraBase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HorasExtraBase record, @Param("example") HorasExtraBaseExample example);

    int updateByExample(@Param("record") HorasExtraBase record, @Param("example") HorasExtraBaseExample example);

    int updateByPrimaryKeySelective(HorasExtraBase record);

    int updateByPrimaryKey(HorasExtraBase record);
}