package com.tjupd.olympics.bridge;

public class PartACSecond implements PriceAPI {
	/**
	 * 分区AC第二层
	 */
		public int pricing() { //返回门票价格
			System.out.println("分区AC第二层票价为300元人民币");
			return 300;
		}
}
