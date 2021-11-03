package com.tjupd.olympics.InterpreterPattern;

import com.tjupd.olympics.FlyWeightPattern.Equipment;

/**
 * @author Mizu_long
 * 解释器模式
 */
public class StrengthInterpreter {
    /**
     * 解释器模式，计算相关装备的正面增益效果
     * @param equipment
     * @return
     */
    public static double calculate(Equipment equipment){
        return equipment.getDex()*2+equipment.getStr()*5;
    }
}
