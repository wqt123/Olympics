package com.tjupd.olympics.abstractFactoryPattern;

public class OnlineTicketing implements PurchaseMethod {
/**
 * 网络售票
 */
	public int purchaseTicket() {
		System.out.println("购买网络售票");
		return 0;
	}

	
	
}
