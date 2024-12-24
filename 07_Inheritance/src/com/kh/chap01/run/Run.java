package com.kh.chap01.run;

import com.kh.chap01.model.vo.ChinaFood;
import com.kh.chap01.model.vo.KoreaFood;
import com.kh.chap01.model.vo.VietnamFood;

public class Run {
	
	public static void main(String[] args) {
		
		KoreaFood kf = new KoreaFood("비빔밥", "밥", 60, 2);
		VietnamFood vf = new VietnamFood("쌀국수", "소고기", 20, true);
		ChinaFood cf = new ChinaFood("꿔바로우", "돼지고기", 30, "별로안느끼함");
		
		System.out.println(kf.information());
		System.out.println(vf.information());
		System.out.println(cf.information());
		
		// 객체지향에서 가장 중요한 것
		// => 클래스 내부와 외부를 바라보는 관점
		// 정보은닉이 목적.
		
		/* 
		 * 매 클래스마다 중복된 코드들을 하나하나 기술하게 되면
		 * 코드의 추가 또는 수정과 같은 유지보수 시 전부 하나하나 찾아서 고쳐야 하는 번거로움이 생김.
		 * 
		 * 상속이라는 개념을 적용시켜서 
		 * 매 클래스마다 중복된 필드, 메소드들을
		 * 단 하나의 클래스(부모클래스)로 만들어놓고, 정의를 해두고
		 * 해당 부모클래스의 속성, 행위를 상속받아서 사용하는 형태로 진행.
		 * 
		 */
		
	}
}
