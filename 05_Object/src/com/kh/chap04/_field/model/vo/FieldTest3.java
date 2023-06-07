package com.kh.chap04._field.model.vo;

// 클래스 변수 (static 변수), 상수 필드에 대하여 알아보기
public class FieldTest3 {
	
	// static은 공유의 개념
	// static이 붙은 애들은 프로그램 실행(F11)과 동시에 메모리 static 영역에 올라감
	// 프로그램 실행과 동시에 메모리상에 한번 올려놓고 여기저기서 가져다 쓰는 개념
	// public이랑 같이 쓰자!!
	
	public static String sta = "static_FieldTest3";
	
	// static : 공유의 개념 
	// final : 상수의 개념(한번 지정된 값 변경 불가)
	
	// 상수필드 (static final) : 프로그램 시작(F11)시 값 저장되면 더이상 변경되지 않고 
	// 														공유하면서 사용할 목적
	public static final String STA_FIN = "static final";
	
	
}
