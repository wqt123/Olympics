package com.tjupd.olympics.testAudience;

import org.junit.Test;
import com.tjupd.olympics.audience.Audience;
import com.tjupd.olympics.iterator.BuySouvenir;

public class TestAudience {
	// 新建一个观众
	Audience audience = new Audience();
	// 新建一个购买对象
	BuySouvenir buySouvenir = new BuySouvenir();
	
	@Test
	public void testAudience() throws CloneNotSupportedException {
		// 初始化观众
		audience.init();
	}
}
