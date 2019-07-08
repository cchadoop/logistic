package com.jxlg.logistic.module.transport.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxlg.logistic.module.transport.entity.Linedetail;
import com.jxlg.logistic.module.transport.entity.LinedetailExample;
import com.jxlg.logistic.module.transport.mapper.LinedetailMapper;
import com.jxlg.logistic.module.transport.queryview.LinedetailQueryView;
import com.jxlg.logistic.module.transport.service.ILinedetailService;

@Service
public class LinedetailServiceImpl implements ILinedetailService{
	
	@Autowired
	LinedetailMapper linedetailMapper;

	@Override
	public int deleteByPrimaryKey(String linedetailId) {
		return linedetailMapper.deleteByPrimaryKey(linedetailId);
	}

	@Override
	public int insertSelective(Linedetail record) {
		String linedetailId = UUID.randomUUID().toString().replaceAll("-", "");
		record.setLinedetailId(linedetailId);
		return linedetailMapper.insertSelective(record);
	}

	@Override
	public List<Linedetail> selectByExample(LinedetailExample example) {
		return linedetailMapper.selectByExample(example);
	}

	@Override
	public Linedetail selectByPrimaryKey(String linedetailId) {
		return linedetailMapper.selectByPrimaryKey(linedetailId);
	}

	@Override
	public int updateByPrimaryKeySelective(Linedetail record) {
		return linedetailMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void deleteRows(String[] ids) {
		for (String linedetailId : ids) {
			deleteByPrimaryKey(linedetailId);
		}
	}

	@Override
	public List<LinedetailQueryView> listView() {
		return linedetailMapper.listView();
	}
}
