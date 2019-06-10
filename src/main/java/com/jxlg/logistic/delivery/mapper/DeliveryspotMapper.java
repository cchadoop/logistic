package com.jxlg.logistic.delivery.mapper;

import com.jxlg.logistic.delivery.entity.Deliveryspot;
import com.jxlg.logistic.delivery.entity.DeliveryspotExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliveryspotMapper {
    long countByExample(DeliveryspotExample example);

    int deleteByExample(DeliveryspotExample example);

    int deleteByPrimaryKey(String deliveryspotId);

    int insert(Deliveryspot record);

    int insertSelective(Deliveryspot record);

    List<Deliveryspot> selectByExample(DeliveryspotExample example);

    Deliveryspot selectByPrimaryKey(String deliveryspotId);

    int updateByExampleSelective(@Param("record") Deliveryspot record, @Param("example") DeliveryspotExample example);

    int updateByExample(@Param("record") Deliveryspot record, @Param("example") DeliveryspotExample example);

    int updateByPrimaryKeySelective(Deliveryspot record);

    int updateByPrimaryKey(Deliveryspot record);
}