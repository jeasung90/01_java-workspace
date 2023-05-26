package com.kh.operator;

public class C_Arithmetic {

	/*
	 *  산술연산자 (이항연산자 == 두개릐 값을 가지고 연산 )
	 *  연산자 종류 : +, -, *, /, %
	 *  
	 *  [*,/,%] > [+,-]
	 */
	
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		// --괄호()없이 진행 했을 때!
		//System.out.println("num1 + num2 = "+ num1 + num2); //103나옴 텍스트로 인식 [10]+[3]
		System.out.println("num1 + num2 = "+(num1 + num2)); // = 13
		//System.out.println("num1 - num2"+num1 - num2); // 에러발생 = 문자에서 숫자를 뺄 수 없음.
		System.out.println("num1 - num2 = "+(num1 - num2)); // = 7
		
		System.out.println("num1 * num2 = "+ num1* num2); // = 30 // *가 우선순위가 높기때문에 필요없으나, 가독성을 위하여 묶어주는것이 좋음
		System.out.println("num1 / num2 = "+ num1/ num2); // = 3  // /가 우선순위가 높기때문에 필요없으나, 가독성을 위하여 묶어주는것이 좋음
		
		// ★★★ 나머지 출력 ★★★★
		System.out.println("num1 % num2 = "+ (num1 % num2));// 나누기 연산시 나머지 출력 <짝수 홀수 가릴때>
		// 값 % 2 == 0 라는건 짝수란 소리
		// 값 % 2 == 1 라는건 홀수란 소리
		
		// 값 % 5 == 0 라는건 5의 배수란 소리
		// 값 % 3 == 0 라는건 3의 배수란 소리
		
	
	}
	public void quiz1(){
	      int a = 5;
	      int b = 10;
	      
	      int c = (++a) + b;  // a=6 + b=10 == c=16
	      int d = c / a; // c: 16 / a:6 == d=2
	      int e = c % a; // c: 16 % a:6 == e=4   
	      int f = e++;   //e == 4 (5)
	      int g = (--b) + (d--); //b:9 + 2(1) == g=11
	      int h = 2; 
	      int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
	   //          a:(6(7))+ 9 /(15/5)*(11(10) - 2) % (6+ 2)
	      //        a:(6(7))+ 9  /3*     9 %  8
	      //        a:(6(7))+ 3*10%8
	      //        a:(6(7))+ 30%8
	      //         a:(6(7))+ 6  => 12
	   
	      System.out.println("a : " + a); //7
	      System.out.println("b : " + b); //9
	      System.out.println("c : " + c); //15 
	      System.out.println("d : " + d); //1
	      System.out.println("e : " + e); //6 
	      System.out.println("f : " + f); //4  
	      System.out.println("g : " + g); //10  
	      System.out.println("h : " + h); //2  
	      System.out.println("i : " + i); //12  
	   }
	
}
