package com.tjupd.olympics.domitory.BusinessDelegatePattern;

import com.tjupd.olympics.athletes.Athlete;

//客户端
public class Client {
    private DomitoryDelegate domitoryDelegate;
    private Athlete athlete;

    public Client(DomitoryDelegate domitoryDelegate,Athlete athlete){
        //Client构造函数
        this.domitoryDelegate=domitoryDelegate;
        this.athlete=athlete;
    }

    public void doTask(){
        //Client办理业务
        domitoryDelegate.doTask(athlete);
    }
}
