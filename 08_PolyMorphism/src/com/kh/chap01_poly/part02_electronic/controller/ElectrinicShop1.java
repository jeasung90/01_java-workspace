package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

// 다형성 적용 안했을 때!!!
public class ElectrinicShop1 {

	
	// 용산 전자상가에 있는 가게
	// 필드부
	//private int price; // 기본 자료형
	
	// 3개의 제품을 마련할 자리부터 만들자
	private Desktop desk; // 내가 만든 자료형
	private NoteBook note; // 객체 생성은 안되고 텅 비어있음
	private Tablet tab;
	
	
	// 이건 실제로 객체 생성 된 것은 아님
	// 필드가 메모라상에 확보되는 순간 => 객체가 생성되는 순간
	// 이름은 같으나 매개변수만 다르니 오버로딩이다.
	public void a(Desktop d) { // Desktop d = new Desktop(~~~);
		desk =d;
	}
	
	public void insert(NoteBook n) { // NoteBook n = new NoteBook(~~~);
		note=n;
	}
	
	public void insert(Tablet t) { // Tablet y = new Tablet(~~~);
		tab=t;
	}
	
	// 조회용 메소드
	// 모르겠으면 일단 반환형을 void로 가자 => 나중에 수정가능!
	public Desktop selectDesktop() {
		return desk;
	}
	
	public NoteBook selectNoteBook() {
		return note;
	}
	
	public Tablet selectTablet() {
		return tab;
	}
	
	// insert 처럼 select도 같은 이름으로 하면 안되는 이유는 ?
	// 매개변수가 없개 때문에 불가능함!! => 오류남
	
	// 현재는 메소드가 총 6개!!
	// 다형성을 적용하면 2~3개로 줄이기 가능
	
	
	
	
	
	
	
}
