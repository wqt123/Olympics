package com.tjupd.olympics.InterpreterPattern;

import com.tjupd.olympics.TemplatePattern.Equipment;

public class StrengthInterpreter {
    public static double calculate(Equipment equipment){
        return equipment.getDex()*2+equipment.getStr()*5;
    }
}
