package com.jxlg.logistic.module.data.mapper;

import com.jxlg.logistic.module.data.entity.DataDictionary;
import com.jxlg.logistic.module.data.entity.DataDictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataDictionaryMapper {
    long countByExample(DataDictionaryExample example);

    int deleteByExample(DataDictionaryExample example);

    int deleteByPrimaryKey(String dataDictionaryId);

    int insert(DataDictionary record);

    int insertSelective(DataDictionary record);

    List<DataDictionary> selectByExample(DataDictionaryExample example);

    DataDictionary selectByPrimaryKey(String dataDictionaryId);

    int updateByExampleSelective(@Param("record") DataDictionary record, @Param("example") DataDictionaryExample example);

    int updateByExample(@Param("record") DataDictionary record, @Param("example") DataDictionaryExample example);

    int updateByPrimaryKeySelective(DataDictionary record);

    int updateByPrimaryKey(DataDictionary record);
}