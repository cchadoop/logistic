package com.jxlg.logistic.data.action;

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
import com.jxlg.logistic.data.entity.DataDictionary;
import com.jxlg.logistic.data.entity.DataDictionaryExample;
import com.jxlg.logistic.data.service.IDataDictionaryService;

@RestController
@RequestMapping("/admin/data/dataDictionary/")
public class DataDictionaryAction {

	@Autowired
	IDataDictionaryService dataDictionaryService;
	
	@GetMapping("page")
	public ModelAndView page(){
		ModelAndView modelAndView = new ModelAndView("admin/data/dataDictionary_list");
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
		DataDictionaryExample example = new DataDictionaryExample();

		List<DataDictionary> listDataDictionary = dataDictionaryService.selectByExample(example);
		PageInfo<DataDictionary> pageInfo  = new PageInfo<>(listDataDictionary);
		Map<String, Object> map = new HashMap<>();
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getList());
		
		return map;
	}
	
	@RequestMapping("edit")
	public ModelAndView edit(@RequestParam(name="dataDictionaryId",required=false)String dataDictionaryId) {
		ModelAndView modelAndView = new ModelAndView("admin/data/dataDictionary_edit");
		if(StringUtils.isNotBlank(dataDictionaryId)) {
			DataDictionary dataDictionary = dataDictionaryService.selectByPrimaryKey(dataDictionaryId);
			modelAndView.addObject("dataDictionary", dataDictionary);
		}else {
			
		}
		return modelAndView;
	}
	
	@RequestMapping("deleteAj")
	public String deleteAj( HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			String dataDictionaryId = request.getParameter("dataDictionaryId") ;
			dataDictionaryService.deleteByPrimaryKey(dataDictionaryId);
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
			dataDictionaryService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}
	
	@PostMapping("saveAj")
	public String saveAj(DataDictionary dataDictionary, HttpServletRequest request, HttpServletResponse response) {
		String result = null ;
		try{
			if(!StringUtils.isEmpty(dataDictionary.getDataDictionaryId())){
				dataDictionaryService.updateByPrimaryKeySelective(dataDictionary) ;
			}else{
				dataDictionaryService.insertSelective(dataDictionary);
			}
		}catch(Exception ex){
			ex.printStackTrace();
			result = "保存失败" ;
		}
		//return "保存失败" ;
		return result ;
	}
}

