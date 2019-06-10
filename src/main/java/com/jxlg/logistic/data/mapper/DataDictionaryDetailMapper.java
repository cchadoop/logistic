package com.jxlg.logistic.data.mapper;

import com.jxlg.logistic.data.entity.DataDictionaryDetail;
import com.jxlg.logistic.data.entity.DataDictionaryDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataDictionaryDetailMapper {
    long countByExample(DataDictionaryDetailExample example);

    int deleteByExample(DataDictionaryDetailExample example);

    int deleteByPrimaryKey(String dictionaryDetailId);

    int insert(DataDictionaryDetail record);

    int insertSelective(DataDictionaryDetail record);

    List<DataDictionaryDetail> selectByExample(DataDictionaryDetailExample example);

    DataDictionaryDetail selectByPrimaryKey(String dictionaryDetailId);

    int updateByExampleSelective(@Param("record") DataDictionaryDetail record, @Param("example") DataDictionaryDetailExample example);

    int updateByExample(@Param("record") DataDictionaryDetail record, @Param("example") DataDictionaryDetailExample example);

    int updateByPrimaryKeySelective(DataDictionaryDetail record);

    int updateByPrimaryKey(DataDictionaryDetail record);
}