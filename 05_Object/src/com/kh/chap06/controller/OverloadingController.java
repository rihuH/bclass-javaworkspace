package com.kh.chap06.controller;

public class OverloadingController {
	
	/*
	 * 메소드 오버로딩
	 * 
	 * - 한 클래스 안에 같은 메소드명으로 여러 메소드들을 정의할 수 있는 방법!
	 * - 매개변수 자료형의 개수, 순서, 종류 다르게 작성해야 함!
	 * - 단, 매개변수명, 접근제한자, 반환타입은 메소드 오버로딩에 영향을 끼치지 않음
	 * 
	 */
	
	// 메소드명은 test로 통일
	public void test() {
		System.out.println("안 녕 나는 테스트 메소드야");
	}
	
	public void test(int num) {
		System.out.println("안녕 나는 int받는 테스트야");
	}
	public void test(String str) {
		System.out.println("안녕 나는 String받는 테스트야");
	}
	public void test(int a, int b) {
		System.out.println("안녕 나는 int a b 받는 테스트야");
	}
	// 매개변수 이름과 상관없이 자료형의 개수가 동일하면 중복으로 판단. 
	// 즉, 오버로딩을 구현하기 위해서는 자료형의 개수와 순서를 다르게 작성해야 한다.
	// 호출부가 중요함. 호출부에서 봤을 때 구분 안 되면 안된다. -> 반환자가 달라도 안됨.
//	public String test(int c, int d) {} // 반환형이 다르다고 해서 오버로딩을 적용할 수 없다. 
	// 메소드를 호출하는 시점에서 매개변수가 동일하다면 에러가 발생한다.
	// 반환형과는 상관없이 매개변수의 개수와 순서를 항상 다르게 작성해야 한다.
//	private void test(int c, int d) {} // 접근제한자가 다른 것과 상관 없이 매개변수의 개수와 순서를 다르게 작성해야한다.
	// 접근제한자를 다르게 해도 오버로딩을 적용할 수 없다. 같은 클래스 내부에서 함수를 호출하는 경우도 있기 때문에 구분이 안 되는 것은 같아서.
	
	public void test(int a, String s) {
		System.out.println("안녕 나는 a랑 s받는 테스트야.");
	}
	public void test(String s, int a) {
		System.out.println("안녕 나는 s랑 a받는 테스트야.");
	}
	// 예로 생성자 오버로딩
	

}
