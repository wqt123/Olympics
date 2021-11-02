package testDomitory;
import com.tjupd.olympics.domitory.BusinessDelegatePattern.*;
import org.junit.Test;
import com.tjupd.olympics.athletes.*;

public class TestBussinessDelegatePattern {

    @Test
    public void testBusinessDelegatePattern() throws CloneNotSupportedException {
        Athletes athletes= Athletes.getAll();
        for (Athlete athlete:athletes.getAthletes()) //遍历运动员，为所有运动员分配住宿
        {
            String country=athlete.getCountry();

            //办理住宿
            DomitoryDelegate domitoryDelegate=new DomitoryDelegate(country);
            domitoryDelegate.setServiceType();
            Client client=new Client(domitoryDelegate,athlete);
            System.out.print(athlete.getName());
            client.doTask(athlete);
            String roomNumber=domitoryDelegate.getroomNumber();
            String building=domitoryDelegate.getBuilding();

            //打印分配结果
            System.out.println("country"+" "+country);
            System.out.println("building:"+athlete.getBuilding());
            System.out.println("roomNumber:"+athlete.getRoomNumber());
            System.out.println();
        }
    }
}

