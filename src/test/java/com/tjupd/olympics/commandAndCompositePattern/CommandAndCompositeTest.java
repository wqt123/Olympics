package com.tjupd.olympics.commandAndCompositePattern;


import com.tjupd.olympics.builderPattern.food.FoodType;
import org.junit.Test;

public class CommandAndCompositeTest {
    @Test
    public void CommandAndCompositeTest(){
        MultipleCommand mulcmd = new MultipleCommand();
        BuyCommand cmd = new BuyCommand(FoodType.Milk, 2);
        mulcmd.append(cmd);
        mulcmd.undo();
        mulcmd.append(cmd);
        mulcmd.clear();
        mulcmd.append(cmd);
        mulcmd.buy();
    }
}

