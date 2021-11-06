package com.tjudp.olympics.bridge;

public abstract class Partition {
/**
 * 分区
 */
	protected PriceAPI priceAPI; //定价接口
	protected Partition(PriceAPI priceAPI){
		this.priceAPI = priceAPI;
	}
	public abstract int getPricing(); //获取该分区对应层数价格
}
