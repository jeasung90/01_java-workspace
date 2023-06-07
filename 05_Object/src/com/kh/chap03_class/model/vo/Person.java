package com.kh.chap03_class.model.vo;

public class Person {
	
	// 필드 선언
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone; // 핸드폰 번호는 int 시 010에 0 이 사라짐 
	private String email;
	
	//	setter 메소드 (7개)
	
	public void setId(String id) {
		this.id=id;
	}
	public void setPwd(String pwd) {
		this.pwd=pwd;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	public void setPhone (String phone) {
		this.phone=phone;
	}
	public void setEmail (String email) {
		this.email=email;
	}
	
	//  getter 메소드 (7개)
	
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	public String information () {
		return name + "님의 ID는 "+id +"이며, PW는 "+pwd+"이고, 인적사항으로는 "+age+"살 "+gender+"이며, 전화번호 : "+phone+", 이메일 : "+email+" 입니다.";
		
	}
	
	
}
