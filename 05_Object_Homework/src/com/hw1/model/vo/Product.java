package com.hw1.model.vo;

public class Product {

	private String productld;
	private String productName;
	private String productArea;
	private int price;
	private double tex;
	
	public Product(String productld,String productName,String productArea,int price,double tex) {
	this.productld = productld;
	this.productName = productName;
	this.productArea=productArea;
	this.price = price;
	this.tex = tex;
	}
	
	public String getProductld() {
		return productld;
	}
	public void setProductld(String productld) {
		this.productld=productld;
	}	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName=productName;
	}
	
	public String getProductArea() {
		return productArea;
	}
	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	
	public double getTex() {
		return tex;
	}
	public void setTex(double tex) {
		this.tex=tex;
	}
	
	
	
	public String information() {
		return productld+" "+productName+" "+productArea+" "+price+" "+tex;
	}
	
	public String information2() {
		return "상품명 : "+productName+"\n부가세 포함 가격 : "+price+"원";
	}
	
	
	
	
	
}
