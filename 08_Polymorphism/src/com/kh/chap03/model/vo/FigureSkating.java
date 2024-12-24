package com.kh.chap03.model.vo;

public class FigureSkating extends Sports { //상속받은 추상클래스의 추상메소드(rule)을 반드시 구현해야 한다고 빨간에러 뜸.
	
	@Override
	public void rule() {
		System.out.println("뱅글뱅글돔");
	}
	
	

}
