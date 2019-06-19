package com.jxlg.logistic.sys.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jxlg.logistic.sys.entity.Role;
import com.jxlg.logistic.sys.entity.RoleExample;
import com.jxlg.logistic.sys.service.IRoleService;

@RestController
@RequestMapping("/admin/sys/role/")
public class RoleAction {

	@Autowired
	IRoleService roleService;
	
	@GetMapping("page")
	public ModelAndView page(){
		ModelAndView modelAndView = new ModelAndView("admin/sys/role_list_layer");
		return modelAndView;
	}
//	@SuppressWarnings("rawtypes")
//	@PostMapping("pageAjax")
//	public Map pageAjax(@RequestParam("page") String strPage,@RequestParam("rows") String strRows,HttpServletRequest request,HttpServletResponse response){	
//		int pageNum = 0 ;
//		int pageSize = 10 ;
//		
//		if(StringUtils.isNotBlank(strPage)) {
//			pageNum = Integer.parseInt(strPage) ;
//		}
//		if(StringUtils.isNotBlank(strRows)) {
//			pageSize = Integer.parseInt(strRows) ;
//		}
//		PageHelper.startPage(pageNum, pageSize);
//		RoleExample example = new RoleExample();
//
//		List<Role> listRole = roleService.selectByExample(example);
//		PageInfo<Role> pageInfo  = new PageInfo<>(listRole);
//		Map<String, Object> map = new HashMap<>();
//		map.put("total", pageInfo.getTotal());
//		map.put("rows", pageInfo.getList());
//		
//		return map;
//	}
	@RequestMapping("pageAjax")
	public Map<String,Object> pageAjax(@RequestParam Map roleMap){
		 String pageNum =  (String) roleMap.get("page");
		 String pageSize = (String) roleMap.get("limit");
		 PageHelper.startPage(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
		Map<String,Object> map = new HashMap<>();
		RoleExample example = new RoleExample();
		List<Role> listRole = roleService.selectByExample(example);
		PageInfo<Role> pageInfo  = new PageInfo<>(listRole);
		map.put("code", 0);
		map.put("count", pageInfo.getTotal());
		map.put("data", pageInfo.getList());
		return map;
	}
	@RequestMapping("edit")
	public ModelAndView edit(@RequestParam(name="roleId",required=false)String roleId) {
		ModelAndView modelAndView = new ModelAndView("admin/sys/role_edit");
		if(StringUtils.isNotBlank(roleId)) {
			Role role = roleService.selectByPrimaryKey(roleId);
			modelAndView.addObject("role", role);
		}else {
			
		}
		return modelAndView;
	}
	
	@RequestMapping("deleteAj")
	public String deleteAj( HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			String roleId = request.getParameter("roleId") ;
			roleService.deleteByPrimaryKey(roleId);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}
	
	@RequestMapping("deleteRowsAj")
	public String deleteRowsAj(@RequestParam("ids[]") String[] ids, HttpServletRequest request,
			HttpServletResponse response) {
		String result = null;
		try {
			roleService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}
	
	@PostMapping("saveAj")
	public String saveAj(Role role, HttpServletRequest request, HttpServletResponse response) {
		String result = null ;
		try{
			if(!StringUtils.isEmpty(role.getRoleId())){
				roleService.updateByPrimaryKeySelective(role) ;
			}else{
				roleService.insertSelective(role);
			}
		}catch(Exception ex){
			ex.printStackTrace();
			result = "保存失败" ;
		}
		//return "保存失败" ;
		return result ;
	}
}

