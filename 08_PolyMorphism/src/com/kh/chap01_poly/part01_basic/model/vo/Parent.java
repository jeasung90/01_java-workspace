package com.kh.chap01_poly.part01_basic.model.vo;

public class Parent {

	private int x;
	private int y;

	public Parent() {}

	public Parent(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int setX() {
		return x;
	}

	public void getX(int x) {
		this.x = x;
	}

	public int setY() {
		return y;
	}

	public void getY(int y) {
		this.y = y;
	}

	public void printparent() {
		System.out.println("나 부모");
	}

	public void print() {
		System.out.println("나 부모");
	}
}
