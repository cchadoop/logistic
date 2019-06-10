package com.jxlg.logistic.sys.service;

import java.util.List;

import com.jxlg.logistic.sys.entity.Module;
import com.jxlg.logistic.sys.entity.ModuleExample;

public interface IModuleService {

    int deleteByPrimaryKey(String moduleId);

    int insertSelective(Module record);

    List<Module> selectByExample(ModuleExample example);

    Module selectByPrimaryKey(String moduleId);

    int updateByPrimaryKeySelective(Module record);
    
    void deleteRows(String[] ids);

}
