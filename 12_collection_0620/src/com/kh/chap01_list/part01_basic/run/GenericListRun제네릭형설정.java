package com.kh.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_basic.model.vo.Music;

public class GenericListRun제네릭형설정 {

	public static void main(String[] args) {
		
		// <Music>형으로 제네릭 설정함 = 다른 객체는 못들어옴
		// 출력이나 뭘할때 형변환 없이 진행하기 위해서 이거 안하면 출력이든 뭐 할때마다 (Music)으로 변환 해줘야함
		ArrayList<Music> list = new ArrayList<Music>();
		
		list.add(new Music("Auttention", "뉴진스"));
		list.add(new Music("새삥", "지코"));
		// list.add("가자"); Music형이 아니기 떄문에 더이상 담을 수 없음
		
		System.out.println(list);
		
		list.add(1, new Music("진심이 담긴 노래", "케이시"));
		
		List<Music> sub =list.subList(0, 2);
		
		list.addAll(sub);
		
		Music m = list.get(0);
		System.out.println(m);
		
		System.out.println(list.get(0).getArtist());
		
		for(Music o : list) { // o = list.get(0) => o = list.get(1)
			System.out.println(o.getTitle());
		}
		
		/*
		 *  ● 제네릭<>을 사용하는 이유
		 * 1. 명시된 타입의 객체만 저장하도록 제안을 둘 수 있음
		 * 2. 컬렉션에 저장된 객체를 꺼내서 사용할 때 매번 형변환 하는 절차를 없애기 위해
		 */
	}

}
