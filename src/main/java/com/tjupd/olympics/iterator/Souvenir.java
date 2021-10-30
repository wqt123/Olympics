package com.tjupd.olympics.iterator;
/**
 * @author GaoShan
 * 纪念品类
 */
public class Souvenir {
	String name;
	Integer price;
	public Souvenir (String name,Integer price){
		this.name = name;
		this.price = price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getPrice() {
		return this.price;
	}
}
