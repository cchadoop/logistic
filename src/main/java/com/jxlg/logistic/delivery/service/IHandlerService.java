package com.jxlg.logistic.delivery.service;

import java.util.List;

import com.jxlg.logistic.delivery.entity.Handler;
import com.jxlg.logistic.delivery.entity.HandlerExample;

public interface IHandlerService {

    int deleteByPrimaryKey(String handlerId);

    int insertSelective(Handler record);

    List<Handler> selectByExample(HandlerExample example);

    Handler selectByPrimaryKey(String handlerId);

    int updateByPrimaryKeySelective(Handler record);
    
    void deleteRows(String[] ids);

	List<Handler> listView(Handler handler);
}
