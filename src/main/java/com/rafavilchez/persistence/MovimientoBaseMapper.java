package com.rafavilchez.persistence;

import com.rafavilchez.model.MovimientoBase;
import com.rafavilchez.model.MovimientoBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MovimientoBaseMapper {
    int countByExample(MovimientoBaseExample example);

    int deleteByExample(MovimientoBaseExample example);

    int deleteByPrimaryKey(Integer idMovimiento);

    int insert(MovimientoBase record);

    int insertSelective(MovimientoBase record);

    List<MovimientoBase> selectByExample(MovimientoBaseExample example);

    MovimientoBase selectByPrimaryKey(Integer idMovimiento);

    int updateByExampleSelective(@Param("record") MovimientoBase record, @Param("example") MovimientoBaseExample example);

    int updateByExample(@Param("record") MovimientoBase record, @Param("example") MovimientoBaseExample example);

    int updateByPrimaryKeySelective(MovimientoBase record);

    int updateByPrimaryKey(MovimientoBase record);
}