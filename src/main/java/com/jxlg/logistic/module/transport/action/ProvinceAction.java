package com.jxlg.logistic.module.transport.action;

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
import com.jxlg.logistic.module.transport.entity.Province;
import com.jxlg.logistic.module.transport.entity.ProvinceExample;
import com.jxlg.logistic.module.transport.service.IProvinceService;

@RestController
@RequestMapping("/admin/transport/province/")
public class ProvinceAction {

	@Autowired
	IProvinceService provinceService;
	
	@GetMapping("page")
	public ModelAndView page(){
		ModelAndView modelAndView = new ModelAndView("admin/transport/province_list");
		return modelAndView;
	}
	@SuppressWarnings("rawtypes")
	@PostMapping("pageAjax")
	public Map pageAjax(@RequestParam("page") String strPage,@RequestParam("rows") String strRows,HttpServletRequest request,HttpServletResponse response){	
		int pageNum = 0 ;
		int pageSize = 10 ;
		
		if(StringUtils.isNotBlank(strPage)) {
			pageNum = Integer.parseInt(strPage) ;
		}
		if(StringUtils.isNotBlank(strRows)) {
			pageSize = Integer.parseInt(strRows) ;
		}
		PageHelper.startPage(pageNum, pageSize);
		ProvinceExample example = new ProvinceExample();

		List<Province> listProvince = provinceService.selectByExample(example);
		PageInfo<Province> pageInfo  = new PageInfo<>(listProvince);
		Map<String, Object> map = new HashMap<>();
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getList());
		
		return map;
	}
	
	@RequestMapping("edit")
	public ModelAndView edit(@RequestParam(name="provinceId",required=false)String provinceId) {
		ModelAndView modelAndView = new ModelAndView("admin/transport/province_edit");
		if(StringUtils.isNotBlank(provinceId)) {
			Province province = provinceService.selectByPrimaryKey(provinceId);
			modelAndView.addObject("province", province);
		}else {
			
		}
		return modelAndView;
	}
	
	@RequestMapping("deleteAj")
	public String deleteAj( HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			String provinceId = request.getParameter("provinceId") ;
			provinceService.deleteByPrimaryKey(provinceId);
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
			provinceService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}
	
	@PostMapping("saveAj")
	public String saveAj(Province province, HttpServletRequest request, HttpServletResponse response) {
		String result = null ;
		try{
			if(!StringUtils.isEmpty(province.getProvinceId())){
				provinceService.updateByPrimaryKeySelective(province) ;
			}else{
				provinceService.insertSelective(province);
			}
		}catch(Exception ex){
			ex.printStackTrace();
			result = "保存失败" ;
		}
		//return "保存失败" ;
		return result ;
	}
}

