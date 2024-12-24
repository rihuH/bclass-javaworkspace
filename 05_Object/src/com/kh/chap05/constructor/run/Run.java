package com.kh.chap05.constructor.run;

import com.kh.chap05.constructor.model.vo.Member;

public class Run {

	public static void main(String[] args) {

		Member member1 = new Member();
		
//		System.out.println(member1.information()); // 값을 대입하지 않는 null 값으르 유효하지 않은 객체라고 함. 메모리상에 올렸어도 사용할 수 없기 때문.

		Member member2 = new Member("값"); //변수를 하나만 적으면 매개변수를 하나만 가진 생성자를 호출
		System.out.println(member2.information());
		Member member3 = new Member("user01", "pass01");
		System.out.println(member3.information());
		Member member4 = new Member("user02", "pass02", "name02", "01022222222");
		System.out.println(member4.information());
	
	}

}
