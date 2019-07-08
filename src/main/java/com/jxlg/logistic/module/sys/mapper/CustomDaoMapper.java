package com.jxlg.logistic.module.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jxlg.logistic.module.sys.entity.Custom;

public interface CustomDaoMapper {

	List<Custom> listView(Custom custom);

	Custom checkCustom(@Param("code") String code);

	Custom selectByAccountAndPwd(@Param("code") String code, @Param("password") String password);
}
