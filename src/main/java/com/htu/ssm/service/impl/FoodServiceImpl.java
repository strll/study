package com.htu.ssm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.htu.ssm.mapper.FoodMapper;
import com.htu.ssm.po.Food;
import com.htu.ssm.service.FoodService;
import com.mysql.cj.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {
    @Autowired
    private FoodMapper foodMapper;

    @Override
    public List<Food> getFoods(String wd) {
        LambdaQueryWrapper<Food> objectLambdaQueryWrapper = new LambdaQueryWrapper<>();
        objectLambdaQueryWrapper.like(!StringUtils.isNullOrEmpty(wd),Food::getFoodName,wd);
        List<Food> foods = foodMapper.selectList(objectLambdaQueryWrapper);


        return foods;
    }

    @Override
    public int delFoodByNo(Long foodCateId) {
        return foodMapper.deleteByPrimaryKey(foodCateId);
    }

    @Override
    public Food getFoodByNo(Long foodCateId) {
        return foodMapper.selectByPrimaryKey(foodCateId);
    }

    @Override
    public int addFood(Food food) {
        return foodMapper.insertSelective(food);
    }

    @Override
    public int editFood(Food food) {
        return foodMapper.updateByPrimaryKeySelective(food);
    }

    @Override
    public List<Food> getAllFood() {
        return foodMapper.getAll();
    }
}
