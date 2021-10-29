package com.tjupd.olympics.diet.CommandAndCompositePattern;

import com.tjupd.olympics.diet.BuilderPattern.builders.FoodBuilder;
import com.tjupd.olympics.diet.BuilderPattern.director.Director;
import com.tjupd.olympics.diet.BuilderPattern.food.Food;
import com.tjupd.olympics.diet.BuilderPattern.food.FoodType;

public class BuyCommand implements Command{
    //买的食物的种类和数量
    private FoodType buyfoottype;
    private int num;

    //构造
    public BuyCommand(FoodType buyfoottype, int num){
        this.buyfoottype = buyfoottype;
        this.num = num;
    }

    @Override
    public void buy(){
        //创建导演
        Director director = new Director();
        //创建工人
        FoodBuilder builder = new FoodBuilder();
        //让工人生产哪种食物
        switch(buyfoottype)
        {
            case Milk:director.BuyMilk(builder);break;
            case Egg:director.BuyEgg(builder);break;
            case Bread:director.BuyBread(builder);break;
            case Bonbon:director.BuyBonbon(builder);break;
            case Sausage:director.BuySausage(builder);break;
            default:
                throw new IllegalStateException("Unexpected value: " + buyfoottype);
        }
        Food food = builder.getResult();
        //food是builder创建的食物对象，再乘数量即可
        System.out.println("\n---------------------------------");
        System.out.println("Buy Food:       "+num+" tmies of "+ food.getFoodtype()+
                "\nWith nutrition:" +
                "\n                Carbohydrates " +food.getCarbohydrates()*num+
                "\n                Fats "+food.getFats()*num+
                "\n                Minerals "+food.getMinerals()*num+
                "\n                Proteins "+food.getProteins()*num+
                "\n                Vitamins "+food.getVitamins()*num+
                "\n                Water "+food.getWater()*num
        );
        System.out.println("---------------------------------\n");

    }
}
