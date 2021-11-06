package com.tjudp.olympics.tickets;
import java.util.Scanner;

import com.tjudp.olympics.abstractfactory.AbstractFactory;
import com.tjudp.olympics.abstractfactory.AdmissionTime;
import com.tjudp.olympics.abstractfactory.FactoryProducer;
import com.tjudp.olympics.abstractfactory.PurchaseMethod;
import com.tjudp.olympics.audience.Audience;
import com.tjudp.olympics.bridge.*;
public class Ticket {
/**
 * 票
 */
	
	private int purchaseMethod;
	/**
	 * 买票方式
	 * 0：网络售票
	 * 1：现场售票
	 */
	private int admissionTime;
	/**
	 * 入场时间
	 * 0：上午
	 * 1：下午
	 * 2：晚间
	 */
	private String partition;
	/**
	 * 分区：A，B，C，D
	 */
	private int layer;
	/**
	 * 层：1,2,3
	 */
	private int price;
	/**
	 * 票价
	 */
	private int row;
	/**
	 * 排：1-10
	 */
	private int seat;
	/**
	 * 座位号：1-40
	 */
	
	public Ticket() {}
	
	public int getPurchaseMethod() {
		return purchaseMethod;
	}
	
	public void setPurchaseMethod(int purchaseMethod) {
		this.purchaseMethod = purchaseMethod;
	}
	
	private void choosePurchaseMethod() {
		/**
		 * 选择买票方式，使用了工厂模式与抽象工厂模式
		 */
		AbstractFactory purchaseMethodFactory = FactoryProducer.getFactory("PurchaseMethod");
		for(;;) {
			System.out.println("请选择买票方式：\n[1] 网络售票\n[2] 现场售票");
			Scanner input=new Scanner(System.in);
			String str=input.nextLine();
			if(str.equals("1")==true) {
				PurchaseMethod purchaseMethod2 = purchaseMethodFactory.getPurchaseMethod("OnlineTicket");
				setPurchaseMethod(purchaseMethod2.purchaseTicket());
				break;
			} else if(str.equals("2")==true) {
				PurchaseMethod purchaseMethod1 = purchaseMethodFactory.getPurchaseMethod("OnSiteTicket");
				setPurchaseMethod(purchaseMethod1.purchaseTicket());
				break;
			} else {
				System.out.println("输入错误，请重新输入。");
			}
		}
	}
	
	public int getAdmissionTime() {
		return admissionTime;
	}
	
	public void setAdmissionTime(int admissionTime) {
		this.admissionTime = admissionTime;
	}
	
	private void chooseAdmissionTime() {
		/**
		 * 选择入场时间，使用了工厂模式与抽象工厂模式
		 */
		AbstractFactory timeFactory = FactoryProducer.getFactory("AdmissionTime");
		for(;;) {
			System.out.println("请选择入场时间：\n[1] 上午（9:00-13:00）\n[2] 下午（13:00-17:00）\n[3] 晚上（17:00-21:00）");
			Scanner input=new Scanner(System.in);
			String str=input.nextLine();
			if(str.equals("1")==true) {
				AdmissionTime time1 = timeFactory.getAdmissionTime("morning");
				setAdmissionTime(time1.chooseAdmissionTime());
				break;
			} else if(str.equals("2")==true) {
				AdmissionTime time2 = timeFactory.getAdmissionTime("afternoon");
				setAdmissionTime(time2.chooseAdmissionTime());
				break;
			} else if(str.equals("3")==true) {
				AdmissionTime time3 = timeFactory.getAdmissionTime("night");
				setAdmissionTime(time3.chooseAdmissionTime());
				break;
			} else {
				System.out.println("输入错误，请重新输入。");
			}
		}
	}
	
	public String getPartition() {
		return partition;
	}
	
	public void setPartition(String partition) {
		this.partition = partition;
	}
	
	private void choosePartition() {
		/**
		 * 选择分区
		 */
		for(;;) {
			System.out.println("请选择座位分区：\n[1] A区域\n[2] B区域\n[3] C区域\n[4] D区域");
			Scanner input=new Scanner(System.in);
			String str=input.nextLine();
			if(str.equals("1")==true) {
				setPartition("A");
				break;
			} else if(str.equals("2")==true) {
				setPartition("B");
				break;
			} else if(str.equals("3")==true) {
				setPartition("C");
				break;
			} else if(str.equals("4")==true) {
				setPartition("D");
				break;
			} else {
				System.out.println("输入错误，请重新输入。");
			}
		}
		System.out.println("您的选择为："+this.partition+"区域");
	}
	
	public int getLayer() {
		return layer;
	}
	
	public void setLayer(int layer) {
		this.layer = layer;
	}
	
