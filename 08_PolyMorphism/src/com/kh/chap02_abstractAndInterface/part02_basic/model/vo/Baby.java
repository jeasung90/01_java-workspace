package com.kh.chap02_abstractAndInterface.part02_basic.model.vo;

public class Baby extends Person implements Basic{ 
	// 상속 => 단일상속만 가능 , 인터페이스 => 다중 상속가능

	public Baby() {}
	public Baby(String name,double weight,int health) {
		super(name, weight, health);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	
	@Override
	public void eat() {
		// 밥먹으면 몸무게 3 증가, 겅강도 1 증가
		super.setWeight(super.getWeight()+3);
		super.setHealth(super.getHealth()+1);
	}

	@Override
	public void sleep() {
		// 잠을 자면 건강도  3증가
		super.setHealth(super.getHealth()+3);
	}

}
