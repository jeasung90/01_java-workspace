package com.kh.array;

import java.util.Arrays;

// Import java.lang; => 알게모르게 포함되어 있음
public class B_ArrayCopy {
	
	// 배열의 복사
	public void method1() {
		int[] origin = {1,2,3,4,5};
		
		System.out.println("== 원본 배열 출력 ==");
		
		for(int i=0;i<origin.length;i++) {
			System.out.print(origin[i]+" ");
		}
		System.out.println();
		
		// 단순하게 origin을 다시 대입시킨 copy 배열 셋팅
		
		int[] copy = origin; // ★ copy!!
		
		System.out.println("== 복사본 배열 출력==");
		for(int i=0;i<copy.length;i++) {
			System.out.print(copy[i]+" ");
		}
		System.out.println();
		System.out.println("====== copy값 변경 후 =======");
		
		copy[2] = 9;
System.out.println("== 원본 배열 출력 ==");
		
		for(int i=0;i<origin.length;i++) {
			System.out.print(origin[i]+" ");
		}
		System.out.println();
		
		// 단순하게 origin을 다시 대입시킨 copy 배열 셋팅
		
		
		System.out.println("== 복사본 배열 출력==");
		for(int i=0;i<copy.length;i++) {
			System.out.print(copy[i]+" ");
		}
		System.out.println();
		
		// copy[2]를 가지고 수정해도 원본까지 변경되어 있음
		// 왜? origin과 copy가 같은 곳을 참조하고 있기 때문
		//   즉, 같은 주소값
		System.out.println("origin 주소값 : "+origin.hashCode());
		System.out.println("copy 주소값 : "+copy.hashCode());
		
		// 얕은 복사 : 주소값을 복사
		
	}
	
	// 얕은 복사의 문제를 해결하기 위해 깊은 복사
	public void method2() {
		// 1. for문을 활용한 방법
		//		새로운 배열을 차라리 생성한 후 반복문을 활용하여
		//		원본배열의 값들을 새로운 배열에 대입하는 방법
		
		int[] origin = {1,2,3,4,5};
		
		// int[] copy = origin; // 얕은복사 : 주소값 복사
		
		int[] copy = new int[origin.length];
		
		/*
		copy[0] = origin[0];
		copy[1] = origin[1];
		copy[2] = origin[2];
		copy[3] = origin[3];
		copy[4] = origin[4];
		*/
		
		
		
		
		for(int i=0;i<origin.length;i++) {
			copy[i] = origin[i];
			
			System.out.println("origin 값 : "+ origin[i]);
			System.out.println("copy 값 : "+ copy[i]);
		}
		copy[2]=99;
		System.out.println("=== 변경 후 =====");
		
		for(int i=0;i<origin.length;i++) {
			
			System.out.println("origin 값 : "+ origin[i]);
			System.out.println("copy 값 : "+ copy[i]);
		
		}
	}
	public void method3() {
		// 2. 차라리 새로운 배열 생성 후 System 이라는 클래스에서 
		//								arraycopy() 메소드를 이용한 복사
		
		int[] origin = {1,2,3,4,5};
		
		int[] copy = new int[10]; // 넉넉하게 크게 생성함 / 0~9 인덱스로 이루어졌는데
		//														'0'이 담겨있을것.
		
		
		//System.arraycopy(원본 배열명, 복사 시작할 인덱스, 복사본 배열명, 복사본 배열의 복사될 시작인덱스, 복사할 개수);
		System.arraycopy(origin, 0, copy, 0, origin.length);
		//								   2 : 인덱스 [2]에서부터 복사 가능.
		for(int i=0;i<origin.length;i++) {
			System.out.println("origin 의 인덱스 : "+origin[i]);
			System.out.println("copy 의 인덱스 : "+copy[i]);
		}
			
			System.out.println("origin 의 주소 : "+origin.hashCode());
			System.out.println("copy 의 주소 : "+copy.hashCode());
			
			copy[2]=99;
		
			for(int i=0;i<origin.length;i++) {
				System.out.println("origin 의 인덱스 : "+origin[i]);
				System.out.println("copy 의 인덱스 : "+copy[i]);
				// 주소값이 다름 (깊은복사)
				//  => 각자 다른 배열 참고하고 있음
				//  => 즉, 배열 수정 시 서로에게 영향을 주지 않음
				
			}
		
		
	}
	public void method4() {
		// 3. Arrays 클래스에서 제공하는 copyOf() 메소드 사용
		int[] origin= {1,2,3,4,5};
		// 복사본 배열 == Arrsys.copyOf (원본배열명, 복사할 길이);
		int[] copy = Arrays.copyOf(origin, 10);
		/*
		 * [참고]
		 * java.lang.Math
		 * java.lang.String
		 * java.lang.System
		 * => java.lang 패키지에 있는 클래스들은 쓸 때는 import 안해도 됨!
		 * 
		 * java.util.Scanner
		 * java.util.Arrays
		 * => java.lang  이외의 패키지에 있는 클래스들은 import 해줘야함
		 */
		
		
		for(int i=0;i<copy.length;i++) {

		System.out.println("copy : "+copy[i]);
		
		/*
		 * Arrays.copyOf() 메소드
		 * ==> 내가 제시한 길이 만큼 복사본 배열 크기 할당
		 * => 단, 내가 제시한 길이가 원본 배열의 크기보다 클 경우 기존 배열에 있는 값은 다 복새 나머지는 '0'이 들어간다.
		 * => 내가 제시한 길이가 원본 배열의 크기보다 작을 경우 기존의 배열에 있는 값 내가 제시한 길이만큼 복사
		 */
		}
		
	}
	public void method5() {
		// 4. clone() 메소드 이용한 복사
		//	  인덱스 지정 불가, 크기 지정 별도로 못함 = 쌍둥이 처럼 만들어줌
		int[] origin= {1,2,3,4,5};
		// 복사열 배열 = 원본배열.clone();
		int[] copy = origin.clone();
		
		for(int i=0;i<copy.length;i++) {

			System.out.println("origin : "+origin[i]);
			System.out.println("copy : "+copy[i]);
		}
		
	}
	
	

}
