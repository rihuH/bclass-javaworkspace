package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {

	// for 
	
	public void method0() {
		
		//출력 문구
		System.out.println("여러분 추석 잘 보내세요🐱‍🚀");;
		
//		for(;;) { // 이렇게 초기 조건 증감식이 아무것도 없으면 무한정 돈다
//			System.out.println("여러분 추석 잘 보내세요~");
//		}
		
		for(int i = 1; // 초기식 : 초기화 할 때 그 초기. 반복문 시작할 때 처음 딱 한 번 초기화.
			i < 5; // 조건식
			i++){ 
			
		}// 증감식
	}
	
	/* for 문
	 * 
	 * for() {
	 * }
	 * 
	 * 괄호안은 반복의 횟수를 지정하는 부분
	 * 초기식; 조건식; 증감식		세 가지로 이루어진다.
	 * ;; 세미콜론으로 구분함
	 * 
	 * [표현법]
	 * for(초기식; 조건식; 증감식){
	 * 		반복적으로 실행하고자 하는 코드;
	 * }
	 * 
	 *  - 초기식 : 반복문을 시작할 때 "초기에 단 한번만 실행"될 구문
	 *  	반복문을 사용할 때 필요한 변수를 선언하고 초기화하는 구문 => int i = 0;
	 *  - 조건식 : "반복문이 실행될 조건"을 작성하는 구문
	 *  		조건식의 결과값이 true일 경우 반복을 수행
	 *  		조건식의 결과값이 false일 경우 반복문을 멈추고 for문 블럭을 빠져나옴 => i < 10;
	 *  
	 *  - 증감식 : "반복문을 제어하는 변수에 대입된 값"을 증감하는 구문
	 *  		보통 초기식에서 선언된 변수를 가지고 증감식 작성
	 *  		이 때, 보편적으로 증감연산자를 사용함 => i++ // ++i, i++ 차이 없는데 둘 다 성능차이 없어서 편하게 i++ 씀
	 *  
	 */
	
	public void method1() {
		//1
		//2
		//3
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
		/*
		for(int i = 1; i <= 3; i++) {
			System.out.println(i);
		}
		*/
		
		// 제어변수를 1부터 시작해서 5와 같아질 때까지 반복
		for(/*1*/int i = 1; /*2*/i <= 5; /*4*/i++) {
			/*3*/System.out.println(i + "번 반복");
		}// 실질적으로 세미콜론 4개(증감식에는 ; 생략된형태)
		/* 어떤 순서로 도는가?
		 * for문에 도달하면 제일 먼저 초기식 -> int i 공간 할당. 오른쪽 초기값 정수형 1리터럴. 대입
		 * 초기식 끝나면 조건식으로 넘어감.
		 * 조건이 true면 블록 안으로 들어감 명령문 수행
		 * 끝나면 증감식으로 
		 * 증감식 끝나면 다시 조건식으로. 초기식은 맨 처음 한 번 수행하면 그 다음 안함.
		 * 계속 순환하다가 조건식 false가 되면 for{} 밖으로 
		 * 1에서 시작해서 2에서 끝남
		 * 
		 */
		
//		System.out.println(i); // 빨간 에러. for문 안의 i는 바깥에서 못 씀.
		
		
	}
	
	public void gugudan() {
		
		//구구단 프로그램
		//사용자에게 정수 입력받아서 구구단 프로그램 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 단을 출력하시겠습니까? > ");
		int num = sc.nextInt();
		
		System.out.println(num + "단");
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
		
	}
	
	public void method2() {
		
		// ★★★★★
		// ★★★★★
		// ★★★★★
		// ★★★★★
		// ★★★★★
		
		for(int i = 0; i < 3; i++) { // outer for문 (if도 이런식이면 outer if문) // for문 만나면 for문 공간 만들어줌
			
			for(int j = 0; j < 3; j++) {// inner for문(inner if) // 얘도 안쪽 for문도 공간 만들어줌
				System.out.print("★");
			} // for문 한 번 끝나면 차지하고 있던 메모리 비운다. 바깥 for문 증감->조건 하고 다시 진입하면 새롭게 또 영역 만들고 공간 할당, 수행
			System.out.println();
		}
		
	}

	
	
	// for문 안에 조건문 쓰기 -1
	public void method3() {
		
		// 단순 출력
		// 출력 형식 : X번째 반복입니다.
		// 100번 반복하면서 
		// 출력할 때 10번째 반복마다 ♡를 하나 찍어주세요		
		for(int i = 0; i < 100; i++) {
			if ((i + 1) % 10 == 0) {
				System.out.print("♡");
			}
			
			System.out.print((i + 1) + "번째 반복입니다."); // 제어변수i는 0으로 써놓는 편이 편하기 때문에, 1부터 시작을 원하면 i+1을 하게 된다.
			System.out.println();
		}
		
	}
	
	public void method4() {
		
		for(;;) {
			System.out.println("1. 로그인");
			System.out.println("2. 구구단");
			System.out.println("3. 홀짝맞추기");
			System.out.println("4. 종료");
			System.out.println("원하시는 메뉴를 선택해주세요 > ");
			
			Scanner sc = new Scanner(System.in);
			int menuNo = sc.nextInt();
			
			if(menuNo == 1) {
				String userId = "user01";
				String userPwd = "pass01";
				
				System.out.println("로그인 서비스입니다");
				
			} else if(menuNo == 2) {
				System.out.print("몇 단을 출력하시겠습니까? > ");
				
			} else if(menuNo == 3) {
				System.out.print("숫자를 입력해주십시오 > ");
				
			} else if(menuNo == 4) {
				System.out.println("프로그램 종료합니다.");
				return;
				
			} else {
				System.out.println("그런 거 없습니다."); 
				
			}
			
			
			
		}
		
	}
	
}
