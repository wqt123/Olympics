package com.tjupd.olympics.BuilderPattern.director;

import com.tjupd.olympics.BuilderPattern.builders.Builder;
import com.tjupd.olympics.BuilderPattern.food.FoodType;

public class Director {
    //Milk, Egg, Bread, Bonbon, Sausage等食品的营养物质的数量
    public void BuyMilk(Builder builder) {
        builder.setFoodtype(FoodType.Milk);
        builder.setCarbohydrates(1);
        builder.setFats(1);
        builder.setMinerals(1);
        builder.setProteins(1);
        builder.setVitamins(1);
        builder.setWater(1);
    }

    public void BuyEgg(Builder builder) {
        builder.setFoodtype(FoodType.Egg);
        builder.setCarbohydrates(2);
        builder.setFats(2);
        builder.setMinerals(2);
        builder.setProteins(2);
        builder.setVitamins(2);
        builder.setWater(2);
    }

    public void BuyBread(Builder builder) {
        builder.setFoodtype(FoodType.Bread);
        builder.setCarbohydrates(3);
        builder.setFats(3);
        builder.setMinerals(3);
        builder.setProteins(3);
        builder.setVitamins(3);
        builder.setWater(3);
    }

    public void BuyBonbon(Builder builder) {
        builder.setFoodtype(FoodType.Bonbon);
        builder.setCarbohydrates(4);
        builder.setFats(4);
        builder.setMinerals(4);
        builder.setProteins(4);
        builder.setVitamins(4);
        builder.setWater(4);
    }

    public void BuySausage(Builder builder) {
        builder.setFoodtype(FoodType.Sausage);
        builder.setCarbohydrates(4);
        builder.setFats(4);
        builder.setMinerals(4);
        builder.setProteins(4);
        builder.setVitamins(4);
        builder.setWater(4);
    }
}
