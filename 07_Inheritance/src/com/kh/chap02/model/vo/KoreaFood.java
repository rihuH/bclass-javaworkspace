package com.kh.chap02.model.vo;
// 	부모클래스 		자식클래스
//	조상클래스		후손클래스
//	슈퍼클래스		서브클래스
//	상위클래스		하위클래스
//	확장클래스		파생클래스
// --> 다중상속은 안 된다. 하나의 부모만 가질 수 있다. 수직상속은 여러 개 가능하다. 

// 클래스다이어그램에서 상속구조 표현
// 자식 -> 부모 화살표 표현(속이 하얀 세모화살표)
public class KoreaFood extends Food {
	
	// foodName, material, cookingTime, spicy
	// [ Food 클래스가 가지고 있음		  ]/
	private int spicy;
	
	// 생성자부
	public KoreaFood() { // 생성자는 물려받을 수 없다. 나도 생성되어야하니까.
		super(); // 생성자 내부에 이런 게 있어야함. 안 쓰면 컴파일러가 자동으로 만들어줌.
		//즉 자식클래스를 생성하면 부모클래스가 먼저 객체생성되고, 거기서부터 자식클래스가 추가로 가지고 있는 만큼 확장하는 것.
		// 부모클래스와 자식클래스는 독립적인 개체이지만 자식클래스는 부모클래스의 것을 사용할 수 있다.
		// 이건 맨 윗줄에 있어야 한다. 이론상 부모가 먼저 생성되어야하니까. 만약 이 부모기본생성자를 밑줄로 내리면 실행되지 않고 에러가 뜬다.
		System.out.println("응애 나 자식클래스");
	}


	// 메소드부
	public int getSpicy() {
		return spicy;
	}
	public void setSpicy(int spicy) {
		this.spicy = spicy;
	}
	

}
