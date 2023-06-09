package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;

public class Run {

	public static void main(String[] args) {

		Car c = new Car("롤스로이스", 6000, "대형 세단", 3);
		
		Ship s = new Ship("원양어선", 3, "호연이가 타고있음", 1);
		
		Airplane a = new Airplane("호연이탄 비행기", 0.01, "죄수호송기", 10, 4);
		
		System.out.println(c.information());
		System.out.println(s.information());
		System.out.println(a.information());
		
		c.howtomove();
		s.howtomove();
		a.howtomove();
		
		
		
	}

}
