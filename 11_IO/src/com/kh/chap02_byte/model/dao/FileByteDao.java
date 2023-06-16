package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteDao {

	/*
	 * "바이트 기반 스트림" 가지고 데이터 입출력해보기!!
	 * 
	 * - 바이트 스트림 : 데이터를 1바이트 단위로 전송하는 통로(좁은 통로임... 1바이트면 한글 깨짐) - 기반 스트름 : 외부매체와
	 * 직접적으로 연결되는 통로
	 * 
	 * xxxxInputStream : xxx 매채로부터 데이터를 입력받는 통로 (외부 매체로부터 데이터 읽어오겠음!)
	 * xxxxOutputStream : xxx 매체로 데이터를 출력하는 통로 (외부매체로부터 데이터를 출력하겠음!!)
	 * 
	 */
	// 프로그램 (자바 또는 메모리) ---------> 외부매체 (파일) == (출력 : 프로그램상의 데이터를 파일로 내보내기 , 즉 파일로
	// 저장)
	public void fileSave() {

		// FileOutputStream : 파일과 직접적으로 연결해서 1바이트 단위로 출력하는 스트림

		// 1. 스트림 생성 (통로 만들기)
		// 2. 스트림으로 데이터 출력 (메소드 활용)
		// 3. 다 사용한 후 스트림 반납

		FileOutputStream fout = null; // 선언은 try 밖에 선언 후
		try {
			// 1. FileOutputStream 객체 생성 => 해당 파일과의 연결통로 만들어짐
			// fout = new FileOutputStream("a_byte.txt"); // 에러가 날 수 있어서 try문 안에서 해야함
			fout = new FileOutputStream("a_byte.txt", true); // 추가로 계속 이어서 쓰고 싶을때
			fout = new FileOutputStream("a_byte.txt", false); // 기본값이 false라서 안쓴것과 같다

			/*
			 * true 미작성 시 => 헤딩 파일이 존재할 경우 기존의 데이터 덮어 씌어짐(기본값이 false) true 작싱 시 => 해당 파일이
			 * 존재할 겨우 기존의 데이터에 이어서 작성
			 */

			// 2. 파일에 데이터를 출력하고자 할 때 write 메소드 사용
			// 숫자를 출력하든 문자를 출력하든 실상 파일에 기록되는건 문자로 기록됨

			fout.write(97); // 'a'가 저장됨
			fout.write('b'); // 'b'가 저장됨
			// fout.write('헐'); // 한글은 2byte 짜리여서 깨져서 저장됨 => 바이트 스트림으로는 제한이 있음

			// fout.write(byte[] b);
			byte[] arr = { 99, 100, 101 };
			fout.write(arr); // cde 문자 저장

			// fout.write(byte[], int off, int len); : byte 배열의 off 인덱스부터 len개수만큼 출력
			fout.write(arr, 1, 2); // de 문자 저장

			// 3. 스트림 이용했으면 반납하기!(반드시)
			// fout.close(); // 위에서 write()메소드 실행시 OIExeption 발생했을 경우 => catch 블럭 실행 후
			// 빠져나갈꺼임 ( 반납하는 코드 실행안됨!!!)
			// 반드시 실행해야 하는 구문이기 때문에 finally{}에 작성할것임.

		} catch (FileNotFoundException e) { // 경로 못찾을 때
			e.printStackTrace();
		} catch (IOException e) { // write 할떄 나는 에러
			e.printStackTrace();
		} finally { // 이 안에 작성된 코드는 어떤 예외가 발생했던간에 마지막 무조건 실행하고 빠져나갈꺼임
			try {
				// 3. 스트림 이용했으면 반납하기!(반드시)
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// vmfhrmfoa <------- 파일 (입력 : 파일로부터 데이터 가져오기)
	public void fileRead() {

		// FileInputStream : 파일로부터 데이터를 1바이트 단위로 입력받는 스트림

		// 1. 스트림 생성 (통로 만들기)
		// 2. 스트림 통해서 입력 받아옴 (메소드 활용)
		// 3. 스트림 반납

		FileInputStream fin = null;

		try {
			// 1. FileInputStream 객체 생성 => 해당 파일과 연결통로 만들어짐
			fin = new FileInputStream("a_byte.txt");

			// 2. 파일로부터 데이터를 읽어드리고자 할 때 = read 메소드 사용
			// 1byte 단위로 하나씩 읽어옴 / 반환형이 int 여서 숫자로 읽어드림

			// 실제로 파일에 얼마만큼의 데이터가 있는지 모를 경우 => 반복문 활용
			/*
			 * System.out.println(fin.read()); // a System.out.println(fin.read()); // b
			 * System.out.println(fin.read()); // c System.out.println(fin.read()); // d
			 * System.out.println(fin.read()); // e System.out.println(fin.read()); // d
			 * System.out.println(fin.read()); // e System.out.println(fin.read()); // 파일의
			 * 끝을 만나는 순간 -1을 받아오는거 확인
			 */

			/*
			 * 반복문 수행시 매번 read()가 두번씩 실행되기 때문에 퐁당퐁당 읽어들여짐 while(fin.read() != -1) { // 읽어드린
			 * 값이 -1이 아닐 경우에만 반복적으로 실행하도록 System.out.println(fin.read()); }
			 */

			// read() 호출이 반복문 수행시에만 실행되도록
			// ★★ 해결방법 1. 무한반복을 돌리면서 매번 조건검사 하는 방법
			/*
			 * while(true) { int value = fin.read(); if(value == -1) { break; }
			 * System.out.println(value); }
			 */

	// ★★★★ 해결방법 2. 권장방법
			int value = 0;
			while ((value = fin.read()) != -1) {
				System.out.println((char) value);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
