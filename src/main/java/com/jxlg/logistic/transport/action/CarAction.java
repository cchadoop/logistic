package com.jxlg.logistic.transport.action;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jxlg.logistic.ResultVo;
import com.jxlg.logistic.constants.Contants;
import com.jxlg.logistic.data.entity.DataDictionaryDetail;
import com.jxlg.logistic.data.entity.DataDictionaryDetailExample;
import com.jxlg.logistic.data.entity.DataDictionaryDetailExample.Criteria;
import com.jxlg.logistic.data.service.IDataDictionaryDetailService;
import com.jxlg.logistic.transport.entity.Car;
import com.jxlg.logistic.transport.entity.Cartype;
import com.jxlg.logistic.transport.entity.Driver;
import com.jxlg.logistic.transport.entity.Line;
import com.jxlg.logistic.transport.queryview.CarQueryView;
import com.jxlg.logistic.transport.service.ICarService;
import com.jxlg.logistic.transport.service.ICartypeService;
import com.jxlg.logistic.transport.service.IDriverService;
import com.jxlg.logistic.transport.service.ILineService;

@RestController
@RequestMapping("/admin/transport/car/")
public class CarAction {

	private static final Logger logger = LoggerFactory.getLogger(CarAction.class);
	
	@Autowired
	ICarService carService;
	@Autowired
	IDataDictionaryDetailService dataDictionaryDetailService;
	@Autowired
	ICartypeService cartypeService;
	@Autowired
	ILineService lineService;
	@Autowired
	IDriverService driverService;

	@GetMapping("page")
	public ModelAndView page() {
		ModelAndView modelAndView = new ModelAndView("admin/transport/car_list");
		List<Cartype> listCartype = cartypeService.selectByExample(null);
		List<Driver> listDriver = driverService.selectByExample(null);
		modelAndView.addObject("listCartype", listCartype);
		modelAndView.addObject("listDriver", listDriver);
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
		// 条件查询
		Car car = new Car();
		// 图片回显

		/*
		 * InputStream in = null; FileOutputStream out =null; try { in =
		 * request.getInputStream(); String imageUrl = car.getImage(); File file = new
		 * File(imageUrl); out = new FileOutputStream(file); byte[] b = new byte[1024 *
		 * 10]; int count = 0; while ((count = in.read(b)) != -1) { out.write(b, 0,
		 * count); } } catch (Exception e) { e.printStackTrace(); } finally { try {
		 * out.close(); in.close(); } catch (IOException e) { e.printStackTrace(); } }
		 */

		String cartypeId = request.getParameter("cartypeId");
		String driverId = request.getParameter("driverId");
		if (StringUtils.isNotBlank(cartypeId)) {
			car.setCartypeId(cartypeId);
		}
		if (StringUtils.isNotBlank(driverId)) {
			car.setDriverId(driverId);
		}
		List<CarQueryView> listCar = carService.listView(car);
		PageInfo<CarQueryView> pageInfo = new PageInfo<>(listCar);
		Map<String, Object> map = new HashMap<>();
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getList());
		return map;
	}

	@RequestMapping("edit")
	public ModelAndView edit(@RequestParam(name = "carId", required = false) String carId) {
		ModelAndView modelAndView = new ModelAndView("admin/transport/car_edit");
		if (StringUtils.isNotBlank(carId)) {
			Car car = carService.selectByPrimaryKey(carId);
			modelAndView.addObject("car", car);
		} else {

		}
		// 车辆类型，路线编号，司机编号，车辆状态下拉列表
		List<Cartype> listCartype = cartypeService.selectByExample(null);
		List<Line> listLine = lineService.selectByExample(null);
		List<Driver> listDriver = driverService.selectByExample(null);
		modelAndView.addObject("listCartype", listCartype);
		modelAndView.addObject("listLine", listLine);
		modelAndView.addObject("listDriver", listDriver);
		DataDictionaryDetailExample exampleCarStatus = new DataDictionaryDetailExample();
		Criteria criteria = exampleCarStatus.createCriteria();
		criteria.andDictionaryDetailCodeEqualTo(Contants.CAR_STATUS);
		List<DataDictionaryDetail> listCarStatus = dataDictionaryDetailService.selectByExample(exampleCarStatus);
		modelAndView.addObject("listCarStatus", listCarStatus);
		return modelAndView;
	}

	@RequestMapping("deleteAj")
	public String deleteAj(HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			String carId = request.getParameter("carId");
			carService.deleteByPrimaryKey(carId);
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
			carService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}

	/*@PostMapping("saveAj")
	public String saveAj(Car car, HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			if (!StringUtils.isEmpty(car.getCarId())) {
				carService.updateByPrimaryKeySelective(car);
			} else {
				carService.insertSelective(car);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			result = "保存失败";
		}
		return result;
	}*/

	@SuppressWarnings("rawtypes")
	@PostMapping("saveAj")
	public ResultVo saveAj(Car car, MultipartFile file, HttpServletRequest request, HttpServletResponse response) {
		ResultVo resultVo = new ResultVo<>();
		try {
			String originalFilename = file.getOriginalFilename();
			if(StringUtils.isNotBlank(originalFilename)) {
				SimpleDateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");
				String date = df.format(new Date());
				// String filePath = "src/main/resources/upload";
				String serverPath = request.getSession().getServletContext().getRealPath("");
				logger.debug("服务器根目录："+serverPath); ///Users/psy/eclipse-workspace/logistic/src/main/webapp/
				String filePath = serverPath+"upload";
				
				String extendName = originalFilename.substring(originalFilename.lastIndexOf("."),
						originalFilename.length());// 后缀名
				String fileName = date + extendName;
				File targetFile = new File(filePath);
				File dest = new File(filePath, fileName);
				if (!targetFile.exists()) {
					targetFile.mkdirs();
				}
				file.transferTo(dest);

				if (!StringUtils.isEmpty(car.getCarId())) {
					car.setImage(fileName);
					carService.updateByPrimaryKeySelective(car);
				} else {
					car.setImage(fileName);
					carService.insertSelective(car);
				}
			}
			resultVo.setCode(0);
			resultVo.setMsg("success");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return resultVo;
	}
	
}
