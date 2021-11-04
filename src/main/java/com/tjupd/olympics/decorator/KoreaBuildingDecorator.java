package com.tjupd.olympics.decorator;
/**
 * @author ywd
 */


/**
 *具体装饰角色类 韩国国家代表队
 */
public class KoreaBuildingDecorator extends BuildingDecorator{

    public KoreaBuildingDecorator(Building building) {
        super(building);
    }

    private void setKoreaBuilding(){
        System.out.println("这栋楼安排韩国代表队入住");
    }

    public void setBuilding(){
        /**
         *对该楼栋进行装饰，入住韩国国家代表队
         */
        super.setBuilding();
        this.setKoreaBuilding();
    }
}
