package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Computer;

public class Run {
	/* 
	 * 캡슐화 과정을 통해 조금 더 이상적인 형태의 클래스를 만들어보자.
	 * Informationhiding(정보 은닉)을 구현하기 위한 기술 -> 객체지향프로그램을 왜 해야하는가에 대한 답/ 
	 *  -> 보안 : 기밀성, 무결성(데이터가 위조, 변조되지 않아야 하는 특성), 가용성(서비스 이용시간에는 프로그램이 돌아야함)
	 *  캡슐화를 진행하지 않으면 -> 클래스 외부로부터 직접접근이 가능하기 때문에 
	 *  값이 변질되거나 조화될 수 있음
	 *  
	 *  데이터의 "접근제한"을 원칙으로 직접접근을 막는 방법 = 캡슐화
	 *  
	 *  캡슐화 방법 : 
	 *  1. 값을 숨긴다 : 필드의 접근제한자를 public대신 private으로 선언한다.
	 *  2. 메소드를 통해 필드에 접근할 수 있도록 만들어준다 : getter()/ setter() 생성
	 *  
	 * 
	 */
	
	//접근제한자 (키워드) 반환형 메소드식별자(매개변수) {}
	public static void main(String[] args) {

		Computer c = new Computer(); // 객체생성 == 메모리에 적재

		int price = 5000;
		price = 10000; // 얘는 메인메소드가 있는 공간인 stack에 있는 price공간에 대입됨, 힙영역 메모리에 있는 price로 가서 대입하는 것이 아님
/*
		c.brand = "애플";
		c.productName = "맥북 프로";
		c.caseColor = "은색";
		c.price = -500; // 캡슐화를 하지 않으면 개발자가 의도하지 않은 값이 들어갈 수 있음
	필드가 보이지 않아서 오류 발생! => 접근제한자를 private로 변경했기 때문에 직접접근이 불가능! */
		// 직접접근을 막았으니 클래스 내부에서 간접적으로 접근할 수 있게끔 방법을 만들어야함
		// -> getter/setter 메소드 만들기
		
		c.setPrice(1000);
		System.out.println("mainMethod안에서 찍어본 c : " + c); //주소값이 나옴
		
		int num = c.getPrice();
		System.out.println(num);
		
		c.setBrand("LG");
		String brand = c.getBrand();
		System.out.println(brand);
		
		
		//실습
		// computer클래스의 모든 필드에 대해
		// getter()/ setter() 완성 후
		//setter() 이용하여 값을 set
		// getter() 이용하여 값을 반환받아 콘솔창에 출력
		
		c.setCaseColor("흰");
		String caseColor = c.getCaseColor();
		System.out.println(caseColor);
		c.setProductName("컴컴");
		String productName = c.getProductName();
		System.out.println(productName);
		
		
		System.out.println(c.information());
		
	}

}
