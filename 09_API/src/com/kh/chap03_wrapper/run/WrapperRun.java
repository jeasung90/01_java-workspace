package com.kh.chap03_wrapper.run;

public class WrapperRun {
	
	/*
	 *  * Wapper 클래스
	 *  => 기본자료형을 객체로 포장해줄 수 있는 클래스가 래퍼클래스 이다.
	 *  
	 *  기본자료형 <----> Wrapper 클래스
	 *  boolean		   boolean
	 *  char		   Character ***
	 *  byte		   byte
	 *  short		   Short
	 *  int			   Integer ***
	 *  long		   Long
	 *  float		   Float
	 *  double		   Double
	 *  
	 *  => 기본자료형을 객체로 취급해야하는 경
	 *  		- 메소드를 호출해야 될 
	 *  		- 메소드의 매개변수로 기본자료형이 아닌 객체타입만이 요구될 때
	 *  		- 다형성을 적용하고 싶을 
	 */

		// Boxing : 기본자료형 => Wrapper 클래스 자료
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 15;
		
		// System.out.println(num1.equals(num2)); // 주소값이라는 개념이 없어서 안
		// equals => String  => 오버라이딩 : 실제값 빋교
		// equals => 주소값 비교 
		//System.out.println(num1 == num2);
		
		// 1. 객체 생성 구문을 통한 방법
		Integer  i1 = new Integer(num1);
		Integer  i2 = new Integer(num2);
		
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println(i1==i2); // 이제는 주소값이 있어서 비교 가능
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2)); // 두 값을 비교하여 앞쪽이 크면 1, 뒤쪽이 크면 -1, 같으면 0
		// 변수.~~~ 을 쓰고싶으면 이렇게 객체화 시키는 박싱을 해야한다.
		
		// 2. 객체 생성 따위 하지 않고 곧바로 대입하는 방법 (AutoBoxing)
		Integer i3 = num1;
		System.out.println(i3);
		
		// 객체생성을 통해서 반드시 변환해야 하는 경우 => 문자열을 Integer 타입으로 변경해야 하는 경우
		// Integer i4 = "123";
		Integer i4 = new Integer("123"); // " " 사이에 반드시 숫자를 넣어야 함
		System.out.println(i4);
		
		// UnBoxing : Wrapper 클래스 자료형 => 기본자료형
		
	
		// 1. 해당 그  Wrapper 클래스에서 제공하는 xxxValue() 메소드를 통해
		int num3 = i3.intValue(); // num3 = 10
		int num4 = i4.intValue(); // num4 = 15
		
		
		// 2. 메소드 따위 사용하지 않고 바로 대입하는 방법 (AutoUnBoxing)
		int num5 = i1;
		
		// 이런거 왜배우나요?
		// -> 웹 개발할때 값 입력하면 무조건 문자로 날아옴
		System.out.println("=================");

		String str1 = "10";
		String str2 = "15.3";
		
		
		System.out.println(str1+str2); // 문자열 + 문자열 = 문자열
		
		// 1. String --> 기본 자료형
		// 	"10"     --> 인트형 10
		// 	"15.3"   --> 인트형 15.3
		//   해당 Wrapper.parseXXX() 	사용
		
		int i = Integer.parseInt(str1);  // 문자열을 인트형 숫자로 변경해줌 테스트
		double d = Double.parseDouble(str2);
		
		System.out.println(i+d);
	
	
		// 2. 기본형 --> String
		// 	  10   --> "10"
		//	  15.3 --> "15.3"
		
		String strI = String.valueOf(i);
		String strD = String.valueOf(d);
		
		System.out.println(strI);
		System.out.println(strD);
		
		// 근데 이렇게는 많이 안씀
		String test = i+""; // String => 다른자료형 + 문자열 => 문자
		
	
	
	
	
	}

}
