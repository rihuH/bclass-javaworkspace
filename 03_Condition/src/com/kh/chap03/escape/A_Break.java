package com.kh.chap03.escape;

import java.util.Scanner;

public class A_Break {
	
	/* ** 주의사항 : switch문 내부에 작성하는 break문과는 구분해야함!
	 * 			   -> 얘는 해당 switch문을 빠져나가는 용도로 사용
	 * 
	 * break : break문을 만나는 순간 "가장 가까운 반복문"을 빠져나감
	 * 			해당 break; 문이 속해있는 반복문 "한 겹"만 빠져나감!
	 * 
	 */
	
	public void method1() {
		
		// 매 번 반복을 수행해서 새롭게 랜점한 정수(1-100)를 생성해서 출력
		
		while(true) {
			int num = (int)(Math.random() * 100) + 1;
			
			System.out.println(num);
			
			// 반복을 하다가 정수값이 55라면 반복을 중단!
			if(num == 55) {
				break;
			}
		}
	}
	
	public void method2() {
		// 사용자에게 반복을 하면서 매 번 문자열을 입력받은 후
		// 해당 문자열의 길이를 출력
		// 단, 사용자가 입력한 문자열이 "exit"과 같다면 반복을 종료.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("문자를 입력 (종료를 원하신다면 'exit'을 입력해주세요) > ");
		String keyword = sc.nextLine();
		
		System.out.println(keyword.length());
		
		if(keyword.equals("exit")) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		}
	}
	
	// 매 번 사용자에게 정수값을 입력받고
	// 만약 입력한 숫자가 0보다 작다면 "프로그램 종료합니다" 문구 출력하고 종료
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력해주세요 (종료하려면 음수 입력) > ");
			int num = sc.nextInt();
			
			if(num < 0) { 
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println("입력한 정수 : " + num);
			
		}
	}
	
	// 사용자로부터 한 개의 정수값을 입력받아서
	// 입력받은 숫자부터 1까지의 모든 숫자를 출력해주세요.
	// 단, 입력받는 정수는 1보다 커야 합니다.
	// 만약 1 미만 숫자 입력시 1 이상의 숫자를 입력해주세요
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		
		while(true) {
			System.out.println("1 이상의 정수를 입력하세요  > ");
			num = sc.nextInt();
				if(num <= 0) {
					System.out.println("1이상의 숫자를 입력해주세요");
					
				}
				else{
					for(; num > 0; num--) {
					System.out.print(num + " ");
				}
				System.out.println();
				}
			
			}
	}

}
