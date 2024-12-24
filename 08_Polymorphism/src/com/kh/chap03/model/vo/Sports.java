package com.kh.chap03.model.vo;
//[표현법]
// 접근제한자 abstract class 클래스식별자{
//}
// 
/*
 * 클래스 내부에 추상메소드를 하나라도 선언하는 순간 클래스 또한 abstract를 붙여서 추상클래스로 정의해야함!
 * 추상클래스 == 일반필드 + 일반 메소드 + 추상메소드(생략가능)
 * 
 *  -> 추상메소드가 존재하지 않아도 추상클래스로 정의가능.
 *  => 기술적으로는 개발자가 판단했을 때 이 클래스는 부모클래스 역할로만 사용할 것이고, 객체 생성이 불가능해야 한다.
 *  	라고 생각이 들면 추상클래스로 선언 가능
 *  => 개념적으로는 개발자가 판단했을 때 해당 클래스가 아직 구체적으로 구현한 상태가 아닌 것 같다 하는
 *  	생각이 들면 추상클래스로 선언 가능.
 *  
 *  객체 생성이 불가능하다. 부모클래스의 역할은 가능(다형성 적용가능)
 */
public abstract class Sports { // 추상메소드를 가지기 위해 abstract 추가
	
	private int people;
	
	public Sports() {}
	public Sports(int people) {
		this.people = people;
	}
	
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}
	
	// 자식클래스들이 상속받아서 오버라이딩 할 용도
	public abstract void rule(); 
	// abstract : 추상 -> 구체적으로 구현할 게 아니고 추상화할 것이다. 뭉뚱그려서 만들어 놓을 것이다.
	// 추상메소드라고 함.
	// [표현법]
	// 접근제한자 abstract 반환형 식별자();
	// 추상메소드를 가진 클래스는 추상클래스여야한다. 

}
