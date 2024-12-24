package com.kh.operator;

public class E_Comparison {
	
	/* 비교 연산자(= 관계 연산자)
	 * 
	 * 두 개의 값을 가지고 비교, 이항 연산자
	 * 비교연산을 한 결과 -> 참(true), 거짓(false)
	 * 특정 조건을 제시할 수 있는 조건문에서 조건식으로 사용될 예정.
	 */

	/* 종류
	 * 동등비교, 대소비교
	 * 
	 * 1. 동등비교 : 일치함을 비교
	 * a == b : a와 b가 일치합니까?
	 * a != b : a와 b가 일치하지 않습니까?
	 * 
	 * 2. 대소비교 : 크고 작음을 비교
	 * a < b : a가 b보다 작습니까?
	 * a > b : a가 b보다 큽니까?
	 * a <= b : a가 b보다 작거나 같습니까?
	 * a >= b : a가 b보다 크거나 같습니까?
	 * 
	 * 결과값은 true/false
	 */
	
	public void method1() {
		
		int a = 10;
		int b = 25;
		
		System.out.println("a < b : " + (a < b)); // true
		System.out.println("a < b : " + (a == b)); // false
		System.out.println("a < b : " + (a > b)); // false
		
		boolean result = a != b; // 1) result 공간( = 를 기준으로 왼쪽 해석) 2) 오른쪽 값 해석. a!=b입니까? => true 3)=으로 대입. result자리에 true
		System.out.println(result); //true
		
		System.out.println("a가 짝수입니까? : " + (a % 2 == 0)); // true. a를 2로 나눴을 때 나머지가 0인가?
		System.out.println("b가 홀수가 아닙니까? "+ (b % 2 != 1)); // false. b가 홀수가 아닌가?-2로 나눴을 때 나머지가 1이 아닌가? b가 짝수인가? - 2로 나눴을 때 나머지가 0인가?
		
		
	}
	
}
