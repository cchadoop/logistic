package com.jxlg.logistic.module.transport.mapper;

import com.jxlg.logistic.module.transport.entity.Linedetail;
import com.jxlg.logistic.module.transport.entity.LinedetailExample;
import com.jxlg.logistic.module.transport.queryview.LinedetailQueryView;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface LinedetailMapper {
    long countByExample(LinedetailExample example);

    int deleteByExample(LinedetailExample example);

    int deleteByPrimaryKey(String linedetailId);

    int insert(Linedetail record);

    int insertSelective(Linedetail record);

    List<Linedetail> selectByExample(LinedetailExample example);

    Linedetail selectByPrimaryKey(String linedetailId);

    int updateByExampleSelective(@Param("record") Linedetail record, @Param("example") LinedetailExample example);

    int updateByExample(@Param("record") Linedetail record, @Param("example") LinedetailExample example);

    int updateByPrimaryKeySelective(Linedetail record);

    int updateByPrimaryKey(Linedetail record);

    @Select("SELECT ld.*,l.line_no,d.deliveryspot_no FROM t_linedetail ld LEFT JOIN t_line l ON ld.line_id=l.line_id LEFT JOIN d_deliveryspot d ON ld.deliveryspot_id=d.deliveryspot_id")
    @Results(value= {
    		@Result(column="linedetail_id",property="linedetailId"),
    		@Result(column="line_id",property="lineId"),
    		@Result(column="deliveryspot_id",property="deliveryspotId"),
    		@Result(column="line_index",property="lineIndex"),
    		@Result(column="line_no",property="lineNo"),
    		@Result(column="deliveryspot_no",property="deliveryspotNo"),
    })
	List<LinedetailQueryView> listView();
}