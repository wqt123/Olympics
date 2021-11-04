package com.tjupd.olympics.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mizu_long
 * 备忘录模式
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    /**
     * 加入状态存档
     * @param memento
     */
    public void add(Memento memento){
        mementoList.add(memento);
    }

    /**
     * 取出对应index的状态存档
     * @param index
     * @return
     */
    public Memento getState(int index){

        return mementoList.get(index);
    }
    public void check(){
        System.out.println(mementoList.size());
    }

    /**
     * 删除对应状态存档
     * @param memento
     */
    public void deleteState(Memento memento){
        mementoList.remove(memento);
    }



}
