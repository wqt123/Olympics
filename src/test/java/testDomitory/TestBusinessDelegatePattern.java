package testDomitory;

import com.tjupd.olympics.athletes.Athletes;
import com.tjupd.olympics.domitory.BusinessDelegatePattern.Client;
import com.tjupd.olympics.domitory.BusinessDelegatePattern.DomitoryDelegate;
import org.junit.Test;

public class TestBusinessDelegatePattern {
    @Test
    public void test(){
        Athletes athletes= Athletes.getAll();
        String country=athletes.getAthlete("Ford").getCountry();
        //抽取一个运动员

        //办理住宿
        DomitoryDelegate domitoryDelegate=new DomitoryDelegate(country);
        domitoryDelegate.setServiceType();
        Client client=new Client(domitoryDelegate);
        client.doTask();
        String roomNumber=domitoryDelegate.getroomNumber();
        String building=domitoryDelegate.getBuilding();
        System.out.println("hello!");
        System.out.println("country"+" "+country);
        System.out.println("building:"+athletes.getAthlete("Ford").getBuilding());
        System.out.println("roomNumber:"+athletes.getAthlete("Ford").getRoomNumber());
        athletes.deliverRoom("Ford",building,roomNumber);
        System.out.println("update:");
        System.out.println("building:"+athletes.getAthlete("Ford").getBuilding());
        System.out.println("roomNumber:"+athletes.getAthlete("Ford").getRoomNumber());
    }
}