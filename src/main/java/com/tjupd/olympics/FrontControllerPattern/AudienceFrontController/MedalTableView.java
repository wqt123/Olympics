package com.tjupd.olympics.FrontControllerPattern.AudienceFrontController;

import com.tjupd.olympics.MedalTable.visitor.MedalTable;
import com.tjupd.olympics.MedalTable.visitor.MedalTableAll;
import com.tjupd.olympics.MedalTable.visitor.MedalTableDisplayVisitor;
import com.tjupd.olympics.MedalTable.visitor.MedalTableGold;
import com.tjupd.olympics.athletes.Athletes;

import java.util.Scanner;

public class MedalTableView {
    public void show(){
        Athletes athletes = Athletes.getAll();
        System.out.println("请选择想要查看的奖牌榜类型：");
        System.out.println("[1]奥运奖牌榜 [2]奥运金牌榜");
        Scanner input = new Scanner(System.in);
        String option = input.nextLine();
        if (option == "1") {
            MedalTable medalTableAll = new MedalTableAll(athletes);
            medalTableAll.accept(new MedalTableDisplayVisitor());
        }
        else if(option == "2"){
            MedalTable medalTableGold = new MedalTableGold(athletes);
            medalTableGold.accept(new MedalTableDisplayVisitor());
        }
        else {
            System.out.println("错误的操作码。");
        }
    }
}
