package com.tjudp.olympics.frontcontroller.audiencefrontcontroller;

import com.tjudp.olympics.audience.Audience;
import com.tjudp.olympics.iterator.BuySouvenir;
/**
 * 前端控制器设计模式
 * 购买纪念品视图类，用于调用观众购买纪念品相关接口
 * @author 王棋田
 */
public class BuySouvenirView {
    /**
     * 购买纪念品视图的调用接口，实现观众购买纪念品功能
     * @param audience
     */
    public void show(Audience audience){
        BuySouvenir buySouvenir = new BuySouvenir();
        try {
            buySouvenir.run(audience);
        }catch (Exception e){
            //ignore
        }
    }
}
