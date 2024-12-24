package com.kh.chap02.run;

import com.kh.chap02.model.vo.ChinaFood;
import com.kh.chap02.model.vo.KoreaFood;
import com.kh.chap02.model.vo.VietnamFood;

public class Run {
	public static void main(String[] args) {
		
		KoreaFood kf = new KoreaFood(); //생성자로 객체 만들기. 동시에 호출하는 것과 같음. 이 생성자 내 구문이 실행됨.
//		ChinaFood cf = new ChinaFood();
		
		kf.setFoodName("비빔밥"); // .찍는다고 하지 말고 kf를 참조해서, 레퍼런스(reference)해서 라고 이야기하기.
		String foodName = kf.getFoodName();
		System.out.println(foodName);
		// 호출 하는 메소드가 해당 클레스에 존재하지 않다면
		// 자동으로 해당 클래스의 부모클래스에 있는 메소드를 호출한다.
		
		VietnamFood vf = new VietnamFood("쌀국수", "소고기", 15, false);
		System.out.println(vf.information()); // 나한테 없으면 부모한테 가서 찾아서 메소드 호출해준다. 자식한테 있으면 자식걸 우선해서 쓴다.
		
		// 자식클래스에 메소드를 재정의했을 경우
		// 자식클래스에 존재하는 메소드가 우선권을 가져서 호출된다.(무조건 그런건 아님 예외는 있음)
		
		/*
		 * 상속
		 * 
		 * - 중복된 코드를 공통으로 관리.
		 *  => 보다 적은 양의 코드로 새로운 클래스를 만들 수 있음. -> 생산성이 높아짐
		 *  -> 프로그램 생산성, 가독성, 유지보수 크게 기여.
		 *  
		 *  
		 *  상속의 특징
		 *  - 클래스간의 다중상속은 불가능하다(단일 상속만 가능)
		 *  - 명시되어있지는 않지만 모든 클래스(자바에서의 모든 클래스)는 Object클래스(자바의 최상위클래스)의 후손클래스.
		 *  (내가 만든 클래스, 자바에서 이미 제공하는 클래스,, 아무튼 모든 클래스)
		 *  그러니까 부모클래스는 컴파일러가 자동으로 extends Object를 붙여준다.
		 *  => Object 클래스에 있는 모든 멤버를 호출해서 사용할 수 있다.
		 *  => Object 클래스에 있는 메소드가 마음에 안 들면 재정의를 할 수 있다.
		 *  
		 *  
		 *  
		 */
		
		
	}
}
