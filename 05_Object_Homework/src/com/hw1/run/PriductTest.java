package com.hw1.run;

import com.hw1.model.vo.Product;

public class PriductTest {

	public static void main(String[] args) {
		Product p1 = new Product("ssgnote9","갤럭시노트9","경기도 수원",960000,10.0);
		Product p2 = new Product("lgxnote5","LG스마트폰5","경기도 평택",780000,0.7);
		Product p3 = new Product("ktsnote3","KT스마트폰3","경기도 강남",250000,0.3);
		
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		System.out.println("===========================================================");
		
		
		p1.setPrice(1200000);
		p2.setPrice(1200000);
		p3.setPrice(1200000);
		
		p1.setTex(0.05);
		p2.setTex(0.05);
		p3.setTex(0.05);
		
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		System.out.println("===========================================================");
		
		
		
		System.out.printf("상품명 : %s\n부가세 포함 가격 : %.0f원\n",p1.getProductName(),((p1.getPrice()*p1.getTex()+p1.getPrice())));
		System.out.printf("상품명 : %s\n부가세 포함 가격 : %.0f원\n",p2.getProductName(),((p2.getPrice()*p2.getTex()+p2.getPrice())));
		System.out.printf("상품명 : %s\n부가세 포함 가격 : %.0f원\n",p3.getProductName(),((p3.getPrice()*p3.getTex()+p3.getPrice())));
		
		
		
		
		
}
}