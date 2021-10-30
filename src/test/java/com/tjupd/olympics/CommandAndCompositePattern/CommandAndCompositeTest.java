package com.tjupd.olympics.CommandAndCompositePattern;


import com.tjupd.olympics.CommandAndCompositePattern.BuyCommand;
import com.tjupd.olympics.CommandAndCompositePattern.MultipleCommand;
import com.tjupd.olympics.BuilderPattern.food.FoodType;
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

