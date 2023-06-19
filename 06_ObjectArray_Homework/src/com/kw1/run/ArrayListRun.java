package com.kw1.run;

import java.util.ArrayList;

import com.kw1.model.vo.Employee;

public class ArrayListRun {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<>();
		int total =0;
		
		list.add(new Employee());
		list.add(new Employee(1, "홍길동", null, null, 19, 'm', 0, 0.0, "01022223333", "서울 잠실"));
		list.add(new Employee(2, "강말순", "교육부", "강사", 20, 'f', 1000000, 0.01, "01011112222", "서울 마곡"));
		
		System.out.println("list[0] : "+list.get(0).information());
		System.out.println("list[1] : "+list.get(1).information());
		System.out.println("list[2] : "+list.get(2).information());
		System.out.println("===================================================");
		
		list.set(0, new Employee(0, "김말똥", "영업부", "팀장", 30, 'm', 3000000, 0.2, "01055559999", "전라도 광주"));
		list.set(1, new Employee(1, "홍길동", "기획부", "부장", 19, 'm', 4000000, 0.3, "01022223333", "서울 잠실"));
		System.out.println("list[0] : "+list.get(0).information());
		System.out.println("list[1] : "+list.get(1).information());
		System.out.println("============================"
				+ "=======================");
		
		System.out.println(list.get(0).information2());
		System.out.println(list.get(1).information2());
		System.out.println(
				list.get(2).information2());
		System.out.println("============================"
				+ "=======================");
		
		for(Employee s : list) {
			total+=((s.getSalary()+(s.getSalary()*s.getBonusPoint()))*12);
		}
		
		System.out.println("직원들의 연봉의 평균 : "+(total/list.size()));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
