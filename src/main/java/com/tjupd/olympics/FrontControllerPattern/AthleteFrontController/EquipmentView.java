package com.tjupd.olympics.FrontControllerPattern.AthleteFrontController;

import com.tjupd.olympics.EquipmentController.EquipmentController;
import com.tjupd.olympics.athletes.Athletes;

    public class EquipmentView {
    public void show(){
        EquipmentController equipmentController = new EquipmentController(Athletes.getAll());
        equipmentController.buyEquipment();
    }
}
