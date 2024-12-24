package com.kh.controller;

public class StringTokenizer {
	
	// 문자열 분리시키는 방법
	
	String str = "피곤하다,말이없다,졸리다,외롭다,쓸쓸하다";
	
	// 1. 구분자를 이용해서 해당 문자열을 분리시키는 방법
	// 2. 분리된 각각의 문자열을 토큰으로 취급
	
	public void method1() {
		
		// 문자열.split(String 구분자) : String[]
		
		String[] arr = str.split(",");
		// for loop문
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		// 다른 for문
		// 향상된 for문 : 초기식, 조건식, 증감식 안씀.
		for(String s : arr) { // 반복시키고싶은 것(지금은 배열)을 () 안에 적는다.
			System.out.println(s);
		}
		// for(값을 받아줄 변수 선언 : 순차적으로 요소에 접근할 (배열||컬렉션) ) {}
		// 배열의 요소를 수정할 수는 없어서 출력할 때만 쓴다.
	}
	
	public void method2() {
		// java.util.StringTokenizer 클래스를 이용하는 방법
		// [표현법]
		// StringTokenizer stn = new StringTokenizer(str, ","); 쪼개고싶은문자열, "구분자"
		
		java.util.StringTokenizer stn = new java.util.StringTokenizer(str, ","); // 지금 클래스명이 똑같아서 여기서 생성자를 찾음.
		// 그러면 앞에 패키지경로를 전부 붙여줘야 함.
		System.out.println(stn); // stn의 부모클래스인 Object 클래스가 가지고 있는 메소드인 toString의 반환값이 출력됨.
		/*
		// 실제 분리된 내용을 확인하고 싶다면?
		System.out.println(stn.nextToken()); // 호출할 때부터 앞에서부터 빠져나옴
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken()); // 토큰 없는데 뽑으면 NoSuchElementException 예외 발생
		*/
		
		System.out.println(stn.countTokens());
		
		// 반복문
		while(stn.hasMoreTokens()) { // 토크나이저에 남아있는 토큰이 존재한다면 true/ 토큰이 하나도 없으면 false값을 반환.
			System.out.println(stn.nextToken());
		}
		
		
		
		
	}
	

}
