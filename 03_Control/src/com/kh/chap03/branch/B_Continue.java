package com.kh.chap03.branch;

public class B_Continue {
	/*
	 * continue; : 반복문 안에 기술되는 구문
	 *      continue; 구문을 실행하지 않고 곧바로 현재 속해있는 반복문 위로 올라간다.
	 *
	 */

	public void method1() {

		// 직접
		// for문으로 1붙터 10까지 홀수 출력
		// 1 3 5 6 7 9

		/*
		 * for(int i =1;i<=10;i++) { if(i%2==1) { // i값이 홀수일 경우 System.out.print(i+" ");
		 * }
		 * 
		 * }
		 */
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) { // i값이 짝수일 경우
				continue; // 건너뛰기라고 생각하자
				// 반복문을 실행 안하고 반복문 위로 올라감 => 증감식으로 가라
			}
			System.out.print(i + " ");
		}

	}

	public void method2() {
		// 1부터 100까지의 총합계
		// 단, 6의 배수값은 빼고 덧샘하겠다.
		
		// 1. 1 ~ 100 까지의 총합계를 먼져 for문 작성 해보기
		int sum =0;
		
		for(int i=1;i<=100;i++) { // 6의 배수
			if(i%6==0) {
				continue;  // 건너뛰고 증감만!!
			}
				sum += i; // 누적합 공식
		}
		System.out.println("1부터 100까지의 합계 : "+sum);
	}
	public void method3	() {
		// 2~9 단까지 출력
		// 단, 3의 배수단은 빼고 출력
		for(int j=2;j<=9;j++) {
			for(int i=2;i<=9;i++) {
				if(j%3==0) {
					continue;
					
				}
				System.out.printf("%d X %d = %d\n",j,i,j*i);
			}
			System.out.println();
			
		}
		
		
	}
}
