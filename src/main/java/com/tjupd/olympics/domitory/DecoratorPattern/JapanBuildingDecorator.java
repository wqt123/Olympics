package com.tjupd.olympics.domitory.DecoratorPattern;

public class JapanBuildingDecorator extends BuildingDecorator{

    public JapanBuildingDecorator(Building building) {
        super(building);
    }

    private void setJapanBuilding(){
        System.out.println("这栋楼安排日本代表队入住");
    }

    public void setBuilding(){
        super.setBuilding();
        this.setJapanBuilding();
    }
}
