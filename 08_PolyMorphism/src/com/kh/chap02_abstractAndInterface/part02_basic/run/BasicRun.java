package com.kh.chap02_abstractAndInterface.part02_basic.run;

import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Mother;

public class BasicRun {

	public static void main(String[] args) {

		// Person p = new Person(); 추상클래스라서 객체 생성 안됨
		/*
		Person mom = new Mother("나엄마", 50, 70, "출산");
		Person baby = new Baby("나아기", 3.5, 70);
		
		System.out.println(mom);
		System.out.println(baby);
		
		// 동적바인딩
		mom.eat(); // 몸무게 +10 / 건강도 -10
		baby.eat(); // 몸무게 +3 / 건강도 +1
		
		mom.sleep(); // 건강도 +20
		baby.sleep(); // 건강도 +3
		
		System.out.println("===========");
		System.out.println(mom);
		System.out.println(baby);
		*/
		
		
		
		// Basic b = new Basic(); // 레퍼런스 변수로는 사용 가능하나 객체 생성은 불가능함
		Basic mom = new Mother("나엄마", 50, 70, "출산");
		Basic baby = new Baby("나아기", 3.5, 70);
		
		System.out.println(mom);
		System.out.println(baby);
		
		mom.eat();
		baby.eat();
		
		mom.sleep();
		baby.sleep();
		
		System.out.println(mom);
		System.out.println(baby);
		
		
		
	}

}
