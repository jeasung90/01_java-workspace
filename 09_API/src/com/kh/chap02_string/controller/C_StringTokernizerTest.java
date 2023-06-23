package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokernizerTest {

	public void method() {
		String str = "java,Oracle,JDBC,HTML,CSS,Spring";
		
		// 구분자를 기준으로 문자열을 불리시키는 방법
		
		// 방법1. 분리된 문자열들을 String[] 배열에 차곡차곡 담고자 할 때
		//			String 클레스에서 제공하는 split 메소드 이용
		//			문자열.split(구분자) : String[]
		
		String[] arr = str.split(","); // 구분자로 문자 분리
		System.out.println("arr 배열의 길이 : "+ arr.length);
		
		/* 기존 for문
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"번째 인덱스 : "+arr[i]);
		}
		*/
		
		// 향상된 for문
		int count =0;
		for(String a:arr) {
			System.out.println(count + "번째 인덱스 : "+a);
			count++;
		}
		
		// 방법2. 분리된 문자열을 각각 토큰으로써 관리하고자 할 때
		//			java.util.StringTokenizer 클래스 이용하는 방법
		
		//			StringTokenizer stn = new StringTokenizer(분리시키고자 하는 문자열, 구분자);
		
		StringTokenizer stn = new StringTokenizer(str,",");
		System.out.println("분리된 문자열의 개수 : "+stn.countTokens());
		/*
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken()); 
		System.out.println(stn.nextToken()); // 다 뽑으면 끝남.. 일회성
		*/
		/*
		for(int i=0;i<stn.countTokens();i++) {
			System.out.println(stn.nextToken());
		}
		
		// i=0 i<6 true 출력("java") i++
		// i=1 i<5 true 출력("Oracle") i++
		// i=2 i<4 true
		// i=3 i<3 false 출력안함
		/*/
		
		// 해결방법 1
		/*
		int count1 = stn.countTokens();
		
		for(int i=0;i<count1;i++) {
			System.out.println(stn.nextToken());
		}
		*/
		
		// 해결방법 2 .hasMoreTokens() : 남은게 있으면 truem/ 없으면 false
		while(stn.hasMoreTokens()) { // 반복 수행될 조건 : 토큰 남았을때
			System.out.println(stn.nextToken());
		}
		
		
	}
	
	
	
	
}
