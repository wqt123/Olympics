package com.tjudp.olympics.decorator;
/**
 * @author ywd
 */


/**
 *具体装饰角色类 日本国家代表队
 */
public class JapanBuildingDecorator extends BuildingDecorator{

    public JapanBuildingDecorator(Building building) {
        super(building);
    }

    private void setJapanBuilding(){
        System.out.println("这栋楼安排日本代表队入住");
    }

    public void setBuilding(){
        /**
         *对该楼栋进行装饰，入住日本国家代表队
         */
        super.setBuilding();
        this.setJapanBuilding();
    }
}
