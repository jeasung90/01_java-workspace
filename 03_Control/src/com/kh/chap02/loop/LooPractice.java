package com.kh.chap02.loop;

import java.util.Scanner;

public class LooPractice {

	public void practice1() {

		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num >= 1) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1이상의 숫자를 입력해 주세요");
		}

	}

	public void practice2() {

		while (true) {
			Scanner sc = new Scanner(System.in);

			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num >= 1) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;
			}

		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num >= 1) {
			for (int i = 0; i <= (num - 1); i++) {
				System.out.print((num - i) + " ");
			}
		} else {
			System.out.println("1이상의 숫자를 입력해 주세요");
		}
	}

	public void practice4() {
		while (true) {
			Scanner sc = new Scanner(System.in);

			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num >= 1) {
				for (int i = 1; i <= num; i++) {
					System.out.print((num - i) + " ");
				}
				break;
			}

		}

	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 하나 입력하세요. : ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
			System.out.print(i);
			if (i < num) {
				System.out.print(" + ");
			}

		}
		System.out.println(" = " + sum);
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번쨰 숫자 : ");
		int num = sc.nextInt();

		System.out.print("두 번쨰 숫자 : ");
		int num1 = sc.nextInt();

		if (num >= 1 && num1 >= 1) {

			if (num > num1) {
				for (int i = num1; i <= num; i++) {
					System.out.print(i + " ");
				}

			} else if (num < num1) {

				for (int j = num; j <= num1; j++) {
					System.out.print(j + " ");
				}
			} else {

			}

		} else {
			System.out.println("1이상의 숫자를 입력해 주세요");

		}

	}

	public void practice7() {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("첫 번쨰 숫자 : ");
			int num = sc.nextInt();
			System.out.print("두 번쨰 숫자 : ");
			int num1 = sc.nextInt();

			if (num >= 1) {
				if (num > num1) {

					for (int i = num1; i <= num; i++) {
						System.out.print(i + " ");
					}
				} else if (num < num1) {
					for (int j = num; j <= num1; j++) {
						System.out.print(j + " ");

					}
				} else {
				}
				break;
			} else {
				System.out.println("1이상의 숫자를 입력해 주세요");

			}
		}

	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		if (dan >= 2 && dan <= 9) {
			System.out.printf("==== %d단 ====\n", dan);
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
			}

		}

	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int minDan = sc.nextInt();

		System.out.print("숫자 : ");
		int maxDan = sc.nextInt();

		for (int o = minDan; o <= maxDan; o++) {

			if (minDan >= 2 && minDan <= 9) {
				System.out.printf("==== %d단 ===\n", minDan);
				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d X %d = %d\n", minDan, i, minDan * i);
				}
				minDan++;

			} else {
				System.out.println("9 이하의 숫자만 입력해주세요.");
			}
		}

	}

	public void practice10() {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자 : ");
			int minDan = sc.nextInt();

			System.out.print("숫자 : ");
			int maxDan = sc.nextInt();

			for (int o = minDan; o <= maxDan; o++) {

				if (minDan >= 2 && minDan <= 9) {
					System.out.printf("==== %d단 ===\n", minDan);
					for (int i = 1; i <= 9; i++) {
						System.out.printf("%d X %d = %d\n", minDan, i, minDan * i);
					}
					minDan++;

				} else {
					System.out.println("9 이하의 숫자만 입력해주세요.");
				}
				break;
			}
		}
	}

	public void practice11() {

		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int n1 = sc.nextInt();

		System.out.print("공차 : ");
		int n2 = sc.nextInt();
		for (int i = 1; i <= 10; i++) {

			System.out.print(n1 + " ");
			n1 += n2;
		}
	}

	public void practice12() {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("연산자(+, -, *, /, %) : ");
			String st = sc.nextLine();

			if (st.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			System.out.print("정수 1 : ");
			int a = sc.nextInt();
			System.out.print("정수 2 : ");
			int b = sc.nextInt();

			// exit : 프로그램종료 (들어올때까지 무제한)
			// 연산자 없는 연산자입니다.
			// 나누기 인데 0 이면 "0으로 나눌 수 없습니다. 다시 입력해주세요"

			switch (st) {
			case "+":
				System.out.printf("%d + %d = %d\n", a, b, (a + b));
				break;
			case "-":
				System.out.printf("%d - %d = %d\n", a, b, (a - b));
				break;
			case "*":
				System.out.printf("%d * %d = %d\n", a, b, (a * b));
				break;
			case "/":
				if (a > 0 && b > 0) {
					System.out.printf("%d / %d = %d\n", a, b, (a / b));
					break;
				}
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
				break;
			case "%":
				System.out.printf("%d % %d = %d\n", a, b, (a % b));
				break;

			}
			System.out.println("없는 연산자입니다. 다시 입력해주세요");
			sc.nextLine();
		}

	}

	public void practice13() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int j = 1; j <= num; j++) {

			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

	public void practice14() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		// num = 10
		for (int j = 1; j <= num; j++) {

			for (int i = j; i <= num; i++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}
}
