package com.tjupd.olympics.MementoPattern;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento getState(int index){

        return mementoList.get(index);
    }
    public void check(){
        System.out.println(mementoList.size());
    }


    public void deleteState(Memento memento){
        mementoList.remove(memento);
    }



}
