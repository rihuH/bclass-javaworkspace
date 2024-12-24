package com.kh.chap04.controller;

/*
 * 필드(field) == 멤버변수 == 인스턴스 변수
 * 클래스를 구성하는 요소 중 하나
 * 데이터를 저장하기 위한 역할(변수)
 * 클래스 내부에 정의하지만 메소드 영역 밖에 존재
 * 
 * 
 * 변수 구분
 *  - field : 클래스 영역에 바로 선언하는 변수
 *  - local variable : 클래스 영역 내부에 특정한 구역! {} => method, if, for문 등등
 *  
 *  1. 전역변수(자바는 전역변수가 없다) 의 역할을 하는 친구들
 *   - 멤버변수(필드, 인스턴스)// 클래스 내에서는 전역변수역할
 *   		 : 생성시점 => new 키워드를 사용해서 해당 객체를 생성하는 순간 heap에 할당
 *   		   소멸시점 => 객제가 소멸될 때 같이. => 가비지컬렉터가 일을 안 하면 OOM(Out Of Memory) 발생
 *   - 클래스 변수(static) : static이라는 예약어가 붙은 변수
 *   					생성 시점 : 프로그램 시작과 동시에 static 영역에 올라감
 *   					소멸 시점 : 프로그램이 종료되면 소멸
 *   
 *   2. 지역 변수
 *   		생성 시점 : 특정한 영역이 실행될 때 {} 실행 시 메모리 영역에 할당 =>  stack
 *   		소멸 시점 : 특정한 영역이 종료될 때 {}
 *   
 * 
 */
public class FieldController {
	// 필드(멤버변수, 인스턴스변수)
	public int global;
	
	public void testMethod(int parameter) { //test메소드 시작
		//지역변수를 사용해보자
		
		int local = 2; // 지역변수 : 반드시 초기화를 진행해야지 사용가능
		
		System.out.println(global); // 필드, 멤버변수
		System.out.println(parameter); // 매개변수(지역변수)
		System.out.println(local); // 지역변수
		
		
	}// test메소드 영역 끝
	

}
