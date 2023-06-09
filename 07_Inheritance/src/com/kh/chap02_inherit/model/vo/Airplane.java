package com.kh.chap02_inherit.model.vo;

public class Airplane extends vehicle {
	private int tire;
		private int wing;
	
	public Airplane() {}
	
	public Airplane(String name,double mileage,String kind,int tire,int wing) {
		super(name, mileage, kind);
		this.tire=tire;
		this.wing=wing;
	}
		
	public int getTire() {
		return tire;
	}
	public void setTire(int tire) {
		this.tire=tire;
	}
	public int getWing() {
		return wing;
	}
	public void setWing(int wing) {
		this.wing=wing;
	}
	
	public String information() {
		return super.information()+", wing : "+wing;

	}
	@Override // 어노테이션(생략가능)
	public void howtomove() { // 이름을 부모와 달리하면 오류남 @붙어 있을 경우
		System.out.println("엔진을 통한 프로펠러식이나, 몰루?");
	}
	
}
