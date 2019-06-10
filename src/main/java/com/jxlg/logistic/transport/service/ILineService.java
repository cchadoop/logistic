package com.jxlg.logistic.transport.service;

import java.util.List;

import com.jxlg.logistic.transport.entity.Line;
import com.jxlg.logistic.transport.entity.LineExample;

public interface ILineService {

    int deleteByPrimaryKey(String lineId);

    int insertSelective(Line record);

    List<Line> selectByExample(LineExample example);

    Line selectByPrimaryKey(String lineId);

    int updateByPrimaryKeySelective(Line record);
    
    void deleteRows(String[] ids);

}
