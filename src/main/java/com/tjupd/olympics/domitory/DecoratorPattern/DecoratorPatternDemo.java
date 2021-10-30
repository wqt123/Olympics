package com.tjupd.olympics.domitory.DecoratorPattern;

public class DecoratorPatternDemo {
    public static void main(String[] args){
        Building no1=new ConcereteBuilding(1);
        Building no2=new ConcereteBuilding(2);
        Building no3=new ConcereteBuilding(3);

        //楼栋No.1
        no1=new ChinaBuildingDecorator(no1);
        no1.setBuilding();

        //楼栋No.2
        no2=new JapanBuildingDecorator(no2);
        no2=new KoreaBuildingDecorator(no2);
        no2.setBuilding();

        //楼栋No.3
        no3=new RussiaBuildingDecorator(no3);
        no3=new ChinaBuildingDecorator(no3);
        no3.setBuilding();

        //楼栋No.4
        no3=new RussiaBuildingDecorator(no3);
        no3.setBuilding();
    }
}
