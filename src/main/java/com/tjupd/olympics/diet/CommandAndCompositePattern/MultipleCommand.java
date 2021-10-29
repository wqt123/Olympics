package com.tjupd.olympics.diet.CommandAndCompositePattern;

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
        }
    }

    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }

    public void clear() {
        commands.clear();
    }
}
