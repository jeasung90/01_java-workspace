package com.kh.practice.chap01.controlpractice;

import java.util.Scanner;

public class controlpractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int n = sc.nextInt();
		String st = "";
		switch(n) {
		case 1 :
			st = "입력";
			break;
		case 2 :
			st = "수정";
			break;
		case 3 :
			st = "조회";
			break;
		case 4 :
			st = "삭제";
			break;
		case 7 :
			st = "종료";
			break;
			default : 
				System.out.println("잘못 입력하였습니다.");
				return;
						
		}
		System.out.println(st+" 메뉴입니다.");
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num %2 == 0) {
			System.out.print("짝수 입니다.");
		}else if(num %2==1) {
			System.out.print("홀수 입니다.");
		}else {
			System.out.println("음수만 입력해주세요.");
		}
		
		
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int a = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int b = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int c = sc.nextInt();
		int sum = a+b+c;
		double dNum = sum /3;
		if(a>=40 && b>=40 && c>=40 && sum/3 >= 60) {
			System.out.printf("국어점수 : %d\n수학점수 : %d\n영어점수 : %d\n합계 : %d\n평균 : %.1f\n축하합니다, 합격입니다!",a,b,c,sum,dNum);
		}else {
			System.out.println("불합격입니다.");
		}
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int a = sc.nextInt();
		String b = "";
		
		switch(a) {
		case 3 :
		case 4 :
		case 5 :
			b="봄";	
			break;
		case 6 :
		case 7 :
		case 8 :
			b="여름";	
			break;
		case 9 :
		case 10 :
		case 11 :
			b="가을";	
			break;
		case 1 :
		case 2 :
		case 12 :
			b="겨울";
			break;
		default :
			System.out.println(a+"월은 잘못 입력된 달입니다.");
			return;
		}
			System.out.println(a+"월은 "+b+"입니다.");
		
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		String rId = "myId";
		String rPw = "myPassword12";
		
		if(id.equals(rId)) {
			
			if(pw.equals(rPw)) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
			
			
		}else if(pw.equals(rPw)){
			System.out.println("아이디가 틀렸습니다.");
		}else {
			System.out.println("다시 입력해주세요.");
		}
		
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String s = sc.nextLine();
		
		switch(s) {
		case "관리자" :
			System.out.print("회원관리, 게시글관리 ");
		case "회원" :
			System.out.print("게시글 작성, 게시글 조회, 댇글작성 ");
		case "비회원" :
			System.out.print("게시글조회");
			
			break;
		default :
			System.out.println("잘못입력하셨습니다.");
			return;
		}
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해 주세요 : ");
		double a = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double b = sc.nextDouble();
		
		double bmi = b /(a*a);
		System.out.println("BMI 지수 : "+bmi);
		
		if(bmi <18.5) {
			System.out.println("저체중");
		}else if(bmi <23) {
			System.out.println("정상체중");
		}else if(bmi <25) {
			System.out.println("과체중");
		}else if(bmi <30) {
			System.out.println("비만");
		}else {
			System.out.println("고도비만");
		}
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("피연산자1 입력 :");
		int a = sc.nextInt();
		System.out.print("피연산자2 입력 :");
		int b = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자를 입력(+,-,*,/,%)  :");
		String c = sc.nextLine();
		
		if(a>=1 && b>=1) {
			switch(c) {
			case "+" :
				System.out.println(a+b);
				break;
			case "-" :
				System.out.println(a-b);
				break;
			case "*" :
				System.out.println(a*b);
				break;
			case "/" :
				System.out.println(a/b);
				break;
			case "%" :
				System.out.println(a%b);
				break;
			}
			
		}else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
		
	}
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("중간 고사 점수 : ");
		double a = sc.nextDouble();
		
		System.out.print("기말 고사 점수 : ");
		double b = sc.nextDouble();
		
		System.out.print("과제 점수 : ");
		double c = sc.nextDouble();
		
		System.out.print("출석 회수 : ");
		double d = sc.nextDouble();
		double sum = (a*0.2)+(b*0.3)+(c*0.3)+(d); // 출석점수
		
		System.out.println("중간 고사 점수(20) : "+(a*0.2));
		System.out.println("기말 고사 점수(30) : "+(b*0.3));
		System.out.println("과제 점수(30) : "+(c*0.3));
		System.out.println("출석 회수(20) : "+ d);
		System.out.println("총점 : "+sum);
		
		if(sum >=70) {
			if(d>=14) {
				System.out.println("pass");
			}else {
				System.out.printf("fail [출석 회수 부족 (%.0f/20)}",c);
			}
			
		}else if(d>14) {
			System.out.println("fail [점수 미달]");
		
	}else {
		System.out.println("fail [점수 및 출석 회수 부족]");
	}
	
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("실행할 기능을 선택하세요.\n1. 메뉴 출력\n2. 짝수/홀수\n3. 합격/불합격\n4. 계절\n5. 로그인\n6. 권한확인\n7. BMI\n8. 계산기\n9. P/F\n선택 : ");
		int a = sc.nextInt();
		
		switch(a) {
		case 1 : 
			practice1();
			break;
		case 2 : 
			practice2();
			break;
		case 3 : 
			practice3();
			break;
		case 4 : 
			practice4();
			break;
		case 5 : 
			practice5();
			break;
		case 6 : 
			practice6();
			break;
		case 7 : 
			practice7();
			break;
		case 8 : 
			practice8();
			break;
		case 9 : 
			practice9();
			break;
		case 10 : 
			practice10();
			break;
		
		}
		
		
		
		
		
	}
	}
