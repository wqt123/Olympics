package com.tjupd.olympics.InterpreterPattern;

import com.tjupd.olympics.TemplatePattern.Equipment;

public class WeaknessInterpreter {
    public static double calculate(Equipment equipment){
        return -1*equipment.getSloth()*2-equipment.getLassitude()*5;
    }
}
