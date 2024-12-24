package com.kh.operator;

public class B_InDecrease {

	/* 중감연산자 : 단항연산자로 한 번에 1씩 증가(더하거나)/ 감소(빼거나)하는 연산을 한다.
	 * => 먼저 증감을 할 건지, 나중에 증감을 할 건지에 따라서 연산자의 위치가 달라짐.
	 * 
	 * [표현법]
	 * ++ : 값을 1 증가시키는 연산자
	 * -- : 값을 1 감소시키는 연산자
	 * 
	 * 연산자의 위치
	 * 전위 연산 : ++값, --값  => 값을 증감하고 작업을 처리
	 * 후위 연산 : 값++, 값--  => 작업하고 값을 증감
	 */
	
	public void method1() {
		
		int num = 10;
		System.out.println("num : "+ num); // "num : 10" , num 자체출력이 아니고 num공간 안에 있는 값을 가져와서 작업,출력, 수행하는 것
		
		num++;
		System.out.println("num : "+ num); // "num : 11"
		num--;
	
		System.out.println("num : "+ num);// "num : 10"
		System.out.println("num : "+ num++); // "num : 10"
		System.out.println("num : "+ num++); // "num : 11"
		System.out.println(num); // 12
		
	}
	
	//후위연산 2번째
	public void method2() {
		
		int a = 10; // 1)a라는 식별자를 가진 int형 변수공간을 할방받고 정수 리터럴값 10을 대입
		int b = a++; // 2)왼쪽에서 b라는 식별자를 가진 int형 변수공간을 할당받겠다. 3)a라는 공간에 대입된 정수형 리터럴값 가져옴.
			//4) a라는 공간의 값을 1 증가 5) 가져온 리터럴값을 b공간에 초기화(= 처리. =는 항상 맨 마지막. 증감연산자보다 마지막)
		
		System.out.println("a : " + a); // "a : 11"
		System.out.println("b : " + b); // "b : 10"
		
		
		int c = 20; // 참고, 이항연산자는 문자랑 연산자랑 한칸씩 띄워 쓰는게 약속.
		int d = c--;
		
		System.out.println("c : " + c); // c : 19 
		System.out.println("d : " + d); // d : 20
		
		int num = 20;
		int result = num++ *3;
		// 후위연산은 연산자 우선순위에서 마지막
		// num 공간 및 초기화 => result 공간 => num값 추출 *3 => 후위연산자++ => =대입수행.
		
		System.out.println(num); // 21
		System.out.println(result); // 60
		
		
	}
	
	//전위연산
	public void method3() {
		
		int a = 10;
		int b = ++a;
		
		System.out.println("a : " + a); // 11 => a자체가 값이 아니고 공간의 값을 증감시키는 거니까 10이라고 하지 말고
		System.out.println("b : " + b); // 11
		
		int num = 20;
		int result = ++num *3;
		//그러니까 후위연산자랑 반대로 전위연산자는 연산우선순위에서 맨 앞.
		
		System.out.println(num); // 21
		System.out.println(result); // 63
		
	}
	
	
	
}
