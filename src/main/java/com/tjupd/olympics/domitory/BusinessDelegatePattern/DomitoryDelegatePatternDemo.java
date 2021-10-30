package com.tjupd.olympics.domitory.BusinessDelegatePattern;

import com.tjupd.olympics.athletes.Athlete;
import com.tjupd.olympics.athletes.Athletes;

public class DomitoryDelegatePatternDemo {
    public static void main(String args[]){
        Athletes athletes= Athletes.getAll();
        Athlete athlete= athletes.getAthlete("Ford");
        String country=athletes.getAthlete("Ford").getCountry();
        //抽取一个运动员

        //办理住宿
        DomitoryDelegate domitoryDelegate=new DomitoryDelegate(country);
        domitoryDelegate.setServiceType();
        Client client=new Client(domitoryDelegate,athlete);
        client.doTask(athlete);
        String roomNumber=domitoryDelegate.getroomNumber();
        String building=domitoryDelegate.getBuilding();

        //打印前后结果
        System.out.println("country"+" "+country);
        System.out.println("building:"+athletes.getAthlete("Ford").getBuilding());
        System.out.println("roomNumber:"+athletes.getAthlete("Ford").getRoomNumber());
       // athletes.deliverRoom("Ford",building,roomNumber);
        System.out.println("update:");
        System.out.println("building:"+athletes.getAthlete("Ford").getBuilding());
        System.out.println("roomNumber:"+athletes.getAthlete("Ford").getRoomNumber());

    }
}

