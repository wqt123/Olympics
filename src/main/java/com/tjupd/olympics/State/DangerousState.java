package com.tjupd.olympics.State;

import com.tjupd.olympics.athletes.Athlete;

/**
 * 危险状态执行类
 * @author lxt
 *
 */
public class DangerousState implements State {
	
	/**
	 * 执行对应函数
	 */
	public void doAction(Context context, Athlete athlete) throws InterruptedException {
		System.out.println("危险！立即隔离进行核酸检测！");
		athlete.setStatus(false);
		System.out.println("核酸检测中……");
		Thread.sleep(1000);
		System.out.println("核酸检测正常，更新");
		Thread.sleep(1000);
	}
}
