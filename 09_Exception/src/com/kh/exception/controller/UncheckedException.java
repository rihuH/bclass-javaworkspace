package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException { // 컴파일러가 알려주지 않는 exception
	
	/*
	 * 프로그램 실행 시 발생하는 예외들
	 * RuntimeException 자식들
	 * 
	 * - NullPointerException : 주소값 객체를 참조했더니 null값이 들어있을 경우 발생하는 예외
	 * - ArrayIndexOutOfBoundsException : 배열의 부적절한 인덱스로 접근했을 때 발생하는 예외
	 * - ArithmeticException : 나누기 연산을 0으로 나누면 발생하는 예외
	 * - ClassCastException : 허용할 수 없는 형변환을 진행할 경우 발생하는 예외
	 * - NegativeArraySizeException : 배열크기를 음수로 지정할 경우 발생하는 예외
	 * ... 등등
	 * 
	 * RuntimeException과 관련된 예외들은 공통점이 있음.
	 * 개발자가 예측이 가능함.
	 * 
	 * 
	 * 
	 */
	
	// ArithmeticException
	public void method1() {
		// 사용자에게 두 개의 정수값을 입력받아 나눗셈 결과 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력해주세요 > ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력해주세요 > ");
		int num2 = sc.nextInt();
		
		/* 방법 1. 조건문으로 처리하기(예외발생을 막음)
		if(num2 != 0) { //예외처리를 해줘야 프로그램이 비정상적으로 종료되지 않음.
			System.out.println("나눗셈 결과 : " + (num1 / num2));			
		} else {
			System.out.println("0을 넣지 말랬는데~~");
		}
		*/
		// 소스코드를 컴파일해서 컴퓨터가 알아볼 수 있는 언어로 만든 것을 프로그램이라고 함.
		// 프로그램을 실행한다는 것은 메모리에 올렸다는 뜻
		// 프로그램이 메모리에 올라가 동작하고 있는 상태를 프로세스라고 함. (프로세싱 중)
		// 위에서 아래로 코드 읽어가며 실행하는 흐름을 스레드라고 표현함.
		
		// 방법 2. 예외처리 구문을 아용
		// 예외가 발생했을 때 실행할 내용을 정의해두는 것.
		
		/*
		 * try ~ catch문
		 * 
		 * [표현법]
		 * 
		 * try {
		 * 		(num1 / num2) // 예외가 발생할 법한 구문을 try블록 안에 넣는다.
		 * } catch(발생할예외클래스명 변수명){ => 매개변수와 같은 역할
		 * 		해당 예외가 발생했을 때 실행할 구문
		 * }
		 * 
		 */
		
		try {
			System.out.println("try문이 시작됨"); // 오류가 발생하기 전에 있는 구문은 출력이 된다.
			System.out.println("나눗셈 결과 : " + (num1 / num2)); // 예외가 발생한 순간 바로 catch문으로 들어감. 오류가 발생한 문장 아래로 전부 출력되지 않음.
			System.out.println("올바른 정수값이 입력됨!");
		} catch(ArithmeticException e) { // 보편적으로 캐치블록의 매개변수면은 exception의 앞글자인 e만 적는다.
			// 에러가 일어나지 않은 경우 catch문은 건너 뜀.
			System.out.println("두 번째 정수에 0을 입력하시면 나눌 수가 없습니다.");
			e.printStackTrace(); // 어디서 어떤 에러가 발생했는지 출력해준다(개발단계에서는 알아야 하기 때문)
		} // 예외가 발생하지 않은 것은 아님. 프로그램 급종료와 사용자가 에러가 발생한 사실을 모를 뿐.
		
		
		
	}
	
	public void idCheck() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("5~10자 사이의 아이디를 입력해주세요 > ");
			String id = sc.nextLine();
			
			if((id.length() < 5) || (id.length() > 10)) {
				System.out.println("5글자에서 10자 사이의 값을 입력해주세요");
				continue;
			}
			break;
		}
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요(0은 제외) > ");
		try {
			int num = sc.nextInt();// 
			// -> InputMismatchException
			sc.nextLine();
			System.out.println("100을 입력한 정수로 나눈 결과 : " + (100 / num));
			// -> ArithmeticException
		} catch(InputMismatchException e) { // catch도 오류 나는 순서대로 해주는게 좋다. 1. 먼저 입력받은 값이 정수인지 판단
			System.out.println("정수만 입력해주세요");
		} catch(ArithmeticException e) { // 2. 정수가 맞다면 0인지 판단
			System.out.println("0을 입력하지 말아주세요.");
		} // 다중캐치문
		
		System.out.println("프로그램 종료");
	}
	
	public void method3() {
		// 배열
		
		// 사용자에게 정수값을 입력받아서
		// 입력받은 만큼의 크기를 가진 배열을 생성하고
		// 100번째 인덱스값을 출력
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("정수값을 입력해주세요 > ");
		
		/*
		try {
			int size = sc.nextInt(); // InputMismatchException
			int[] arr = new int[size]; // NegativeArraySizeException : 배열의 크기를 음수로 지정할 때 발생하는 예외
			System.out.println(arr[100]); // ArrayIndexOutOfBoundsException : 배열의 크기보다 큰 인덱스에 접근할 때 발생하는 예외
		} catch(InputMismatchException e) {
			System.out.println("정수만 입력해주세요");
		} catch(NegativeArraySizeException e) {
			System.out.println("0보다 큰 수로 입력해주세요");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("100보다 큰 수를 입력해주세요.");
		} // 하지만 하나하나 처리해주기 힘들다.
		*/
		
		try {
			int size = sc.nextInt(); // InputMismatchException
			int[] arr = new int[size]; // NegativeArraySizeException : 배열의 크기를 음수로 지정할 때 발생하는 예외
			System.out.println(arr[100]); // ArrayIndexOutOfBoundsException : 배열의 크기보다 큰 인덱스에 접근할 때 발생하는 예외
		} catch(RuntimeException e) { // RuntimeException으로 한 번에 할 수 있는 이유는 다형성때문임. *** 중요
			System.out.println("정수가 아니거나 0보다 큰 수를 입력했거나 100보다 작은 수를 입력했어요.");
		} /*catch(InputMismatchException e) { // unreachable 블록이라는 빨간에러. 위에서 다 handled 되기 때문 -> 위에 쓰면 됨. 순서가 중요하게 된다.
			System.out.println("숫자만 넣으세요");
		}*/ // 다중 catch문 작성 시 범위가 작은 자식 타입의 클래스부터 기술해야함.
 
		
		
		
	}
	
	

}
