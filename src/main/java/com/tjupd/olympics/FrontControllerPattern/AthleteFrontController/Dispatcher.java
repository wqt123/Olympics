package com.tjupd.olympics.FrontControllerPattern.AthleteFrontController;


public class Dispatcher {
    private GameView gameView;
    private DietView dietView;
    private DormitoryView dormitoryView;
    private MedalTableView medalTableView;
    private EquipmentView equipmentView;
    public Dispatcher(){
        gameView = new GameView();
        dietView = new DietView();
        dormitoryView = new DormitoryView();
        medalTableView = new MedalTableView();
        equipmentView = new EquipmentView();
    }

    public void dispatch(String request){
        switch (request){
            case "Game":
                gameView.show();
                break;
            case "Diet":
                dietView.show();
                break;
            case "Dormitory":
                dormitoryView.show();
                break;
            case "MedalTable":
                medalTableView.show();
                break;
            case "Equipment":
                equipmentView.show();
                break;
        }
    }
}
