package com.kh.variable;

public class C_Printf {

	public void PrintfTest() {
		
		//System.out.print(출력하고자 하는 값); // 출력만함 (줄바꿈 발생 X)
		//System.out.println(출력하고자 하는 값); // 출력 후 (줄바꿈 발생 O)
		
		//System.out.printf("출력하고자 하는 형식(포멧)"출력하고자 하는 값);
		// 출력하고자 하는 값들이 제시힌 (포멧)에 맞춰서 출력 만 진행
		
		/* 포멧 안에서 쓰일 수 있는 키워드
		 * 1. %d : 정수 (int)
		 * 2. %c : 문자 (cher)
		 * 3. %s : 문자열 (문자도 가능,한글자도 가능)
		 * 4. %f : 실수 (double)
		 */
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		// 원하는 출력값 "10 20"
		
		//System.out.println(iNum1 + iNum2); // 문자화 되어버린다.
		//System.out.printf("%d %d",iNum1,iNum2,iNum2);
		//System.out.println(); // printf는 줄바꿈이 안돼서 이걸 넣어줘야함 / 문자가 붙어서 나온다면 
		//System.out.printf("출력하고자 하는 값");
		
		// System.out.printf("%d %d%",iNum1,iNum2); // %d %d% (%뒤에는 포맷키워드가 와야만함.)
		
		// 그래도 진짜로 %를 출력하고 싶다면
		System.out.printf("%d %d%%",iNum1,iNum2); // %%두번쓰면 %로 인식해줌
		System.out.println();//줄바꿈 용도
		//정렬하고자 할 때 많이 쓴다.
		System.out.printf("%5d\n",iNum1); // 양수 5 오른쪽 정렬
		System.out.printf("%-5d\n",iNum2); // 음수 5 왼쪽 정렬
		
		System.out.printf("%5d\n", 250);  // 왼쪽 5 오른쪽 정렬
		System.out.printf("%5d\n", 3000);
		System.out.printf("%5d\n", 16);
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		
		System.out.printf("%f\t%f",dNum1,dNum2); // 무조건 소수점 아래 6번쨰 자리까지 보여줌 / 없다면 0으로 체워서라도 보여줌
		// \n 엔터 , \t 탭
		System.out.println();
		
		// 시험나올듯 중요! **********
		System.out.printf("%.2f %.1f",dNum1,dNum2);  // %.?f => ?자리만큼 소수점 표시됨
		
		System.out.println();//  줄 나누는 용도 
		char ch = 'a'; //c char 은 "" 아니고 ''로
		String str = "hello";
		
		System.out.printf("%c %s %s", ch, str, ch );
		
		System.out.println();//  줄 나누는 용도 
		
		System.out.printf("%C %S %S", ch, str, ch ); // [%?] 에서 ?를 대문자로 입력시 대문자로 출력된다.
		
		
		

		
	}
	
}
