package com.tjupd.olympics.FrontControllerPattern.AthleteFrontController;


public class Dispatcher {
    private GameView gameView;
    private DietView dietView;
    private DormitoryView dormitoryView;
    private MedalTableView medalTableView;
    public Dispatcher(){
        gameView = new GameView();
        dietView = new DietView();
        dormitoryView = new DormitoryView();
        medalTableView = new MedalTableView();
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
        }
    }
}
