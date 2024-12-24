package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {
	
	/*
	 * CheckedException
	 * 문법적으로 반드시 예외처리를 해야하는 예외들
	 *  => 주로 외부 매체 입/출력시
	 *
	 */
	
	public void method1() throws IOException {
		
		// 사용자에게 문자열을 하나 입력받아서
		// 입력받은 문자열의 길이를 출력
		
		System.out.print("아무 문자열이나 입력해주세요");
/*
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); // API(Application Programming Interface) 때문에 예외처리 하지 않고 사용할 수 있음.
	*/
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		// System.in이 인풋스트림이고 buffer는 보조스트림. 원래 같은 계열끼리만 보조할 수 있음. System.in이랑 버퍼리더는 타입이 달라서
		// 사이에 inputstreamreder라는 보조스트림을 붙이고 버퍼리더라는 보조스트림을 붙여서 사용했던 것.
		String str = "";
		
		// catchedException/ 방법1 try~catch문으로 직접 처리해야함 : 코드 작성 부분에서 처리.
		/*
		try { 
			str = br.readLine(); // Unhandled exception type IOException // 예외 처리 안 하면 빨간줄 뜨는 것.
		} catch(IOException e) {
			e.printStackTrace();
		}
		*/
		
		
		str = br.readLine();
		
		// 방법2. throws : 코드작성 부 말고 메소드를 호출 하는 부분으로 예외처리를 위임하겠다.
		
		
		
		
		System.out.println(str.length());
		
		
		
	}

}
