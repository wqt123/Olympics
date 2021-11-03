package com.tjupd.olympics.flyWeightPattern;

import com.tjupd.olympics.InterpreterPattern.Calculate;
import com.tjupd.olympics.InterpreterPattern.StrengthInterpreter;
import com.tjupd.olympics.InterpreterPattern.WeaknessInterpreter;
import com.tjupd.olympics.singleton_DataAccessObject_NullObjectPattern.Athletes;

import java.text.DecimalFormat;
import java.util.Random;
public class Shoes extends  Equipment{



    public Shoes(){
        Random rand = new Random();
        this.dex = rand.nextDouble()*10;
        this.lassitude = rand.nextDouble()*7;
        this.sloth = rand.nextDouble()*3;
        this.str = rand.nextDouble()*5;

    }
    @Override
    void buff(String name,Athletes athletes){
        DecimalFormat decimalFormat = new DecimalFormat("0.000");
        Calculate calculate = new StrengthInterpreter();
        double strength = calculate.calculate(this);
        //double strength = StrengthInterpreter.calculate(this);
        System.out.println("获得鞋子增益："+decimalFormat.format(strength));

        athletes.updateAthletesBody(name,strength);
    }

    @Override
    void deBuff(String name,Athletes athletes){
        DecimalFormat decimalFormat = new DecimalFormat("0.000");
        Calculate calculate = new WeaknessInterpreter();
        double weakness= calculate.calculate(this);
        //double weakness = WeaknessInterpreter.calculate(this);
        System.out.println("获得鞋子减益："+decimalFormat.format(weakness));
        athletes.updateAthletesBody(name,weakness);
        System.out.println("当前身体素质："+decimalFormat.format(athletes.getAthlete(name).getBodyScore()));
    }
}