package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;

public class ElectrinicShop2 {
	// 자리를 마련하자
	// 다현성 : 보무타입 래퍼런스 하나로 다양한 자식 객체를 담을 수 있음!!
	
	// 부모 : Electronic
	// 자식 : DeskTop, NoteBook, Tablet
	
	// parent[] arr = nwe parent[4];
	// parent 타입 
	// arr[0] = new Child1(1,2,3)
	// arr[1] = new Child2(1,2,3)
	
	// 부모타입 배열로 모든 자식 객체 다루기
	private Electronic[] elec = new Electronic[3];
	private int count = 0;
	// insert 함수 구연
	// 매개변수 => DeskTop, NoteBook, Tablet 전부 다 받을 수 있는 부모 Electrinic
	
	public void insert(Electronic any) {
		elec[count++]=any;
		
		// 맨처음 => count: 0 이었을 경우
		// any = new DeskTop(~,~,~);
		// elec[0] = new DeskTop(~~); 이거 실행 후 count 1로 증가
		
		// 그 다음 => count가 1이었을 경우
		// any = new NoteBook(~~~); 이거 실행 후 count 2로 증가
		// elec[1] = new NoteBook(~~~);
		
		// 그 다음 => count가 2이었을 경우
		// ant = new Tablest(~~~);
		// elec[2] = new Tablest(~~~);
	}
	
	public Electronic select(int index) {
		// DeskTop => elec[0]
		// NoteBook => elec[1]
		// Tablet => elec[2]
		return elec[index];
	}
	
	
	
}
