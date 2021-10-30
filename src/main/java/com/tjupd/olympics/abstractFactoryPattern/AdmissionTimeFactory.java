package com.tjupd.olympics.abstractFactoryPattern;

public class AdmissionTimeFactory extends AbstractFactory {
/**
 * 入场时间工厂
 */
	@Override
	public AdmissionTime getAdmissionTime(String time) { //获取入场时间，生成相应入场时间的类
		if(time == null){
	         return null;
	      }        
	      if(time.equalsIgnoreCase("morning")){
	         return new MorningTicket();
	      } else if(time.equalsIgnoreCase("afternoon")){
	         return new AfternoonTicket();
	      } else if(time.equalsIgnoreCase("night")){
	         return new NightTicket();
	      }
		return null;
	}

	@Override
	public PurchaseMethod getPurchaseMethod(String purchaseMethod) {

		return null;
	}

}
