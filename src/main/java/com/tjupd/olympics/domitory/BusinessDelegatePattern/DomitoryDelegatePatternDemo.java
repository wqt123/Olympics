package com.tjupd.olympics.domitory.BusinessDelegatePattern;

import com.tjupd.olympics.athletes.Athlete;
import com.tjupd.olympics.athletes.Athletes;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Random;


public class DomitoryDelegatePatternDemo {
    //业务代表模式demo
    public static void main(String args[]){
        Athletes athletes= Athletes.getAll();
        for (Athlete athlete:athletes.getAthletes()) //遍历运动员，为所有运动员分配住宿
        {
            String country=athlete.getCountry();

            //办理住宿
            DomitoryDelegate domitoryDelegate=new DomitoryDelegate(country);
            domitoryDelegate.setServiceType();
            Client client=new Client(domitoryDelegate,athlete);
            //System.out.print(athlete.getName());
            client.doTask();
            String roomNumber=domitoryDelegate.getroomNumber();
            String building=domitoryDelegate.getBuilding();

            //打印前后结果
            /*
            System.out.println("国家"+" "+country);
            System.out.println("楼栋号:"+athlete.getBuilding());
            System.out.println("房间号:"+athlete.getRoomNumber());
            System.out.println();
            */

        }



    }
}

