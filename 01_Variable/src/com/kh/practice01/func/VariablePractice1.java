package com.kh.practice01.func;

import java.util.Scanner;

public class VariablePractice1 {

	public void variablePractice1() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 :");
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) :");
		char gen = sc.nextLine().charAt(0);
		
		System.out.print("나이를 입력하세요 :");
		int age = sc.nextInt();
		
		System.out.print("키를 입력하세요(cm) :");
		double heigth = sc.nextDouble();
				
				System.out.print("키 " + heigth + "cm인 " + age + "살 " + gen +"자 " + name + "님 반갑습니다^^" );

		
		
	}
	
	
	
}
