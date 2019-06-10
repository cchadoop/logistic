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
import com.jxlg.logistic.data.entity.DataDictionaryDetail;
import com.jxlg.logistic.data.entity.DataDictionaryDetailExample;
import com.jxlg.logistic.data.service.IDataDictionaryDetailService;

@RestController
@RequestMapping("/admin/data/dataDictionaryDetail/")
public class DataDictionaryDetailAction {

	@Autowired
	IDataDictionaryDetailService dataDictionaryDetailService;
	
	@GetMapping("page")
	public ModelAndView page(){
		ModelAndView modelAndView = new ModelAndView("admin/data/dataDictionaryDetail_list");
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
		DataDictionaryDetailExample example = new DataDictionaryDetailExample();

		List<DataDictionaryDetail> listDataDictionaryDetail = dataDictionaryDetailService.selectByExample(example);
		PageInfo<DataDictionaryDetail> pageInfo  = new PageInfo<>(listDataDictionaryDetail);
		Map<String, Object> map = new HashMap<>();
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getList());
		
		return map;
	}
	
	@RequestMapping("edit")
	public ModelAndView edit(@RequestParam(name="dictionaryDetailId",required=false)String dictionaryDetailId) {
		ModelAndView modelAndView = new ModelAndView("admin/data/dataDictionaryDetail_edit");
		if(StringUtils.isNotBlank(dictionaryDetailId)) {
			DataDictionaryDetail dataDictionaryDetail = dataDictionaryDetailService.selectByPrimaryKey(dictionaryDetailId);
			modelAndView.addObject("dataDictionaryDetail", dataDictionaryDetail);
		}else {
			
		}
		return modelAndView;
	}
	
	@RequestMapping("deleteAj")
	public String deleteAj( HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			String dataDictionaryDetailId = request.getParameter("dataDictionaryDetailId") ;
			dataDictionaryDetailService.deleteByPrimaryKey(dataDictionaryDetailId);
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
			dataDictionaryDetailService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}
	
	@PostMapping("saveAj")
	public String saveAj(DataDictionaryDetail dataDictionaryDetail, HttpServletRequest request, HttpServletResponse response) {
		String result = null ;
		try{
			if(!StringUtils.isEmpty(dataDictionaryDetail.getDictionaryDetailId())){
				dataDictionaryDetailService.updateByPrimaryKeySelective(dataDictionaryDetail) ;
			}else{
				dataDictionaryDetailService.insertSelective(dataDictionaryDetail);
			}
		}catch(Exception ex){
			ex.printStackTrace();
			result = "保存失败" ;
		}
		//return "保存失败" ;
		return result ;
	}
}

