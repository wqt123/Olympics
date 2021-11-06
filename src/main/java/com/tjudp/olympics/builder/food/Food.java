package com.tjudp.olympics.builder.food;

public class Food {
    //食物类型
    private FoodType foodtype;
    //六种营养物质
    private int Water;
    private int Carbohydrates;
    private int Proteins;
    private int Fats;
    private int Vitamins;
    private int Minerals;

    public Food(FoodType foodtype, int water, int carbohydrates, int proteins, int fats, int vitamins, int minerals) {
        this.foodtype = foodtype;
        Water = water;
        Carbohydrates = carbohydrates;
        Proteins = proteins;
        Fats = fats;
        Vitamins = vitamins;
        Minerals = minerals;
    }

    public FoodType getFoodtype() {
        return foodtype;
    }

    public int getWater() {
        return Water;
    }

    public int getCarbohydrates() {
        return Carbohydrates;
    }

    public int getProteins() {
        return Proteins;
    }

    public int getFats() {
        return Fats;
    }

    public int getVitamins() {
        return Vitamins;
    }

    public int getMinerals() {
        return Minerals;
    }
}
