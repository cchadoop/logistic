package com.jxlg.logistic.module.transport.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxlg.logistic.module.transport.entity.Line;
import com.jxlg.logistic.module.transport.entity.LineExample;
import com.jxlg.logistic.module.transport.mapper.LineMapper;
import com.jxlg.logistic.module.transport.service.ILineService;

@Service
public class LineServiceImpl implements ILineService{
	
	@Autowired
	LineMapper lineMapper;

	@Override
	public int deleteByPrimaryKey(String lineId) {
		return lineMapper.deleteByPrimaryKey(lineId);
	}

	@Override
	public int insertSelective(Line record) {
		String lineId = UUID.randomUUID().toString().replaceAll("-", "");
		record.setLineId(lineId);
		return lineMapper.insertSelective(record);
	}

	@Override
	public List<Line> selectByExample(LineExample example) {
		return lineMapper.selectByExample(example);
	}

	@Override
	public Line selectByPrimaryKey(String lineId) {
		return lineMapper.selectByPrimaryKey(lineId);
	}

	@Override
	public int updateByPrimaryKeySelective(Line record) {
		return lineMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void deleteRows(String[] ids) {
		for (String lineId : ids) {
			deleteByPrimaryKey(lineId);
		}
	}
}
