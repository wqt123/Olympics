package com.tjupd.olympics.diet.CommandAndCompositePattern;


import com.tjupd.olympics.diet.*;
import com.tjupd.olympics.diet.BuilderPattern.food.FoodType;
import org.junit.Test;

public class CommandAndCompositeTest {
    @Test
    public void CommandAndCompositeTest(){
        Multiplecommand mulcmd = new Multiplecommand();
        Buycommand cmd = new Buycommand(FoodType.Milk, 2);
        mulcmd.append(cmd);
        mulcmd.undo();
        mulcmd.append(cmd);
        mulcmd.clear();
        mulcmd.append(cmd);
        mulcmd.buy();
    }
}

