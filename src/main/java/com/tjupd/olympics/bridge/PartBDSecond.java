package com.tjupd.olympics.bridge;

public class PartBDSecond implements PriceAPI {
	/**
	 * 分区BD第二层
	 */
		public int pricing() { //返回门票价格
			System.out.println("分区BD第二层票价为200元人民币");
			return 200;
		}
}
