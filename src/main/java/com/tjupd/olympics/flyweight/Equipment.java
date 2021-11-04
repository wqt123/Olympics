package com.tjupd.olympics.flyweight;


import com.tjupd.olympics.singleton_dataaccessobject_nullobject.Athletes;

/**
 * @author Mizu_long
 * 模板模式
 */
public abstract class Equipment{

    double str;
    double dex;
    double lassitude;
    double sloth;

    public double getStr(){
        return this.str;
    }
    public double getDex(){
        return this.dex;
    }
    public double getLassitude(){
        return this.lassitude;
    }
    public double getSloth(){
        return this.sloth;
    }

    /**
     * 将buff的功能放到子类中进行实现
     * @param name
     * @param athletes
     */
    abstract void buff(String name,Athletes athletes);

    /**
     * 将debuff的功能放到子类中实现
     * @param name
     * @param athletes
     */
    abstract void deBuff(String name,Athletes athletes);

    public final void influence(String name, Athletes athletes){
        buff(name,athletes);
        deBuff(name,athletes);
    }


}