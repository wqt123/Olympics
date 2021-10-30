package testTicket;

import org.junit.Test;
import com.tjupd.olympics.bridgePattern.*;

public class TestBridgePattern {

	@Test
	public void test() {
		System.out.println("\n桥接模式测试：");
		Partition A1 = new PartAC(new PartACFirst());
		Partition A2 = new PartAC(new PartACSecond());
	    Partition A3 = new PartAC(new PartACThird());
	    Partition B1 = new PartBD(new PartBDFirst());
	    Partition B2 = new PartBD(new PartBDSecond());
	    Partition B3 = new PartBD(new PartBDThird());
	 
	    A1.getPricing();
	    A2.getPricing();
	    A3.getPricing();
	    B1.getPricing();
	    B2.getPricing();
	    B3.getPricing();
	}
}
