package com.tjudp.olympics.decorator;
/**
 * @author ywd
 */


/**
 *抽象装饰角色
 */
public abstract class BuildingDecorator extends Building {
    private Building building=null;

    public BuildingDecorator(Building building){
        this.building=building;
    }

    @Override
    public void setBuilding(){
        this.building.setBuilding();
    }
}
