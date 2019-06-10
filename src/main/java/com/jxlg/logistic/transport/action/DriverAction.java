package com.jxlg.logistic.transport.action;

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
import com.jxlg.logistic.transport.entity.Driver;
import com.jxlg.logistic.transport.service.IDriverService;

@RestController
@RequestMapping("/admin/transport/driver/")
public class DriverAction {

	@Autowired
	IDriverService driverService;
	@Autowired
	IDataDictionaryDetailService dataDictionaryDetailService;
	
	@GetMapping("page")
	public ModelAndView page(){
		ModelAndView modelAndView = new ModelAndView("admin/transport/driver_list");
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
		Driver driver = new Driver();
		String driverName = request.getParameter("driverName");
		String driverSex = request.getParameter("driverSex");
		if(StringUtils.isNotBlank(driverName)) {
			driver.setDriverName(driverName);
		}
		if(StringUtils.isNotBlank(driverSex)) {
			driver.setDriverSex(driverSex);
		}
		List<Driver> listDriver = driverService.listView(driver);
		PageInfo<Driver> pageInfo  = new PageInfo<>(listDriver);
		PageHelper.startPage(pageNum, pageSize);
		Map<String, Object> map = new HashMap<>();
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getList());
		
		return map;
	}
	
	@RequestMapping("edit")
	public ModelAndView edit(@RequestParam(name="driverId",required=false)String driverId) {
		ModelAndView modelAndView = new ModelAndView("admin/transport/driver_edit");
		if(StringUtils.isNotBlank(driverId)) {
			Driver driver = driverService.selectByPrimaryKey(driverId);
			modelAndView.addObject("driver", driver);
		}else {
			
		}
		//司机认证状态
		DataDictionaryDetailExample example = new DataDictionaryDetailExample();
		Criteria criteria = example.createCriteria();
		criteria.andDictionaryDetailCodeEqualTo(Contants.DRIVER_STATUS);
		List<DataDictionaryDetail> listDriverStatus = dataDictionaryDetailService.selectByExample(example);
		modelAndView.addObject("listDriverStatus", listDriverStatus);
		return modelAndView;
	}
	
	@RequestMapping("deleteAj")
	public String deleteAj( HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			String driverId = request.getParameter("driverId") ;
			driverService.deleteByPrimaryKey(driverId);
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
			driverService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}
	
	@PostMapping("saveAj")
	public String saveAj(Driver driver, HttpServletRequest request, HttpServletResponse response) {
		String result = null ;
		try{
			if(!StringUtils.isEmpty(driver.getDriverId())){
				driverService.updateByPrimaryKeySelective(driver) ;
			}else{
				driverService.insertSelective(driver);
			}
		}catch(Exception ex){
			ex.printStackTrace();
			result = "保存失败" ;
		}
		//return "保存失败" ;
		return result ;
	}
}

