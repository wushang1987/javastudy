package com.wgh;

public class Product {
	public static final int PAGE_SIZE = 2;  //每页记录数
	private int id;				//编号
	private String name;		//名称
	private double price;		//价格
	private int num;			//数量
	private String unit;		//单位
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getUnit() {
		return unit;
	}
	
	
}