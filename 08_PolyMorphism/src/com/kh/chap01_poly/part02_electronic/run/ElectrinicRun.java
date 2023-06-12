package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectrinicShop2;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectrinicRun {

	public static void main(String[] args) {

		// 실해용 클래스는 납품업체라고 생각!!
		
		
		// 1. 다형성을 적용 안했을 경우(ElectrinicShop1)
		/*
		ElectrinicShop1	es = new ElectrinicShop1();
		// es에서 마련해놓은 desk, note, tab 이라는 필드에
		// 객체를 생성해서 넣어주기 위해서 우선 es 생성!!
		
		// 메소드를 써서 생성하겠음
		// 먼저 필요한 메소드를 생각해보자
		
		// 아직은 없는 메소드
		// 추가용 메소드 => insert
		// 데스크탑 이라는 객체를 생성해서 넘기는 메소드
		
		//es.insert(데스크탑 객체를 생성하는 구문);
		es.a(new Desktop("samsung", "데톱",1200000, "gtx4080"));
		
		// 노트북이라는 객체를 생성해서 넘기는 메소드
		es.insert(new NoteBook("lg", "그램", 2000000, 4));
		
		// 테블릿이라는 객체를 생성해서 넘기는 메소드
		es.insert(new Tablet("애플", "아이패드 에어4", 1000000, false) );
		
		// 가게에 해당 객체들이 잘 생성돼있는지 확인
		// 조회용 메소드 => select();
		
		es.selectDesktop();
		
		//String desk = es.selectDesktop(); // 같지 않아서 안됨
		Desktop desk = es.selectDesktop();
		NoteBook n = es.selectNoteBook();
		Tablet tab = es.selectTablet();
		
		System.out.println(desk);
		System.out.println(n);
		System.out.println(tab);
		*/
		
		// 2. 다형성을 적용했을 경우 [ElectrinicShop2]
		ElectrinicShop2 es= new ElectrinicShop2();
		
		// 추가용 메소드 => insert
		es.insert(new Desktop("애플", "아이맥", 1600000, "m1"));
		es.insert(new NoteBook("애플", "노트북", 190000, 2));
		es.insert(new Tablet("애플", "아이패드 에어", 100000, false));
		
		// 조회용 메소드 => select
		// 이번에는 이름을 하나로!!
		
		// es.select(인덱스값);
		// Desktop d = es.select(0);
		// 실제로 들어있는 값은 Desktop 객체가 맞으나 반환형이 Electronic 이라서 맞춰줘야 함!
		// 					=> 강제 형변환을 통해서
		
		/*
		Desktop d =(Desktop)(es.select(0));
		NoteBook n = (NoteBook)(es.select(1));
		Tablet t = (Tablet)(es.select(2));
		*/
		
		// 위아래 방법 둘다 가능
		
		// 그럼 toString() 할 때 부모에 있는 toString을 불러오지 않을까?
		// 아님 => 왜?? 동적 바인딩!!
		
		Electronic d = es.select(0);
		Electronic n = es.select(1);
		Electronic t = es.select(2);
		
		
		// 이런걸 다운캐스팅 / 강제형변환 이라고 한다.
		
		
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		
		System.out.println(es.select(0));
		/*
		 *  다형성을 사용하는 이유
		 *  1. 부모타입 배열로 다양한 자식객체들을 받을 수 있음
		 *  2. 메소드 정의시 매개변수로 다형성을 적용하게 되면 메소드의 개수가 줄어든다.!!
		 *  3. 필수로 써야하는 곳이 있음 => 추상클래스(인터페이스)
		 */
		
	}

}
