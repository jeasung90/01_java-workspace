package com.kh.operator;

public class F_Compound {
	/*
	 * 복합 대입 연산자
	 * 산술연산자와 대입연산자가 결합돼있는 형태 (산술연산자 먼져쓰고 대입연산자 나중)
	 * 연산처리 속도가 빨라짐으로 사용하는 것을 권장함!!!
	 * 
	 *  +=, -=, *=, %=, /= 
	 *  
	 *  [ a = a + 3; ]  =>  [ a += 3; ]
	 *  [ a = a - 3; ]  =>  [ a -= 3; ]
	 *  [ a = a * 3; ]  =>  [ a *= 3; ]
	 *  [ a = a % 3; ]  =>  [ a %= 3; ]
	 *  [ a = a / 3; ]  =>  [ a /= 3; ]
	 *  
	 *  
	 */

	public void method1() {
		int num = 12;
		System.out.println(num); //12
		
		// num = num; no effect code : 변화되지 않는 코드
		num += 3; // == num = num + 3;
		System.out.println("-3 증가 시킨 num : " +num); //15 
		
		num -= 5; // == num = num - 5;
		System.out.println("-5 감소 시킨 num : "+num); //10
		
		num *= 6; // == num = num * 6;
		System.out.println("6배 증가시킨 num : "+num); //60
		
		num /= 2; // == num = num / 2;
		System.out.println("2배 감소시킨 num : "+num); //30
		
		num %= 2; // == num = num % 2;
		System.out.println("최종 num : "+num); //0
		
		String str = "Hello";
		str += " World";  // str = str + "World"  // 산술연사 중 + 만 가능하다.
		
		System.out.println(str);
		
	}
	
}
