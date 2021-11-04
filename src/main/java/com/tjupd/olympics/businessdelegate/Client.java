package com.tjupd.olympics.businessdelegate;
import com.tjupd.olympics.singleton_dataaccessobject_nullobject.Athlete;
/**
 * @author ywd
 */


/**
 *客户端
 */
public class Client {
    private DomitoryDelegate domitoryDelegate;
    private Athlete athlete;

    public Client(DomitoryDelegate domitoryDelegate,Athlete athlete){
        /**
        * Client构造函数
         */
        this.domitoryDelegate=domitoryDelegate;
        this.athlete=athlete;
    }

    public void doTask(){
        /**
         * Client 业务办理
         */
        domitoryDelegate.doTask(athlete);
    }
}
