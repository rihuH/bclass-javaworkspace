package com.kh.chap01.run;

import com.kh.chap01.model.vo.Child1;
import com.kh.chap01.model.vo.Child2;
import com.kh.chap01.model.vo.Parent;

public class Run {

	// polymorphism : 다형성.
	/*
	 * 상속구조
	 *
	 * 필드, 메소드 (생성자는 못 받음)
	 * **** 타입(자료형) ****
	 * 을 받아서 사용할 수 있음.
	 *
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		// 1. 부모타입 자료형으로 부모객체를 다룸
		Parent p1 = new Parent();
		p1.printParent();
//		p1.printChild1(); // 자식이 가진 멤버는 부모가 사용할 수 없다.
		// p1으로는 parent에만 접근가능.
		
		// 2. 자식타입 자료형으로 자식객체를 다룸
		Child1 c1 = new Child1();
		c1.printChild1();// 자식은 본인 것도 쓸 수 있음.
		c1.printParent();// 자식은 부모 것을 쓸 수 있음.
		// c1로는 Child1, Parent에 둘 다 접근 가능
		
		// = 를 기준으로 양 변 자료형이 같아야한다.
		
		// 3. 부모타입 자료형으로 자식 객체를 다룸 => 다형성 적용
		Parent p2 = new Child1(); // (Parent)로 자동형변환 됨.
		// p2를 parent형태로(그만큼만) 사용할 것이라고 함. new로 Child1() 객체 생성. p2는 new로 생성된 Child1이 본체
		// Child1을 Parent만큼 잘라내고 사용한 것이 아니고 그대로 둔 채 parent만큼만 사용하고 있는 것.
		// 그래서 나중에 p2를 다시 (Child1)으로 확장해서 Child1의 메소드를 사용할 수 있다.
		p2.printParent();
//		p2.printChild1(); // Parent에만 접근할 수 있음.
		// 양 쪽이 자료형이 다름에도 에러가 발생하지 않는 이유
		// == 클래스 형변환이 일어났기 때문
		
		((Child1)p2).printChild1();
		
		/*
		int in = 1;
		double dn = 3.4;
		(double)in = dn;
		*/
//		Child1 c2 = new Parent();  
//		c2.printChild1();
		
		/*
		 * 클래스 형 변환
		 * "상속구조" 일 경우에만 가능
		 * 1. Up Casting 
		 * 자식타입 => 부모타입
		 * 생략이 가능하다
		 * 
		 * 2. Down Casting
		 * 부모타입 => 자식타입
		 * 생략이 불가능하다
		 * 
		 * ((자식)부모).자식메소드(); // 부모가 자식타입이 되어야만 자식메소드를 사용할 수 있다.
		 */
		
		// 다형형 적용 예시
		// 배열 사용해서
		// 배열의 특징 == 한 종류의 자료형인 값들을 묶어서 관리할 수 있음.
		
		// 다형성 적용 전
		/*
		Child1 child1 = new Child1();
		Child1 child2 = new Child1();
		
		Child2 child3 = new Child2();
		Child2 child4 = new Child2();
		*/
		
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1,2,3);
		arr1[1] = new Child1(2,3,4);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(3,4,5);
		arr2[1] = new Child2(4,5,6);
		
		System.out.println(3.0);
		System.out.println(3);
		System.out.println('3');
		System.out.println("3");
		// 자료형에 따라 같은 3이라도 컴퓨터가 다르게 인식한다는 것과 같은 이야기다. child를 parent모양으로 쓰겠다고 하면 parent모양으로 쓸 수 있는것이고
		// 자료형은 - 개발자가 값을 다룰 때 어떤 형태로 다룰 것인지 선언하는 것. 
		
		System.out.println("다형성을 적용하기 전~");
		arr1[0].printChild1();
		arr1[1].printChild1();
		arr2[0].printChild2();
		arr2[1].printChild2();
		
		System.out.println("다형성을 적용하고 난 후");
		Parent[] arr = new Parent[4]; // Child들은 Parent의 타입을 물려받았기 때문에 한 번에 다룰 수 있게 된다.
		arr[0] =/*(Parent)*/ new Child1(1, 2, 3);
		arr[1] = new Child2(3, 4, 5);
		arr[2] = new Child2(4, 5, 6);
		arr[3] = new Child1(5, 6, 7);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].printParent();
		}
		
//		(Child1).arr[0].printChild1(); // ()위치가 이러면 arr[].~~ 를 child1 으로 바꾸게 된다
		((Child1)arr[0]).printChild1();
		// child구문 쓰고 싶으면 타입 다시 변환하고 사용해야한다.
		
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			/*if(i == 0 || i == 3) {
				((Child1)arr[i]).printChild1();
			} else {
				((Child2)arr[i]).printChild2();
			}
		}
		*/
		
		/*
		 * instanceof 연산자 => 반환값 true / false
		 * 현재 레퍼런스가 실질적으로 어떤 클래스타입을 참조하고 있는지 확인할 때 사용.
		 * 
		 * 
		 */
		
			if(arr[i] instanceof Child1)/*한 칸 띄고 instanceof 체크하고싶은 클래스타입*/{
				((Child1)arr[i]).printChild1();
			} else {
				((Child2)arr[i]).printChild2();
			}
			arr[i].print();
			// 오버라이드를 통해 실행시키고 싶은 반복문을 한 번에 실행시킬 수 있다.
			// 현재 Paretn타입에 있는 print를 호출한 것임, 자료형의 메소드를 가리킴.
			/* 이를
			 * 동적바인딩 : 프로그램 실행 전 컴파일이 되면서 정적바인딩 수행(자료형의 메소드를 가리킴)
			 * 			단, 실질적으로 참조하고 있는(부모타입으로 만들어놨지만 실질적으로 Child1,2인) 객체에 해당 메소드가 오버라이딩이 되어있다면
			 * 			프로그램 실행 시 동적으로 자식클래스의 오버라이딩 된 메소드를 찾아서 실행
			 * 			(Runtime = 프로그램 실행시)
			 * 
			 * 다형성 == 부모클래스 자료형으로 여러 자식클래스 객체를 다루는 기술
			 * (상속구조에서는 자식클래스가 부모클래스의 자료형을 상속받아서 사용할 수 있기 때문에)
			 * 
			 */
			
			// 데이터추상화(공통점 추출, 필요한 메소드) -> 대상화(이름지어주기, 클래스라는 틀로) -> 
			
			
			
		}
		
		
		
		
		

	}

}
