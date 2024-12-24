package com.kh.chap06.controller;

public class MethodController {
	
	/*
	 * 메소드(Method) == 멤버 함수 : 입력을 가지고 어떤 일을 수행한 다음에 결과물을 내놓는다.
	 * 함수긴 한데 함수는 보통 파일을 따로 빼서 관리함. 그래서 클래스 내부에 존재하는 '메소드'는 함수말고 '메소드'라고 부르기로 약속함.
	 * 
	 * 자바는 class를 데이터타입으로 판단/활용함.
	 * 특정 자료형에서만 사용이 가능한 함수 => 메소드
	 * 
	 * [표현법]
	 * 접근제한자 예약어 반환형 메소드식별자(매개변수의자료형 매개변수식별자){
	 * 		수행할 코드;
	 * 		return 반환값;(있을수도 없을수도)
	 * }
	 * 
	 * 생략 가능한 것 : 예약어, 매개변수, return문(void일 경우)
	 * 반환형 : 반환할 값의 자료형
	 * 한 번 정의해두고 필요할 때마다 언제든 호출
	 * 호출할 때 메소드 전달 인자값 => 매개변수의 자료형과 개수가 정확히 일치해야 함
	 * 
	 */
	
//	public void abc() {
		
//	}// 함수를 마치면 호출한 곳으로 돌아간다. 지금은 run의 메인메소드. 그런데 돌아가려면 return이라는 명령어가 있어야 하는데 안 써도 돌아감. 왜냐면 기본생성자와 같은 프로세스. 컴퓨터가 return을 생성해줌.
	
	
	public int abc() {
		return 'a';
	} // int랑 char형은 자동 형변환이 가능하다. char형을 int형으로
	
	public int add(int firstNum, int secondNum) {
		int sum =  firstNum + secondNum;
		return sum;
		
	}
	
	// 메소드의 경우 접근제한자 == public/ private
	private void setName(String name) {
		//작업작업
	}
	private void setPhone(String phone) {
		//작업작업
	}
	
	// 사용자에게 이름과, 전화번호를 입력받아서 ~~~
	
	public void akj(String name, String phone) {
		setName(name);
		setPhone(phone);
	}
	
	// 1. 매개변수가 없고 반환값도 없는 메소드
	public void method1() {
		System.out.println("매개변수와 반환값이 둘 다 없습니다.");
		return; // returnType이 void면 생략가능하고, 컴퓨터가 대신 만들어줌.
	} // 객체간 상호작용이 없으면 기능도 구현하지 않는 경우가 보통. 따라서 이런 경우는 아주 드물고, 보통 입,출력정도만 담당하거나 함.

	// 2. 매개변수는 없지만 반환값은 존재하는 메소드
	public String method2() { 
		System.out.println("매개변수는 없지만 반환값은 존재합니다.");
		return "나를 돌려줄게"; // 반환값이 있으면 반드시 return해야함. 그리고 return하는 값과 자료형이 일치해야함.
	}
	public String method3() {
		return method2();
	}
	
	// 3. 매개변수는 존재하지만 반환값은 없는 메소드. 대표적으로 setter
	public void setController(int controller) {
		System.out.println("매개변수는 존재하고 반환값은 없습니다.");
		System.out.println("전달된 인자값 : " + controller);
	}
	
	// 4. 매개변수도 존재하고 반환값도 존재하는 메소드
	public int method4(int num) {
		System.out.println("매개변수와 반환값 둘 다 있음");
		return num + 50;
	}
	
	/*
	public void a() {
		b();
	}
	public void b() {
		a();
	} // 메소드 호출되면 스택에 차곡차곡 쌓이다가 스택 메모리 초과 에러
	*/
	
	public void test(MethodController mc) {
		mc.method3();
	}
	

}
