package com.kh.operator;

import java.util.Scanner; //Scanner도 클래스니까 앞 자리가 대문자

public class F_Logical {

	/* 논리 연산자 : 두 개의 논리값을 연산하는 연산자
	 * 
	 * [표현법]
	 * 논리값 논리연산자 논리값 => 결과값도 논리값
	 * 
	 * 종류
	 * 
	 * 1. AND연산자 : 논리값 && 논리값
	 * 좌항과 우항의 값이 모두 true여야만 최종 결과값이 true.
	 * 
	 * 2. OR연산자 : 논리값 || 논리값
	 * 좌항과 우항의 값 중 하나라도 true일 경우 최종 결과값이 true
	 * 
	 */
	
	// AND
	public void method1() {
		
		// 사용자에게 정수값을 입력받은 후 --> Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요 > ");
		int num = sc.nextInt(); // 변수선언 및 초기화(initialize)
		
//		System.out.println(num);
		
		// 사용자가 임력한 정수가 양의 정수이면서 짝수인지 판별
		// 무슨 값? => num
		// 무슨 연산? => 1. 0보다 큰가? -> 사용자가 입력한 값>0?
		//			=> 2. 짝수인가? -> 2로 나눈 나머지가 0과 일치하는가? 사용자가 입력한 값 % 2 == 0
		//			=> AND 연산자 && : ~이면서, ~이고, 그리고.
		boolean result = (num > 0) && (num % 2 == 0); // 참고로 괄호 없어도 되긴 함. 우선순위때문에. 그래도 명확하게 작성 위해 괄호.
			// 사용자가 입력한 정수가 0보다 크고 그리고 사용자가 입력한 정수가 2로 나눴을 때 나머지가 0 인가요?
		/* 참고로 첫 번째 논리연산에서 탈락하면 뒤의 것을 안 보기 때문에, 뒤의 num에 ++, -- 같은 게 붙어있다면 계산 안 된다. 뒤에 논리연산까지 간다면 계산한다.*/
		System.out.println("사용자가 입력한 정수가 양수이면서 짝수입니까? " + result); 
		System.out.println("num : " + num); 
		
	}

	public void method2() {
		
		//사용자에게 정수 값 입력 받아서
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해 주세요 > ");
		int num = sc.nextInt();
		
		// 입력한 정수가 1~100사이의 값인지 체크해보기
		
		boolean result = (0 < num) && (num < 101); // (0<num<101) 자바는 이거 안 해줌. 직접 두 번 진행해줘야함. 언어에 따라 되는 곳도 있음.
			// 그리고 가독성을 위해서 0 < num < 101을 뗀 것이기 때문에 0 < num, num < 101으로 쪼개는 게 가독성이 좋다. 다른 경우의 수도 많지만 사람이 빨리 알아볼 수 있도록
		System.out.println("사용자가 입력한 값은 1-100 사이의 정수입니까? " + result); 
		System.out.println("사? " + ((0 < num) && (num < 101))); // 논리연산자만 쓰면 논리연산자로 계산. 문자열이랑 붙였을 때 논리연산 하고 싶으면 문자열보다 먼저 계산해야하니까 () 붙여야함.
			// <=, >= 를 쓰느냐는 취향차이. 영어권국가는 <>를 사용하고 비영어권국가는 <=, >=를 선호한다는. 근거는 없음.
		
	}
	
	// OR
	public void method3() {
		
		// 사용자가 입력한 값이 'A' 또는 'a'인지 확인!
		Scanner sc = new Scanner(System.in);
		
		System.out.println("한 글자만 입력해주세요 > ");
		char ch = sc.nextLine().charAt(0); // next() 문자됨 공백문자 전까지. Line 엔터 전까지.
			// 형변환 연산자 -> 기본자료형/ 원시자료형끼리만 가능한 연산자
			// => 문자열 중 하나만 추출할 수 있음. 
		
		String str = "index"; // i n d e x 단일문자가 나열된 것.(+순서를 붙여서). i가 있는 메모리 공간 앞부터 0번. 
		
//		char d = str.charAt(3); // e => (index)에 해당하는 단일문자를 불러온다. 
		// index는 0부터 시작함.
//		System.out.println(d);
		
//		System.out.println(ch);
		
		// 사용자가 입력한 한 글자 == ch
		// 비교대상 == 'A', 'a'
		
		// 단일문자의 경우 동등비교 연산 가능한가? 가능하다
		//	=> char형 비교연산은 int형으로 자동형변환이 일어난 뒤 연산을 함
		
		boolean result = (ch == 'a') || (ch == 'A'); // || : ~이거나, 또는
		
		System.out.print("사용자가 입력한 값이 'A' 또는 'a'입니까? : " + result);
	}

	/*
	 * AND(&&) : 두 개의 조건이 모두 true일 경우 true
	 * 
	 * OR(||)  : 두 개의 조건 중 하나라도 true 일 경우 true
	 */

	public void tip() {
		
		int num = 10;
		
		boolean result = false && (num > 0); // 이러면 앞에가 false이니까 항상 false 둘 다 true가 될 수 없으니까. 이걸 Dead code라고 한다. 
		
	}
	
}
