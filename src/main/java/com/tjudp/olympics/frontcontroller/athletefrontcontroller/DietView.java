package com.tjudp.olympics.frontcontroller.athletefrontcontroller;
import com.tjudp.olympics.commandandcomposite.Athletes;
import com.tjudp.olympics.builder.food.FoodType;

import java.util.Scanner;
/**
 * 前端控制器设计模式
 * 饮食视图类，用于调用运动员购买饮食相关接口
 * @author 王棋田
 */
public class DietView {
    /**
     * 饮食视图的调用接口，实现运动员购买饮食功能
     */
    public void show(){
        Athletes athletes = new Athletes();
        boolean stop = false;
        while(!stop)
        {
            FoodType foodType;
            //本次购买的数量
            int foodnum;
            //是否继续购买
            boolean continue_to_buy = true;
            //输入的食物种类是否在1-5之间
            boolean between1to5 = false;
            //输入的食物数量是否在大于1
            boolean between1toInf = false;
            //接受输入
            Scanner input = new Scanner(System.in);
            //食物种类
            System.out.println("请选择购买食物的种类:\n [1]牛奶 [2]鸡蛋 [3]面包 [4]棒棒糖 [5]火腿肠");
            //接受输入
            String str = input.next();
            //正则判断输入是否符合要求
            between1to5 = str.matches("[1-5]");

            while(!between1to5)
            {
                System.out.println("输入不符合要求，请重新输入");
                //食物种类
                System.out.println("请选择购买食物的种类:\n [1]牛奶 [2]鸡蛋 [3]面包 [4]棒棒糖 [5]火腿肠");
                //接受输入
                str = input.next();
                between1to5 = str.matches("[1-5]");

            }

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

            //食物数量
            System.out.println("想要多少这种食物?请输入数字：");
            String strfoodnum = input.next();
            between1toInf = strfoodnum.matches("[0-9]+");
            while(!between1toInf) {
                System.out.println("输入不符合要求，请重新输入");
                System.out.println("想要多少这种食物?请输入数字：");
                strfoodnum = input.next();
                between1toInf = strfoodnum.matches("[0-9]+");
            }
            foodnum = Integer.parseInt(strfoodnum);


            //下订单
            athletes.createcommand(foodType, foodnum);

            //是否继续购买
            while(continue_to_buy)
            {
                System.out.println("是否继续购买？[1]继续购买 [2]购买完成 [3]撤销最近购买 [4]清空所有购买");
                String stropnum= input.next();
                switch(stropnum)
                {
                    case "1":continue_to_buy = false;break;
                    case "2":athletes.getMulcmd().buy();continue_to_buy = false;stop = true;break;
                    case "3":athletes.getMulcmd().undo();break;
                    case "4":athletes.getMulcmd().clear();break;
                    default:
                        System.out.println("输入错误，请输入1-4之间的数字");
                }

            }

        }
    }
}
