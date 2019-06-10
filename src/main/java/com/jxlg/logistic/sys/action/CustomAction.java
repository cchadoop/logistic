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
import com.jxlg.logistic.constants.Contants;
import com.jxlg.logistic.data.entity.DataDictionaryDetail;
import com.jxlg.logistic.data.entity.DataDictionaryDetailExample;
import com.jxlg.logistic.data.entity.DataDictionaryDetailExample.Criteria;
import com.jxlg.logistic.data.service.IDataDictionaryDetailService;
import com.jxlg.logistic.sys.entity.Custom;
import com.jxlg.logistic.sys.service.ICustomService;

@RestController
@RequestMapping("/admin/sys/custom/")
public class CustomAction {

	@Autowired
	ICustomService customService;
	@Autowired
	IDataDictionaryDetailService dataDictionaryDetailService;
	
	@GetMapping("page")
	public ModelAndView page(){
		ModelAndView modelAndView = new ModelAndView("admin/sys/cst_list");
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
		
		//条件查询
		Custom custom = new Custom();
		String cstName = request.getParameter("cstName");
		String cstPhone = request.getParameter("cstPhone");
		if(StringUtils.isNotBlank(cstName)) {
			custom.setCstName(cstName);
		}
		if(StringUtils.isNotBlank(cstPhone)) {
			custom.setCstPhone(cstPhone);
		}
		PageHelper.startPage(pageNum, pageSize);
		List<Custom> listCustom = customService.listView(custom);
		PageInfo<Custom> pageInfo  = new PageInfo<>(listCustom);
		Map<String, Object> map = new HashMap<>();
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getList());
		
		return map;
	}
	
	@RequestMapping("edit")
	public ModelAndView edit(@RequestParam(name="cstId",required=false)String cstId) {
		ModelAndView modelAndView = new ModelAndView("admin/sys/cst_edit");
		if(StringUtils.isNotBlank(cstId)) {
			Custom custom = customService.selectByPrimaryKey(cstId);
			modelAndView.addObject("custom", custom);
		}else {
			
		}
		
		DataDictionaryDetailExample example = new DataDictionaryDetailExample();
		Criteria criteria = example.createCriteria();
		criteria.andDictionaryDetailCodeEqualTo(Contants.CST_STATUS);
		List<DataDictionaryDetail> listCstStatus = dataDictionaryDetailService.selectByExample(example );
		modelAndView.addObject("listCstStatus",listCstStatus);
		return modelAndView;
	}
	
	@RequestMapping("deleteAj")
	public String deleteAj( HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			String cstId = request.getParameter("cstId") ;
			customService.deleteByPrimaryKey(cstId);
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
			customService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}
	
	@PostMapping("saveAj")
	public String saveAj(Custom custom, HttpServletRequest request, HttpServletResponse response) {
		String result = null ;
//		customer.setAddress("no_pay");
		try{
			if(!StringUtils.isEmpty(custom.getCstId())){
				customService.updateByPrimaryKeySelective(custom) ;
			}else{
				customService.insertSelective(custom);
			}
		}catch(Exception ex){
			ex.printStackTrace();
			result = "保存失败" ;
		}
		//return "保存失败" ;
		return result ;
	}
}

