package com.kh.run;

public class WrapperRun {

	public static void main(String[] args) {
		
		/*
		 * Wrapper Class 
		 * => 기본자료형을 객체로 포장해주는 클래스들을 래퍼클래스라고 함.
		 * 
		 * 기본자료형 <-> WrapperClass
		 * boolean <-> Boolean
		 * char			Char
		 * byte 		Byte
		 * short 		Short	
		 * int			Integer
		 * long 		Long
		 * float		Float
		 * double		Double
		 * --> 이 순서로 말하는걸 사람들이 좋아함.
		 * 
		 * - 기본자료형을 객체로 취급해야 하는 경우, 
		 * 메소드 매개변수 자료형이 기본자료형이 아닌 객체타입만 받을 때
		 * 다형성을 적용시키고 싶을 때
		 * -> 사용함.
		 * 
		 * 
		 */
		
		int num1 = 10;
		int num2 = 15;
		
		// equals() => Object
		
//		Integer i1 = new Integer(num1); // 이 문법은 곧 없어질수도 있는 것. 다른 방식을 만들어뒀음
//		System.out.println(i1);
		
		// 기본자료형 => Wrapper클래스 자료형으로 바꿔야 할 때 생성자를 호출하지 않고
		Integer i1 = num1;
		Integer i2 = num2;
		// 이렇게 쓸 수 있음. 객체가 되었음.
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2));
		// a.compareTo(b)
		// a가 b보다 크면 1을 반환, a가 b보다 작으면 -1, 같으면 0을 반환. (정수로 대소비교 연산자 대신 사용하는 것)
		String str1 = "10";
		String str2 = "10.3";
		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		System.out.println(i + d); // 큰쪽으로 형변환 --> **그래야 데이터 손실이 일어나지 않으니까
		// 해당 Wrapper클래스이름.parseXXX(변환할 문자열);	--> 파싱 한다. (해석한다는 느낌. 정수로 해석하거나 실수로 해석하거나. 이게 통용되는 표현은 아니고 그냥 파싱한다고 하면 됨)
		
//		String strI = i + ""; // 문자열로 바꾸기 1
		String strI = String.valueOf(i);
		String strD = String.valueOf(d);
		System.out.println(strI + strD);
//		String strI = (String)i// 이렇게 하면 안됨 ()형변환은 기본자료형끼리만 가능.
		
		
		
		
		
	}
	
	
}
