package com.tjupd.olympics.domitory.DecoratorPattern;

public class KoreaBuildingDecorator extends BuildingDecorator{

    public KoreaBuildingDecorator(Building building) {
        super(building);
    }

    private void setKoreaBuilding(){
        System.out.println("这栋楼安排韩国代表队入住");
    }

    public void setBuilding(){
        super.setBuilding();
        this.setKoreaBuilding();
    }
}
