package com.tjupd.olympics.prototype;

import org.junit.Test;
import com.tjupd.olympics.audience.Audience;

public class TestPrototype {
		Audience audience = new Audience("张三","888888",1000);
		PrintReceipt printReceipt = new PrintReceipt();
		
		@Test
		public void testPrototype() throws CloneNotSupportedException {
			System.out.println("\n原型模式测试：");
			printReceipt.run(audience,1400);
		}
}

