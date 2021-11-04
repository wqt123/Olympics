package com.tjupd.olympics.bridge;

public class PartACFirst implements PriceAPI {
/**
 * 分区AC第一层
 */
	public int pricing() { //返回门票价格
		System.out.println("分区AC第一层票价为500元人民币");
		return 500;
	}

}
