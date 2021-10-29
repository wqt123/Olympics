package com.tjupd.olympics.prototype;

 /**
* 购物凭证类
* 有消费者（这里是观众）的
* 姓名、ID、购买总金额、凭证编号和相关信息
*/
public class receipt implements Cloneable {
	String name;
	String audienceID;
	String receiptNumber;
	int total;
	String info;
	receipt(){}
	receipt(String name, String audienceID, int total, String info) {
	      this.name = name;
	      this.audienceID = audienceID;
	      this.total = total;
	      this.info = info;
	      setReceiptNumber();
	      System.out.println("购物凭证创建成功！");
	  }
	/**
	 * @param name
	 */
	void setName(String name) {
		this.name = name;
	}
	/**
	 * @param audienceID
	 */
	void setAudienceID(String audienceID) {
		this.audienceID = audienceID;
	}
	/**
	 * 使用随机数生成发票编号
	 */
	void setReceiptNumber() {
		int newNum = (int)((Math.random()*9+1)*100000);
		this.receiptNumber = String.valueOf(newNum);
	}
	/**
	 * 设置总金额
	 */
	void setTotal(int total) {
		this.total = total;
	}
	
	/**
	 * 打印购物凭证
	 */
	void display() {
	      System.out.println("凭证编号：" + receiptNumber);
	      System.out.println(name + audienceID + info + total);
	  }
	
	/**
	 * 实现深克隆
	 */
	public Object clone() throws CloneNotSupportedException {
	      System.out.println("发票拷贝成功！");
	      return (receipt) super.clone();
	  }
}
