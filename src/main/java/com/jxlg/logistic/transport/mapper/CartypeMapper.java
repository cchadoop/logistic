package com.jxlg.logistic.transport.mapper;

import com.jxlg.logistic.transport.entity.Cartype;
import com.jxlg.logistic.transport.entity.CartypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CartypeMapper {
    long countByExample(CartypeExample example);

    int deleteByExample(CartypeExample example);

    int deleteByPrimaryKey(String cartypeId);

    int insert(Cartype record);

    int insertSelective(Cartype record);

    List<Cartype> selectByExample(CartypeExample example);

    Cartype selectByPrimaryKey(String cartypeId);

    int updateByExampleSelective(@Param("record") Cartype record, @Param("example") CartypeExample example);

    int updateByExample(@Param("record") Cartype record, @Param("example") CartypeExample example);

    int updateByPrimaryKeySelective(Cartype record);

    int updateByPrimaryKey(Cartype record);
}