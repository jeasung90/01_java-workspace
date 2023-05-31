package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {

	public static void practice1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int num = sc.nextInt();

		if (num > 0) {

			for (int i = 1; i <= num; i++) {
				if(i%2==0) {
					System.out.print("수");
				}else {
				System.out.print("박");
				}
				
				
				
			}
		}else {
		System.out.println("양수가 아닙니다.");
		}
	}
	public static void practice2() {
		Scanner sc = new Scanner(System.in);

		while(true) {
		System.out.print("정수 : ");
		int num = sc.nextInt();

		if (num > 0) {

			for (int i = 1; i <= num; i++) {
				if(i%2==0) {
					System.out.print("수");
				}else {
				System.out.print("박");
				}
				
				
			}
			break;
		}else {
		System.out.println("양수가 아닙니다.");
		sc.nextLine();
		}
	}
	}
	public static void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String a = sc.nextLine();
		
		System.out.print("문자 : ");
		char b = sc.nextLine().charAt(0);
		int sum =0;
		
		for(int i=0;i< a.length();i++) {
			if(a.charAt(i)==b) {
				sum++;
			}
			
		
		}
		System.out.println(a+" 안에 포함된 "+b+"개수 : "+sum);
	}
	
	
	
	
	
	
	
	
	
}
