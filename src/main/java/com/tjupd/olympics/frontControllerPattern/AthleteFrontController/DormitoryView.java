package com.tjupd.olympics.frontControllerPattern.AthleteFrontController;

import com.tjupd.olympics.singleton_DataAccessObject_NullObjectPattern.Athletes;
import com.tjupd.olympics.businessDelegatePattern.Client;
import com.tjupd.olympics.businessDelegatePattern.DomitoryDelegate;
/**
 * 前端控制器设计模式
 * 住宿办理视图类，用于调用运动员住宿办理相关接口
 * @author 王棋田
 */
public class DormitoryView {
    /**
     * 办理入住视图的调用接口，实现运动员办理入住功能
     */
    public void show(){
        Athletes athletes= Athletes.getAll();
        //创建住宿代理对象
        DomitoryDelegate domitoryDelegate=new DomitoryDelegate(athletes.myAthlete.getCountry());
        domitoryDelegate.setServiceType();
        //创建客户端对象，模拟运动员办理入住时使用的客户端
        Client client=new Client(domitoryDelegate,athletes.myAthlete);
        client.doTask();
    }
}
