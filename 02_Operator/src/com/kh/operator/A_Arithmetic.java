package com.kh.operator;
import java.util.Scanner;

public class A_Arithmetic {

	/* 산술연산자 =>이항연산자, 우선순위가 일반수학과 동일. 
	* + : 덧셈
	* - : 뺄셈
	* * : 곱셈
	* / : 나눗셈
	* % : 모듈러(Modular) => 나눗셈에서 나머지를 구함. 
	*/	
	
	public void method() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);

		System.out.println(num1+num2); // 13

		System.out.println("num1 + num2 : " + num1 + num2); 		
		// 결과값은 "num1+ num2 : 103"  -> 컴퓨터처럼 생각하기. 산술연산자가 일반수학과 동일한 우선순위를 가지고 있기 때문. 
		// 문자열은 기본자료형이 X. 그래서 문자열+다른 것 하면 무조건 문자열이 됨. 
		// 1) 앞 +가 먼저 수행되어서, "num1+num2 : 10" 문자열. 그리고 +3 계산해서 "num1+num2: 103"
		System.out.println(num1+"num1 + num2 : " + num1 + num2); 	// 10num1+num2 : 103
		System.out.println("num1 + num2 : " + (num1 + num2)); 		// 괄호로 연산 우선순위를 지정하여야만 의도한 결과를 출력할 수 있다.
		System.out.println(num1+num2+"num1 + num2 : " + num1 + num2); 	// 13num1+num2 : 103. 앞에서부터 계산함.
		
//		System.out.println("num1-num2 : " + num1-num2); // 빨간줄 에러
			// 1단계 "num1-num2 : 10" 2단계 -는 못함. ()치면 됨.
		System.out.println("num1 + num2 : " + (num1 - num2)); 		
		
		System.out.println("num1 x num2 : "+num1 * num2); // "num1 x num2 : 30" =>곱하기는 괄호 안 쳐도 우선순위가 높아서 미리 계산.
			//계산 당시는 정수형이었겠지만 결론은 ""문자열 데이터가 나온다는 것 주의. 30까지도 문자열. 하지만 괄호 권장
		System.out.println("num1 x num2 : "+(num1 * num2)); // 사람이 코드 읽기 쉬우라고. 친절하게 할 것.
		
		// *,/,%, 우선순위가 +-보다 높아서 묶지 않아도 먼저 연산되지만, 가독성을 위해 괄호 사용 권장. (유지보수)
		
		System.out.println("num1 / num2 : " + (num1/num2)); // num1/num2 : 3
		System.out.println("num1 mod num2 : " + (num1%num2)); //num1 mod num2 : 1
		
		// * 특이케이스
		int num3 = 0;
//		System.out.println(5/ num3);
		// ArithmeticException: / by zero 에러
		// 정수를 0으로 나눌 수 없음.
		

		
	}
	
	//크리스마스
	
	// 메소드명 : presentToSturdent() => 메소드선언
	
	// 입력받을 값 : 1. 신청 인원 수, 2. 선물 개수 =>Scanner
	// 출력 형식 : 신청 인원 당 받을 수 있는 선물의 개수, 남는 선물 개수. => println(), 남는 선물 %
	
	public void presentationToStudent() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("신청할 인원 수를 기재해주세요 > "); // 그러니까 이게 입력칸보다 먼저 나와야함
		int people = sc.nextInt(); // 입력칸이 뜨게 됨

		System.out.println("선물 개수를 입력해주세요 > ");
		int count = sc.nextInt();
		
		System.out.println(people+"명 신청하셨습니다. 총 선물 개수는 " +count + "개 입니다.");
		
		int result1 = count / people;
		int result2 = count % people;
		System.out.println("인당 "+ result1+ "개씩 받을 수 있습니다.");
		System.out.println("남은 선물의 개수는 "+ result2+"개 입니다.");
		
	}
	
	
	

	
}
