package com.kh.practice01.func;

import java.util.Scanner;

public class VariablePractice4 {

	public void variablePractice4() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("문자열을 입력하세요 : ");
		String a = sc.nextLine();
	
		
		System.out.println("첫 번째 문자 : " + a.charAt(0));
		System.out.println("두 번쨰 문자 : " + a.charAt(1));
		System.out.println("세 번쨰 문자 : " + a.charAt(2));
		

		
	}
}
