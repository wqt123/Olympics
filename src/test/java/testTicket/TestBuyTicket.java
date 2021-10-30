package testTicket;
import static org.junit.Assert.*;

import org.junit.Test;

import com.tjupd.olympics.audience.Audience;

public class TestBuyTicket {

	@Test
	public void test() {
		Audience audience1=new Audience();
		audience1.init();
		audience1.buyTicket();
	}

}
