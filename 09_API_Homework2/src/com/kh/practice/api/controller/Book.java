package com.kh.practice.api.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.xml.crypto.Data;

public class Book {

	private String title;
	private String author;
	private String publisher;
	private Date publishDate;
	private int price;

	public Book() {
	}

	public Book(String title, String author, String publisher, Date publishDate, int price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publishDate = publishDate;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher=publisher;
	}
	
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate=publishDate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	
	
	

	@Override
	public String toString() {
		// 출판일(Date publishDate) 형식을 SimpleDateFormat을 이용하여 "0000 년 00월 00일" 형태의 문자열
		// 형식으로 만들어 하단의 주석에 반영시키시오
		// 포맷을 지정한 SimpleDateFormat 객체 생성
		 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy 년 MM월 dd일");
		    String str = dateFormat.format(publishDate);
		    
		    return str;
		// publishDate (Date타입) --- 포맷적용한 ---> str (String)
	}
}
