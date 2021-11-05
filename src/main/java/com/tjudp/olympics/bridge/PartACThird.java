package com.tjudp.olympics.bridge;

public class PartACThird implements PriceAPI {
	/**
	 * 分区AC第三层
	 */
		public int pricing() { //返回门票价格
			System.out.println("分区AC第三层票价为80元人民币");
			return 80;
		}
}
