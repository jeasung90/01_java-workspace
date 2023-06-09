package com.kh.chap02_inherit.model.vo;

public class Car extends vehicle{
	private int tire;
	
	public Car() {}
	
	public Car(String name,double mileage,String kind,int tire) {
		super(name, mileage, kind);
		this.tire=tire;
	}
	
	public int getTire() {
		return tire;
	}
	public void setTire(int tire) {
		this.tire=tire;
	}
	
	public String information() {
		return super.information()+", tire : "+tire;
	}
	
	@Override // 어노테이션(생략가능)
	public void howtomove() { // 이름을 부모와 달리하면 오류남 @붙어 있을 경우
		System.out.println("엔진에서 4행정을 통하여 출력을 만든후 미션에 전달해 기어맞물린 후 디퍼런셜을 통하여 각 바퀴에 전달한다.");
	}
	
}
