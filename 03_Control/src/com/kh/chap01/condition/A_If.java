package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	/*
	 * 기본적으로 프로그램 진행은 순차적으로 진행
	 * 단, 이 순차적인 흐름을 바꾸고자 한다면 제어문을 이용해서 직접 제어가능
	 * 
	 * 선택적으로 실행시키고자 할 때 => 조건문
	 * 
	 * 반복적으로 실행시키고자 할 때 => 반복문
	 * 그 외의 흐름을 제어 => 분기문
	 * 
	 *  ★ 조건문
	 *  "조건식"을 총해서 참이냐 거짓이냐를 판단하여 잠일 경우 그에 해당하는 코드 실행
	 *  
	 *  조건식의 결괴 true/false 여야 한다!!
	 *  보통 조건식에서는 비교연산자 (대소,동등), 논리연산자 (&&, ||)를 주로 사용
	 *  
	 *   ★ 조건문은 크게 if문과 switch문으로 나뉨
	 */
	
	
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		/*
		 * 단독 if문 
		 * 
		 * [표현법]
		 * if(조건식) {
		 * .... 실행시키고자 하는 코드 ...
		 * }
		 * 
		 * 조건식은 if랑 친하다!!
		 * 
		 * => 조건식이 참(true)일 경우 => 중괄호 불럭 안의 코드 실행
		 * => 조건식이 거짓(false)일 경우 => 중괄호 불륵 안의 코드를 무시하고 넘어감
		 * 
		 */
		
		if(num>0) {
			System.out.println("양수이다");
		}
		if(num <=0) {
			System.out.println("양수가 아니다.");
		}
	}
	public void method2() {
			Scanner sc =new Scanner(System.in);
			System.out.print("정수 하나 입력 : ");
			int num = sc.nextInt();
			/*
			 * if - else문
			 * [표현법]
			 * if(조건식) {
			 *  ... 참일때 실행할 코드 1...
			 * }else{
			 *  ... 실행코드 2..
			 * }
			 * 
			 *  조건식의 결과가 참(true)일 경우 실행코드1 수행 후 if-else문 빠져나감
			 *  단, 결과가 거짓(false)일 경우 무조건 실행코드2 수행
			 */
			if(num>0) {
				System.out.println("양수다.");
			}else {
				System.out.println("양수 아냐.");
			}
		}
	public void method3() {
		Scanner sc =new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		/*
		 *  ★ if - else if - else문
		 *  
		 *  같은 비교대상으로 여러개의 조건을 제시해야 될 경우
		 *  
		 *  [표현법]
		 *  if(조건식) {
		 *     ... 참일때 실행할 코드 1...
		 *  }else if(조건식2) {
		 *     ... 참일때 실행할 코드 2...
		 *  }else {
		 *     ... 위의 조건들이 다 false 경우 실행할 코드...
		 *  }
		 */
		
		if(num >0) {
			System.out.println("양수입니다.");
		}else if(num<0) {
			System.out.println("음수입니다.");
		}else {
			System.out.println("0입니다.");
		}
	}
	public void method4() {
		/*
		 * 사용자에게 나이를 입력받아 어린이 청소년 성인
		 * 13세 이하 : 어린이
		 * 13세 초과 19세 이하 : 청소년
		 * 19세 초과 :성인
		 */
		Scanner sc =new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		/*
		if(age<= 13) {
			System.out.println("어린이");
		}else if(age <=19) {
			System.out.println("청소년");
		}else {
			System.out.println("성인");
			*/
		
		String result;
		if(age<= 13) {
			result = "어린이";
		}else if(age <=19) {
			result = "청소년";
		}else {
			result = "성인";
		System.out.println(result);
		}
	}
	public void method5() {
		/*
		 * 이름, 성별 입력
		 * 성별 M(m), F(f)입력하면 남학생이다. 여학생이다.
		 * 단, 설명을 잘못 입력하면 "성별을 잘못 입력하였습니다."
		 */
		
		Scanner sc =new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하세요(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		/*
		if(gender =='M' ||gender =='m') {
			System.out.println(name+"님은 "+"남학생 입니다.");
		}else if(gender =='F'||gender =='f') {
			System.out.println(name+"님은 "+"여학생 입니다.");
		}else {
			System.out.println("성별을 잘못 입력하셨습니다.");
		}
		*/
		String result = "";
		if(gender =='M' ||gender =='m') {
			result="남학생;";
		}else if(gender =='F'||gender =='f') {
			result ="여학생";
		}else {
			System.out.println("성별을 잘못 입력하셨습니다.");
			return; // 해당 이 메소드를 빠져나가는 구문
		}
		
		System.out.println(name+ "님은 "+ result + "입니다.");
	}
	public void method6() {//특이 케이스
		Scanner sc =new Scanner(System.in);

		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		
		/*
		if(name == "차은우") {
			System.out.println("은우야 안녕~");
		}else {
			System.out.println("응 꺼져~");
		}
		*/
		/*
		 *  기본자료형 : boolean, byte, short, int, long, float, double, char
		 *  참조자료형 : String (대문자로 시작함)
		 *  
		 *  기본자료형들 끼리 동등 배교시에는 ==, != 사용가능
		 *  단, 참조자료형은 동등 비교시 ==, != 사용시 정상적으로 비교가 안됨.
		 *  		=> equals() 메소드를 이용하여 비교해야함!
		 *  		[표현법] 문자열.equals(문자열);
		 */
		if(name.equals("차은우")) {   // String 자료를 비교하기위해 equals를 사용
			System.out.println("은우야 안녕~");
		}else {
			System.out.println("응 꺼져~");
		}
	}
	public void method7() { // 조건문 중첩 사용
		Scanner sc =new Scanner(System.in);
		
		System.out.println("정수 입력(양수만) : ");
		int num = sc.nextInt();
		
		if(num > 0) {// 양수일 경우
			//짝홀 가리기 
			if(num%2 == 0) { // 양수이면서 짝수인 경우
				System.out.println("어~ 짝수야");
			}else { // 양수이면서 홀수인 경우
				System.out.println("어~ 홀수야");
			}
			
		}else {
			System.out.println("양수가 아닙니다. 다시 입력해 주세요.");
		}
				
	
			
	}
 }

