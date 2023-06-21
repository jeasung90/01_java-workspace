package com.kh.library.controller;

import java.util.ArrayList;

import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

//BookManager 인터페이스 구현
public class BookController implements BookManager {
	ArrayList<Book> list = new ArrayList<>();

	@Override
	public void addBook(Book nBook) {
		list.add(nBook);
	}

	@Override // 정보 입력
	public ArrayList<Book> getAllBook() {

		return list;
	}

	@Override // bNo로 같은거 찾기
	public Book searchBookBybNo(String bNo) {
		Book list2 = null;

		for (Book b : list) {
			if (b.getbNo().equals(bNo)) {
				list2 = b;
			}
		}
		return list2;
	}

	@Override // 책 이름을 ㅗ찾기
	public ArrayList<Book> searchBookByTitle(String title) {
		ArrayList<Book> titlsea = new ArrayList<Book>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().contains(title)) {
				titlsea.add(list.get(i));
			}
		}
		return titlsea;
	}

	@Override // 책만 넣어서 반환
	public ArrayList<Book> onlySearchBook() {
		ArrayList<Book> onlyBook = new ArrayList<Book>();
		for (Book b : list) {
			if (b instanceof Magazine) {

			} else {
				onlyBook.add(b);
			}
		}
		return onlyBook;
	}

	@Override // 매거진만 반환
	public ArrayList<Book> onlySearchMagazine() {
		ArrayList<Book> onlyMagazine = new ArrayList<Book>();
		for (Book b : list) {
			if (b instanceof Magazine) {
				onlyMagazine.add(b);
			} else {
			}
		}
		return onlyMagazine;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		ArrayList<Book> yearL = new ArrayList<Book>();

		for(int i=0; i<list.size(); i++) {
			if(list.get(i)instanceof Magazine) {
				if(((Magazine)list.get(i)).getYear()==year) {
					yearL.add(list.get(i));
			}
			}
		}
		return yearL;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher1) {
		ArrayList<Book> publ = new ArrayList<Book>();
		for(Book b : list) {
			if(b.getPublisher().equals(publisher1)) {
				publ.add(b);
			}
		}
		return publ;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		return null;
	}

	@Override
	public int getTotalPrice() {
		return 0;
	}

	@Override
	public int getAvgPrice() {
		return 0;
	}

}
