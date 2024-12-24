package com.kh.operator;
import java.util.Scanner;

public class C_Compound {
	
	/* 복합 대입 연산자 : "=" 대입연산자.
	 * 
	 * 다른 산술연산자와 대입연산자가 결합한 것
	 * =>자기 자신의 값과 해당 산술연산을 한 후에 그 결과를 자기자신에게 다시 대입하는 용도
	 */
	
	// 아래 5개
	// +=
	// -=
	// *=
	// /=
	// %=

	
	/* 예시
	 * int days = 365;
	 * 매일 23시59분59초에 실행할 코드 : days = days - 1;
	 * => days -= 1;
	 * 
	 * System.out.println("종강일 까지 " + days + "일 남았습니다.");
	 * 
	 */
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("임의의 정수를 입력해주세요 : ");
		int num = sc.nextInt();
		System.out.println("현재 num : " + num);
		
		// 사용자가 입력한 정수 값은 알 수 없음.
		// num을 2 감소시키고 싶음
		num = num - 2;
		System.out.println("2를 감소시킨 num : " + num); 
		
		// 복합대입 연산자를 이용한다면
		num -= 2;
		System.out.println("2를 감소시킨 num : " + num);
		
	}
	
}
