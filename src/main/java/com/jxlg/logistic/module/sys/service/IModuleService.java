package com.jxlg.logistic.module.sys.service;

import java.util.List;

import com.jxlg.logistic.module.sys.entity.Module;
import com.jxlg.logistic.module.sys.entity.ModuleExample;

public interface IModuleService {

    int deleteByPrimaryKey(String moduleId);

    int insertSelective(Module record);

    List<Module> selectByExample(ModuleExample example);

    Module selectByPrimaryKey(String moduleId);

    int updateByPrimaryKeySelective(Module record);
    
    void deleteRows(String[] ids);

}
