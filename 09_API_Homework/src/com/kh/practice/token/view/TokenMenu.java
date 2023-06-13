package com.kh.practice.token.view;

import java.util.Scanner;

public class TokenMenu {
	Scanner sc = new Scanner(System.in);

	while (true) {
        System.out.println("1. 지정 문자열");
        System.out.println("2. 입력 문자열");
        System.out.println("9. 프로그램 끝내기");
        int num = sc.nextInt();
        sc.nextLine();
        switch (num) {
        case 1:
           tokenMenu();
        case 2:
           inputMenu();
        case 9:
           System.out.println("프로그램을 종료합니다");
           break;
        default:
           System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
        }
     }
}
