package com.tjupd.olympics.diet.BuilderPattern;

import java.util.Scanner;

import com.tjupd.olympics.diet.BuilderPattern.builders.FoodBuilder;
import com.tjupd.olympics.diet.BuilderPattern.director.Director;
import com.tjupd.olympics.diet.BuilderPattern.food.Food;

public class Demo {
    public static void main(String[] args) {
        //选择了购买食物这一块
        //列出所有的食物
        System.out.println("Please select the type of the food:\n [1]Milk [2]Egg [3]Bread [4]Bonbon [5]Sausage");
        //接受输入
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(str);


        //创建导演
        Director director = new Director();
        //创建工人
        FoodBuilder builder = new FoodBuilder();
        //让工人生产哪种食物
        switch(str)
        {
            case "1":director.BuyMilk(builder);break;
            case "2":director.BuyEgg(builder);break;
            case "3":director.BuyBread(builder);break;
            case "4":director.BuyBonbon(builder);break;
            case "5":director.BuySausage(builder);break;
            default:
                throw new IllegalStateException("Unexpected value: " + str);
        }
        Food food = builder.getResult();
        System.out.println("Buy Food:  " + food.getFoodtype()+
                "\n\nWith nutrition:" +
                "\nCarbohydrates " +food.getCarbohydrates()+
                "\nFats "+food.getFats()+
                "\nMinerals "+food.getMinerals()+
                "\nProteins "+food.getProteins()+
                "\nVitamins "+food.getVitamins()+
                "\nWater "+food.getWater()
        );


//        CarManualBuilder manualBuilder = new CarManualBuilder();
//        director.constructSportsCar(manualBuilder);
//        Manual carManual = manualBuilder.getResult();
//        System.out.println("\nCar manual built:\n" + carManual.print());

    }
}