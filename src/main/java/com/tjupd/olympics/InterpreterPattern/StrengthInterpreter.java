package com.tjupd.olympics.InterpreterPattern;

import com.tjupd.olympics.flyWeightPattern.Equipment;

/**
 * @author Mizu_long
 * 解释器模式
 */
public class StrengthInterpreter implements Calculate {
    /**
     * 解释器模式，计算相关装备的正面增益效果
     * @param equipment
     * @return
     */
    @Override
    public double calculate(Equipment equipment){
        return equipment.getDex()*2+equipment.getStr()*5;
    }
}
