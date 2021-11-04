package com.tjupd.olympics.bridge;

public class PartBDFirst implements PriceAPI {
	/**
	 * 分区BD第一层
	 */
		public int pricing() { //返回门票价格
			System.out.println("分区BD第一层票价为450元人民币");
			return 450;
		}
}
