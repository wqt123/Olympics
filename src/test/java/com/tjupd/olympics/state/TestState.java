package com.tjupd.olympics.state;

import com.tjupd.olympics.singleton_dataaccessobject_nullobject.Athlete;
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
