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
import com.jxlg.logistic.delivery.entity.Deliveryspot;
import com.jxlg.logistic.delivery.service.IDeliveryspotService;
import com.jxlg.logistic.transport.entity.Line;
import com.jxlg.logistic.transport.entity.Linedetail;
import com.jxlg.logistic.transport.queryview.LinedetailQueryView;
import com.jxlg.logistic.transport.service.ILineService;
import com.jxlg.logistic.transport.service.ILinedetailService;

@RestController
@RequestMapping("/admin/transport/linedetail/")
public class LinedetailAction {

	@Autowired
	ILinedetailService linedetailService;
	@Autowired
	ILineService lineService;
	@Autowired
	IDeliveryspotService deliveryspotService;

	@GetMapping("page")
	public ModelAndView page() {
		ModelAndView modelAndView = new ModelAndView("admin/transport/linedetail_list");
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
		List<LinedetailQueryView> listLinedetail = linedetailService.listView();
		PageInfo<LinedetailQueryView> pageInfo = new PageInfo<>(listLinedetail);
		Map<String, Object> map = new HashMap<>();
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getList());

		return map;
	}

	@RequestMapping("edit")
	public ModelAndView edit(@RequestParam(name = "linedetailId", required = false) String linedetailId) {
		ModelAndView modelAndView = new ModelAndView("admin/transport/linedetail_edit");
		if (StringUtils.isNotBlank(linedetailId)) {
			Linedetail linedetail = linedetailService.selectByPrimaryKey(linedetailId);
			modelAndView.addObject("linedetail", linedetail);
		} else {

		}
		// 路线编号 配送点编号
		List<Line> listLine = lineService.selectByExample(null);
		modelAndView.addObject("listLine", listLine);
		List<Deliveryspot> listDeliveryspot = deliveryspotService.selectByExample(null);
		modelAndView.addObject("listDeliveryspot", listDeliveryspot);
		return modelAndView;
	}

	@RequestMapping("deleteAj")
	public String deleteAj(HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			String linedetailId = request.getParameter("linedetailId");
			linedetailService.deleteByPrimaryKey(linedetailId);
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
			linedetailService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}

	@PostMapping("saveAj")
	public String saveAj(Linedetail linedetail, HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			if (!StringUtils.isEmpty(linedetail.getLinedetailId())) {
				linedetailService.updateByPrimaryKeySelective(linedetail);
			} else {
				linedetailService.insertSelective(linedetail);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			result = "保存失败";
		}
		// return "保存失败" ;
		return result;
	}
}
