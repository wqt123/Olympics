package Observer;

import com.tjupd.olympics.Observer.ObserverDemo;
import com.tjupd.olympics.athletes.Athlete;
import com.tjupd.olympics.athletes.Athletes;
import org.junit.Test;

/**
 * 测试观察者模式类
 * @author lxt
 *
 */
public class TestObserver {
	private Athlete athlete = new Athlete();
	private Athletes athletes = Athletes.getAll();
	
	private ObserverDemo observerdemo = new ObserverDemo();
	@Test
	public void testnotifyObserver() {
		athlete.setName("test");
		athlete.setHealthCode(2);
		athlete.setCountry("Russian");
		observerdemo.run(athlete, athletes);
	}
}