	private void chooseLayer() {
		/**
		 * 选择层
		 */
		for(;;) {
			System.out.println("请选择座位楼层：\n[1] 第1层\n[2] 第2层\n[3] 第3层");
			Scanner input=new Scanner(System.in);
			String str=input.nextLine();
			if(str.equals("1")==true) {
				setLayer(1);
				break;
			} else if(str.equals("2")==true) {
				setLayer(2);
				break;
			} else if(str.equals("3")==true) {
				setLayer(3);
				break;
			} else {
				System.out.println("输入错误，请重新输入。");
			}
		}
		
		System.out.println("您的选择为：第"+this.layer+"层");
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	private void calculatePrice() {
		/**
		 * 计算票价，使用了桥接模式
		 */
		System.out.println("票价表：\nA、C区域第1层：500元人民币\nA、C区域第2层：300元人民币\nA、C区域第3层：80元人民币\nB、D区域第1层：450元人民币\nB、D区域第2层：200元人民币\nB、D区域第3层：50元人民币");
		this.choosePartition();
		this.chooseLayer();
		if(this.partition=="A"&&this.layer==1) {
			Partition A1 = new PartAC(new PartACFirst());
			setPrice(A1.getPricing());
		} else if(this.partition=="A"&&this.layer==2) {
			Partition A2 = new PartAC(new PartACSecond());
			setPrice(A2.getPricing());
		} else if(this.partition=="A"&&this.layer==3) {
			Partition A3 = new PartAC(new PartACThird());
			setPrice(A3.getPricing());
		} else if(this.partition=="B"&&this.layer==1) {
			Partition B1 = new PartBD(new PartBDFirst());
			setPrice(B1.getPricing());
		} else if(this.partition=="B"&&this.layer==2) {
			Partition B2 = new PartBD(new PartBDSecond());
			setPrice(B2.getPricing());
		} else if(this.partition=="B"&&this.layer==3) {
			Partition B3 = new PartBD(new PartBDThird());
			setPrice(B3.getPricing());
		} else if(this.partition=="C"&&this.layer==1) {
			Partition C1 = new PartAC(new PartACFirst());
			setPrice(C1.getPricing());
		} else if(this.partition=="C"&&this.layer==2) {
			Partition C2 = new PartAC(new PartACSecond());
			setPrice(C2.getPricing());
		} else if(this.partition=="C"&&this.layer==3) {
			Partition C3 = new PartAC(new PartACThird());
			setPrice(C3.getPricing());
		} else if(this.partition=="D"&&this.layer==1) {
			Partition D1 = new PartBD(new PartBDFirst());
			setPrice(D1.getPricing());
		} else if(this.partition=="D"&&this.layer==2) {
			Partition D2 = new PartBD(new PartBDSecond());
			setPrice(D2.getPricing());
		} else if(this.partition=="D"&&this.layer==3) {
			Partition D3 = new PartBD(new PartBDThird());
			setPrice(D3.getPricing());
		}
	}
	
	public int getRow() {
		return row;
	}
	
	public void setRow(int row) {
		this.row = row;
	}
	
	private void chooseRow() {
		/**
		 * 选择排
		 */
		for(;;) {
			System.out.println("请输入排号：1-10");
			Scanner input=new Scanner(System.in);
			int row = 0;
			if (input.hasNextInt()) {
				row = input.nextInt();
				if(row<1||row>10) {
					System.out.println("输入错误，请重新输入。");
				} else {
					System.out.println("您选择的排为：" + row);
					setRow(row);
					break;
				}
	        } else {
	        	System.out.println("输入错误，请重新输入。");
	        }
		}
	}
	
	public int getSeat() {
		return seat;
	}
	
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	private void chooseSeat() {
		/**
		 * 选择座位
		 */
		for(;;) {
			System.out.println("请输入座位号：1-40");
			Scanner input=new Scanner(System.in);
			int seat = 0;
			if (input.hasNextInt()) {
				seat = input.nextInt();
				if(seat<1||seat>40) {
					System.out.println("输入错误，请重新输入。");
				} else {
					System.out.println("您选择的座位为：" + seat);
					setSeat(seat);
					break;
				}
	            
	        } else {
	        	System.out.println("输入错误，请重新输入。");
	        }
		}
	}
	
	public void buyTicket() {
		/**
		 * 买票
		 */
		this.choosePurchaseMethod();
		this.chooseAdmissionTime();
		this.calculatePrice();
		this.chooseRow();
		this.chooseSeat();
	}
	
	public void printTicket(Audience audience) {
		/**
		 * 打印门票信息
		 */
		System.out.println("买票成功！您的门票信息为：");
		String name;
		String audienceID;
		name=audience.getName();
		System.out.println("姓名："+name);
		audienceID=audience.getAudienceID();
		System.out.println("观众编号："+audienceID);
		int purchaseMethod;
		int admissionTime;
		String partition;
		int layer;
		int row;
		int seat;
		int price;
		purchaseMethod=getPurchaseMethod();
		admissionTime=getAdmissionTime();
		partition=getPartition();
		layer=getLayer();
		row=getRow();
		seat=getSeat();
		price=getPrice();
		if(purchaseMethod==0) {
			System.out.println("门票类型：网络售票");
		} else if(purchaseMethod==1) {
			System.out.println("门票类型：现场售票");
		}
		if(admissionTime==0) {
			System.out.println("入场时间：上午场（9:00-13:00，请在规定时间内入场检票！）");
		} else if(admissionTime==1) {
			System.out.println("入场时间：下午场（13:00-17:00，请在规定时间内入场检票！）");
		} else if(admissionTime==2) {
			System.out.println("入场时间：夜晚场（17:00-21:00，请在规定时间内入场检票！）");
		}
		System.out.println("座位分区："+partition+"区");
		System.out.println("层数：第"+layer+"层");
		System.out.println("排号：第"+row+"排");
		System.out.println("座位号："+seat+"号");
		System.out.println("票价："+price+"元");
	}
}

