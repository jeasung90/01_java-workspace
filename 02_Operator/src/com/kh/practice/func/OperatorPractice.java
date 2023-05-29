package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양수를 입력해 주세요. : ");
		int num = sc.nextInt();
		
		System.out.println((num>=0)?"양수입니다.":"양수가 아닙니다.");
	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양수를 입력해 주세요. : ");
		int num = sc.nextInt();
		
		System.out.println((num>=1) ? "양수입니다.":(num<=-1)?"음수입니다.":"0이다.");
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요. : ");
		int num = sc.nextInt();
		
		System.out.print(( num % 2 == 0)?"짝수입니다.":"홀수입니다.");
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가지고 있는 사탕의 수는 몇개 입니까? : ");
		int num1 = sc.nextInt();
		
		System.out.print("나누어줄 사람은 몇명 입니까? : ");
		int num2 = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 :"+(num1 / num2)+"\n"+ "남은 사탕 개수는 : "+(num1 % num2));
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int class1 = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별(m/f) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("성적(소수점 아래 둘째자리까지) : ");
		double record = sc.nextDouble();
		
		System.out.print(grade + "학년 "+class1 +"반 "+num +"번 "+name + " "+((gender =='f')?"여학생의 ":(gender == 'F')?"여학생의 ":(gender =='m')?"남학생의 ":(gender =='M')?"남학생의 ":"남학생의 ")+"성적은 "+record+"이다.");
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = (age <= 13) ?"어린이" :(age <= 19)?"청소년":"성인";
		System.out.println(result);
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		double a = sc.nextDouble();
		
		System.out.print("영어 : ");
		double b = sc.nextDouble();
		
		System.out.print("수학 : ");
		double c = sc.nextDouble();
		
		int total = (int) (a+b+c);
		double dNum = ((a+b+c)/3);
		System.out.printf("합계 : %d",total);
		System.out.println();
		System.out.printf("평균 : %.1f",dNum);
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호를 입력하세요(- 포함) : ");
		char ch = sc.nextLine().charAt(7);
		String result = (ch == '1') ? "남자":(ch=='3')? "남자" : (ch=='2')?"여자":(ch=='4')? "여자":"잘못입력하셨습니다.";
		System.out.println(result);
	}
	public void practice9() {
		Scanner sc =new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		boolean result = (((num3 <= num1)||(num3>=num2)));
		System.out.println(result);
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		System.out.println((num1 == num2 && num2 == num3)?"true":"false");
	}
	public void practice11() {
		Scanner sc= new Scanner(System.in);
		System.out.print("A사원의 연봉 : ");
		int a = sc.nextInt();
		int a2 = a;
		System.out.print("b사원의 연봉 : ");
		int b = sc.nextInt();
		System.out.print("c사원의 연봉 : ");
		double c = sc.nextInt();
		double c2 = c;
		double a1 = a*1.4;
		double b1 = b;
		double c1 = (c*1.15);
		
		System.out.printf("A사원의 연봉/연봉+a : %d/%.1f",a,a1);
		System.out.println((a1>=3000)?" 3000 이상":" 3000 미만");
		
		
		System.out.printf("b사원의 연봉/연봉+a : %d/%.1f",b,b1);
		System.out.println((b>=3000)?" 3000 이상":" 3000 미만");
		
		System.out.printf("c사원의 연봉/연봉+a : %.0f/%.15f",c,c1);
		System.out.println((c1>=3000)?" 3000 이상":" 3000 미만");
		
		System.out.println(c1);
		
	}
}
