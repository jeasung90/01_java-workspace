package com.kh.operator;

public class B_InDecrease {
	// 어려움...
	
	/*
	 *  ★ 증감연산자 (단항 연산자)
	 *  ++ : 변수에 담긴 값을 1 증가시켜주는 연산자
	 *  		++변수, 변수++
	 *  
	 *  -- : 변수에 담긴 값을 1 감소시켜주는 연산자
	 *  		--변수, 변수--
	 *  
	 *  (증감연산자)변수 : 전위연산 => "선증감" 후처리
	 *  변수(증감연산자) : 후위연산 => 선처리 "후증감"
	 */
	public void method1(){
		
		// 전위연산 테스트
		int num1 = 10;
		System.out.println("전위연산 적용 전 num1의 값 : " + num1); // num1 = 10 출력
		System.out.println("1회 수행 후 결과 : " + ++num1); // num1 = 11 출력
		System.out.println("2회 수행 후 결과 : " + ++num1); // num1 = 12 출력
		System.out.println("3회 수행 후 결과 : " + ++num1); // num1 = 13 출력
		System.out.println("최종 num1의 값 : " + num1); // num1 = 13 출력
		
		System.out.println("====================================="); // 구분선
		
		// 후위연산 테스트
		int num2 = 10;
		System.out.println("후위연산 적용 전 num2의 값 : " +num2); // num2 = 10 출력
		System.out.println("1회 수행 후 결과 : " + num2++ );// num2 = 10 출력
		System.out.println("2회 수행 후 결과 : " + num2++ );// num2 = 11 출력
		System.out.println("3회 수행 후 결과 : " + num2++ );// num2 = 12 출력
		System.out.println("최종값 : " + num2 );// num2 = 13 출력
		
	}
	
	public void method2(){
		int a = 10;
		int b = ++a; // a=?, b=?
		//System.out.println(a);
		//System.out.println(b);
		System.out.printf("a: %d, b:%d\n",a,b);
		
		int c = 10;
		int d = c++;
		System.out.printf("c: %d, d: %d\n",c,d);
		
		System.out.println("===============================================");
		
		int num = 20;
		System.out.println(num);
		System.out.println("현재 num은 ? : "+ num);// num = 20
		System.out.println("++num은 ? : "+ ++num);// num = 21
		System.out.println("num++은 ? : "+ num++);// num = 21 (22)
		System.out.println("--num은 ? : "+ --num);// num = 21
		System.out.println("num--은 ? : "+ num--);// num = 21 (20)
		System.out.println("최종num은 ? : "+ num);
		
		
		
		
		
		
	}
	
	
	
	
}
