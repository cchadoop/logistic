package com.jxlg.logistic.transport.service;

import java.util.List;

import com.jxlg.logistic.transport.entity.Linedetail;
import com.jxlg.logistic.transport.entity.LinedetailExample;
import com.jxlg.logistic.transport.queryview.LinedetailQueryView;

public interface ILinedetailService {

    int deleteByPrimaryKey(String linedetailId);

    int insertSelective(Linedetail record);

    List<Linedetail> selectByExample(LinedetailExample example);

    Linedetail selectByPrimaryKey(String linedetailId);

    int updateByPrimaryKeySelective(Linedetail record);
    
    void deleteRows(String[] ids);

	List<LinedetailQueryView> listView();

}
