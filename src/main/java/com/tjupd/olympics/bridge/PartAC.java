package com.tjupd.olympics.bridge;

public class PartAC extends Partition {
/**
 * A、C分区
 * @param priceAPI
 */
	public PartAC(PriceAPI priceAPI) {
		super(priceAPI);
	}

	@Override
	public int getPricing() {  //获取A、C分区对应层数价格
		return priceAPI.pricing();
		
	}

}
