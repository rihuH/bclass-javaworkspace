package com.kh.controller;

public class StringMethod {
	
	// 문자열과 관련된 메소드들
	public void method1() {
		
		String str1 = "경실련하이텔 정보교육원";
		
		// 1. 문자열.length() : int
		// 문자열의 길이를 반환
		System.out.println("str1의 길이 : " + str1.length());
		
		// 2. 문자열.charAt(int index) : char
		char ch = str1.charAt(3);
		System.out.println("ch : " + ch);
		
		String phoneNumber = "010-1234-5678";
		// 0 1 0 - 1 2 3 4 - 5 6 7 8
		// 3. 문자열.substring() : String
		// 3-1. 문자열.substring(int beginindex) => 문자열의 beginindex위치에서 문자열 끝까지의 문자열을 추출해서 반환.
		System.out.println(phoneNumber.substring(4)); //1234-5678
		
		
		// 3-2. 문자열.substring(int beginindex, int endindex) : String => 시작지점부터 끝 인덱스 전까지만 해줌.
		System.out.println(phoneNumber.substring(4, 7)); // 123
		
		// 문자열.indexOf(str) : int => 특정 문자열의 인덱스를 알고 싶을 때.
		System.out.println(str1.indexOf("구")); // 9
		
		String email = "hong@kh.com";
		System.out.println(email.substring(0, email.indexOf("@"))); // hong
		
		// 4. 문자열.toCharArray() : char[]
		// 문자열의 각 문자들을 char[]에 옮겨 담은 후 해당 배열을 반환
		char[] chArr = email.toCharArray();
		for(char c : chArr) {
			System.out.println(c);
		}
		
		// char[] -> String
		System.out.println(String.valueOf(chArr));
		
		// 5. 문자열.replace(char old, char new) : String (char라 써있는데 String도 됨)
		System.out.println(email.replace("kh", "google")); // hong@google.com
		System.out.println(email); // hong@kh.com -> print구문에서 수행된 것은 한 번만 수행되고 저장되지 않는다.
		
		String str3 = "                       JAva sdlkj eslif";
		//6. 문자열.trim() : String
		// 문자열 앞 뒤 공백을 제거한 문자열을 반환.
		System.out.println(str3.trim()); // JAva sdlkj eslif
		
		
		// 7. 문자열.toUpperCase() : String -> 모든 문자열을 대문자로 바꾼 후 문자열로 반환
		// 	 문자열.toLowerCase() : String -> 모든 문자열을 소문자로 바꾼 후 문자열로 반환.
		// 	isLowerCase(char), isUpperCase(char) -> true, false로 반환
		System.out.println(str3.toUpperCase());
		System.out.println(str3.toLowerCase());
		
	
		
		
		/*
		int num = 0;
		System.out.println("n 처음 : " + num);
		while(num++ < 5) { // 조건문을 읽더라도 ++ 계산하고 넘어간다.
			System.out.println("while에서의 num " + num);
		}
		*/
		
	}
	/*
	 * 문자열을 대문자로 만들어주는 기능
	 * 문자열을 이쁜 대문자로 만들어주는 기능
	 */
	
	public String method2(String str) {
		
		// 바꾸기
		
		char[] chArr = str.toCharArray();
		/*
		System.out.println((int)'a');
		System.out.println((int)'A');
		소문자 - 32 = 대문자
		*/
		for(int i = 0; i < chArr.length; i++) {
			if('a' <= chArr[i] && chArr[i] <= 'z') {
				chArr[i] -= 32;
			}
		}
		
		String upper = String.valueOf(chArr); // 이거 뭐지?? 이 배열에 있는 값들을 모두 string으로 만들어주는거같은데.
		
		return upper;
		
	}
	

}
