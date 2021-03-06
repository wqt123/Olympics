package com.tjudp.olympics.chainofresponsibility;

/**
 * 责任链抽象类
 * @author lxt
 *
 */
public abstract class AbstractLogger {

	/**
	 * 不同健康码级别
	 * SAFE表示绿码，WARNING黄码，DANGEROUS红码
	 */
	public static int SAFE = 1;
	public static int WARNING = 2;
	public static int DANGEROUS = 3;

	protected int level;

	protected AbstractLogger nextLogger;

	/**
	 * 连接责任链
	 * @param nextLogger
	 */
	public void setNextLogger(AbstractLogger nextLogger){
		this.nextLogger = nextLogger;
	}

	/**
	 * 比较责任链上不同状态的级别大小，只用等于时采用相等级别的动作
	 * @param level
	 * @param message
	 */
	public void logMessage(int level, String message){
		if(this.level == level){
			doAction(message);
		}
		if(nextLogger !=null){
			nextLogger.logMessage(level, message);
		}
	}
	
	/**
	 * 不同级别动作
	 * @param message
	 */
 	abstract protected void doAction(String message);
}
