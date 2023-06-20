package com.kh.chap01_list.part02_mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part02_mvc.controller.MusicController;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

// 화면을 담당하는 클래스 (출력문, 입력문)
public class MusicMenu {
	
	private MusicController mc = new MusicController();
	private Scanner sc = new Scanner(System.in);
	
	
	
	/**
	 * @author yjs
	 * @since 2023.06.20
	 * @version java11
	 * 
	 */
	// 메인화면 : 프로그램 실행시 처음 보여주는 화면
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("\n============ Welcome 이문세의 별밤 =============");
			System.out.println("1. 새로운 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정 곡 삭제");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 수정");
			System.out.println("0. 프로그램 종료");
			System.out.print(">> 메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 :
				insertMusic();
				break;
				
			case 2 :
				selectMusic();
				break;
				
			case 3 :
				deleteMusic();
				break;
				
			case 4 :
				searchMusic();
				break;
				
			case 5 :
				updateMusic();
				break;
				
			case 0 :
				System.out.println("프로그램을 종료합니다.");
				System.out.println("이용해주셔서 감사합니다.");
				System.out.println("잘자요~");
				return; // 이 메소드를 호출했던 곳으로 나감
			default:
				System.out.println("잘못입력 하셨습니다.");
				System.out.println("다시 선택해 주세요.");
				break;
			}
		}
	}
	// alt + shift + j
	/**
	 * 1. 새로운 곡 추가하는 서브화면 
	 */
	public void insertMusic() {
		System.out.println("\n=========새로운 곡 추가=========");
		System.out.print("제목 입력 : ");
		String title = sc.nextLine();
		System.out.print("가수 입력 : ");
		String artist = sc.nextLine();
		
		// 추가 요청 보내기 (사용자의 요청 처리해주는 컨트롤러단에!)
		// 사용자가 입력한 곡명, 가수명 같이 넘기면서!!!
		// 즉, controller 메소드 호출
		
		//mc.insertMusic(title, artist);
		int count =5;
		System.out.println("성공적으로 곡이 추가되었습니다.");
		ArrayList<Music> list = mc.insertMusic(title, artist);
		System.out.println(list.get(count++));
		
		
	}
	
	/**
	 * 2. 전체 곡 조회용 서브화면
	 */
	public void selectMusic() {
		System.out.println("\n=========전체 곡 리스트=========");
		mc.selectMusic();
		ArrayList<Music> list = mc.selectMusic();
		/* 리스트가 비어있을때는 안돔
		for(Music m : list) {
			System.out.println(m);
		}
		*/
		if(list.isEmpty()) {// 현재 리스트가 비어있을 경우
			System.out.println("현재 존재하는 곡이 없습니다.");
		}else { // 그게 아니고 하나라도 있는 경우
			for(Music m : list) {
				System.out.println(m);
			}
		}
	}
	
	/**
	 * 3. 특정 곡 삭제하는 서브화면
	 */
	public void deleteMusic() {
		System.out.println("\n=========특정 곡 삭제=========");
		System.out.print("삭제하실 곡의 제목 : ");
		String title = sc.nextLine();
		
		//int result = mc.deleteMusic(title);
		Music dInfo = mc.deleteMusic(title);
		if(dInfo==null) {
			System.out.println("삭제된 곡은 없습니다.");
		}else {
			System.out.println("정상적으로 곡이 삭제되었습니다.");
			System.out.println("삭제된 곡의 정보 : "+dInfo);
		}
		/*
		if(result==1) {
			System.out.println("성공적으로 삭제되었습니다.");
			// 삭제된 곡에 대한 정보도 출력하고 싶어요
		}else {
			System.out.println("삭제되지 않았습니다.");
		}
		*/
	}
	
	/**
	 * 4. 특정 곡 검색해주는 서브화면
	 */
	public void searchMusic() {
		System.out.println("\n=========특정 곡 검색=========");
		/*
		System.out.print("검색하실 곡의 제목(키워드 가능) : ");
		String title = sc.nextLine();
		
		ArrayList<Music> searchList = mc.searchMusic(title);
		*/
		System.out.println("1) 제목으로 검색");
		System.out.println("2) 가수명으로 검색");
		System.out.print(">> 매뉴 선택 : ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		System.out.print("검색 키워드 : ");
		String keyword = sc.nextLine();
		
		ArrayList<Music> searchList = mc.searchMusic(menu,keyword);
		
		
		if(searchList.isEmpty()) { // 텅 비어있을 경우
			System.out.println("검색 결과가 없습니다.");
		}else {
			System.out.println("\n=========검색 결과=========");
			for(Music m : searchList) {
				System.out.println(m);
			}
		}
		
		
		
	}
	
	/**
	 * 5. 특정 곡 수정해주는 서브화면
	 */
	public void updateMusic() {
		System.out.println("\n=========특정 곡 수정=========");
		System.out.print("수정하시려는 곡의 제목 : ");
		String title = sc.nextLine();
		System.out.print("수정할 제목 : ");
		String fixTitle	= sc.nextLine();
		System.out.print("수정할 가수 : ");
		String fixArtist = sc.nextLine();
		
		Music fixMusic =mc.updateMusic(title,fixTitle,fixArtist);
		
		if(fixMusic==null) {
			System.out.println("검색 결과가 없어 수정하지 못 하였습니다.");
		}else {
			System.out.println("성공적으로 수정하였습니다.");
			System.out.println("수정된 곡의 정보 : ");
			System.out.println(fixMusic);
		}
		
	}
	
	
	
	
	
	
	
	
	
}
