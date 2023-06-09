package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;

		// 3명의 학생 정보를 기록할 수 있게 객체 배열 할당 (Student[])
		Student[] Students = new Student[3];
		// 위의 사용 데이터 참고하여 3명의 학생 정보 초기화
		Students[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		Students[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		Students[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신학과");

		// 위의 학생 정보 모두 출력
		System.out.println(Students[0]);
		System.out.println(Students[1]);
		System.out.println(Students[2]);

		// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당 (Employee[])
		Employee[] El = new Employee[10];
		// 사원들의 정보를 키보드로 계속 입력 받고 → while(true) 무한 반복문을 통해

		while (true) { // 1차 while
			for (int i = 0; i < El.length; i++) { // for문 i

				System.out.print("이름 : ");
				String uName = sc.nextLine();

				System.out.print("나이 : ");
				int uAge = sc.nextInt();
				sc.nextLine();

				System.out.print("신장 : ");
				double uHieght = sc.nextDouble();
				sc.nextLine();

				System.out.print("몸무게 : ");
				double uWieght = sc.nextDouble();
				sc.nextLine();

				System.out.print("급여 : ");
				int uSalary = sc.nextInt();
				sc.nextLine();

				System.out.print("부서 : ");
				String uDept = sc.nextLine();

				El[i] = new Employee(uName, uAge, uHieght, uWieght, uSalary, uDept);
				count++;

				while (true) { // 웨일 2차

					System.out.print("더하실?(y/n) : ");
					char yn = sc.nextLine().charAt(0);


						if (yn == 'Y' || yn == 'y') {
							
							if(count<=9) {
								break;
							}else {
								System.out.println("정원참");
								for (int j = 0; j <= i; j++) {
									System.out.println(El[j]);
									//System.out.println("i" + i);
									//System.out.println("j" + j);
								}
								sc.nextLine();
							}
							
						} else if (yn == 'N' || yn == 'n') {
							System.out.println("종료합니다.");
							for (int j = 0; j <= i; j++) {
								System.out.println(El[j]);
								//System.out.println("i" + i);
								//System.out.println("j" + j);
							}
							sc.nextLine();
							
							
							
						}else {
							System.out.println("잘못입력하셨습니다.");
							continue;

						}
					}

				} // 웨일2차 끝
				break;

			} // for문 i

			// 입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체 배열에 객체 생성
			// 한명씩 추가 될때마다 카운트함
			// 계속 추가할 것인지 물어보고, 대소문자 상관없이 y이면 계속 객체 추가
			// ‘n’일 경우 더 이상 그만 입력 받도록 …
			// 배열에 담긴 사원들의 정보를 모두 출력

		} // while 1차

	}

