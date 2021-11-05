package com.tjupd.olympics.flyweight;

import com.tjupd.olympics.interpreter.Calculate;
import com.tjupd.olympics.interpreter.StrengthInterpreter;
import com.tjupd.olympics.interpreter.WeaknessInterpreter;
import com.tjupd.olympics.singleton_dataaccessobject_nullobject.Athletes;

import java.text.DecimalFormat;
import java.util.Random;

public class SportPants extends Equipment {

    public SportPants(){
        Random rand = new Random();
        this.dex = rand.nextDouble()*15;
        this.lassitude = rand.nextDouble()*3;
        this.sloth = rand.nextDouble()*3;
        this.str = rand.nextDouble()*1;
    }

    @Override
    void buff(String name,Athletes athletes){
        DecimalFormat decimalFormat = new DecimalFormat("0.000");
        Calculate calculate = new StrengthInterpreter();
        double strength = calculate.calculate(this);
        //double strength = StrengthInterpreter.calculate(this);
        System.out.println("获得运动裤增益："+decimalFormat.format(strength));
        athletes.updateAthletesBody(name,strength);
    }

    @Override
    void deBuff(String name,Athletes athletes){
        DecimalFormat decimalFormat = new DecimalFormat("0.000");
        Calculate calculate = new WeaknessInterpreter();
        double weakness= calculate.calculate(this);
        //double weakness = WeaknessInterpreter.calculate(this);
        System.out.println("获得运动裤减益："+decimalFormat.format(weakness));
        athletes.updateAthletesBody(name,weakness);
        System.out.println("当前身体素质："+decimalFormat.format(athletes.getAthlete(name).getBodyScore()));
    }
}