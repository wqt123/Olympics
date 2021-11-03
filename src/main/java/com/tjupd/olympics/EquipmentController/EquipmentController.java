package com.tjupd.olympics.EquipmentController;

import com.tjupd.olympics.ProxyPattern.EquipmentProxy;
import com.tjupd.olympics.athletes.Athletes;
import com.tjupd.olympics.FlyWeightPattern.*;

import java.util.Scanner;

import com.tjupd.olympics.MementoPattern.CareTaker;
import  com.tjupd.olympics.MementoPattern.Memento;

/**
 * @author Mizu_long
 * 代理模式
 * 使用EquipmentProxy来对装备生成相关类进行控制
 */
public class EquipmentController {


    private Athletes athletes;



    private EquipmentProxy equipmentProxy;

    private CareTaker careTaker;

    public EquipmentController(Athletes athletes){
        this.athletes = athletes;

        this.careTaker = new CareTaker();
        this.equipmentProxy = new EquipmentProxy();
    }

    public void buyEquipment(){
        int count = -1;
        System.out.println("请输入购买者姓名: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        while(athletes.getAthlete(name).getName() == null){
            System.out.println("运动员中暂无此人，请重新输入姓名");
            name =input.nextLine();
        }
        System.out.println("请输入购买的装备的类型,或进行的操作：  1.慢跑鞋   2. 运动背心    3.运动裤    4.撤销上次购买   0.结束购买");
        int option = input.nextInt();
        while(option !=0){
            switch (option){
                case 1:{
                    count++;
                    System.out.println("当前身体素质："+athletes.getAthlete(name).getBodyScore());
                    careTaker.add(new Memento(athletes.getAthlete(name).getBodyScore()));
                    Equipment equipment = equipmentProxy.getEquipment("Shoes");
                    equipment.influence(name,this.athletes);
                    System.out.println("购买成功");

                    break;
                }
                case 2:{
                    System.out.println("当前身体素质："+athletes.getAthlete(name).getBodyScore());
                    count++;
                    Equipment equipment = equipmentProxy.getEquipment("Clothes");
                    careTaker.add(new Memento(athletes.getAthlete(name).getBodyScore()));
                    equipment.influence(name,this.athletes);


                    System.out.println("购买成功");
                    break;
                }
                case 3:{
                    System.out.println("当前身体素质："+athletes.getAthlete(name).getBodyScore());
                    count++;
                    Equipment equipment = equipmentProxy.getEquipment("SportPants");
                    careTaker.add(new Memento(athletes.getAthlete(name).getBodyScore()));
                    equipment.influence(name,this.athletes);


                    System.out.println("购买成功");
                    break;
                }
                case 4:{
                    if(count>=0) {
                        System.out.println("当前身体素质："+athletes.getAthlete(name).getBodyScore());
                        athletes.getAthlete(name).setBodyScore(careTaker.getState(count).getState());
                        careTaker.deleteState(careTaker.getState(count));
                        count--;
                        System.out.println("撤销成功");
                        System.out.println("当前身体素质："+athletes.getAthlete(name).getBodyScore());

                    }
                    else {
                        System.out.println("暂无可撤销的订单");
                    }
                    break;
                }
                default:
                    break;
            }
            System.out.println("请输入购买的装备的类型,或进行的操作：  1.慢跑鞋   2. 运动背心    3.运动裤    4.撤销上次购买   0.结束购买");
            option = input.nextInt();
        }

    System.out.println("结束购买，退出商店");
    }



}
