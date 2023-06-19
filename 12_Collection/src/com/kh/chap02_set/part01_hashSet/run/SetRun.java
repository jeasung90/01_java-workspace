package com.kh.chap02_set.part01_hashSet.run;

import java.util.HashSet;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class SetRun {
	public static void main(String[] args) {

		// Object equals() 		=> 두 객체의 "주소값"을 비교해서 일치하면 true / 일치하지 않으면 false를 반환
		// Object hashCode()	=> 해당 객체의 "주소값"을 가지고 10진수 형태로 만들어서 반환
		
		// String equals()		=> "실제 담긴 문자열"을 가지고 비교해서 일치하면 true / 일치하지 않으면 false를 반환
		// String hashCode() 	=> "실제 담긴 문자열"을 가지고 10진수의 형태로 만들어서 반환
		
		
		
		
		
		
		
		HashSet<String> hs1 = new HashSet<>();
		
		hs1.add("방갑습네다");
		hs1.add(new String("방갑습네다"));
		hs1.add(new String("여러분"));
		hs1.add(new String("안녕하십네까"));
		hs1.add(new String("여러분"));
		
		System.out.println(hs1); // 저장 순서 유지 안됨!! (인덱스 개념 없음), 중복된 데이터(동일객체) 보관 불가능 
		
		
		
		HashSet<Student> hs2 = new HashSet<>();
		
		// 존예월드 3명이 산다고 가정하자
		hs2.add(new Student("한지민", 42, 100));
		hs2.add(new Student("숯이", 29, 90));
		hs2.add(new Student("아이유", 30, 85));
		hs2.add(new Student("한지민", 42, 100));
		
		System.out.println(hs2); // 저장순서 유지 안됨!!(인덱스의 개념 없음) / 중복 제거 안됨 => 동일객체로 판단이 안되고 있어서 
		
		// HashSet 이라는 공간에 객체가 추가 될 때마다 동일 객체인지 비교!!
		// 동일 객체 : 각 객체마다 hachCode() 호출결과가 일치하고, equals() 비교시 true 일 경우 동일 객체로 판단함
		
		// Student equals() 오버라이딩		=> "실제 각 필드에 담긴 데이터"들이 전부 일치하면 true / 하나라도 일치하지 않으면 false
		// Student hashCode() 오버라이딩 	=> "실제 각 필드에 담긴 데이터"들이 전부 일치하면 동일한 10진수 반환 
		
		System.out.println(new Student("한지민", 42, 100).hashCode());
		System.out.println(new Student("한지민", 42, 100).hashCode());
		// 재정의 한 hashCode() 메소드에 의해 둘 다 결과 똑같음
		
		System.out.println(new Student("한지민", 42, 100).equals(new Student("한지민", 42, 100)));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
