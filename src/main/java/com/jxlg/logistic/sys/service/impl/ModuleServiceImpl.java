package com.jxlg.logistic.sys.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxlg.logistic.sys.entity.Module;
import com.jxlg.logistic.sys.entity.ModuleExample;
import com.jxlg.logistic.sys.mapper.ModuleMapper;
import com.jxlg.logistic.sys.service.IModuleService;
@Service
public class ModuleServiceImpl implements IModuleService{
	
	@Autowired
	ModuleMapper moduleMapper;

	@Override
	public int deleteByPrimaryKey(String moduleId) {
		// TODO Auto-generated method stub
		return moduleMapper.deleteByPrimaryKey(moduleId);
	}

	@Override
	public int insertSelective(Module record) {
		// TODO Auto-generated method stub
		String moduleId = UUID.randomUUID().toString().replaceAll("-", "");
		record.setModuleId(moduleId);
		return moduleMapper.insertSelective(record);
	}

	@Override
	public List<Module> selectByExample(ModuleExample example) {
		// TODO Auto-generated method stub
		return moduleMapper.selectByExample(example);
	}

	@Override
	public Module selectByPrimaryKey(String moduleId) {
		// TODO Auto-generated method stub
		return moduleMapper.selectByPrimaryKey(moduleId);
	}

	@Override
	public int updateByPrimaryKeySelective(Module record) {
		// TODO Auto-generated method stub
		return moduleMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void deleteRows(String[] ids) {
		// TODO Auto-generated method stub
		for (String moduleId : ids) {
			deleteByPrimaryKey(moduleId);
		}
	}

}
