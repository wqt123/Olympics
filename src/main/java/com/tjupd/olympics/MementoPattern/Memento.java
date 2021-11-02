package com.tjupd.olympics.MementoPattern;

/**
 * @author Mizu_long
 * 备忘录模式
 */

public class Memento {
    /**
     * 备忘录中存储的状态
     */
    private Double state;

    public Memento(Double state){
        this.state=state;
    }

    public Double getState(){
        return this.state;
    }

}
