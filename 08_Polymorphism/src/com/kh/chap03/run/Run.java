package com.kh.chap03.run;

import com.kh.chap03.model.vo.BaseBall;
import com.kh.chap03.model.vo.Soccer;
import com.kh.chap03.model.vo.Sports;

public class Run {

	public static void main(String[] args) {

		
		Soccer soccer = new Soccer();
		soccer.rule();
		
		BaseBall baseBall = new BaseBall();
		baseBall.rule();
		/*
		Sports sports = new Sports(); // 추상클래스로 만들었기 때문에 객체로 생성할 수가 없음. 객체생성 위해 만든 것이 아니기 때문에.
		sports.rule();
		추상클래스로 선언되었기 때문에 객체생성이 불가능!
		*/
		
		Sports[] arr = new Sports[2];
		arr[0] = new Soccer();
		arr[1] = new BaseBall();
		

		
	}

}
