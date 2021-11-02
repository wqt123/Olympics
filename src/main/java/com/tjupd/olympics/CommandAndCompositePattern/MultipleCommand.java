package com.tjupd.olympics.CommandAndCompositePattern;

import java.util.Iterator;
import java.util.Stack;

public class MultipleCommand implements Command{
    private Stack commands = new Stack();

    public Stack getCommands() {
        return commands;
    }

    @Override
    public void buy() {
        Iterator it = commands.iterator();
        while (it.hasNext()) {
            ((Command) it.next()).buy();
        }
        if(commands.isEmpty())
        {
            System.out.println("\n您本次未进行任何购买！");
        }
    }

    public void append(Command cmd) {
        if (cmd != this) {
            commands.push(cmd);
            System.out.println("\n++++++++++++");
            System.out.println("+已经成功购买+");
            System.out.println("++++++++++++\n");
        }
    }

    public void undo() {
        if (commands.empty()) {
            System.out.println("您还未购买任何东西");
        }
        else{
            BuyCommand cmd = (BuyCommand) commands.pop();
            System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("+您最近一次购买的是"+cmd.getNum()+"个"+cmd.getBuyfoottype()+ ",已经取消本次购买+");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        }
    }

    public void clear() {
        System.out.println("\n+++++++++++++++++++++");
        System.out.println("+您已经清空所有的"+commands.size()+"次购买+");
        System.out.println("+++++++++++++++++++++\n");
        commands.clear();

    }
}
