package com.kh.array;

import java.util.Scanner;

public class A_Array {

	// 변수 : 하나의 공간에 하나의 값을 담을 수 있음
	// 배열 : 하나의 공간에 여려개의 값을 담을 수 있는 개념
	// "같은 자료형의 값" 으로만 담을 수 있음
	// 정확히 이야기하자면 배열의 각 인덱스 자리에 실제값이 담김(인덱스는 0부터 시작함!)

	public void method1() {
		// ● 배열을 왜 사용하는지

		// 변수라는 것만을 이용하게 되면
		// => 대량의 데이터드를 보관하고자 할때 각각의 변수를 만들어서 따로 관리하여야함.
		// int num1 = 0,1,2,3,4,;

		/*
		 * int num1 = 0; int num2 = 1; int num3 = 2; int num4 = 3; int num5 = 4;
		 * 
		 * // 출력하고자 할때도 =>일일히 출력해야함 (반복문 활용 불가) System.out.println(num1);
		 * System.out.println(num2); System.out.println(num3); System.out.println(num4);
		 * System.out.println(num5);
		 * 
		 * for(int i = 1; i<=5 ; i++) { System.out.println("num"+i); // 작동하지 않음
		 * 
		 * }
		 * 
		 * // 총합계를 구할 때에도 => 일일히 더해줘야함 int sum = num1+ num2+ num3 +num4+ num5; // 작동안됨
		 */

		/*
		 * 1. 배열 선언 (여려개의 값을 보관할 배열을 만들겠다!)
		 * 
		 * [표현법] 자료형 배열명[]; 자료형[] 배열명; => 일반적으로 많이 쓰임
		 */

		// int a; // 변수 선언

		// int arr[];

		// int[] array; // 오로지 int 값만을 담을 수 있다!!

		/*
		 * 2. 배열 할당 -> (이 배열에 몇개의 값들을 보관할건지 크기를 지정하는 과정, 그 개수만큼 방이 만들어진다!!!)
		 * 
		 * [표현법] 배열명 = new 자료형[배열크기];
		 */

		// array = new int[5];

		/*
		 * ●● 배열 선언과 동시에 할당 ( 배열 만듦과 동시에 크기 지정)
		 */

		int[] arr = new int[5];

		/*
		 * 3. 값 대입
		 * 
		 * [표현법] 배열명[인덱스] = 값;
		 */

		// 반복문으로 표현 가능!!
		/*
		 * arr[0]=0; arr[1]=1; arr[2]=2; arr[3]=3; arr[4]=4;
		 */

		// 배열의 장점 : 반복문 활용 가능
		for (int i = 0; i <= 4; i++) {
			arr[i] = i;
		}
		/*
		 * System.out.println(arr[0]); System.out.println(arr[1]);
		 * System.out.println(arr[2]); System.out.println(arr[3]);
		 * System.out.println(arr[4]);
		 */

		// 출력시 반복문 활용 가능
		for (int i = 0; i <= 4; i++) {
			System.out.println(arr[i]);
		}

		System.out.println(arr);
		// arr 이라는 박스에는 " 주소값" 이라는게 담겨있음 (뭔소리지" =>method2();)

	}

	public void method2() {

		int i = 10;

		// 배열 선언과 동시에 할당
		int[] iArr = new int[5];

		System.out.println(iArr);

		double[] dArr = new double[3];
		System.out.println(dArr);

		// int iArr => [I@6f2b958e @앞이 자료형
		// double dArr => [D@5e91993f

		/*
		 * 실제 리터럴(값)을 곧바로 담을 수 있는 변수를 일반 변수라고 이야기하고, 주소값을 담고 있는 변수는 참조변수(래퍼런스 변수)라고
		 * 이야기한다.
		 * 
		 * 기본자료형(boolean, char, byte, short, long, float, double) 으로 선언된변수 -> 소문자로 시작하고
		 * 소문자로 끝이남! => 실제 리터럴 값을 바로 담는 변수 = 그냥 일반 변수
		 * 
		 * 그 외 자료형(int[], double[], char[], short[], 요런 자료형, String, ...)으로 선언된 변수 ->
		 * 주소값을 담는 변수 => 참조변수(래퍼런스 변수)
		 * 
		 * 
		 */
	}

