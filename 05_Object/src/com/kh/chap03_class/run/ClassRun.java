package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class ClassRun {

	public static void main(String[] args) {

		
		  Person p = new Person();
		  
		  System.out.println(p.getId()); System.out.println(p.getAge());
		  System.out.println(p.getGender());
		  
		  // 생성 후에 필드에 담긴값을 곧바로 알아보면 // jvm이 초기화(값 세팅)까지 진행해줬음!!
		  
		  p.setId("user01"); // 스트링이기 때문에 " 필요 p.setPwd("pwd01"); p.setAge(20);
		  p.setGender('m');p.setAge(20); p.setPhone("010-1234-5678"); p.setEmail("test@naver.com");
		  System.out.println(p.information());
			/*
			 * System.out.println("=== 값 대입 후 ==="); System.out.println(p.getId());
			 * System.out.println(p.getPwd()); System.out.println(p.getAge());
			 * System.out.println(p.getGender()); System.out.println(p.getPhone());
			 * System.out.println(p.getEmail());
			 */
		  Product pro1 = new Product();
		  
		  pro1.setpName("락미체인"); pro1.setPrice(320); pro1.setBrand("루이비똥");
		  
			/*
			 * System.out.println("===상품1==="); System.out.println("상품명 : "+pro.getpName());
			 * System.out.println("가격 : "+pro.getPrice()+"만원");
			 * System.out.println("브랜드 : "+pro.getBrand());
			 */
		  
		  Product pro2 = new Product();
		  pro2.setpName("선글라스"); pro2.setPrice(65); pro2.setBrand("구찌");
			/*
			 * System.out.println(); System.out.println("===상품2===");
			 * System.out.println("상품명 : "+pro.getpName());
			 * System.out.println("가격 : "+pro.getPrice()+"만원");
			 * System.out.println("브랜드 : "+pro.getBrand());
			 */ 
		  Product pro3 = new Product();
		  pro3.setpName("스카프"); pro3.setPrice(60); pro3.setBrand("디올");
		  
			/*
			 * System.out.println(); System.out.println("===상품3===");
			 * System.out.println("상품명 : "+pro.getpName());
			 * System.out.println("가격 : "+pro.getPrice()+"만원");
			 * System.out.println("브랜드 : "+pro.getBrand());
			 */
		System.out.println(pro1.information());
		System.out.println(pro2.information());
		System.out.println(pro3.information());
		
		
	}

}
