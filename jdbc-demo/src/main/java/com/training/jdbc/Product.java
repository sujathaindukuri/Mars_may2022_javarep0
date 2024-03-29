package com.training.jdbc;

public class Product implements Comparable<Product> {
	private String name;
	private int price;
	private String desc;
	public Product(String name, int price, String desc) {
		super();
		this.name = name;
		this.price = price;
		this.desc = desc;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		if(this.getPrice() > o.getPrice())
		{
		return 1;
	}
		else if (this.getPrice() < o.getPrice())
		{
		return -1;
	}
		else {
			return 0;
		}
		
		
		
	

}
}