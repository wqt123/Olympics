package com.tjupd.olympics.chainOfResponsibility;

/**
 * 黄码：警告级别
 * @author lxt
 *
 */
public class WarningLogger extends AbstractLogger{
	public WarningLogger(int level){
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
