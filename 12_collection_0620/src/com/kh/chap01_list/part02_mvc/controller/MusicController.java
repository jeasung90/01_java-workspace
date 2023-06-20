package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

// 사용자의 요청을 처리해주는 클래스!! 출력문 쓰지 않기!!!
public class MusicController {

	private ArrayList<Music> list = new ArrayList<>();
	{
		// 최기화 블럭
		list.add(new Music("Attention", "뉴진스"));
		list.add(new Music("소녀", "이문세"));
		list.add(new Music("희재", "성시경"));
		list.add(new Music("나이", "윤종신"));
		list.add(new Music("혜성", "윤하"));
	}

	// 보내줄때 같이 보낸 자료 받아줘야 함
	public ArrayList<Music> insertMusic(String title, String artist) {

		list.add(new Music(title, artist));
		return list;

	}

	public ArrayList<Music> selectMusic() {
		// 돌려준다 => return
		return list;
	}

	public Music deleteMusic(String title) {
		int result = 0;
		Music dInfo = null;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				dInfo = list.remove(i);
				result = 1;
				break; // 반복문 빠져 나오기
			}
		}
		return dInfo;
	}

	public ArrayList<Music> searchMusic(int menu, String keyword) {
		ArrayList<Music> searchList = new ArrayList<Music>();

		if (menu == 1) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getTitle().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		} else if (menu == 2) {
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getArtist().contains(keyword)) {
						searchList.add(list.get(i));
					}
				}
		} else {  
		}
		return searchList;

		/*
		 * ArrayList<Music> searchList = new ArrayList<Music>();
		 * 
		 * for(int i=0;i<list.size();i++) { if(list.get(i).getTitle().contains(title)) {
		 * searchList.add(list.get(i)); } // searchList => 텅텅 or 검색된 Music객체들이 담겨있을수도..
		 * } return searchList;
		 */
	}

	public Music updateMusic(String title,String fixTitle,String fixArtist ) {
		Music fixMusic = null;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				
				list.set(i, new Music(fixTitle, fixArtist));
				fixMusic = list.get(i);
				break;
			}
		}
		return fixMusic;
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
