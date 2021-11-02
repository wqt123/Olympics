package com.tjupd.olympics.InterpreterPattern;

import com.tjupd.olympics.TemplatePattern.Equipment;

/**
 * @author Mizu_long
 * 解释器模式
 */
public class WeaknessInterpreter implements Calculate{
    /**
     * 解释器模式实现，计算相关装备的负面增益效果
     * @param equipment
     * @return
     */
    @Override
    public  double calculate(Equipment equipment){
        return -1*equipment.getSloth()*2-equipment.getLassitude()*5;
    }
}
