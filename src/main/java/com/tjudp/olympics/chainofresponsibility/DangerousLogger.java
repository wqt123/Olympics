package com.tjudp.olympics.chainofresponsibility;

/**
 * 红码：危险级别
 * @author lxt
 *
 */
public class DangerousLogger extends AbstractLogger {
	 public DangerousLogger(int level){
	      this.level = level;
	   }
	 
	 /**
	  * 执行动作
	  */
	   @Override
	   protected void doAction(String message) {    
		   System.out.println("运动员身体状况：" + message);
	   }
}
