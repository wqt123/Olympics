package com.tjupd.olympics.decoratorPattern;
/**
 * @author ywd
 */


/**
 *具体装饰角色类 韩国国家代表队
 */
public class RussiaBuildingDecorator extends BuildingDecorator{

    public RussiaBuildingDecorator(Building building) {
        super(building);
    }

    private void setRussiaBuilding(){
        System.out.println("这栋楼安排俄罗斯代表队入住");
    }

    public void setBuilding(){
        /**
         *对该楼栋进行装饰，入住俄罗斯国家代表队
         */
        super.setBuilding();
        this.setRussiaBuilding();
    }
}
