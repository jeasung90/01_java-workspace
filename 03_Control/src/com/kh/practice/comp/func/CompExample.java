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
	
	public static void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) { //무한루

		System.out.print("문자열 : ");
		String a = sc.nextLine();
		
		System.out.print("문자 : ");
		char b = sc.nextLine().charAt(0);
		int sum =0;
		
		for(int i=0;i< a.length();i++) {     //for시
			if(a.charAt(i)==b) {			 // 같을떄 카운팅 시
				sum++;
			}								 // 같을떄 카운팅 
		}									 //for	 
		
		System.out.println(a+" 안에 포함된 "+b+"개수 : "+sum);
		
		while(true) {
			System.out.print("더해?");
			
			char yn = sc.nextLine().charAt(0);
			
			if(yn=='y'||yn=='Y') {
				break;
				
			}else if(yn=='n'||yn=='N') {
				System.out.println("bye");
				return;
			}else {
				System.out.println("잘못입력했어.");
				
			}
		}
		
		} // 무한루프 
	}	
	public static void practice5() {
		Scanner sc = new Scanner(System.in);

		int random = (int) (Math.random()*100+1);
		System.out.println(random);
		int count =0;
		
		while(true) {
			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			int user = sc.nextInt();
			
			if(user<1 || user >100) {
				System.out.println("다시");  /// 해결
				
			}else if(user>random){
				System.out.println("down");			
				count++;
			}else if(user<random) {
				System.out.println("up");
				count++;
			}else {
				System.out.println("same");
				System.out.println("몇번만에 "+count+1);
			}
		}
	}
	public static void practice6() {
		Scanner sc = new Scanner(System.in);

		
		while(true) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("가위바위보 : ");
			String a = sc.nextLine();
			
			String b = null  ;
			int bRandom = (int) (Math.random()*3+1);
			
			
			int aa = 0 ;
				
			int win=0;
			int lose=0;
			int same=0;
			int all=0;
			
			if(a.equals("exit")){
				System.out.println((win+lose+same)+"전 "+win+"승 "+same+"무 "+lose+"패");
				break;
			}
				
			 switch(bRandom) {
			 case 1 : 
				 b = "가위";
				break;
			 
			 case 2 : 
				 b = "바위";
				 break;
				 
			 case 3 : 
				 b = "보";
				 break;
				 
			 }
			
			
			if((a.equals("가위")) || (a.equals("바위")) || (a.equals("보")) ) {
				
				if(a.equals("가위")) {
					aa =1;
				}else if(a.equals("바위")){
					aa =2;
				}else if(a.equals("보")){
					aa=3;
				}
				
				
				// 가위 {1>3}{1<2}
				// 바위 {2<3}{2>1}
				// 보   {3<1}{3>2}
				
				/*
				switch(a) {
				case "가위" :
					aa = 1;
					System.out.println(aa);
				case "바위" :
					aa = 2;
					System.out.println(aa);
				 case "보" : 
					 aa = 3;
					 System.out.println(aa);
				}
				*/
				if(aa == bRandom) {
					System.out.println(name+" : "+a+" ");
					System.out.println("컴퓨터 : " + b+"");
					System.out.println("비김");
					same++;
				
				}else if((a.equals("가위")) == (b.equals("바위"))) {
					System.out.println(name+" : "+a+" ");
					System.out.println("컴퓨터 : " + b+"");
					System.out.println("짐1");
					lose++;
				}else if((a.equals("가위")) == (b.equals("보"))) {
					System.out.println(name+" : "+a+" ");
					System.out.println("컴퓨터 : " + b+"");
					System.out.println("이김1");
					win++;
					
				}else if((a.equals("바위")) == (b.equals("가위"))) {
					System.out.println(name+" : "+a+" ");
					System.out.println("컴퓨터 : " + b+"");
					System.out.println("이김2");
					win++;
				}else if((a.equals("바위")) == (b.equals("보"))) {
					System.out.println(name+" : "+a+" ");
					System.out.println("컴퓨터 : " + b+"");
					System.out.println("짐2");
					lose++;
				}else if((a.equals("보")) == (b.equals("가위"))) {
					System.out.println(name+" : "+a+" ");
					System.out.println("컴퓨터 : " + b+"");
					System.out.println("짐3");
					lose++;
				}else if((a.equals("보")) == (b.equals("바위"))) {
					System.out.println(name+" : "+a+" ");
					System.out.println("컴퓨터 : " + b+"");
					System.out.println("이김3");
					win++;
				
				}else {
					System.out.println("오류입니다");
				}
				
				
				
				
				
				
				
			}else {
				System.out.println("잘못입력하셨습니다.");
				break;
			}
			
			
			
			
			
			
			
			
		}
		
		
	}
	
	
	
	
	
}
