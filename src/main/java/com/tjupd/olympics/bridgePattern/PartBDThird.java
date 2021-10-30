package com.tjupd.olympics.bridgePattern;

public class PartBDThird implements PriceAPI {
	/**
	 * 分区BD第三层
	 */
		public int pricing() { //返回门票价格
			System.out.println("分区BD第三层票价为50元人民币");
			return 50;
		}
}
