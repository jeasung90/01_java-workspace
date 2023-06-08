package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.Book;

public class ObjectRun {

	public static void main(String[] args) {

		// 복습
		// 방법 1. 기본생성자로 생성 한 후 setter 메소드를 이용해서 입력함.
		/*
		Book bk = new Book();
		bk.setTitle("자바의 정석");
		bk.setAuthor("차모땡");
		bk.setPrice(10000);
		bk.setPublicher("kh");
		*/
		
		// 방법 2. 매개변수 생성자를 통해서 생성과 동시에 값을 입력.
		/*
		Book b1 = new Book("열정과 냉정사이","에쿠니 가오리와 츠지 히토나리",25000,"문학관");
		System.out.println(b1.information());
		*/
		
		// [응용] 사용자에게 입력받은 값으로 객체를 생성 후 초기화
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("출판사 : ");
		String publisher = sc.nextLine();
		
		Book bk = new Book(title, author, price, publisher);
		System.out.println(bk.information());
		*/
		
		// 세개의 Book 객체를 관리해야한다면?
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;
		
		// 3권의 도서에 대한 정보를 반복적으로 사용자에게 입력 받기
		// => 입력받은 후 각 객체 생성과 동시에 초기화(값대입)
		
		for(int i = 0; i<3; i++) {
			System.out.println((i+1)+"번째 도서 입력");
			System.out.print("도서명 : ");
			String title = sc.nextLine();
			
			System.out.print("저자명 : ");
			String author = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			if(i==0) {
				bk1 = new Book(title, author, price, publisher);
			}else if(i==1) {
				bk2 = new Book(title, author, price, publisher);
			}else {
				bk3 = new Book(title, author, price, publisher);
			}
		}
		// 객체 생성 끝
		
		// 전체 도서 정보 조회하기 => 일일히 각 객체의 출력문 작성 (반복문 활용x)
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		
		
		
		
		
		
		
		
		
	}
	

}