	public void method3() {
		int[] iArr = new int[3]; // 0번 인덱스~ 2번 인덱스
		double[] dArr = new double[4]; // 0~3번 인덱스

		// 배열 선언하고 크기 지정(할당)까지만 한 상태
		// 그럼 각각의 인덱스에 초기화(값대입)가 돼어있을까?

		// 각각의 인덱스에 값을 안담고 출력해보기
		for (int i = 0; i <= 2; i++) {
			System.out.println(iArr[i]);
		}
		System.out.println("==============");
		for (int i = 0; i <= 3; i++) {
			System.out.println(dArr[i]);
		}

		// 내가 각 인덱스에 초기화(값대입)을 하지 않아도 값들이 담겨있음!!
		// Heap이라는 공간에 절대 빈공간이 존재할 수 없음!!
		// => 따라서 공간이 만들어질때 JVM(자바가상머신)이 기본적으로
		// 초기화(값대입)을 진행해줌
	}

	public void method4() {
		int[] arr = new int[5];

		// arr[0] =1;
		// arr[1] =2;
		// arr[2] =3;
		// arr[3] =4;
		// arr[4] =5;

		// 값대입 and 출력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");

		}
		System.out.println();
		System.out.println(arr);// { 배열의 자료형 +@+ 주소값의 16진수 형태
		System.out.println(arr.hashCode());// 주소값으 10진수 형태로 나옴
		System.out.println("배열의 길이 : " + arr.length);

