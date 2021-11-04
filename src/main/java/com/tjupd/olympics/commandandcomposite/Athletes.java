package com.tjupd.olympics.commandandcomposite;

import com.tjupd.olympics.builder.food.FoodType;

public class Athletes {

    private MultipleCommand mulcmd;

    public Athletes() {
        mulcmd = new MultipleCommand();
    }

    public MultipleCommand getMulcmd() {
        return mulcmd;
    }

    public void createcommand(FoodType buyfoodtype,int num){
        BuyCommand cmd = new BuyCommand(buyfoodtype,num);
        mulcmd.append(cmd);
    }

    public void doALlcommand(){
        mulcmd.buy();
    }

    public void undocommand(){
        mulcmd.undo();
    }

    public void clearcommand(){
        mulcmd.clear();
    }

}
