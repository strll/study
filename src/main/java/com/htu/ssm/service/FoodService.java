package com.htu.ssm.service;

import com.htu.ssm.po.Food;

import java.util.List;

public interface FoodService {
    List<Food> getFoods(String wd);

    int delFoodByNo(Long foodCateId);

    Food getFoodByNo(Long foodCateId);

    int addFood(Food food);

    int editFood(Food food);

    List<Food> getAllFood();
}
