package com.kh.chap03.model.vo;

public class Friday extends Object {

	private String name; // String도 S 대문자로 클래스라는 건데 왜 쓸수 있지?
	// import가 자동으로 되기 때문. (import java.lang.*) 자동으로 import 해준다.
	// 모든 클래스의 최상위 부모클래스는 Object => 생략가능
	
	public Friday() {}
	public Friday(String name) {
		/*super();*/
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		/*return*/ // 본래 호출된 곳으로 돌아가야하니까 생략되어있음.
	}
	
	/*
	 * Overriding
	 * - 상속받고 있는 부모클래스의 메소드를 자식클래스에서 재정의(다시씀)하는 것
	 * - 부모클래스가 제공하고 있는 메소드를 자식이 일부 고쳐서 사용하겠다는 의미
	 * - 자식클래스의 오버라이딩 된 메소드가 우선권을 가져 호출됨.
	 * 
	 * 오버라이딩 성립 조건!
	 * 1. 부모메소드의 메소드명과 동일
	 * 2. 매개변수의 자료형, 개수, 순서가 동일(매개변수명과는 무관하지만 일반적으로 바꾸지 않음)
	 * 3. 반환형이 동일.
	 * ---- 개발자들끼리 약속
	 * 1. 오버라이딩한 메소드에는 @Override 애노테이션(주석이랑비슷, 각 기능이 있음)을 붙여주자.
	 * 
	 * 일종의 주석
	 * - 생략이 가능
	 * - 굳이 애노테이션을 달지 않아도 부모메소드와 형태가 같으면 오버라이딩한 것으로 판단.
	 * 
	 * 왜 붙여야하나요?
	 * 				=> 실수를 줄이자! 실수로 클래스명 오타나거나 했을 때 알아볼 수 있게. 부모클래스에 없다고 알려줌.
	 * 				=> 누가봐도 오버라이딩이라고 알아볼 수 있게.
	 * 
	 */
	
	@Override
	public String toString() {
		return"";
	}
}
