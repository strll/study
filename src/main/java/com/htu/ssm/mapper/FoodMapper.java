package com.htu.ssm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.htu.ssm.po.Food;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author CuiXiaoFang
* @description 针对表【food】的数据库操作Mapper
* @createDate 2023-12-06 14:42:40
* @Entity com.htu.ssm.po.Food
*/
@Mapper
public interface FoodMapper  extends BaseMapper<Food> {

    int deleteByPrimaryKey(Long id);

    int insert(Food record);

    int insertSelective(Food record);

    Food selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Food record);

    int updateByPrimaryKey(Food record);

    List<Food> getFoodAll(@Param("wd") String wd);

    List<Food> getAll();
}
