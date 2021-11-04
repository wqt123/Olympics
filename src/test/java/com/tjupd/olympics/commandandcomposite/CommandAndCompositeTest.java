package com.tjupd.olympics.commandandcomposite;


import com.tjupd.olympics.builder.food.FoodType;
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

