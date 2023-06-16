package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// dao (Data Access Object)
public class FileCharDao {

	/*
	 * "문자 기반 스트림"을 가지고 입출력 해보기
	 * 
	 * - 문자스트림 : 데이터를 2바위트 단위로 전송하는 통로다 (넓은 통로) - 기반스트림 : 외부매체와 직접적으로 연결되는 통로다. (필수)
	 * 
	 * - XXXReader : 입력용 스트림 - XXXWriter : 출력용 스트림
	 */

	// 프로그램 ----------> 파일 (출력)
	public void fileSave() {
		// FileWriter : 파일로 데이터를 2바이트 단위로 출력할 수 있는 스트림

		FileWriter fw = null;

		try {
			// 1. FileWriter 객체 생성
			fw = new FileWriter("b_char.txt"); // 해당 파일이 없으면 새로 만들고 연결, 있으면 그냥 연결
			// 이것도 ,true 로 계속 작성가능

			// 2. Write 메소드를 이용해서 데이터 출력
			// 2byte 단위로 데이터 전송

			fw.write("와! IO 싫다... ㅎ 쀍");
			fw.write(' ');
			fw.write('A');
			fw.write('\n');
			fw.write("집에 가고 싶어요.");

			char[] arr = { 'a', 'p', 'p', 'l', 'e' };
			fw.write(arr);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 3. 스트림 반납!!!
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// 프로그램 <--------- 파일
	public void fileRead() {

		// FileReader : 파일로부터 데이터를 2바이트 단위로 입력받을 수 있는 스트림
		FileReader fr = null;

		try {
			// 1. FileReader 객체 생성
			fr = new FileReader("b_char.txt");

			// 2. read 메소드를 이용해서 읽어드리자 (정수값)
			// 파일의 끝을 만나는 순간 -1 출력

			int value = 0;
			while ((value = fr.read()) != -1) {
				System.out.print((char) value);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 3. 스트림 반납!!
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
