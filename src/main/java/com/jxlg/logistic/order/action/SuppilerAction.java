package com.jxlg.logistic.order.action;

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
import com.jxlg.logistic.order.entity.Suppiler;
import com.jxlg.logistic.order.service.ISuppilerService;

@RestController
@RequestMapping("/admin/order/suppiler/")
public class SuppilerAction {

	@Autowired
	ISuppilerService suppilerService;
	@Autowired
	IDataDictionaryDetailService dataDictionaryDetailService;

	@GetMapping("page")
	public ModelAndView page() {
		ModelAndView modelAndView = new ModelAndView("admin/order/suppiler_list");
		DataDictionaryDetailExample exampleSuppilerType = new DataDictionaryDetailExample();
		Criteria criteria = exampleSuppilerType.createCriteria();
		criteria.andDictionaryDetailCodeEqualTo(Contants.SUPPILER_TYPE);
		List<DataDictionaryDetail> listSuppilerType = dataDictionaryDetailService.selectByExample(exampleSuppilerType);
		modelAndView.addObject("listSuppilerType", listSuppilerType);
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

		Suppiler suppiler = new Suppiler();
		// 条件查询
		String suppilerName = request.getParameter("suppilerName");
		String suppilerType = request.getParameter("suppilerType");
		if (StringUtils.isNotBlank(suppilerName)) {
			suppiler.setSuppilerName(suppilerName);
		}
		if (StringUtils.isNotBlank(suppilerType)) {
			suppiler.setSuppilerType(suppilerType);
		}
		List<Suppiler> listSuppiler = suppilerService.listView(suppiler);

		PageInfo<Suppiler> pageInfo = new PageInfo<>(listSuppiler);
		Map<String, Object> map = new HashMap<>();
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getList());

		return map;
	}

	@RequestMapping("edit")
	public ModelAndView edit(@RequestParam(name = "suppilerId", required = false) String suppilerId) {
		ModelAndView modelAndView = new ModelAndView("admin/order/suppiler_edit");
		if (StringUtils.isNotBlank(suppilerId)) {
			Suppiler suppiler = suppilerService.selectByPrimaryKey(suppilerId);
			modelAndView.addObject("suppiler", suppiler);
		} else {

		}
		// 供应商类型
		DataDictionaryDetailExample exampleSuppilerType = new DataDictionaryDetailExample();
		Criteria criteria = exampleSuppilerType.createCriteria();
		criteria.andDictionaryDetailCodeEqualTo(Contants.SUPPILER_TYPE);
		List<DataDictionaryDetail> listSuppilerType = dataDictionaryDetailService.selectByExample(exampleSuppilerType);
		modelAndView.addObject("listSuppilerType", listSuppilerType);
		// 是否有效
		DataDictionaryDetailExample exampleIsVail = new DataDictionaryDetailExample();
		criteria = exampleIsVail.createCriteria();
		criteria.andDictionaryDetailCodeEqualTo(Contants.ISVAIL);
		List<DataDictionaryDetail> listIsVail = dataDictionaryDetailService.selectByExample(exampleIsVail);
		modelAndView.addObject("listIsVail", listIsVail);
		// 是否删除
		DataDictionaryDetailExample exampleIsDel = new DataDictionaryDetailExample();
		criteria = exampleIsDel.createCriteria();
		criteria.andDictionaryDetailCodeEqualTo(Contants.ISDEL);
		List<DataDictionaryDetail> listIsDel = dataDictionaryDetailService.selectByExample(exampleIsDel);
		modelAndView.addObject("listIsDel", listIsDel);
		return modelAndView;
	}

	@RequestMapping("deleteAj")
	public String deleteAj(HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			String suppilerId = request.getParameter("suppilerId");
			suppilerService.deleteByPrimaryKey(suppilerId);
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
			suppilerService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}

	@PostMapping("saveAj")
	public String saveAj(Suppiler suppiler, HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			if (!StringUtils.isEmpty(suppiler.getSuppilerId())) {
				suppilerService.updateByPrimaryKeySelective(suppiler);
			} else {
				suppilerService.insertSelective(suppiler);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			result = "保存失败";
		}
		// return "保存失败" ;
		return result;
	}
}
