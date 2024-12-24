package com.kh.chap04.controller;


// 클래스 변수(static)필드와 상수 필드에 대해서
public class StaticController {
	
	// 필드부
	// [표현법]
	// 접근제한자 예약어(생략가능) 자료형 식별자
	
	public static String str = "static field"; // static은 글자가 기울어짐
		// => 생성시점 : 프로그램 실행과 동시에 메모리의 static 영역에 할당
		// => 소멸시점 : 프로그램 종료 시 소멸!
		// => 객체를 생성하지 않고 static 영역에 할당! 
		// static == "공유"의 개념이 강함. 프로그램 실행과 동시에 올려놓고 그 안의 값을 공유해서 쓰자.
	
	/*
	 * 상수 필드
	 * [표현법]
	 * public static final 자료형 상수필드식별자 = 값;
	 *  => final static도 됨. 예약어 순서는 상관 없음
	 *  => 한 번 지정한 값을 고정해서 쓰겠다. 무조건 초기화를 해야함!!
	 *  
	 *  static : 공유의 목적
	 *  final : 한 번 초기화하고 안바꾸겠다.
	 *  
	 *  값이 변경되면 큰일나는 고정적인 값들을 메모리(static)영역에 올려놓고 공유해서 쓸 목적
	 *  
	 *  상수 필드도 작명 시 반드시 대문자여야함!
	 *  
	 */
	
	public static final int VERSION = 21;
	
	/*
	 * AccessModifier(접근제어자/ 접근제한자)
	 * 
	 * (+)public => 어디서든
	 * (#)protected => 같은 패키지라면 무조건 접근 가능
	 * 			 => 다른 패키지라면 상속구조인 클래스에서만 접근가능
	 * 			 => 상속이라는 개념은 05_Object / 06_ObjectArray 끝나고 그 다음 07에서 배울 것.
	 * (~)default(package friendly) => public같은 예약어를 것을 아무것도 안 붙인 것/ 오직 같은 패키지에서만 접근 가능.
	 * (-)private => 오직 해당 클래스 안에서만 접근가능하게 하고 싶다.
	 * 
	 *  => 위에서부터 아래로 내려올수록 접근할 수 있는 범위가 좁아짐
	 *  => 클래스 다이어그램(UML) 표기법 : +, #, ~, -
	 *  
	 * 
	 */
	

}
