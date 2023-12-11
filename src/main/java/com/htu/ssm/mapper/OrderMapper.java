package com.htu.ssm.mapper;

import com.htu.ssm.po.Order;
import org.apache.ibatis.annotations.Mapper;

/**
* @author CuiXiaoFang
* @description 针对表【order】的数据库操作Mapper
* @createDate 2023-12-06 14:42:40
* @Entity com.htu.ssm.po.Order
*/
@Mapper
public interface OrderMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

}
