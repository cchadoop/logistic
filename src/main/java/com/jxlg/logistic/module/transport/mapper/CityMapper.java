package com.jxlg.logistic.module.transport.mapper;

import com.jxlg.logistic.module.transport.entity.City;
import com.jxlg.logistic.module.transport.entity.CityExample;
import com.jxlg.logistic.module.transport.queryview.CityQueryView;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface CityMapper {
    long countByExample(CityExample example);

    int deleteByExample(CityExample example);

    int deleteByPrimaryKey(String cityId);

    int insert(City record);

    int insertSelective(City record);

    List<City> selectByExample(CityExample example);

    City selectByPrimaryKey(String cityId);

    int updateByExampleSelective(@Param("record") City record, @Param("example") CityExample example);

    int updateByExample(@Param("record") City record, @Param("example") CityExample example);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
    
    @Select("SELECT c.*,p.province_name FROM t_city c LEFT JOIN t_province p ON c.province_id=p.province_id")
    @Results(value= {
    		@Result(column="city_id",property="cityId"),
    		@Result(column="city_name",property="cityName"),
    		@Result(column="province_id",property="provinceId"),
    		@Result(column="province_name",property="provinceName"),
    })
	List<CityQueryView> listView();
}