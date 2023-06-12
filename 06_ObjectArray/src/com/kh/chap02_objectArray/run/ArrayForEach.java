package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayForEach {

	public static void main(String[] args) {

		int[] arr = {10,20,30};
		
		// 단순 for문
		/*
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		*/
		
		// for each문(향상된 for문 / 개선된 for문)
		// 배열 또는 컬렉션과 함께 사용됨
		// 배열 또는 컬렉션의 0번 인덱스부터 마지막 인덱스까지 순차적으로
		//				모두 접근할 목적일 때 사용됨.
		
		/*
		 *  	[표현법]
		 *  for(순차적으로 접근할 값을 담을 변수 선언 : 순차적으로 접근할 배열 또는 컬렉션의 이름){ // 반복횟수 == 배열 또는 컬렉션의 크기
		 *  	반복적으로 실행할 내용
		 *  }
		 */
		
		for(int value : arr) { // value = arr[0], value = arr[1], value = arr[2];
			System.out.println(value);
		}
		
		// 객체배열
		
		Phone[] Phones = new Phone[3];
		
		Phones[0] = new Phone("갠녁시", "샘송", 1200000, "s23");
		Phones[1] = new Phone("아이뻐", "애뽈", 1800000, "15pro");
		Phones[2] = new Phone("롤러블", "앤지", 1500000, "롤러1");
		
		
		System.out.println(Phones[0].information());
		
		Phones[2].setSeries("15쁘로");
		
		int total =0;
	
		for(Phone p:Phones) { // p=Phones[0], p=Phones[1], p=Phones[2]
			System.out.println(p.information());
			// 모든 인덱스의 금액 누적합 => total +=i
			total+=p.getPrice();
		}
		System.out.println("총 합계 : "+total);
		System.out.println("평균가 : "+total/Phones.length + "원");
		
		
		// 구매하고자 하는 핸드폰
		// 롤리팝 
		// 가격 : 00원 => 항상된 for문으로
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하고자 하는 휴대폰 : ");
		String str = sc.nextLine();
		
		for(Phone a : Phones) {
			if(str.equals(a.getName())) {
			str.equals(a.getName());
			System.out.println("가격 : "+a.getPrice()+"원 입니다.");
			}
		}
		
	}

}
