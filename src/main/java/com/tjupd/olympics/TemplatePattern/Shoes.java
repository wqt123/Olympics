package com.tjupd.olympics.TemplatePattern;

import com.tjupd.olympics.InterpreterPattern.StrengthInterpreter;
import com.tjupd.olympics.InterpreterPattern.WeaknessInterpreter;
import com.tjupd.olympics.athletes.Athletes;
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

         double srength = StrengthInterpreter.calculate(this);
        System.out.println("获得鞋子增益"+srength);

        athletes.updateAthletesBody(name,srength);
    }

    @Override
    void deBuff(String name,Athletes athletes){
        double weakness = WeaknessInterpreter.calculate(this);
        System.out.println("获得鞋子减益"+weakness);
        athletes.updateAthletesBody(name,weakness);
        System.out.println("当前身体素质："+athletes.getAthlete(name).getBodyScore());
    }
}
