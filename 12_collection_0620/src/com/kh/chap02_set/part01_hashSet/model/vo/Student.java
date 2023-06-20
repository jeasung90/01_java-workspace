package com.kh.chap02_set.part01_hashSet.model.vo;

import java.util.Objects;

public class Student {
	private String name;
	private int age;
	private int score;

	public Student() {
	}

	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, score);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(name, other.name) && score == other.score;
	}
	
	/*
	@Override
	public int hashCode() { // 모든 필드에 담긴 값이 일치하면 동일항 hashCode를 반환 하도록
		String str = name+age+score; // 하나의 문자열 "한지민42100","숯이2990","아이유3085","한지민42100"
		return str.hashCode();
	}
	
	
	
	@Override
	public boolean equals(Object obj) { // 현재객체와 전달받은 객체의 각 필드값이 모두 일치하면 true, 하나라도 일치하지 않으면 false 반환
		//		this (현객체)		vs		obj (전달받은 객체)
		//		student타입 				Object 타입
		
		Student other = (Student) obj;
		
		//		this (현객체)		vs		obj (전달받은 객체)
		//		this.name		vs		obj.name		일치하는지
		//		this.age		vs		obj.age			일치하는지
		//		this.score		vs		obj.score		일치하는지
		
		//if(this.name.equals(other) && this.age == other.age && this.score == other.score) {
		if(name.equals(other) && age == other.age && score == other.score) {
			return true;
		}else {
			return false;
		}
	*/	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
