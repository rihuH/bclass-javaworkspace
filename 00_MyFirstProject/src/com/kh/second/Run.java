package com.kh.second;

//import com.kh.first.HelloWorld;

//프로그램 실행을 위한 클래스
public class Run {
	
	public static void main(String[] args) {
		
		//printMyName(); /* 내 class 안에 있는 메소드는 내부, 그 밖에는 외부 클래스라 함*/
		
		// 외부 클래스에 존재하는 메소드들을 호출하고 싶을 때는?
		
		/*
		 * 호출할 메소드가 존재하는 클래스를 생성 해줘야함!
		 * 
		 * [표현법]
		 * "클래스이름" "클래스명을 대신할 별칭" = new "클래스이름()";
		 * 
		 * 나중에 객체지향시간에 깊게 다뤄볼 것(이번주 금 또는 다음주 목)
		 */
		ExamController ec = new ExamController(); /*ec 별칭, new가 생성한다는 뜻. 생성한 class가 같은 package에 존재하면 그냥 선언해주면 됨. 찾을 수 있으니까*/
		
		com.kh.first.HelloWorld fh= new com.kh.first.HelloWorld();
		
		// . : 참조연산자, 직접접근연산자
		ec.printMyName();
		fh.printMyName();
		
	}

}
