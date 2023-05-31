package com.kh.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	/*
	 *   ● do-while 문
	 *   
	 *   [표현법]
	 *  do {
	 *  		반복적으로 실행할 코드( 무조건 실행!! )
	 *   }while (조건식);
	 *  
	 *   처음에는 무조건 실행코드 실행 ★★★★★★
	 *   --> 조건식 검사 --> true일 경우 실행코드 실행
	 *   --> 조건식 검사 --> true일 경우 실행코드 실행
	 *   --> 조건식 검사 --> false일 경우 실행코드 실행X => 반복문 빠져나옴
	 *   
	 *    ● 기존 for / while 문과의 차이점
	 *    for / while문 같은 경우에는 조건 검사 후에 true여야만 수행함
	 *    근데 do-while문은 조건검사 없이 무조건 한 번은 수행함
	 *   
	 */
	public void method1() {
		int num =1;
		do {
			System.out.println(num);
		}while(false); // 대놓고 false임에도 do의 실행코드는 무조건 한번 실행됨.
	}
	public void method2() {
		// 1 2 3 4 5
		int num =1;
		
		do {
			System.out.print(num++ + " ");
		}while(num<=5);
	}
	public void method3() {
		// 1부터 사용자가 입력한 수 까지의 총 합계
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력해주세요 : ");
		int num = sc.nextInt();
		int i =1;
		int sum=0;
		do {
			sum +=i;
			i++;
		}while(i<=num);
		
		System.out.println("1부터 "+num+"까지의 총 합계 : "+sum);
		
		
		
		
	}
	
	
	
	
	
	
	
}
