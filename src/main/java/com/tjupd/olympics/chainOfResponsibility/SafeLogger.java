package com.tjupd.olympics.chainOfResponsibility;

/**
 * 绿码：安全级别
 * @author lxt
 *
 */
public class SafeLogger extends AbstractLogger {
	public SafeLogger(int level){
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
