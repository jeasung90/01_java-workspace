package com.kh.chap02_inherit.model.vo;

public class Ship extends vehicle{
	private int propeller;
	
	public Ship() {}
	
	public Ship(String name,double mileage,String kind,int propeller) {
		super(name, mileage, kind);
		this.propeller=propeller;
	}

	public int getPropeller() {
		return propeller;
	}
	public void setPropeller(int propeller) {
		this.propeller=propeller;
	}
	
	public String information() {
		return super.information()+", propeller : "+propeller;

	}
	@Override // 어노테이션(생략가능)
	public void howtomove() { // 이름을 부모와 달리하면 오류남 @붙어 있을 경우
		System.out.println("엔진에서 4행정을 통하여 출력을 만든후 프로펠러에게 전달한함. 프로펠러가 물을 밀어내서 추진력을 얻는다.");
	}
	

}
