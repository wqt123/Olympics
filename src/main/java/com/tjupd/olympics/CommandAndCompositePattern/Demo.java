package com.tjupd.olympics.CommandAndCompositePattern;

import com.tjupd.olympics.BuilderPattern.food.FoodType;

//静态导入什么鬼来着？

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Athletes athletes = new Athletes();
        boolean stop = false;
        while(!stop)
        {
            FoodType foodType;
            int foodnum;
            boolean continue_to_buy = true;

            //食物种类
            System.out.println("Please select the type of the food:\n [1]Milk [2]Egg [3]Bread [4]Bonbon [5]Sausage");
            //接受输入
            Scanner input = new Scanner(System.in);
            String str = input.next();
            switch(str)
            {
                case "1":foodType = FoodType.Milk;break;
                case "2":foodType = FoodType.Egg;break;
                case "3":foodType = FoodType.Bread;break;
                case "4":foodType = FoodType.Bonbon;break;
                case "5":foodType = FoodType.Sausage;break;
                default:
                    throw new IllegalStateException("Unexpected value: " + str);
            }
            //数量
            System.out.println("How many do you want?");
            Scanner inputfoodnum = new Scanner(System.in);
            String strfoodnum = input.next();
            foodnum = Integer.parseInt(strfoodnum);

            //下订单
            athletes.createcommand(foodType, foodnum);

            //是否继续购买
            while(continue_to_buy)
            {
                System.out.println("是否继续购买？[1]继续购买 [2]购买完成 [3]撤销最近购买 [4]清空所有购买");
                Scanner inputopnum = new Scanner(System.in);
                String stropnum= input.next();
                switch(stropnum)
                {
                    case "1":continue_to_buy = false;break;
                    case "2":athletes.getMulcmd().buy();continue_to_buy = false;stop = true;break;
                    case "3":athletes.getMulcmd().undo();break;
                    case "4":athletes.getMulcmd().clear();break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + str);
                }

            }

        }
    }
}
