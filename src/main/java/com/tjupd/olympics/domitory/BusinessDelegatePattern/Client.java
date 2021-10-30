package com.tjupd.olympics.domitory.BusinessDelegatePattern;

//客户端
public class Client {
    DomitoryDelegate domitoryDelegate;

    public Client(DomitoryDelegate domitoryDelegate){
        this.domitoryDelegate=domitoryDelegate;
    }

    public void doTask(){
        domitoryDelegate.doTask();
    }
}
