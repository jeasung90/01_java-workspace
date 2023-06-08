package com.kh.chap01_oneVSmany.model.vo;

public class Book {
	
	// 필드부
	// 도서명, 저자, 가격, 출판사
	private String title;
	private String author;
	private int price;
	private String publicher;
	
	// 생성자
	
	// 기본 생성자
	public Book() {}
	
	// 전체 매개변수 생성자
	public Book(String title, String author, int price, String publicher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publicher = publicher;
	}
	
	// 메소드부 
	// getter - setter
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getPublicher() {
		return publicher;
	}
	public void setPublicher(String publicher) {
		this.publicher = publicher;
	}
	
	public String information() {
		return title +", "+author+", "+ price+", "+publicher;
	}
	
	
	
	
	
	
}
