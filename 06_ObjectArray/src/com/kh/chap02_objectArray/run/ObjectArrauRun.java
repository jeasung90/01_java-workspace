package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ObjectArrauRun {

	public static void main(String[] args) {
		
		int[] arr = new int[3];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		// for loof문 => 단순한 for문
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		Phone[] phones = new Phone[3]; // 배열 생성 ★★★★★
		//System.out.println(Phones[0]);
		
		phones[0] = new Phone();
		phones[1] = new Phone("아이폰","애플", 180, "15pro");
		phones[2] = new Phone("갠녁시","샘송", 120, "s23");
		
		phones[0].setName("롤러블폰");
		phones[0].setBrand("LG");
		phones[0].setPrice(120);
		phones[0].setSeries("마지막 폰");
		
		int total=0;
		for(int i=0;i<phones.length;i++) {
			System.out.println(phones[i].information());
			total+= phones[i].getPrice();
		}
		System.out.println("총 가격 : " +total);
		//System.out.println("평균 가격 : " +(total/3));
		System.out.println("평균 가격 : " +(total/phones.length));
		
		// 사용자에게 구매하고자 하는 핸드폰명 입력받아
		// 해당 휴대폰을 찾아서 그 가격을 알려주기!
		
		// 구매하고자 하는 휴대폰 이름 입력 : 갠녁시
		// 당신이 구매하고자 하는 휴대폰의 가격은 : 120만원 입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하고자 하는 휴대폰 이름 입력 : ");
		String phoneName = sc.nextLine();
		
		for(int i=0;i<phones.length;i++) {
			if(phones[i].getName().equals(phoneName)) {
				System.out.println("당신이 구매하고자 하는 휴대폰의 가격은 : "+phones[i].getPrice()+"만원 입니다.");
			sc.close();
			
			}
		}
		System.out.println("선생님은 다 지켜보고 계신단 말이다.");
	}

}
