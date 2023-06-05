package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Product;

public class ClassRun {

	public static void main(String[] args) {

		Product pro = new Product();
		
		pro.setpName("락미체인");
		pro.setPrice(320);
		pro.setBrand("루이비똥");
		
		System.out.println("===상품1===");
		System.out.println("상품명 : "+pro.getpName());
		System.out.println("가격 : "+pro.getPrice()+"만원");
		System.out.println("브랜드 : "+pro.getBrand());
		
		
		
		pro.setpName("선글라스");
		pro.setPrice(65);
		pro.setBrand("구찌");
		System.out.println();
		System.out.println("===상품2===");
		System.out.println("상품명 : "+pro.getpName());
		System.out.println("가격 : "+pro.getPrice()+"만원");
		System.out.println("브랜드 : "+pro.getBrand());
		
		pro.setpName("스카프");
		pro.setPrice(60);
		pro.setBrand("디올");
		
		System.out.println();
		System.out.println("===상품3===");
		System.out.println("상품명 : "+pro.getpName());
		System.out.println("가격 : "+pro.getPrice()+"만원");
		System.out.println("브랜드 : "+pro.getBrand());
		
		
		
		
	}

}
