package com.kh.run;

public class Run {

	public static void main(String[] args) {

		// Math 클래스(수학) 
		// 클래스를 쓰고 싶으면 객체생성해서 메모리에 올려야하는데..
//		Math math = new Math(); // 안 보인다고 함. Math() 클래스는 public final class{} final은 상속받은 애들이 못 바꾸게 하겠다는 것.
		/*
		 * Math클래스 특징
		 * - 모든 필드와 모든 메소드가 전부 다 static
		 *  => 객체생성할 필요가 없다는 뜻.
		 * - 객체를 생성할 필요가 없으므로 생성자의 접근제한자가 private
		 * - java.lang  
		 *
		 */
		
		// 필드
		// 파이 => Math클래스 내에 상수필드로 정의되어 있음
		System.out.println(Math.PI); // math 객체생성 안하고 바로 사용할 수 있음.
		
		// 메소드
		// 1. 올림 => Math.ceil(double) : double
		double num1 = 4.242424;
		System.out.println("올림 : " + Math.ceil(num1));
		
		// 2. 내림 => Math.floor(double) : double
		System.out.println("버림 : " + Math.floor(num1));
		
		// 3. 반올림 => Math.round(double) : long
		System.out.println("반올림 : " + Math.round(num1));
		
		// 4. 최소값 => Math.min(int, int) : int ==> 오버로딩 되어있어서 double float도 받고 그 타입으로 반환/
		System.out.println("최소값 : " + Math.min(23432,22232));
		
		// 5. 최대값 => Math.max(int, int) : int/ double/ float/ long
		System.out.println("최대값 : " + Math.max(235434, 234892));
		
		// 6. 절대값 => Math.abs(int, double, long, float)
		System.out.println("절대값 : " + Math.abs(-333));
		
		// 7. 제곱 => Math.pow(x, y) x^y
		System.out.println("2의 20제곱 : " + Math.pow(2.3, 20));
		
		
		
	}

}
