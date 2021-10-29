package com.tjupd.olympics.diet.CommandAndCompositePattern;

import com.tjupd.olympics.diet.BuilderPattern.food.FoodType;

public class Athletes {

    private Multiplecommand mulcmd;

    public Athletes() {
        mulcmd = new Multiplecommand();
    }

    public Multiplecommand getMulcmd() {
        return mulcmd;
    }

    public void createcommand(FoodType buyfoodtype,int num){
        Buycommand cmd = new Buycommand(buyfoodtype,num);
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
