package com.kh.chap02_inherit.model.vo;

public class vehicle {
	private String name;
	private double mileage;
	private String kind;
	
	public vehicle() {}
	
	public vehicle(String name,double mileage,String kind) {
		this.name=name;
		this.mileage=mileage;
		this.kind=kind;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public String getKind() {
		return kind;
	}
	public void setKined(String kind) {
		this.kind=kind;
	}
	
	public String information() {
		return "naem : "+name+", mileage : "+mileage+", kind : "+kind;
	}
	@Override
	public String toString() {
		return "naem : "+name+", mileage : "+mileage+", kind : "+kind;
	}
	
	public void howtomove() {
		System.out.println("굴러간다.");
	}
	
	
	
}
