package com.tjupd.olympics.TemplatePattern;


import com.tjupd.olympics.InterpreterPattern.StrengthInterpreter;
import com.tjupd.olympics.InterpreterPattern.WeaknessInterpreter;
import com.tjupd.olympics.athletes.Athletes;

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
    abstract void buff(String name,Athletes athletes);
    abstract void deBuff(String name,Athletes athletes);

    public final void influence(String name, Athletes athletes){
        buff(name,athletes);
        deBuff(name,athletes);
    }


}