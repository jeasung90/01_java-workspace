package com.hw2.model.vo;

public class Circle extends Point {

	private int radius;
	
	public Circle() {}
	
	public Circle(int x,int y,int radius) {
		super(x,y);
		this.radius=radius;
	}

	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius=radius;
	}
	
	public void draw() {
	System.out.println(super.getX());
	System.out.println(super.getY());
	System.out.println("면적 : "+Math.round(Math.PI*radius*radius));
	System.out.println("둘레 : "+Math.round(Math.PI*radius*2));
	System.out.println();
	}
	

	
}
