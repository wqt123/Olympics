package com.tjudp.olympics.flyweight;

import com.tjudp.olympics.interpreter.StrengthInterpreter;
import com.tjudp.olympics.interpreter.WeaknessInterpreter;
import com.tjudp.olympics.interpreter.Calculate;
import com.tjudp.olympics.singleton_dataaccessobject_nullobject.Athletes;

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
