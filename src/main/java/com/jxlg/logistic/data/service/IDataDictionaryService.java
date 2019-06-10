package com.jxlg.logistic.data.service;

import java.util.List;

import com.jxlg.logistic.data.entity.DataDictionary;
import com.jxlg.logistic.data.entity.DataDictionaryExample;

public interface IDataDictionaryService {

    int deleteByPrimaryKey(String dataDictionaryId);

    int insertSelective(DataDictionary record);

    List<DataDictionary> selectByExample(DataDictionaryExample example);

    DataDictionary selectByPrimaryKey(String dataDictionaryId);

    int updateByPrimaryKeySelective(DataDictionary record);
    
    void deleteRows(String[] ids);

}
