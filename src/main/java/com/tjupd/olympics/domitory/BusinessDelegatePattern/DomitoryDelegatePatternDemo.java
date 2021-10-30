package com.tjupd.olympics.domitory.BusinessDelegatePattern;

import athletes.Athletes;

public class DomitoryDelegatePatternDemo {
    public static void main(String args[]){
        Athletes athletes= Athletes.getAll();
        String country=athletes.getAthlete("Ford").getCountry();
        //抽取一个运动员

        //办理住宿
        DomitoryDelegate domitoryDelegate=new DomitoryDelegate(country);
        domitoryDelegate.setServiceType();
        Client client=new Client(domitoryDelegate);
        client.doTask();
        String roomNumber=domitoryDelegate.getroomNumber();
        String building=domitoryDelegate.getBuilding();

        //打印前后结果
        System.out.println("country"+" "+country);
        System.out.println("building:"+athletes.getAthlete("Ford").getBuilding());
        System.out.println("roomNumber:"+athletes.getAthlete("Ford").getRoomNumber());
        athletes.deliverRoom("Ford",building,roomNumber);
        System.out.println("update:");
        System.out.println("building:"+athletes.getAthlete("Ford").getBuilding());
        System.out.println("roomNumber:"+athletes.getAthlete("Ford").getRoomNumber());

    }
}

