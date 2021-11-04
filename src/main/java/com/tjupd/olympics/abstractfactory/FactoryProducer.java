package com.tjupd.olympics.abstractfactory;

public class FactoryProducer {
/**
 * 工厂生产类
 */
	public static AbstractFactory getFactory(String choice){ //选择生产的工厂类型
	      if(choice.equalsIgnoreCase("AdmissionTime")){
	         return new AdmissionTimeFactory();
	      } else if(choice.equalsIgnoreCase("PurchaseMethod")){
	         return new PurchaseMethodFactory();
	      }
	      return null;
	   }
}
