package com.tjupd.olympics.frontControllerPattern.AthleteFrontController;

import com.tjupd.olympics.equipmentController.EquipmentController;
import com.tjupd.olympics.singleton_DataAccessObject_NullObjectPattern.Athletes;
/**
 * 前端控制器设计模式
 * 购买装备视图类，用于调用运动员购买装备相关接口
 * @author 王棋田
 */
public class EquipmentView {
    /**
     * 购买装备视图的调用接口，实现运动员购买装备功能
     */
    public void show(){
        EquipmentController equipmentController = new EquipmentController(Athletes.getAll());
        equipmentController.buyEquipment();
    }
}
