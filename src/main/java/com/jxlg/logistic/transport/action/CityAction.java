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
import com.jxlg.logistic.transport.entity.City;
import com.jxlg.logistic.transport.entity.Province;
import com.jxlg.logistic.transport.queryview.CityQueryView;
import com.jxlg.logistic.transport.service.ICityService;
import com.jxlg.logistic.transport.service.IProvinceService;

@RestController
@RequestMapping("/admin/transport/city/")
public class CityAction {

	@Autowired
	ICityService cityService;
	@Autowired
	IProvinceService provinceService;

	@GetMapping("page")
	public ModelAndView page() {
		ModelAndView modelAndView = new ModelAndView("admin/transport/city_list");
		return modelAndView;
	}

	@SuppressWarnings("rawtypes")
	@PostMapping("pageAjax")
	public Map pageAjax(@RequestParam("page") String strPage, @RequestParam("rows") String strRows,
			HttpServletRequest request, HttpServletResponse response) {
		int pageNum = 0;
		int pageSize = 10;

		if (StringUtils.isNotBlank(strPage)) {
			pageNum = Integer.parseInt(strPage);
		}
		if (StringUtils.isNotBlank(strRows)) {
			pageSize = Integer.parseInt(strRows);
		}
		PageHelper.startPage(pageNum, pageSize);

		List<CityQueryView> listCity = cityService.listView();
		PageInfo<CityQueryView> pageInfo = new PageInfo<>(listCity);
		Map<String, Object> map = new HashMap<>();
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getList());
		return map;
	}

	@RequestMapping("edit")
	public ModelAndView edit(@RequestParam(name = "cityId", required = false) String cityId) {
		ModelAndView modelAndView = new ModelAndView("admin/transport/city_edit");
		if (StringUtils.isNotBlank(cityId)) {
			City city = cityService.selectByPrimaryKey(cityId);
			modelAndView.addObject("city", city);
		} else {

		}
		// 省份
		List<Province> listProvince = provinceService.selectByExample(null);
		modelAndView.addObject("listProvince", listProvince);
		return modelAndView;
	}

	@RequestMapping("deleteAj")
	public String deleteAj(HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			String cityId = request.getParameter("cityId");
			cityService.deleteByPrimaryKey(cityId);
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
			cityService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}

	@PostMapping("saveAj")
	public String saveAj(City city, HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			if (!StringUtils.isEmpty(city.getCityId())) {
				cityService.updateByPrimaryKeySelective(city);
			} else {
				cityService.insertSelective(city);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			result = "保存失败";
		}
		// return "保存失败" ;
		return result;
	}
}
