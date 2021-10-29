package com.tjupd.olympics.audience;

import java.util.*;
/**
 * 
 * @author GaoShan
 * 观众类，观众有姓名、ID、携带的钱和背包
 * 买票状态False表示未购买，True表示已购买
 */
public class Audience implements AudienceInterface{
	private int money;
	private String name;
	private String audienceID;
	private boolean ticketState;
	private List<String> bag;
	public Audience() {
	  }
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAudienceID() {
		return audienceID;
	}
	/**
	 * 随机生成一个六位的观众ID
	 */
	public void setAudienceID() {
		int newNum = (int)((Math.random()*9+1)*100000);
		this.audienceID =String.valueOf(newNum);
	}
	
	public boolean getTicketState() {
		return ticketState;
	}
	
	public void setTicketState(boolean ticketState) {
		this.ticketState = ticketState;
	}
	
	public List<String> getBag(){
		return bag;
	}
	
	public void setBag(String item) {
		this.bag.add(item);
	}
	
	public void showBag() {
		System.out.println("您的背包里有："+this.getBag());
	}

	public void showAudience() {
		System.out.println("姓名："+this.getName());
		System.out.println("编号："+this.getAudienceID());
		System.out.println("资金："+this.getMoney());
		System.out.println("购票状态："+this.getTicketState());
		System.out.println("背包："+this.getBag());
	}
	
	public void init() {
		System.out.println("请输入观众姓名：");
		Scanner name=new Scanner(System.in);
		String n=name.next();
	    this.name = n;
	    setAudienceID();
	    System.out.println("您的观众ID是："+ audienceID );
	    System.out.println("请输入拥有人民币金额：");
		int money=name.nextInt();
	    this.money = money;
	    this.bag = new ArrayList<String>();
	    this.setTicketState(false);
	}
}