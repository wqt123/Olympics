package com.tjupd.olympics.builderPattern.builders;

import com.tjupd.olympics.builderPattern.food.FoodType;

public interface Builder {
    public void setFoodtype(FoodType foodtype);

    public void setWater(int water);

    public void setCarbohydrates(int carbohydrates);

    public void setProteins(int proteins);

    public void setFats(int fats);

    public void setVitamins(int vitamins);

    public void setMinerals(int minerals);
}
