package com.jxlg.logistic.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import com.jxlg.logistic.sys.queryview.RolePowerQueryView;

public interface RolePowerDaoMapper {
	@Select("select rp.*,r.role_name,p.power_name from sys_role_power rp left join sys_role r on rp.role_id = r.role_id left join sys_power p on rp.power_id = p.power_id")
	@Results(value= {
			@Result(column="role_power_id",property="rolePowerId"),
			@Result(column="role_id",property="roleId"),
			@Result(column="power_id",property="powerId"),
			@Result(column="role_name",property="roleName"),
			@Result(column="power_name",property="powerName"),
	})
	List<RolePowerQueryView> listView();
}
