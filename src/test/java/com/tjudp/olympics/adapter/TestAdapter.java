package com.tjudp.olympics.adapter;

import org.junit.Test;

import com.tjudp.olympics.audience.Audience;

public class TestAdapter {
		Audience audience = new Audience("张三","888888",1000);
		PayForSouvenir payForSouvenir = new PayForSouvenir();
		@Test
		public void testAdapter() throws CloneNotSupportedException {
			System.out.println("\n适配器模式测试：");
			System.out.println("类适配器模式测试：");
			System.out.println("请选择支付方式：[1] 微信支付          [2] 支付宝支付");
			System.out.println("[1]");
			Pay target1 = new WeChatAdapter();
			target1.pay();
		}
}
