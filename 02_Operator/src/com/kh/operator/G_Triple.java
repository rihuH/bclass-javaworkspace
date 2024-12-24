package com.kh.operator;

import java.util.Scanner;

public class G_Triple {

	/* 삼항 연산자 : 피 연산자가 3개 => 값 3개와 연산자 1개로 이루어짐(조건문 형식으로 쓰임)
	 * 
	 * 조건문 : 값에 따라 연산을 처리하는 방식
	 * 			결과값이 true일 경우 첫 번째 문장	
	 * 			결과값이 false일 경우 두 번째 문장
	 * 
	 * [표현식]
	 * 조건식 ? 조건식이 true일 경우 결과값 : 조건식이 false일 경우 결과값.
	 * 
	 * 
	 */
	
	public void method1() {
		
		System.out.println("시즌 메뉴판 : ");
		System.out.println("1. 아이스 푸른 용 헤이즐넛 라떼");
		System.out.println("2. 푸른 용 얼그레이 쉬폰 케이크");
		System.out.println("3. 푸른 용 클래식 밀크티");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴 번호를 입력해 주세요 > ");
		int menu = sc.nextInt();
		
		// 선택한 번호에 따라 메뉴명 출력
		// 1번 입력시 "아이스 푸른 용 헤이즐넛 라떼를 주문하셨습니다."
		// 2번 입력시 "푸른 용 얼그레이 쉬폰 케이크를 주문하셨습니다."
		
		String orderMenu = (menu == 1) ? "아이스 푸른 용 헤이즐넛 라떼를 주문하셨습니다." : "푸른 용 얼그레이 쉬폰 케이크를 주문하셨습니다.";
			//조건식 ? 조건식이 true일 경우 결과값 : 조건식이 false일 경우 결과 값
		// 예로 3을 입력하면 menu == 1이 false이므로 얼그레이 쉬폰이 출력된다.
		
		String orderMenu2 = (menu == 1) ? "아이스 푸른 용 헤이즐넛 라떼를 주문하셨습니다." 
							: (menu == 2) ? "푸른 용 얼그레이 쉬폰 케이크를 주문하셨습니다." 
							: (menu == 3) ? "푸른 용 클래식 밀크티를 주문하셨습니다." : "잘못 입력하셨습니다."; // 삼항에 삼항에 삼항도 가능. 다만 가독성이 매우 떨어짐
		
		System.out.println(orderMenu2);
		
	}
	
	// 홀짝 구하기
	public void method2() {
		// 사용자에게 값을 입력받아서 입력받은 정수가 홀인지 짝인지 판별해서 출력 --> Scanner
		
		Scanner sc = new Scanner(System.in); // 입력도구 별칭짓기
		
		System.out.print("숫자를 입력해주세요 > "); // 필요한 값을 입력받을 수 있도록 메시지 출력
		int num = sc.nextInt();					// 정수형 공간에 입력한 정수값 초기화
		
		// num(사용자가 입력한 정수)가 홀/짝인지 
		char oddEven = (num%2 != 0) ? '홀' : '짝';
		
		
		// 출력 형식
		System.out.println(num + "은/는 " + oddEven + "입니다."); // 출력예시
		
	}
	
	public void method3() {
		
		// 사용자 입력문자가 대/소문자인지 판별
		// 출력형식
		// X는 소문자(대문자)입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳을 입력해주세요 > ");
		char ch = sc.next().charAt(0);
		
		String result1 = ('A' <= ch) ? (ch < 'a') ? ("대문자") : (ch <= 'z') ? "소문자" : "잘못 입력" : "잘못 입력";
		String result2 = (('A' <= ch) && (ch <= 'z')) ? (ch < 'a') ? "대문자": "소문자" : "잘못 입력"; // 얘가 제일 좋은듯??
		String result3 = (('a' <= ch) && (ch <= 'z')) ? "소문자" : "대문자";
		
		System.out.println(result1 + " / " + result2 + "/ " + result3);
	}

	
	public void method4() {
		
		//사용자에게 영문자를 총 3번 입력받은 뒤
		// 3개의 입력값이 모두 동일한 문자일 시 
		//" 동일합니다." 하나라도 다르면 "다릅니다."
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 알파벳을 입력해주세요 > ");
		char ch1 = sc.next().charAt(0);
		System.out.println("두 번째 알파벳을 입력해주세요 > ");
		char ch2 = sc.next().charAt(0);
		System.out.println("세 번째 알파벳을 입력해주세요 > ");
		char ch3 = sc.next().charAt(0);
		
		
		String result = (((ch1 == ch2) && (ch2 == ch3))) ? "동일합니다." : "다릅니다."; // ==는 기본연산자끼리만 됨 string은 안됨 그래서
			
		System.out.println(result);
			
	}
	
}
