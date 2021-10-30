package com.tjupd.olympics.domitory.DecoratorPattern;

public class RussiaBuildingDecorator extends BuildingDecorator{

    public RussiaBuildingDecorator(Building building) {
        super(building);
    }

    private void setRussiaBuilding(){
        System.out.println("这栋楼安排俄罗斯代表队入住");
    }

    public void setBuilding(){
        super.setBuilding();
        this.setRussiaBuilding();
    }
}
