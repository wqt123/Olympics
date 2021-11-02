package com.tjupd.olympics.TemplatePattern;

import com.tjupd.olympics.InterpreterPattern.StrengthInterpreter;
import com.tjupd.olympics.InterpreterPattern.WeaknessInterpreter;
import com.tjupd.olympics.athletes.Athletes;

import java.util.Random;

public class Clothes extends Equipment {

    public Clothes(){
        Random rand = new Random();
        this.dex = rand.nextDouble()*4;
        this.lassitude = rand.nextDouble()*10;
        this.sloth = rand.nextDouble()*2;
        this.str = rand.nextDouble()*10;

    }
    @Override
    void buff(String name,Athletes athletes){

        double strength = StrengthInterpreter.calculate(this);
        System.out.println("获得运动背心增益"+strength);
        athletes.updateAthletesBody(name,strength);
    }

    @Override
    void deBuff(String name,Athletes athletes){
        double weakness = WeaknessInterpreter.calculate(this);
        System.out.println("获得运动背心减益"+weakness);

        athletes.updateAthletesBody(name,weakness);
        System.out.println("当前身体素质："+athletes.getAthlete(name).getBodyScore());
    }
}
