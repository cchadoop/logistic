package com.jxlg.logistic.module.data.service;

import java.util.List;

import com.jxlg.logistic.module.data.entity.DataDictionaryDetail;
import com.jxlg.logistic.module.data.entity.DataDictionaryDetailExample;

public interface IDataDictionaryDetailService {

    int deleteByPrimaryKey(String dictionaryDetailId);

    int insertSelective(DataDictionaryDetail record);

    List<DataDictionaryDetail> selectByExample(DataDictionaryDetailExample example);

    DataDictionaryDetail selectByPrimaryKey(String dictionaryDetailId);

    int updateByPrimaryKeySelective(DataDictionaryDetail record);

    void deleteRows(String[] ids);
}
