package com.kh.variable;

public class A_variable {

	// 시급과 근무시간, 근무일수를 곱해서 월급을 계산해서 출력하는 메소드
	public void printVariable() {
	  System.out.println("=== 변수 사용 전 ===");
		
	  System.out.println("시급 : 9620원");
	  System.out.println("근무일수 : 6일");
	  System.out.println("근무시간 : 8시간");
	 
	  
	  // 월급 = 시급 X 근무시간 X 근무일수
	  
	  System.out.println("차은우의 주급은 "+(9620*6*8)+" 입니다.");
	  System.out.println("주지훈의 주급은 "+(9620*6*8)+" 입니다."); // 자바에서의 곱셈은 *로 나타낸다.

	  
	  	  // 변수 사용 후
	  
	  System.out.println("=== 변수 사용 후 ===");
	  
	  // 자료형  변수명
	  
	  int pay = 9620; // 자바에서 "="는 대입이다.(동등아님)
	  int time = 8;
	  int day = 6;
	  
	  int 주급 = (pay*time*day);
	  int 월급 = (주급*4);
	  
			  
	  
	  System.out.println("차은우의 주급은 "+주급+" 입니다.");
	  System.out.println("차은우의 월급은 "+월급+" 입니다.");

	  /* 변수를 사용하는 이유
	   * 1. 변수는 우선적으로 같이 의미를 부여할 목적으로 사용한다.(가동성이 좋아진다.)
	   * 2. 변수는 단 한번 갚을 기록하고 필요할 때마다 가져다 쓰는 목적으로 사용한다.(재사용이 높아진다.)
	   * 3. 유지보수를 보다 쉽게 할 수 있다.
	   * 
	  */
	  System.out.println(pay);
	  
	  System.out.print("aaa");
	  System.out.println("bbbb");
	  
	}
	
	//변수의 선언을 공부하기 위한 메소드
	public void decleareVariable() {
		
		/* 변수의 선언
		 * 값을 기록하기 위한 변수를 메모리 공간에 확보, 할당한다.
		 * => 즉 값을 보관하기 위하여 상자를 만들겠다!라는 의미
		 * 
		 * [표현법] 자료형 결정(숫자?문자?...) 변수이름;
		 * 자료형 : 변수의 크기 및 모양을 지정해주는 부분
		 * 변수이름 : 변수의 이름을 붙여주는 부분(의미 부여 필요!)
		 * 
		 * 변수 선언시 주의사항
		 * 1. 변수 이름은 소문자로 시작 /단, 낙타봉 표기법을 지킬 것! 예약어는 불가
		 * 2. 같은 영역[()나{}] 안 에서는 동일한 변수명으로 선언 불가! => 즉, 중복이 불가능하다.
		 * 3. 해당 영역[()나{}]에서 선언한 변수는 해당 영역 안에서만 사용이 가능 => 즉, 다른 메소드 안에서는 사용이 불가능하다.
		 */
		
		// 낙타봉 표기법 이란, 사용자이름 => user + name => userName // 두 단어를 합성할때 두번째 단어는 대문자로! (username = X)
		// 예약어란, java에서 사용하는 명령어로 해당 명령어는 변수로 선언이 불가능하다. // 이용하다 안되면 구글링 하기.
		
		// ----- 자료형에 대한 개념 -----
		// 1. 논리형 (논리값 = true / false)
		  boolean isTrue; 
		  boolean isFalse = false;  //1byte, 변수 선언과 동시에 값을 대입
		  
		  System.out.println("isFalse 의 값 : "+ isFalse);//sysout
		  
		  isTrue = 1 + 3 > 1; //ture // 1+3이 1보다 큽니까? 참입니다.(true)
		  isFalse = 4 + 2 < 1; // false // 4+2rk 1보다 큽니까? 거짓입니다.(false_
		  
		  System.out.println(isTrue);
		  System.out.println(isFalse);
		  
		  
		  // 2. 숫자형
		  // 2_1. 정수형 (소수점X)
		  byte bNum; // 1byte (-128~ 127) // 많이 사용하지 않음
		  
		  bNum = 18;
		  		  
		  short sNum = 1000; // 2byte byte의 두배
		  
		  int iNum = 10000; // 4byte short의 두배 // 정수형의 기본 자료형
		  
		  long lNum = 100000; // 8byte int의 두배
		  
		  // 2_2. 실수형 (소수점O)
		  float fNum = 0.0f; // 4byte => 소수점 7자리까지 표현 가능
		  						// float의 경우 double과 값을 구분하기 위해 값 뒤에 f를 붙임.
		  
		  double dNum = 0.12345; // 8byte => 소수점 15자리까지 표현 가능, 실수형의 기본 자료형
		  
		  // 3. 문자형
		  // 3_1. 문자 [a,b,c,....]
		  char ch = 'a'; // 2byte 홑따옴표('')로 담워줘야 함
		  char kim;
		  kim = '김'; // 영문은 1byte, 한글은 2byte
		  
		  // 3_2. 문자열 [happy 단어]
		  String str; // 첫글자 대문자, 참조자료형, 검정색
		  str = "바보";
		  
		  // 값이 잘 담겨있는지 확인!
		  // 변수명 : 변수값
		  
		  System.out.println("isTrue : "+ isTrue);
		  System.out.println("isFalse : "+ isFalse);
		  
		  System.out.println(bNum);
		  System.out.println(sNum);
		  System.out.println(iNum);
		  System.out.println(lNum);
		  System.out.println(fNum);
		  System.out.println(dNum);
		  System.out.println(ch);
		  System.out.println(kim);
		  System.out.println(str);
		
		  //--------------------------------------------//
		  // 상수의 선언!
		  // [표현법] final 자료형 상수이름(모두 대문자);
		  final int AGE;
		  AGE = 10; // 초기화
		  
		  System.out.println("AGE : " + AGE);
		  
		  // AGE = 11; 상수의 값은 변경이 불가능하다.
		  
		  // 대표적인 상수의 예 : 3.14(파이, 원주율)
		  System.out.println("파이 : " + Math.PI);
		  
		  //번외 : 가독성을 위해 언더바를 사용할 수 있음.
		  int etc = 999_999_999;
		  
		  System.out.println(etc);
		  
		  // * 변수 명명규칙
		  int number;
		  
		  // 1. 같은 영역내에 중복된 이름 안됨!!
		  // 대소문자 구분
		  int numBer; // 이건된다.
		  
		  // 2. 예약어(자바에서 사용되는 키워드) 안됨.
		  // int true;
		  // int class;
		  // int abstract;
		  // int public;
		  
		  
		  // 3. 숫자 사용가능하나 (단, 숫자로 시작하는건 안됨)
		  int number1;
		  int num1ber;
		  // int 1number;
		  
		  // 4. 특수문자 사용가능하나 (단, _와 $만 사용 가능)
		  //int _number1;
		  int number$;
		  //int number!;
		  
		  // 권장사항!! (오류는 나지 않으나 지켜줬으면 하는 것) 개발자간의 규칙(매너)
		  // 1) 낙타표기법(두 단어를 합칠 때 두번째 단어는 첫글자 대문자로 작성)
		  String username; // 관례상 틀림
		  String userName; // 관례상 맞는 표현
		  String userNameTest;
		  
		  // 2) 한글 사용 가능하나, 무조건 영문자로 작성하자!
		  String 이름;
		  int 나이; // 한글을 사용하지 않는 환경에서는 오류를 발생시킬 수 있음!
		  int userAge;
		  
		  
		  
		  
		  
		  
		  
	}
	
}
