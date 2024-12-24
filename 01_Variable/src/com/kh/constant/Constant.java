package com.kh.constant;
/*만든 project(00_myfirst--) 이름 바꾸기 누르고 f2*/
public class Constant {
	
	/*상수(수학)
	 * 변하지 않는 값
	 * Java라는 프로그래밍 언어를 사용해서 다룰 수 있는 값 형태의 종류	 */
	public static void main(String[] args) {
		/*println은 자동 다음줄, print는 바로 옆 출력*/
		//정수(양수, 음수)
		System.out.println(5);
		System.out.println(-5);
		
		//실수(.)
		System.out.println(0.5);
		System.out.println(-0.5);
		
		//문자열
		System.out.println("문자열");
		System.out.println("5"); /*출력은 5로 나오나 숫자 아니고 "문자열"취급*/
		
		//(단일)문자 ''쓰면 단일문자 취급. 문자열에 '' 쓰면 에러. 단일문자에 "" 써도 안 에러.
		System.out.println('밥');
		System.out.println('5'); /*출력은 5로 나오나 숫자 아니고 '단일문자'취급*/
		
		//논리값(true, false)
		System.out.println(true);
		System.out.println(false);/*true, false가 보라색이니 키워드(예약어)*/
		
		


	}
	
	

}
