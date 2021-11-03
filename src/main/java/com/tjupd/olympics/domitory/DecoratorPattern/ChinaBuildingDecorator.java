package com.tjupd.olympics.domitory.DecoratorPattern;
//具体装饰角色 中国代表队
public class ChinaBuildingDecorator extends BuildingDecorator{

    public ChinaBuildingDecorator(Building building) {
        super(building);
    }

    private void setChinaBuilding(){
        System.out.println("这栋楼安排中国代表队入住");
    }

    public void setBuilding(){
        //对该楼栋进行装饰，入住中国国家代表队
        super.setBuilding();
        this.setChinaBuilding();
    }
}
