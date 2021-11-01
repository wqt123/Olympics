package com.tjupd.olympics.FrontControllerPattern.AthleteFrontController;

import com.tjupd.olympics.MedalTable.visitor.MedalTable;
import com.tjupd.olympics.MedalTable.visitor.MedalTableAll;
import com.tjupd.olympics.MedalTable.visitor.MedalTableDisplayVisitor;
import com.tjupd.olympics.MedalTable.visitor.MedalTableGold;
import com.tjupd.olympics.athletes.Athletes;

import java.util.Objects;
import java.util.Scanner;

public class MedalTableView {
    public void show(){
        Athletes athletes = Athletes.getAll();
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("请选择想要查看的奖牌榜类型：");
            System.out.println("[1]奥运奖牌榜 [2]奥运金牌榜");
            String option = input.nextLine();
            if (Objects.equals(option, "1")) {
                MedalTable medalTableAll = new MedalTableAll(athletes);
                medalTableAll.accept(new MedalTableDisplayVisitor());
            }
            else if(Objects.equals(option, "2")){
                MedalTable medalTableGold = new MedalTableGold(athletes);
                medalTableGold.accept(new MedalTableDisplayVisitor());
            }
            else {
                System.out.println("错误的操作码。");
            }
            System.out.println("是否希望继续查看奖牌榜");
            System.out.println("[y]是 [n]否");
            String tmp = input.nextLine();
            switch (tmp){
                case "y":
                    flag = true;
                    break;
                case "n":
                    flag = false;
                    break;
                default:
                    System.out.println("错误操作码，默认退出！");
                    flag = false;
            }
        }
    }
}
