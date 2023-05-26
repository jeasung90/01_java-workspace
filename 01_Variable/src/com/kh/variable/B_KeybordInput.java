package com.kh.variable;

import java.util.Scanner;

// 사용자가 키보드로 입력한 값을 받아들이는 Scanner 실습
public class B_KeybordInput {

	public void inputTest1(){
		
		/*
		 * 키보드로 값을 입력받는 방법
		 * Scanner를 사용한다!
		 * 즉 java.util.Scanner 클래스를 이용함
		 * Scanner 클래스 내부의 메소드를 호출해서 입력받는 것
		 */
		
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in); // 외워야함.
		//System.in => 입력받은 값을 바이트 단위로 받아들이겠다는 의미
		
		/* System.out.print("아무거나 입력해 보세요 : ");
		
		String name = sc.nextLine();
		
		System.out.println("입력받은 내용 : " + name);
		
		sc.close();
		*/
		
		System.out.print("아무거나 입력해 보세요 : ");
		
		
		
		
	}
	
	
	public void inputTest2() {
		/* 
		 * nextLien() 을 이용한 경우
		 * 
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름은 무엇입니까?: ");
		String message = sc.nextLine();
		System.out.println("아 당신의 이름은 " + message + " 이군요.");
		sc.close();
		*/
		// nextLine() : 사용자가 입력한 값 모두 읽어옴(엔터 전 까지의 모든 값)
				
		
		/*
			next()를 이용한 경우
			
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름은 무엇입니까?: ");
		String message2 = sc.next();
		System.out.println("아 당신의 이름은 " + message2 + " 이군요.");
		sc.close();
		
		
		// 사용자가 입력한 값을 문자열로 받아오는 메소드(nextLine(),next())
		// String name - sc.next();
		// next() : 사용자가 입력한 값 중 공백이 있을 경우 공백 이전의 값만 읽어옴
		//               서울시 성북구 종암동 // 거주지 처럼 공백이 있는경우 제대로 된 값을 못가져올 수 도 있음.
		*/
		
		// nextLine(); 으로 하면 띄어쓰기 뒤까지 읽어옴
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇입니까?: ");
		String name = sc.nextLine();
		
		System.out.print("당신의 나이는 몇 살입니까?");
		int age = sc.nextInt(); // 사용자가 입력한 값을 정수로 읽어들이는 메소드
		
		System.out.print("당신의 키는 몇 입니까? (소수점 첫쨰 자리까지)");
		double height = sc.nextDouble(); // 사용자가 입력한 값을 실수로 읽어드리는 메소드
		
		System.out.println(name +"님은" + age +"살이며, 키는" + height +"cm입니다.");
		
		// xxx님은 xx살이며 키는 xxx.x cm 입니다.
				
	}
	
	
	public void inputTest3() {
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게 : ");
		double wt = sc.nextDouble();
		
		sc.nextLine(); // 버퍼에 남아있는 엔터를 비워주는 코드를 추가
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		
		
		
		
		// xxx님은 xx살이며, 사는곳은 xxx이고, 키는 xxx.xcm 입니다.
		
	
		System.out.print(name + "님은 " + age + "살이며 " + height + "에" + wt + "입니다. 사는곳은 " + address + "입니다."  );
		System.out.println();
		System.out.printf("%s님은 %d살이며 %.1f에 %.1f입니다. 사는곳은 %s입니다.",name,age,height,wt,address);
		
		
	}
	
	public void inputTest4() {
		
		Scanner cs = new Scanner(System.in);
		
		System.out.print("이름이 뭐에요 :");
		String name = cs.nextLine();
		
		System.out.print("성별(m/x) :");
		//char gender = cs.nextChar(); // nextChar() 와 같은 메소드는 존재하지 않음
		char gender = cs.nextLine().charAt(0);
		// 문자열.charAt(인덱스) : 해당 문자열로부터 해당 인덱스의 문자열을 추출해주는 메소드
		// **인덱스 : 순번 같은 존재. 단, 0부터 시작함!
		
		System.out.print("나이 :");
		int age = cs.nextInt();
		
		System.out.print("키: ");
		double heigth = cs.nextDouble();
		
		
		System.out.println(name + "님의 개인정보");
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + heigth);
		
		
	}
	
	
	public void charAtTest() {
		
		
		String str = "hello";
		
		// 변수에 기록하여 출력하는 방식
						
		char ch = str.charAt(0);
		
		System.out.println(ch);
		
		
		// 바로 출력하는 방식
		System.out.println(str.charAt(3));
		
		// 존재하지 않는 인덱스 제시 : 오류발생
		//System.out.println(str.charAt(13)); //java.lang.StringIndexOutOfBoundsException
		
		
	}
	/*
	 *   ** 정리 **
	 *   1. 콘솔창에 (모니터) 출력하기 위해 : System.out.print[ln]() 메소드 이용
	 *   2. 콘솔창에 (키보드) 입력받기 위해 : Scanner 이용해서 [nextLine(),next(),nextInt(),nextDouble()..]
	 *   
	 *   > 주의사항 < 
	 *   1. sc.nextXXX() 메소드 뒤에 sc.nextLine() 메소드가 와야 될 경우
	 *      sc.nextLine() 메소드를 한번 더 써줘서 버퍼에 남아 있는 '엔터'를 빼주는 과정 필수!
	 *   2. '문자' 값을 입력받아야 될 경우
	 *      sc.nextLine() 메소드를 통해 우선 문자열로 받고 그 뒤에 .charAt(인덱스) 메소드를 통하여 문자하나씩 추출
	 *    
	 *   
	 *   
	 */
}
