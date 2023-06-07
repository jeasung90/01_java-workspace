package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class constructorRun {

	public static void main(String[] args) {
		// 1. 기본생성자로 객체를 생성
		User u1 = new User();
		
		System.out.println(u1.information());
		// 각 필드에 JVM 초기값들 담겨 있음!!
		
		// 회원가입시 필수 입력사항만 입력 받는다면?
		/*
		User u2 = new User();
		u2.setUserId("user007");
		u2.setUserPwd("pwd00700");
		u2.setUserName("제임스본드");
		System.out.println(u2.information());
		*/
		
		// 2. 매개변수 3개짜리 생성자로 객체 생성 후 정보 출력
		User u2 = new User("user007","user00700","제임스본드");
		System.out.println(u2.information());
		
		// 그럼 setter 안만들어도 되지 않을까... => 안됨
		// 비번을 바꾸는 경우, 개명을 하는 경우
		u2.setUserName("차우뉴");
		System.out.println(u2.information());
		
		
		// getter는?... 없어도.. 안됨!
		// 비번을 잊어버린 경우 비번만 보여줘야함 그때 getter 필요
		
		// 3. 매개변수 5개짜리 생성자로 객체 생성
		// "user03" "pwd03" "장원영" "23" '여'
		// information() 출력
		
		User u3 = new User("user03","pwd03", "장원영",23,'여');
		System.out.println(u3.information());
		
		
		
		
		
	}

}
