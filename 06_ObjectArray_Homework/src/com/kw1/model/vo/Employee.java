package com.kw1.model.vo;

public class Employee {
	
	private int enpNo;
	private String enpName;
	private String dept;
	private String jop;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	
	public Employee() {}
	
	public Employee(int enpNo,String enpName,String dept,String jop,int age,char gender, int salary,double bonusPoint,String phone,String address) {
		this.enpNo = enpNo;
		this.enpName = enpName;
		this.dept=dept;
		this.jop=jop;
		this.age = age;
		this.gender=gender;
		this.salary= salary;
		this.bonusPoint=bonusPoint;
		this.phone=phone;
		this.address=address;
	}
	
	public int getEnpNo() {
		return enpNo;
	}
	public void setEnpNo(int enpNo) {
		this.enpNo = enpNo;
	}
	
	
	public String getEnpName() {
		return enpName;
	}
	public void setEnpName(String enpName) {
		this.enpName=enpName;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept=dept;
	}
	
	public String getJop() {
		return jop;
	}
	public void setJop(String jop) {
		this.jop=jop;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public double getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint=bonusPoint;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	
	double test = (salary+(salary*bonusPoint)*12);
	
	public String information2() {
		return enpName+"의 연봉 : "+ (int)(salary+(salary*bonusPoint))*12+"원";
	}
	public String information() {
		return enpNo+", "+enpName+", "+dept+", "+jop+", "+age+", "+gender+", "+salary+", "+bonusPoint+", "+phone+", "+address;
	}
	
	
	
	
	
}
