package com.htu.ssm.controller;

import com.htu.ssm.po.Food;
import com.htu.ssm.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {
    @Autowired
    private FoodService foodService;

    @RequestMapping("/all")
    public List<Food> getAllFoods(String wd){
        return foodService.getFoods(wd);
    }

    @GetMapping("/get")
    public Food getFood(Long foodCateId){
        return foodService.getFoodByNo(foodCateId);
    }
    @PostMapping("/del")
    public int delFoodByNo(Long foodCateId){
        return foodService.delFoodByNo(foodCateId);
    }

    @PostMapping("/add")
    public int addFood(@RequestBody Food food){
        return foodService.addFood(food);
    }
    @PostMapping("/edit")
    public int editFood(@RequestBody Food food){
        return foodService.editFood(food);
    }
}
