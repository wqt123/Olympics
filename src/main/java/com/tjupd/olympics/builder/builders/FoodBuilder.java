package com.tjupd.olympics.builder.builders;

import com.tjupd.olympics.builder.food.Food;
import com.tjupd.olympics.builder.food.FoodType;

public class FoodBuilder implements Builder{
    //食物类型
    private FoodType foodtype;
    //六种营养物质
    private int Water;
    private int Carbohydrates;
    private int Proteins;
    private int Fats;
    private int Vitamins;
    private int Minerals;


    //构建各种食物的属性的具体构造方法
    @Override
    public void setFoodtype(FoodType foodtype) {
        this.foodtype = foodtype;
    }

    @Override
    public void setWater(int water) {
        Water = water;
    }

    @Override
    public void setCarbohydrates(int carbohydrates) {
        Carbohydrates = carbohydrates;
    }

    @Override
    public void setProteins(int proteins) {
        Proteins = proteins;
    }

    @Override
    public void setFats(int fats) {
        Fats = fats;
    }

    @Override
    public void setVitamins(int vitamins) {
        Vitamins = vitamins;
    }

    @Override
    public void setMinerals(int minerals) {
        Minerals = minerals;
    }

    public Food getResult() {
        return new Food(foodtype, Water, Carbohydrates, Proteins, Fats, Vitamins, Minerals);
    }
}
