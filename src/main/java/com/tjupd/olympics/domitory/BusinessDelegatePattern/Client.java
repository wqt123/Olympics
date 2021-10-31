package com.tjupd.olympics.domitory.BusinessDelegatePattern;

import com.tjupd.olympics.athletes.Athlete;

//客户端
public class Client {
    private DomitoryDelegate domitoryDelegate;
    private Athlete athlete;

    public Client(DomitoryDelegate domitoryDelegate,Athlete athlete){
        this.domitoryDelegate=domitoryDelegate;
        this.athlete=athlete;
    }

    public void doTask(){
        domitoryDelegate.doTask(athlete);
    }
}
