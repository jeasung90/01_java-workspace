package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
	
		int[] num = new int[10];
		
		for(int i=0;i<=9;i++) {
			num[i]=i+1;
			System.out.print(num[i]+" ");
		}
	}
	
	
	
	public void practice2() {
		
		int[] num = new int[10];
		
		for(int i=9;i>=0;i--) {
			num[i]=i+1;
			System.out.print(num[i]+" ");
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int user = sc.nextInt();
		
		int[] num = new int[user];
		
		for(int i=0;i<=user-1;i++) {
			num[i]=i+1;
			System.out.print(num[i]+" ");
		}
	}
	
	public void practice4() {
		
		String[] str = {"사과", "귤", "포도","복숭아","참외"};
		
		System.out.println(str[1]);
	}
		
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str	= sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		
		//String test="";
		int sum=0;
		
		char[] arr = new char[str.length()];
		
		System.out.print(str+"에 "+ch+"가 존재하는 위치(인덱스) : ");
		
		for(int i=0;i<=str.length()-1;i++) {
			arr[i] = str.charAt(i);
			if(arr[i] == ch) {
				System.out.print(i+" ");
				sum++;
			}
		}
		System.out.println();
		System.out.println(ch+"개수 : "+sum);
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		String[] str = {"월","화","수","목","금","토","일"};
		
		if(num>=0 && num<7) {
			System.out.println(str[num]);
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		int sum=0;

		System.out.print("정수 : ");
		int in = sc.nextInt();
		
		int[] arr = new int[in];
		
		for(int i=0;i<=in-1;i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			int num = sc.nextInt();
			arr[i]=num;
		}
		for(int i=0;i<=in-1;i++) {
		System.out.print(arr[i]+" ");
		sum=+arr[i];
		}
		System.out.println();
		System.out.println("총 합 : "+sum);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			//선언류
			int tn = 0;
			int tn2 = num;
			
			int[] arr = new int[num]; // 5일떄 0,1,2,3,4
			// 1st if
			if(num>3 && num%2==1 ) { // if 1
				// 				  5
				for(int i =0; i<=num-1;i++) {
					num--; // num : 4
					//	2까지 진행 4/2:2  i: 0 ,1 ,2
					for(i=0;i<=(num/2);i++) {
						arr[i] = i+1;
					}
					
					for(int k=i; k<=num;k++) {
						arr[k]= i-1;
						i--;
					}
					break;
					}
				for(int j=0;j<=num;j++) {
					System.out.print(arr[j]+" ");
				}
				break;
			}else { // if 1 done // if 2 start
				System.out.println("다시 입력하세요");
			} // if 2 done
		} // while
	}
	public void practice9() {
		Scanner sc = new Scanner(System.in);

		String[] chi = {"후라이드","양념","간장","불닭","파닭","고추바사삭","뿌링클","신호등"};
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String st = sc.nextLine();
		int count = 0;
		for(int i=0;i<chi.length;i++) {
			if(st.equals(chi[i])){
				count++;
			}
		}
		
		if(count==1) {
			System.out.println(st+"치킨 배달 가능");
		}else {
		System.out.println(st+"치킨은 없는 메뉴 입니다.");
		}
		
		
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) :");
		String pn = sc.nextLine();
		
		char[] arr = new char[pn.length()];
		
		for(int i =0;i<pn.length();i++) {
			arr[i]= pn.charAt(i);
			
		}
		char[] copy = arr.clone();
		
		for(int i =8;i<pn.length();i++) {
			copy[i]='*';
		}
		for(int i =0;i<pn.length();i++) {
			System.out.print(copy[i]);
		}
		
		
		
		
		
		
		
	}
	public void practice11() {
		
		int[] arr = new int[10];
		
		
		for(int i=0;i<10;i++) {
			arr[i]=(int) (Math.random()*10+1);
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice12() {
		
		int[] arr = new int[10];
		int max, min;
		
		for(int i=0;i<10;i++) {
			arr[i]=(int) (Math.random()*10+1);
			System.out.print(arr[i]+" ");
		
			for(int k=0;k<arr.length;k++) {
			}
			
		}
		
		max=arr[0];
		min=arr[0];
		
		for(int k=0;k<arr.length;k++) {
		if(max<arr[k]) {
			max = arr[k];
		}
		if ( min > arr[k]) {
			min=arr[k];
		}
		}
		System.out.println();
		System.out.printf("가장 큰 수 %d, 가장 작은 수 : %d ",max, min);
		
	}
	public void practice13() {
		
		int[] arr = new int[10]; // 실제 랜덤값 선언
			for(int i=0;i<arr.length; i++) { // 10번 도는것
				arr[i] = (int) (Math.random()*10+1);
				for(int j=0;j<i;j++) { // 9번 도는것
					
					if(arr[i]==arr[j]) {
						i--;
					}
				}
			}
			for(int i = 0; i<=9 ; i++ ) {
				System.out.print(arr[i]+" ");
			}
	}
	public void practice14() {
		
	}
	
	
	
	
}
