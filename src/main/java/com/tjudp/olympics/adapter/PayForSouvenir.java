package com.tjudp.olympics.adapter;

import java.util.Scanner;

import com.tjudp.olympics.audience.Audience;

/**
 * @author GaoShan
 * 适配器模式，选择微信支付或者支付宝支付
 */
public class PayForSouvenir {
	public boolean run(Audience audience, int price) {
		System.out.println("类适配器模式测试：");
		System.out.println("请选择支付方式：[1] 微信支付          [2] 支付宝支付");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int restMoney = audience.getMoney()-price;
		if (restMoney >= 0 ) {
			switch (n) {
			case 1: Pay target1 = new WeChatAdapter();
		    target1.pay();
		    audience.setMoney(audience.getMoney()-price);
		    return true;
		    case 2: Pay target2 = new AlipaytAdapter();
		    target2.pay();
		    return true;
		    default: System.out.println("支付失败！");
		    return false;
			}
		}
		else System.out.println("支付失败！");
		return false;
	}
}
