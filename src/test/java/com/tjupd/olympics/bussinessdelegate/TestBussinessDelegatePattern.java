package com.tjupd.olympics.bussinessdelegate;
import com.tjupd.olympics.businessdelegate.*;
import org.junit.Test;
import com.tjupd.olympics.singleton_dataaccessobject_nullobject.*;
/**
 * 测试
 * @author ywd
 *
 */
public class TestBussinessDelegatePattern {

    @Test
    public void testBusinessDelegatePattern(){
        Athletes athletes= Athletes.getAll();
        for (Athlete athlete:athletes.getAthletes())
        /**
         *遍历运动员，为所有运动员分配住宿
         */
        {
            String country=athlete.getCountry();
            /**
             *办理住宿
             */

            DomitoryDelegate domitoryDelegate=new DomitoryDelegate(country);
            domitoryDelegate.setServiceType();
            Client client=new Client(domitoryDelegate,athlete);
            client.doTask();
            //打印分配结果
            System.out.println("国家"+" "+country);
            System.out.println("楼栋号:"+athlete.getBuilding());
            System.out.println("房间号:"+athlete.getRoomNumber());
            System.out.println();
        }
    }
}

