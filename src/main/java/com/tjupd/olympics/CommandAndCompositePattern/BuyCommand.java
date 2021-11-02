package com.tjupd.olympics.CommandAndCompositePattern;

import com.tjupd.olympics.BuilderPattern.builders.FoodBuilder;
import com.tjupd.olympics.BuilderPattern.director.Director;
import com.tjupd.olympics.BuilderPattern.food.Food;
import com.tjupd.olympics.BuilderPattern.food.FoodType;

public class BuyCommand implements Command{
    //买的食物的种类和数量
    private FoodType buyfoottype;
    private int num;

    //构造
    public BuyCommand(FoodType buyfoottype, int num){
        this.buyfoottype = buyfoottype;
        this.num = num;
    }

    public FoodType getBuyfoottype() {
        return buyfoottype;
    }

    public int getNum() {
        return num;
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
        System.out.println("您购买了:         "+num+" 个 "+ food.getFoodtype()+
                "\n它具有这些营养:" +
                "\n                碳水化合物 " +food.getCarbohydrates()*num+
                "\n                脂类 "+food.getFats()*num+
                "\n                矿物质 "+food.getMinerals()*num+
                "\n                蛋白质 "+food.getProteins()*num+
                "\n                维生素 "+food.getVitamins()*num+
                "\n                水分 "+food.getWater()*num
        );
        System.out.println("---------------------------------\n");

    }
}
