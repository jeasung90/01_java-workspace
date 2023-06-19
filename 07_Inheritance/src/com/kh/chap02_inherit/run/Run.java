package com.kh.chap02_inherit.run;

import java.util.ArrayList;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;
import com.kh.chap02_inherit.model.vo.vehicle;

public class Run /*extends Object*/ {

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
		
		System.out.println("===================================================");
		
		ArrayList<vehicle> list = new ArrayList<>();
		
		list.add(new Car("밴틀리", 12.5, "세단", 4));
		list.add(new Ship("오징어잡이배", 3, "어선", 1));
		list.add(new Airplane("농약살포기", 0.01, "농업용비행기", 10, 1));
		
		for(int i=0;i<list.size(); i++) {
			System.out.println(list.get(i).information()); //동적바인딩 
		}
		
		System.out.println("======================================");
		
		
		
		
		
		
		
		
		
		/*
		 *  ● 상속의 장점
		 * - 보다 적은 양의 코드로 새로운 클래서 작성가능
		 * - 코드를 공통적으로 관리하기 때문에 추가나 변경에 용이 (유지보수, 생산성 up)
		 * 
		 *  ● 상속의 특징
		 * - 클래스간의 상속에 있어서는 다중상속이 안된다!! (단일 상속만 가능 즉, 부모는 하나다)
		 * - 자식 객체는 부모 클래스에 있는 메소드를 마치 내것처럼 호출 가능
		 * 		+ 부모클래스에 있는 메소드가 맘에 안들면 자식 클래스에서 오버라이딩 가능하다.(내 입맛대로 재정의 가능)
		 * - 부모클래스에 정의돼잇는 protected 필드는 자식클래스에서 직접 접근 가능하다.
		 * - 명시되어있지는 않지만 모든 클래스(제공하는 클래스, 직접만든 클래스)는 Object 클래스의 후손이다.
		 * 	=> 즉, Object 클래스에 있는 메소드들 마음대로 호출 가능!
		 * 	=> 뿐만 아니라 오버라이딩을 통해 재정의도 가능함!!
		 */
		
		System.out.println(c.hashCode());
		System.out.println(c.equals(s)); // 그럼 부모가 2명인가요?
		System.out.println(c/*.toString()*/);
		System.out.println(c.toString()); // 위와 같다
		System.out.println(c);
		
		/*
		 *  car(해당 클래스에가서) 
		 *  toString 이라는 메소드를 만들면 'c'만 출력해도 나옴
		 *  이거도 오버라이딩임.!!
		 */
		
	}

}
