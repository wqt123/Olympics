package State;

import com.tjupd.olympics.State.StateDemo;
import com.tjupd.olympics.athletes.Athlete;
import org.junit.Test;

/**
 * 测试状态模式类
 * @author lxt
 *
 */
public class TestState {
	private Athlete athlete = new Athlete();
	private StateDemo demo = new StateDemo();
	
	@Test
	public void testdoaction() throws InterruptedException {
		athlete.setHealthCode(2);
		demo.run(athlete);
	}
}
