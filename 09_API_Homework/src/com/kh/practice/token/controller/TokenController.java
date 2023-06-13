package com.kh.practice.token.controller;

public class TokenController {

	// 띄어쓰기 없앤 문자열
	public String afterToken(String str) {
		return str.replace(" ", "");
	}
	
	// 첫글자만 대문자
	public String firstCap(String input) {
		
		return input.substring(0, 0).toUpperCase()+input.substring(1);
	}
	
	// 문자 몇갠지 반환
	int count =0;
	
	public int findChar(String input, char one) {
	    int count = 0;
	    for (int i = 0; i < input.length(); i++) {
	        if (input.charAt(i) == one) {
	            count++;
	        }
	    }
	    return count;
	}
	
}