		// 배열 크기 변경 요청 => 10으로[10] X => 배열은 크기변경이 불가능하다(다시 만들어야 함)
	}

	public void method5() {
		int result = 0;// 선언과 동시에 초기화

		// 배열 쓰면 서 볼 수 있는 오류들 모음
		// int[] arr;//크기지정 까먹음

		int[] arr = null; // 아무것도 참조하고 있지 않음.
		System.out.println(arr);// 선언만 한 경우 => 초기화가 안돼있어 오류남
		// arr = new int[5];

		// nell 가지고 메소드를 호출한다거나 특정 어딘가에 접근하고자 한다면
		// 항상 오류 발생!! => NellPointerException

		// System.out.println(arr.hashCode());
		// System.out.println(arr.length);
		// System.out.println(arr[0]);

	}

	public void method6() {
		int[] arr = new int[5];

		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 6;
		arr[3] = 8;
		arr[4] = 10;
		int sum = 2;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 2;
			System.out.println(arr[i]);

		}
		System.out.println("arr의 해쉬코드값 : " + arr.hashCode());
		System.out.println("arr의 길이 : " + arr.length);

		// java.lang.ArrayIndexOutOfBoundsException : 배열의 부적절한 인덱스 제시시 발생
		// (범위에서 벗어난 인덱스 제시)
		// arr[5] = 12;
		// System.out.println(arr[5]);

		// ● 배열의 가장 큰 단점
		// - 한번 지정된 배열의 크기는 변경이 불가
		// => 배열의 크기를 변경하고자 한다면 다시 만들어야함.
		arr = new int[7];
		System.out.println("변경 후의 arr의 해쉬코드값 : " + arr.hashCode());
		System.out.println("변경 후의 arr의 길이 : " + arr.length);
		System.out.println(arr[6]);
		// 주소값이 변경 됨!! => 새로운 곳을 참조하고 있음
		/*
		 * 연결이 끊어진 기존 배열은 Heap영역에 잔류(어디에도 참조되어 있지 않음으로 필요 없는 존재 == 지워주는게 좋음) => 일정 시간이
		 * 지나면 "가비지컬렉터(GC)"가 알아서 지워줌!! => 자바에서의 "자동메모리 관리"특징!! == 개발자가 코드작성에만 신경쓸 수 있음
		 */

		// 배열을 강제로 삭제시키고자 한다면?? ==> 연결고리를 끊으면 됨!!

		arr = null; // 아무것도 참조하지 않겠다.

		System.out.println("삭제 후 arr : " + arr); // null

		// null.xxx() ==> NullPointExcaeption 발생
	}

	public void method7() {
		// 배열 선언, 할당, 초기화(값대입) 다 동시에 하기

		// [표현법 1]
		int[] arr1 = new int[] { 1, 2, 3, 4, 5 };

		// [표현법 2]★★★★★
		int[] arr2 = { 1, 2, 3, 4 }; // 위랑 동일하나 간편하고 깔끔

		System.out.printf("arr1이랑 arr2랑 같나요? : " + (arr1[0] == arr2[0]));
		// 각각의 변수에 담겨있는 주소값을 비교하기 때문

	}

	public void method8() {
		// 1. 크기 10짜리 정수 배열 생성 후
		int[] arr1 = new int[10];

		// 2. 반복문을 활용해서 0번 인덱스 ~ 마지막 인덱스까지 순차적 값 대입
		// 매번 1~100 사이에 생성되는 앤덤값
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int) (Math.random() * 100 + 1);
		}

		// 3. 반복문을 활용해서 0번 인덱스 ~ 마지막 인덱스까지 값 출력
		// arr[x] : xx
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr[" + i + "] : " + arr1[i] + " ");

		}
	}

	public void method9() {
	 
	 Scanner sc = new Scanner(System.in); // 1. 사용자에게 배열의 길이를입력 받은 후
	 // 해당 그 크기만큼의 문자열 배열 생성 System.out.print("배열의 길이를 입력해주세요 : ");
	 int size = sc.nextInt();
	 sc.nextLine(); // 버퍼에 남아있는 엔터를 제거하는 코드 추가
	 
	 String[] arr = new String[size];
	
	 
	 // 2. 반복문을 활용하여 매번 사용자에게 과일명을 입력받아 // 그 값을 맨 인덱스 자리에 대입( 0번~ 마지막 인덱스) 
	 for(int
	 i=0;i<arr.length;i++) { System.out.print("좋아하는 과일명 입력 : ");
	 arr[i]=sc.nextLine(); }
	 
	 
	 // 3. 반복문 활용해서 0~ 마지막 인덱스까지 담긴 값을 출력 
	 for(int i=0;i<arr.length;i++) {
	 System.out.println("arr["+i+"] : "+arr[i]); }

}

	public void method10() {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 입력 :");
		String str = sc.nextLine(); // 'k''i''w''i'

		System.out.print("찾고자 하는 문자 : ");
		char ch = sc.nextLine().charAt(0);

		char[] arr = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);

			if (ch == arr[i]) { // 찾으려는 문자와 배열의 값이 같은경우
				count++;
			}

		}
		System.out.println("찾아진 문자 개수 : " + count);
	}
public void method11() {
	// 1. 사용자에게 배열의 길이를 입력바등 후 해당 크기만큼의 정수 배열 생성
	// 2. 반복문을 활용해서 0~ 마지막 인덱스까지 매번 1~100사이의 랜덤값 발생키셔 대입
	// 2. 반복문을 활용해서 0~ 마지막 인덱스까지 담긴 값을 출력과 동시에
	//   해당 그 인덱스에 담긴 값이 짝수인 값들의 총합(누적합)을 구하자
	
	Scanner sc = new Scanner(System.in);

	System.out.print("문자열 입력 :");
	String str = sc.nextLine();
	
	int[] arr = new int[str.length()];
	int sum=0;
	int jjk =0;
	for(int i = 0; i < str.length(); i++) {
		arr[i] = (int) (Math.random()*100+1);
		sum+=arr[i];
	
	for(int j = 0; j < str.length(); j++) {
		System.out.print("arr["+i+"] : " + arr[i]+"\n");
		if(arr[i]%2==0) {
			jjk+=arr[i];
		}
	}
	}
	System.out.print("담긴 랜덤값의 총 합 : " +sum);
	System.out.println();
	System.out.print("짝 랜덤값의 총 합 : " +jjk);
	
	
	
}	
}
