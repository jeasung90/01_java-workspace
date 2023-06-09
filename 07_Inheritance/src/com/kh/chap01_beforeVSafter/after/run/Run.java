package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;

public class Run {

	public static void main(String[] args) {

		/*
		 *  ● 상속의 장점
		 * - 보다 적은양의 코드로 새로운 클래스 작성 가능
		 * - 중복된 코드를 별도로 관리하기 때문에 코드의 추가나 변경에 용이 (프로그램의 생산성과 유지보수에 크게 기여)
		 * 
		 */
		
		
		// Desktop 객체 생성
		// brand, pCode, pName, price, allInOne
		
		Desktop d = new Desktop("삼성","d-01","짱짱데스크탑",20000,true);
		
		// Tv 객체 생성
		// brand, pCode, pName, price,
		
		Tv t = new Tv("LG","t-01","겁나 얇은 테레비",350000,6);
		
		// SmartPhone
		// brand, pCode, pName, price, mobileAgency
		
		SmartPhone s = new SmartPhone("애플","15pro","아이뻐",1800000,"kt");
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
		s.setPrice(1500000); // 부모클래스에 있는 메소드 호출
		s.setMobileAgency("skt"); // 자식 클래스에 있는 메소드 호출
		
		/*
		 *  ● 상속의 특징
		 * - 자식객체를 가지고 부모클래스에 있는 메소드를 마치 내것처럼 호출 가능
		 * - 부모클래스에 있는 메소드를 오버라이딩을 통해 자식 클래스에 재정의 가능
		 * => 오버라이딩을 하는 순간 같은 이름이라도 자식 클래스에 있는 메소드가 우선권을 가짐. 
		 *  ★ 클래스간의 상속은 다중상속이 불가능하다 (단일 상속만 가능)
		 */
		
		
		
		
	}

}
