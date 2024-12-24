package com.kh.controller;

import com.kh.run.Run;

public class StringController {
	
	// String 클래스 **** 중요
	// => String클래스를 가지고 객체를 만들면 그 객체는 불변 객체가 됨.
	// => Immutable 하다 (변하지 않음)
	
	/*
	 * String 클래스 사용방법
	 * 
	 * 1. new 키워드를 이용해서 String 클래스의 생성자를 호출하는 방법
	 * 2. 대입연산자를 이용해서 직접 문자열 리터럴을 대입하는 방법
	 * 
	 */
	
	// 생성자를 호출해서 문자열 객체를 생성하는 방법
	public void method1() {
		// String의 개요
		// String도 클래스인데 왜 아래와 같이 쓰지 않을까. 되긴 되는데.
		String str1 = new String("hello");
		String str2 = new String("hello");
		Run run = new Run();
		System.out.println(run/*.toString()*/); // Object가 가진 toString이 자동으로
		System.out.println(str1); // String클래스에서는 toString을 오버라이딩 한 것.
		System.out.println(str2);
		
		int[] nums = new int[] {1, 2, 3};
		
		// 1. String클래스의 toString()의 경우
		// 실제 담겨 있는 문자열 value값을 반환하게끔 오버라이딩
		
		Run run1 = new Run();
		Run run2 = new Run();
		System.out.println(run1.equals(run2)); //false. 주소값을 비교하게 됨
		// equals의 결과값은 Object를 매개변수타입으로 가진다. 다형성을 적용해서 어떤 타입이 적용되든지 동일하게 처리하기 위해서.
		
		//equals()
		System.out.println(str1.equals(str2)); // true
		// 이것도 new 해서 다른 객체 만들었는데 왜?
		// 얘도 주소값비교가 아니라 오버라이딩 해서 값 비교를 한 것.
		// 주소값 비교가 아닌 문자열값 비교하도록 오버라이딩.
		
		
		// hashcode()
		System.out.println(run1.hashCode());
		System.out.println(run2.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode()); // 얘는 같은 객체일 수가 없는데 해시코드가 같게 나온다. 
		// 오버라이딩 해둠.
		// 3. String 클래스의 hashCode()
		// 주소값을 해싱하는 것이 아니라 실제 담긴 문자열값을 기반으로 해시코드값을 만들어서 반환.
		
		// 진짜 식별할 수 있는 값을 얻어내는 법
		// System.identityHashCode(참조형변수) : 진짜 주소로 만든 해시코드
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println(str1 == str2); // 주소값 비교
		// 실제 str1과 str2는 다른 객체
		
	}
	
	// 문자열 리터럴 대입방식
	public void method2() {
		
		String str1 = "hello";
		String str2 = "hello";
		
		// toString()
		System.out.println(str1);
		System.out.println(str2);
		
		// equals()
		System.out.println(str1.equals(str2));
		
		// hashCode()
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// System.identityHashCode()
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println(str1 == str2); // true. 이번에는 왜 true인가
		
	}
	
	// String pool
	public void method3() {
		
//		String exam = new String("hello");
		// new로 만든 객체들은 heap영역에 올라간다
		
		// 메모리 영역 중 기존 배운 static stack heap 말고 Method영역이 존재(영역 이름이 메소드)
		// Method 영역에는 우리가; 만드는 등 클래스 정보도 메모리영역 어딘가에 올라가있어야 하는데 그게 Method영역,
		System.out.println(1);
		// 등, 저장하지 않았던 변하지 않는 1, 등 상수도 메소드 영역에 올라가있다.
		// 메소드 영역 안에도 세부 영역이 있는데, 상수형 리터럴값이 저장된 공간을 constant pool이라고 한다.
		// 그 constant pool 안에 String pool이 또 있다.
		String str = "hello";
		// 대입연산자로 문자열을 대입하게 되면 heap 말고 상수풀로 가게 됨.
		// 문자열은 공간낭비가 심하기 때문에, 매번 그 객체마다 heap 메모리를 할당할 수 없기 때문.
		// 처음 String은 String pool로 가고, 두번째 String은 기존 것과 같은 것이 있는지 찾는다. 똑같다면 같은 주소를 가리키게 한다.
		// (얕은 복사랑은 다르다)
		
		// 문자열 리터럴을 대입연산자를 통해 대입했을 때
		// StringPool 영역에 등록됨
		// StringPool 특징 : 동일한 내용의 문자열 리터럴이 존재할 수 없다.
		
		System.out.println(System.identityHashCode(str)); // str이 hello였을 때
		str = "bye";
		System.out.println(System.identityHashCode(str)); // bye의 identity가 변해서 나온다.
		// 기존 hello 객체와의 연결을 끊고 새로운 bye객체를 StringPool에 생성해서 가리키는 것이다.
		
		String str2 = "hello";
		System.out.println(System.identityHashCode(str2)); // 2036368507
		// Constant Pool은 JVM이 실행되는 동안(프로그램 시작부터 종료될때까지) 리셋되는 것 없이 계속 유지된다.
		// hello와 연결이 끊어졌지만 그 주소가 그대로 유지되는 것.
		
		
		str += "!!";
		System.out.println(System.identityHashCode(str));
		
		String a = "a";
		String b = "a";
		
		System.out.println("결과 : " + (a == b));
		
	}
	
	public void method4() {
		// Buffer == 임시저장공간
		
		// StringBuffer
		// 문자열은 불변객체라서 내용물이 변경될 때마다 새로운 공간을 할당하고 집어넣는다.
		// 이를 해결하기 위해 임시공간(Buffer)를 하나 준비해서
		// 임시공간에 차곡차곡 담아두었다가 한번에 처리하는 클래스
		
		//Buffer를 쓴다는 것은 문자열을 더하겠다는 의미
		StringBuffer sb = new StringBuffer();
		
		sb.append("Hello");
		sb.append(" World!");
		
		System.out.println(sb.toString());
		// 문자열 더할 게 많다면 buffer를 이용한다면 메모리낭비를 막을 수 있다.
		
		// StringBuilder
		StringBuilder sr = new StringBuilder();
		sr.append("Hello ");
		sr.append("World!");
		System.out.println(sr);
		
		// Buffer와 Builder는 사용법이 같다.
		
		// 동시제어기능 (Thread - Safe) : 동시에 입력이 들어왔을 때 이를 처리하는 기능
		// Buffer에는 있고 Builder에는 없다. 그래서 Builder가 속도가 더 빠르다(연산이 더 적어서)
		// 동시제어기능이 외부에서 제공이 이미 많이 제공되고 있기 때문에
		// 충돌환경이 아니라면 굳이 동시제어를 구현할 필요가 없다. 그래서 Builder를 보편적으로 사용한다.
		// 멀티스레드 제어 기능. 스레드 세이프 기능.
		
	}
	

}
