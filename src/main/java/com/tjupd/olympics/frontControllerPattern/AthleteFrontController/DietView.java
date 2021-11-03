package com.tjupd.olympics.frontControllerPattern.AthleteFrontController;
import com.tjupd.olympics.builderPattern.food.FoodType;
import com.tjupd.olympics.singleton_DataAccessObject_NullObjectPattern.Athletes;
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
        Athletes athletes = Athletes.getAll();
        boolean stop = false;
        while(!stop)
        {
            FoodType foodType;
            int foodnum;
            boolean continue_to_buy = true;

            //食物种类
            System.out.println("请选择食物种类：\n [1]牛奶 [2]鸡蛋 [3]面包 [4]Bonbon [5]香肠");
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
            System.out.println("请键入您需要购买的数量。");
            String strfoodnum = input.next();
            foodnum = Integer.parseInt(strfoodnum);

            //下订单
            athletes.creatCommand(foodType, foodnum);

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
                        throw new IllegalStateException("Unexpected value: " + str);
                }

            }

        }
    }
}
