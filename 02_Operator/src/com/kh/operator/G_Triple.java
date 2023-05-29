package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	/*
	 *  *삼항연산자 (항목 3개를 가지고 연산해주는 연산자)
	 *  [표현식]
	 *  조건식 ? 조건식이 참(true)일 경우 돌려준 결과 값 : 조건식이 거짓(false)일 경우 돌려줄 결과 값
	 *  
	 *  이때, 조건식은 반듯이 true 또는 false가 나오도록 작성해야함!!!
	 *  주로 비교, 논리연산자를 통해 작성함!
	 */
	
	public void method1() {
		// 입력받은 정수 값이 양수인지 아닌지(음수) 판별 후 출력
		Scanner sc = new Scanner(System.in);
			
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		
		//String result = (num > 0) ? "양수입니다." : "음수입니다";
		
		// xx은 (는) xxxx
		// 7은 양수입니다. -99는 음수입니다.
		// ** 조건 : Sysout 한번만 이용
		
		//String result = (num > 0) ? (num +"은 양수입니다.") : (num + "은 음수입니다");
		System.out.println(num + "은(는)" + ((num > 0) ? " 양수입니다." : "음수입니다."));
		
	}
	public void method2() {
		// 입력받은 정수값이 짝수인지 홀수인지 판별 후
		// 3은 홀수입니다. 4는 짝수 입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		
		System.out.println(num +"은(는) " + ((num % 2) == 0 ? "짝수 입니다." :"홀수 입니다."));
	}
	public void method3() {
		// 사용자에게 종료여부를 입력 받아 판별해서 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("게임을 종료하시겠습니까?(y/n) : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.print((ch == 'Y' || ch == 'y' ) ? "게임을 종료합니다." : "계속진행합니다." );
				
	}
	public void method4() {
		// 영문자 입력받아서, 영어 소문자인지 아닌지 판별 후 출력
		// a는 소문자입니다. F는 소문자가 아닙니다.
		
		Scanner sc =new Scanner(System.in);
		System.out.print("대문자 알파벳 하나를 입력해 주세요 : " );

		char ch = sc.nextLine().charAt(0);
		
		System.out.println(ch + ((ch >= 65 && ch <= 90) ? "은 대문자 입니다." : "은 소문자 입니다.")); // (ch >= 'a' && ch <= 'z')
		
	}
	
	public void method5() {
		// 양수(+5), 음수(-55), 0(0)  => 세가지 조건
		Scanner sc =new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요 : ");
		int num = sc.nextInt();
		
		String result = (num>0) ? "양수입니다." :(num==0) ?"0입니다." : "음수입니다.";
		System.out.println(num + "은 " + (    result       ));
	}
	public void method6() {
		//사용자에게 두개의 정수를 입력 받고
		// + 또는 - 를 입력받아 그에 맞는 연산결과를 출력
		// 단, + 또는 - 외의 문자를 입력했을 경우 "잘못 입력하였습니다." 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번쨰 정수 : ");
		int num2 = sc.nextInt();
		
		// 버퍼에 남아있는 엔터제거를 위한 코드
		sc.nextLine();
		
		System.out.print("연산자 입력(+,-,*,/,%) : ");
		char op = sc.nextLine().charAt(0);
		
		// String 문에서 (num1 + num2)는 계산이 안됨 문자로 변경하기위해 ""를 붙여야함 =>(num1 + num2+"")
		String result = (op == '+') ? (num1 + num2+"") :(op == '-') ? (num1 - num2+"") : (op == '*') ? (num1 * num2+""):(op == '/') ? (num1 / num2 + "") : (op == '%') ? (num1 % num2 +"") : "잘못 입력하였습니다.";
		
		System.out.println((""+num1 + op + num2) +"는 " + (result));
	}
	
}
