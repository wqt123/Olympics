package com.tjupd.olympics.FrontControllerPattern.AthleteFrontController;

import com.tjupd.olympics.athletes.Athlete;
import com.tjupd.olympics.athletes.Athletes;
import com.tjupd.olympics.domitory.BusinessDelegatePattern.Client;
import com.tjupd.olympics.domitory.BusinessDelegatePattern.DomitoryDelegate;

public class DormitoryView {
    public void show(){
        Athletes athletes= Athletes.getAll();
        //办理住宿
        DomitoryDelegate domitoryDelegate=new DomitoryDelegate(athletes.myAthlete.getCountry());
        domitoryDelegate.setServiceType();
        Client client=new Client(domitoryDelegate,athletes.myAthlete);
        client.doTask();
    }
}
