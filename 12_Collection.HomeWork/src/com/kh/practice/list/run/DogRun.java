package com.kh.practice.list.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.model.vo.Dog;

public class DogRun {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Dog> dogList = new ArrayList<>();

		// 5마리의 강쥐 이름을 입력 받아서 ArrayList에 저장한 후에
		for (int i = 0; i < 4; i++) {
			System.out.print((i+1)+"번째 강쥐 이름 입력 : ");
			String dogName = sc.nextLine();
			System.out.print("강쥐 나이 입력 : ");
			int dogAge = sc.nextInt();
			sc.nextLine();
			System.out.print("강쥐 종 입력(ex.마르티스) : ");
			String dogKind = sc.nextLine();
			dogList.add(new Dog(dogName, dogAge, dogKind));
		}
		System.out.print("5번째 강쥐 이름 입력 : ");
		String dogName = sc.nextLine();
		System.out.print("강쥐 나이 입력 : ");
		int dogAge = sc.nextInt();
		sc.nextLine();
		System.out.print("강쥐 종 입력(ex.마르티스) : ");
		String dogKind = sc.nextLine();
		dogList.add(2, new Dog(dogName, dogAge, dogKind));
		
		System.out.println("==================================");
		for(Dog d:dogList) {
			System.out.println(d);
		}
		System.out.println("==================================");
		System.out.println("이름에 '구'가 들어간 강쥐 정보 출력");
		System.out.println("==================================");
		int gu =0;
		for(Dog d:dogList) {
			if(d.getName().contains("구")) {
				System.out.println(d);
				gu++;
			}
		}
		System.out.println("이름에 '구'가 들어간 강쥐는 총"+gu+"마리 입니다.");
		
		
		
		// 이들 중 '구' 라는 이름이 포함된 강쥐를 모두 출력하시오.
		// * 처음에는 4마리의 강쥐 ArrayList 생성 후 (크기 4짜리)
		// 2번 인덱스에 마지막 강쥐를 추후에 추가 할 것!(끼워넣기)
		// + 구 포함한 이름을 가진 강쥐가 몇마리 인지 출력하시오.

	}
}
