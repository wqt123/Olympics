package com.tjudp.olympics.audience;

import org.junit.Test;
import com.tjudp.olympics.iterator.BuySouvenir;

public class TestAudience {
	// 新建一个观众
	Audience audience = new Audience("张三","888888",1000);
	// 新建一个购买对象
	BuySouvenir buySouvenir = new BuySouvenir();
	
	@Test
	public void testAudience() throws CloneNotSupportedException {
		// 初始化观众
		//audience.init();
	}
}
