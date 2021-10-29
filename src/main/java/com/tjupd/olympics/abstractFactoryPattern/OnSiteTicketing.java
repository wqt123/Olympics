package com.tjupd.olympics.abstractFactoryPattern;

public class OnSiteTicketing implements PurchaseMethod {
/**
 * 现场买票
 */
	public int purchaseTicket() {
		System.out.println("购买现场售票");
		return 1;
	}
}
