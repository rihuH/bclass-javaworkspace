package com.kh.chap03.run;

import com.kh.chap03.model.vo.Apartment;
import com.kh.chap03.model.vo.Friday;
import com.kh.chap03.model.vo.Hanok;
import com.kh.chap03.model.vo.House;

public class Run {

	public static void main(String[] args) {

		Hanok hanok = new Hanok(2, 3, 4, 60, "남색");
		Apartment apt = new Apartment(2, 3, 5, 30, 10);
		House house = new House(1, 1, 1, 1);
		
		hanok.information();
		apt.information();
		house.information();
		
		int num = 0;
//		System.out.println(num.toString());// 빨간에러. 기본자료형은 메소드를 가지고 있지 않음. 실제 값이 들어간다. 객체생성되는 것들이 아님.
		// 그래서 toString을 쓸 수 없음.
		
		
		System.out.println(hanok);// house의 주소값이 출력이 된다.
		// house 변수를 전달하면 실제로 동작은 house.toString() 으로 컴파일러가 추가해줘서 출력해준다.
		// toString()을 만든 적이 없는데 쓸 수 있음 -> Object가 가지고 있는 메소드.
		// public native int 등 native로 되어 있는 것들은 자바가 제공하는 것이 아니고 운영체제가 제공하는 것이다.
		// toString() : 해당 객체의 풀 클래스명 + "@" + 해당 객체의 주소값(16진수 형태) : String
		
		System.out.println(apt);// 이 클래스에 toString이라는 메소드를 새로 정의하면, Object가 가진 메소드보다 우선해서 호출된다.
		
		Friday fr = new Friday();
		System.out.println(fr);
		
	}

}
