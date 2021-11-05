package com.tjudp.olympics.adapter;
/**
 * @author GaoShan
 * 微信支付适配器
 */
public class WeChatAdapter extends WeChatAdaptee implements Pay{
	public void pay(){
		  weChatPay();
	}
}
