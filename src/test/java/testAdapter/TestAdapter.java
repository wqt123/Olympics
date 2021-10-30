package com.tjupd.olympics.testAdapter;

import org.junit.Test;

import com.tjupd.olympics.adapter.PayForSouvenir;
import com.tjupd.olympics.audience.Audience;

public class TestAdapter {
		Audience audience = new Audience("张三","888888",1000);
		PayForSouvenir payForSouvenir = new PayForSouvenir();
		@Test
		public void testAdapter() throws CloneNotSupportedException {
			System.out.println("\n适配器模式测试：");
			payForSouvenir.run(audience,1400);
		}
}
