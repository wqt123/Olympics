package com.tjupd.olympics.MementoPattern;


public class Memento {

    private Double state;

    public Memento(Double state){
        this.state=state;
    }

    public Double getState(){
        return this.state;
    }

}
