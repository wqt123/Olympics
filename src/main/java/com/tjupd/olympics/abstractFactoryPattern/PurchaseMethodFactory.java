package com.tjupd.olympics.abstractFactoryPattern;

public class PurchaseMethodFactory extends AbstractFactory {
/**
 * 购票方式工厂
 */
	@Override
	public AdmissionTime getAdmissionTime(String time) {
		return null;
	}

	@Override
	public PurchaseMethod getPurchaseMethod(String purchaseMethod) {
	/**
	 * 获取售票类型，生成相应售票类型的类
	 */
		if(purchaseMethod == null){
	         return null;
	      }        
	      if(purchaseMethod.equalsIgnoreCase("OnlineTicket")){
	         return new OnlineTicketing();
	      } else if(purchaseMethod.equalsIgnoreCase("OnSiteTicket")){
	         return new OnSiteTicketing();
	      }
		return null;
	}

}
