package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	
	/* if-else
	 * 
	 * [표현법]
	 * 
	 * if(조건식) { 조건식의 결과가 true였을 때 실행할 코드; 
	 * } else { 조건식의 결과가 true가 아니었을 때 실행할 코드;}
	 * 
	 */
	
	public void method1() {
		
		// 사용자에게 정수를 입력받아서 0보다 큰지 아닌지 판별 후 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 주세요 > ");
		int num = sc.nextInt();
		
		if(num > 0) { // 사용자가 입력한 정수가 0보다 클 경우 이 if블록의 내부로직 수행
			System.out.println("입력값이 0보다 커요");
		} else { // 사용자가 입력한 정수가 0보다 크지 않을 경우 else블럭 내부로직을 수행. if가 끝나는 다음부터 시작을 해야함 java개발자들 사이의 약속
			System.out.println("입력값이 0보다 크지 않아요");
		} // if코드블럭이 끝나면 else는 안 읽고 else 끝으로 가버림. if조건식이 false면 else{ 로 이동해서 수행하고 넘어감.
		// if문의 조건식의 결과가 true일 경우 => else블럭을 건너 뜀.
		// 불필요한 연산 감소 => 처리속도 향
	}
	
	/* if-else if문
	 * 
	 * [표현법]
	 * 
	 * if(조건식1) { 조건식1이 true일 경우 실행할 코드;
	 * } else if(조건식2) { 조건식2가 true일 경우 실행할 코드;
	 * } else if(조건식3) { 조건식3가 true일 경우 실행할 코드;
	 * } else { 앞에서 기술했던 모든 조건이 false인 경우 실행할 코드;
	 * }
	 * 
	 */
	
	public void method2() {
		// 정수를 입력받아서 0보다 커요/ 0이예요/ 0보다 작아요
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 > ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("0보다 커요");
		} else if(num < 0) {
			System.out.println("0보다 작습니다.");
		} else {
			System.out.println("0이다");
		}
	}
	
	public void method3() {
		// 사용자에게 나이를 입력받고, 어린이/ 청소년/ 성인 출력
		// 1-13 : 어린이/ 14-19 : 청소년/ 20- 성인/ 0 - 올바른 나이를 입력해주세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력해주세요 > ");
		int age = sc.nextInt();
		
		/*
		if(age>19) { 
			System.out.println("성인입니다.");
		} else if(age > 13) {
			System.out.println("청소년입니다.");
		} else if(age > 0) {
			System.out.println("어린이입니다.");
		} else {
			System.out.println("올바른 나이를 입력해주세요.");
		}
		*/
		
		if (age <= 0) { // 전체 숫자범위에서 0부터 -21억구천--까지가 가장 많은 범위이므로. 연산을 최대한 적게 하기 위해 얘부터 처리)
			System.out.println("올바른 나이를 입력해주세요.");
		} else if(age >= 20) { //두번째로 범위가 많은 애들을 처리함. 연산을 적게 하기 위해서
			System.out.println("성인");
		} else if(age >= 14) {
			System.out.println("청소년");
		} else {
			System.out.println("어린이");
		} // 내가 다뤄야 하는 값의 범위, + 연산방식, 연산횟수**
		
	}
	

}
