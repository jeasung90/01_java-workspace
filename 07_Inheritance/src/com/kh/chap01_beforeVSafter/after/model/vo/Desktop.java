package com.kh.chap01_beforeVSafter.after.model.vo;
	//         자식 --------> 부모
	//		   후손 --------> 조상
	//		   하위 --------> 상위
	//		   this --------> super
public class Desktop extends Produck {
	private boolean allInOne;
	
	public Desktop() {}
	
	public Desktop(String brand,String pCode,String pName,int price,boolean allInOne) {
		//brand = trand; // thos :  이 클래스의 주소값
		
		// 해결방법 1. 부모클래스에 있는 필드를 protected 접근 제한자로 수정
		/* 
		super.brand = brand;
		super.pCode = pCode;
		*/
		// brand ~~ price 네 개의 값들은 부모클래스(Produck)의 필드에 대입
		
		// 해결방법 2. 부모클래스에 있는 setter 메소드 활용하기 (public 이기 때문에)
		/*
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		*/
		
		// 해결방법 3. 부모 생성자 호출하기 => 이걸로 진행할것임!
		// this 생성자 this(), super 생성자 super() 위치가 한상 위어야한다
		super(brand, pCode, pName, price); // <-- 맨 위에 있어야함
		this.allInOne=allInOne;
		
		
	}
	
	public boolean isallInOne() {
		return allInOne;
		
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne=allInOne;
	}
	
	
	// 오버라이딩 : 부모클래스에 있는 메소드를 자식 클래스에서 재정의 하는 것 
	public String information() {
		return super.information()+ ", allInOne : "+allInOne;
	}
	
	
}
