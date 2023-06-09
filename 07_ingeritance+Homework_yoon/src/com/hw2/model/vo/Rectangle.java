package com.hw2.model.vo;

public class Rectangle extends Point {
	private int width;
	private int height;
	
	
	public Rectangle () {}
	
	public Rectangle (int x,int y,int width,int height) {
		super(x,y);
		this.height=height;
		this.width=width;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
	this.width=width;
	}

	
	public void draw() {
		System.out.println(super.getX());
		System.out.println(super.getY());
		System.out.println("면적 : "+(width*height));
		System.out.println("둘레 : "+(2*(width+height)));
	}
}
