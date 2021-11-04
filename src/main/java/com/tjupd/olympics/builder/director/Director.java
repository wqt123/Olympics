package com.tjupd.olympics.builder.director;

import com.tjupd.olympics.builder.builders.Builder;
import com.tjupd.olympics.builder.food.FoodType;

public class Director {
    //Milk, Egg, Bread, Bonbon, Sausage等食品的营养物质的数量
    public void BuyMilk(Builder builder) {
        builder.setFoodtype(FoodType.Milk);
        builder.setCarbohydrates(12);
        builder.setFats(4);
        builder.setMinerals(34);
        builder.setProteins(50);
        builder.setVitamins(15);
        builder.setWater(40);
    }

    public void BuyEgg(Builder builder) {
        builder.setFoodtype(FoodType.Egg);
        builder.setCarbohydrates(20);
        builder.setFats(30);
        builder.setMinerals(13);
        builder.setProteins(20);
        builder.setVitamins(24);
        builder.setWater(32);
    }

    public void BuyBread(Builder builder) {
        builder.setFoodtype(FoodType.Bread);
        builder.setCarbohydrates(23);
        builder.setFats(32);
        builder.setMinerals(14);
        builder.setProteins(24);
        builder.setVitamins(17);
        builder.setWater(9);
    }

    public void BuyBonbon(Builder builder) {
        builder.setFoodtype(FoodType.Bonbon);
        builder.setCarbohydrates(7);
        builder.setFats(4);
        builder.setMinerals(42);
        builder.setProteins(61);
        builder.setVitamins(12);
        builder.setWater(9);
    }

    public void BuySausage(Builder builder) {
        builder.setFoodtype(FoodType.Sausage);
        builder.setCarbohydrates(10);
        builder.setFats(22);
        builder.setMinerals(3);
        builder.setProteins(44);
        builder.setVitamins(17);
        builder.setWater(8);
    }
}
