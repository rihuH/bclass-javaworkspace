package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.model.vo.Puppy;

public class Run {
	public static void main(String[] args) {
		
		//클래스명 객체식별자
		Puppy milky = new Puppy(); //  = 객체를 생성한다 new puppy() 라는 작업
									// new 라는 예약어를 사용
									// Memory의 heap영역에 데이터를 생성하겠다.
		
		Puppy dog = new Puppy(); // 얘도 new 들어갔으니 새로 자리가 만들어짐
		milky.sniff();
		dog.sniff();  // 다른 공간에 있는 sniff를 호출한 것./ 그래서 Puppy라는 게 붕어빵틀같은 역할 
		
		milky.name = "밀키"; // 이름 대입
		milky.species = "말티즈";
		milky.age = 10;
		milky.gender = "여";
		milky.color = "흰색";
		milky.weight = 2.0;
		
		System.out.println(milky.name + "는 " + milky.color + " " + milky.species + "입니다.\n"
							+ milky.age + "살 " + milky.gender + "성이고요.\n" + "몸무게는 " + milky.weight + "kg입니다.");
		
		Puppy gaebong = new Puppy();
		gaebong.name = "개봉이";
		gaebong.species = "진돗개";
		gaebong.age = 7;
		gaebong.gender = "남";
		gaebong.color = "흰색";
		gaebong.weight = 20.0;
		
		System.out.println(gaebong.name + "는 " + gaebong.color + " " + gaebong.species + "입니다.\n"
							+ gaebong.age + "살 " + gaebong.gender + "성이고요.\n"
							+ "몸무게는 " + gaebong.weight + "kg 입니다.");
		milky.sniff(); // . : 참조연산자, 직접접근연산자
		gaebong.sniff();
		for(int i = 0; i < 30; i++) {
		gaebong.bark(); 
		}
		
		System.out.println("짖고 난 후 " + gaebong.name + " 몸무게는 " + gaebong.weight + "kg 입니다.");
		
		
		/* 실습
		 * 현실세계에 존재하는 나만의 무언가
		 * VO 클래스를 만들고 
		 * 
		 * PuppyCare처럼 VO클래스를 이용하여 만든 객체를 관리할 수 있는 프로그램을 작성하시오.
		 * 
		 * 개수) VO x 5 + VO관리프로그램 X5
		 * 각 VO클래스의 최소 필드 수 ) 5개
		 * 최소 한 개 이상의 필드 값을 변경할 수 있는 메소드 생성 -> 예시  ) puppy클래스의 bark()
		 * 
		 * 총 10개의 클래스 만들어서
		 * 우리반 게시판 제출: 제한시간 == 오늘까지
		 * 
		 * 
		 * 
		 * 
		 */
	}
}
