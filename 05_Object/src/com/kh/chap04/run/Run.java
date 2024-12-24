package com.kh.chap04.run;

import com.kh.chap04.controller.FieldController;
import com.kh.chap04.controller.StaticController;

public class Run {

	public static void main(String[] args) {
		FieldController fc = new FieldController();
		// 1. FieldController 자료형으로 fc 지역변수 선언. Stack에 fc영역 생성. 
		// 2. heap 영역에 객체생성(new 키워드 만났을 때)
		// 3. 주소값을 대입
		
		System.out.println(fc.global); //fc.local은 못 부름
//		System.out.println(fc.local); // 빨간 에러. 필드가 아니라 함
		fc.testMethod(50);
		// testMethod 호출
		// parameter 지역변수 할당 및 초기화
		
		// testMethod 호출 종료 시 -> Stack에서 영역 제거 -> parameter, local 지역변수 소멸
		
		System.out.println(fc.global); //-> field는 문제 없음
		
		fc = null; // 할당을 새로 함 -> 기존 연결을 끊음 -> 연결이 끊어진 heap의 메모리는 순찰돌던 garbage collector가 자동으로 삭제함. 배열과 같다.
		
//		System.out.println(fc.global); // 실행하면 빨간에러. null이라 fc를 읽을 수 없다고 함.
		
		
		// 목표 str 출력하기
		
//		StaticController sc = new StaticController();
//		System.out.println(sc.str); // 노란전구 -> 이거 static field야
		System.out.println(StaticController.str); // ->결과는 위와 동일하나 올바른 static field 사용법. 객체를 메모리에 올린 적이 없는데 바로 사용??
			// 객체생성도 안 해도 됨. 이거 쓰고 바로 ctrl+shift+o 누르면 import 자동
		System.out.println(StaticController.VERSION); // static 필드와 같이 상수필드도 바로 사용가능
		
		
	}

}
