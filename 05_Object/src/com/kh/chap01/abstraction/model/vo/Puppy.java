package com.kh.chap01.abstraction.model.vo;
/* 객체 지향 프로그래밍 : 현실세계에서의 독립적인 존재(객체)를 속성과 행위를 가지게 만들어서, 
 * 					 객체간의 상호작용을 프로그래밍 언어를 통해 구현하는 것
 * 
 * 구현하고자하는 프로그램에 객체를 만들기 위해서는(생성하기 위해서는) 
 *  => 클래스라는 틀을 먼저 만들어야함!
 *  
 *  클래스란? 각 객체들의 정보(속성, 행위)들을 담아내는 그릇 또는 틀 또는 설계도 또는 명세
 *  
 *  클래스 : VO(Value Object) 
 * 
 */


/* VO클래스의 경우
 * public class 클래스이름{
 * 		// 필드부
 * 		// 생성자부
 * 		// 메소드부
 * }
 * 
 */

public class Puppy {

	
	
	// [필드부]
	// 접근제한자 자료형 필드식별자;
	
	// 접근제한자 : 이 필드에 접근할 수 있는 접근권한을 제어하는 역할
	// public > protected > default > private
	// 클래스 내부에서 필드를 선언할 때는 반드시 접근제한자를 붙일 것
	
// 강아지 
// 이름, 종, 나이, 성별, 색상, 몸무게 (강아지의 속성)
// 지은씨네 강아지
	// 이름 : 밀키
	// 종 : 말티즈
	// 나이 : 10
	// 성별 : 여자
	// 색상 : 하얀색
	// 몸무게 : 2.0
	
// 속성 담을 변수 선언. 반드시 접근제한자를 앞에 붙여서 선언.
	public String name; // 필드로 선언.heap상에 올라간 변수니 자동으로 null 이 들어가있음(int면 0). heap영역은 공간이 비어있을 수가 없음. 
	public String species;
	public int age;
	public String gender;
	public String color;
	public double weight;
	
	// [생성자부]
	
	
	// [메소드부]
	public void sniff() {
		System.out.println(name + "가 냄새를 킁킁거리며 맡습니다."); // 나와 같은 필드에 있는 name을 호출하는 것이므로 참조하지 않고 바로 name
	}
	
	public void bark() {
		// 한 번 짖을 때마다 몸무게가 0.1kg씩 빠짐
		if(weight > 18.0) {
		System.out.println(name + ": 멍멍");
		weight -= 0.1;
	} else { 
		System.out.println("너나 짖어!");
	}
	}
	
	
}
