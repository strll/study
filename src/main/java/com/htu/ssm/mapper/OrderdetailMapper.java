package com.htu.ssm.mapper;

import com.htu.ssm.po.Orderdetail;
import org.apache.ibatis.annotations.Mapper;

/**
* @author CuiXiaoFang
* @description 针对表【orderdetail】的数据库操作Mapper
* @createDate 2023-12-06 14:42:40
* @Entity com.htu.ssm.po.Orderdetail
*/
@Mapper
public interface OrderdetailMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Orderdetail record);

    int insertSelective(Orderdetail record);

    Orderdetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Orderdetail record);

    int updateByPrimaryKey(Orderdetail record);

}
