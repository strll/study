package com.htu.ssm.mapper;

import com.htu.ssm.po.Cart;
import org.apache.ibatis.annotations.Mapper;

/**
* @author CuiXiaoFang
* @description 针对表【cart】的数据库操作Mapper
* @createDate 2023-12-06 14:42:40
* @Entity com.htu.ssm.po.Cart
*/
@Mapper
public interface CartMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

}
