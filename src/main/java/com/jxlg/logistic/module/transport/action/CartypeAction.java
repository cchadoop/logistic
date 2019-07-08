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
import com.jxlg.logistic.module.transport.entity.Cartype;
import com.jxlg.logistic.module.transport.entity.CartypeExample;
import com.jxlg.logistic.module.transport.service.ICartypeService;

@RestController
@RequestMapping("/admin/transport/cartype/")
public class CartypeAction {

	@Autowired
	ICartypeService cartypeService;
	
	@GetMapping("page")
	public ModelAndView page(){
		ModelAndView modelAndView = new ModelAndView("admin/transport/cartype_list");
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
		CartypeExample example = new CartypeExample();

		List<Cartype> listCartype = cartypeService.selectByExample(example);
		PageInfo<Cartype> pageInfo  = new PageInfo<>(listCartype);
		Map<String, Object> map = new HashMap<>();
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getList());
		
		return map;
	}
	
	@RequestMapping("edit")
	public ModelAndView edit(@RequestParam(name="cartypeId",required=false)String cartypeId) {
		ModelAndView modelAndView = new ModelAndView("admin/transport/cartype_edit");
		if(StringUtils.isNotBlank(cartypeId)) {
			Cartype cartype = cartypeService.selectByPrimaryKey(cartypeId);
			modelAndView.addObject("cartype", cartype);
		}else {
			
		}
		return modelAndView;
	}
	
	@RequestMapping("deleteAj")
	public String deleteAj( HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			String cartypeId = request.getParameter("cartypeId") ;
			cartypeService.deleteByPrimaryKey(cartypeId);
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
			cartypeService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}
	
	@PostMapping("saveAj")
	public String saveAj(Cartype cartype, HttpServletRequest request, HttpServletResponse response) {
		String result = null ;
		try{
			if(!StringUtils.isEmpty(cartype.getCartypeId())){
				cartypeService.updateByPrimaryKeySelective(cartype) ;
			}else{
				cartypeService.insertSelective(cartype);
			}
		}catch(Exception ex){
			ex.printStackTrace();
			result = "保存失败" ;
		}
		//return "保存失败" ;
		return result ;
	}
}

