package com.tjupd.olympics.adapter;

/**
 * @author GaoShan
 * 支付宝支付适配器
 */
public class AlipaytAdapter extends AlipayAdaptee implements Pay {
	public void pay(){
		  aliPay();
	}
}
