package com.kh.variable;

public class D_Cast {

	public void autoCasting() {
		
		/*
		 *  &형변환 : 값의 자료형을 바꾸는 것
		 *  
		 *  컴퓨터에서의 값 처리 규칙 (즉, 형변환이 필요한 상황)
		 *  1. 대입 연산자를 기준으로 왼쪽과 오른쪽이 같은 자료형이여야 한다!!
		 *  => 즉, 같은 자료형에 해당하는 값만 대입 가능하다!!
		 *  => 즉, 다른 자료형의 값을 대입하고자 한다면 형 변환이 필수이다!!
		 *  
		 *  [표현법] 변수형 = (자료형)값; // int a = (int)8.0 
		 *  
		 *  
		 *  2. 같은 자료형 끼리만 연산이 가능
		 *   값 + 값 => 계산 결과도 같은 자료형으로 나옴!
		 *   
		 *  & 형변환의 종류
		 *  1. 자동 형변환 => 자동으로 형변환이 이루어져서 굳이 변환 시킬 필요가 없다! (컴퓨터가 변환)
		 *  2. 강제(명시적) 형변환 => 자동으로 형변환이 안됌, 우리가 직접 형변환 해줘야함.
		 *  
		 *  [표현법] (바꿀자료형)값
		 *  
		 *  ** 주의사항 **
		 *  boolean은 형변환 불가!!
		 *  
		 */
		
		/*
		 * 자동형변환
		 * 값의 범위가 작고 자료형과 큰 자료형간의 연산시
		 * 자동으로 범위가 작은 자료형을 큰 자료형으로 변환 후 처리해줌
		 * 
		 */
		
		
		// 1. int(4byte) => double(8byte)
		int i1 = 12;
		double d1 = /*(double)*/i1; // 자동으로 내용이 들어간 것과 같다.
		
		byte b1 = 5;
		int b2 = b1;
		
		System.out.println(d1);
		System.out.println(b2);
		
		// 큰 박스에는 작은 박스를 담을 수 있다. => 자동형번환이 가능!
		int i2 = 12;
		double d2 = 3.14;
		
		double result = /*(double)*/i2 + d2;
		System.out.println(result);
		
		// 2. int(4byet) -> long(8byte)
		int i3 = 1000;
		long l3 = i3;
		System.out.println(l3);
		
		// 3. float(4byte) -> double(8byte)
		float f4 = 1.0f;
		double d4 = f4;
		
		// === 특이 케이스 ==
		// 4. long(8byte) => float(4byte) // 원래는 안됨 
		//   float이 실수형이기 때문에 long형 보다 표현 가능한 수의 범위가 더 커서 자동형변환이 가능!
		
		long l5 = 100000000000000L;
		float f5 = l5;
		System.out.println(f5);
		
		// 5. char(2byte) <=> int(4byte)
		int num = 'A';
		System.out.println(num);
		
		char ch = 71;
		System.out.println(ch);
		
		// 아스키 코드표 
		// 각 문자들마다 고유한 숫자가 지정되어 있기 때문에 쌍방향으로 형변환 가능
		// char는 음수값 저장 불가 => 값의 범위가 0~65535
		
		//6. byte 또는 Short간의 연산
		byte o1 = 1;
		byte o2 = 10;
		
		//byte b3 = o1 + o2; //byte나 short는 연산시 무조건 int형으로 처리함.
		                    // 연산 결과가 범위가 더 큰 int 형임. => byte형 대입 불가
		byte b3 = (byte)(o1 + o2); // (형변환값)(변환 당할 내용)
		System.out.println(b3);
		
		
	}
}
