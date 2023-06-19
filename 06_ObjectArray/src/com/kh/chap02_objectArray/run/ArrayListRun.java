package com.kh.chap02_objectArray.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayListRun {

	public static void main(String[] args) {

		ArrayList<Phone> list = new ArrayList<>();// 뒤에 제네릭 생략가능 jdk6이상
		
		list.add(new Phone());
		list.add(new Phone("아이폰", "애플", 1800000, "15pro"));
		list.add(new Phone("갠녁시", "샘송", 1200000, "s23"));
		
		list.get(0).setName("롤러블폰");
		list.get(0).setBrand("LG");
		list.get(0).setPrice(1700000);
		list.get(0).setSeries("마지막 폰");
		
		int total=0;
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).information());
			total+=list.get(i).getPrice();
		}
		System.out.println("총 가격 : " +total);
		System.out.println("평균 가격 : " +(total/list.size()));

Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하고자 하는 휴대폰 이름 입력 : ");
		String phoneName = sc.nextLine();
		
		for(Phone p : list) {
			if(p.getName().equals(phoneName)) {
				System.out.println("당신이 구매하고자 하는 "+p.getName()+"의 가격은 "+p.getPrice()+"만원 입니다.");
			sc.close();
			
			}
		}
		
		
		
		
		
		
		
		
	}

}
