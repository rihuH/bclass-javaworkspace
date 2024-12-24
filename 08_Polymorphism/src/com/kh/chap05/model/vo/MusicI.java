package com.kh.chap05.model.vo;

	/*
	 * 인터페이스
	 * [ 표현법 ]
	 * 접근제한자 interface 인터페이스식별자{
	 * 	[상수] 필드;
	 * 	메소드;
	 * }
	 * 
	 * - 인터페이스의 필드는 상수필드
	 * - 인터페이스의 메소드부 키워드를 붙이지 않는 이상 추상메소드
	 * 
	 * - 상수필드와 추상메소드로 이루어진 추상클래스의 끝. 변형체 == 인터페이스(추상화를 극한으로 한 것)
	 * 
	 * - 추상클래스보다 더욱 강한 규칙성, 강제성을 가진다.(필드가 무조건 상수필드, 메소드도 무조건 추상메소드)
	 * 
	 * - 인터페이스는 다중구현을 허용한다. (클래스와 다른 점)
	 * 클래스가 다중상속을 허용하지 않는 이유는 모호성 때문임. 어떤 함수를 호출하는지 모르니까.
	 * 그런데 인터페이스에 들어있는 메소드들은 꼭 추상메소드. 이걸 쓰고 싶으면 호출하는 클래스가 반드시 구현(overriding) 해야 함.
	 * 그래서 밖에서 호출할 때는 반드시 구현된 implement 하고 있는 클래스 것을 호출하게 되므로, 헷갈릴 일이 없다.
	 * 그래서 인터페이스는 다중구현을 허용한다. (범용성 높아짐)
	 * 
	 * - "무조건 구현해야 하는 기능이 있을 경우 인터페이스로 사용법만 만들어주고 구현하게 만듦' => 오버라이딩
	 * 
	 * 1. 공통점
	 * - 객체 생성은 불가능하지만, 참조변수로는 사용이 가능함(다형성으르 적용할 수 있음)
	 * - 추상메소드를 가지고 있을 경우, 상속받는 클래스에서 추상메소드를 오버라이딩 하고록 강제함.
	 * 
	 * 2. 차이점
	 * - 추상클래스 : 자신의 멤버로 일반필드, 일반메소드를 가질 수 있음
	 * 				추상메소드는 있어도 그만 없어도 그만.
	 * - 인터페이스  : 상수 필드, 특정한 경우를 제외하면 모든 메소드를 추상메소드로 정의해야함.
	 * 
	 * -> 존재하는 목적이 아예 다름.
	 * --> 추상클래스는 상속을 받아서 필드 메소드를 재사용하고 클래스를 확장시키기 위한 용도
	 * ---> 인터페이스는 기능의 구현(나아가 확장)을 강제할 용도. // 정말 타입만 물려주게 됨. 결합도가 낮아져서 일반 상속보다 영향을 덜 받음.
	 *-> 인터페이스 사용으로 상속의 이점을 얻고 결합도를 낮추는 용도로 사용.
	 * 
	 */
public interface MusicI { // 자바로만 개발하는 개발자들은 interface라는 의미로 뒤에 I를 붙이기도 함. 우린 그렇게는 안 할것. 이번에만 이름 없어서 함.
	
	/*public static final*/// int num = 10; // static final 붙였을 때와 같은 모양.(static은 그냥 기울고, final은 두께까지 굵어짐)
	// 인터페이스의 모든 필드들은 암묵적으로 public static final
	// 안 바꾸고 쓰겠다는 것. 그래서 사용시에도 다 대문자로 씀.
	int NUM = 10;
	/*
	default public void play() {
		
	}
	*/ //default는 어떤 클래스든지 똑같이 동작시키고 싶을 때 붙일 수 있다. 
	// 인터페이스를 구현한 모든 클래스가 동일하게 수행해야 하는 메소드에 default 키워드를.
	//그렇지 않다면 아래와 같이.
	/*public abstract*/void play(); // 이렇게만 메소드를 적는다.
	// 반환타입 메소드명(매개변수); 만 존재 (앞에 public abstract 붙어있긴 함)
	// 메소드 사용법
	// 인터페이스의 메소드들은 암묵적으로 추상메소드 == 메소드를 완성하지 않았다는 뜻.
	// 따라서 메소드를 부를 수 있는 이름과 매개변수만 남는다는 것이고, 이것은 메소드 사용하는 방법과 같다.
	
	default public void stop() {
		System.out.println("음악을 중지합니다.");
	}
	

}