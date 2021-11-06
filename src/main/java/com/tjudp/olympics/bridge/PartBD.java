package com.tjudp.olympics.bridge;

public class PartBD extends Partition {
/**
 * B、D分区
 * @param priceAPI
 */
	public PartBD(PriceAPI priceAPI) {
		super(priceAPI);
	}

	@Override
	public int getPricing() { //获取B、D分区对应层数价格
		return priceAPI.pricing();
		
	}

}
