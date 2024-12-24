package com.kh.run;

import java.io.IOException;
import java.util.Date;

import com.kh.exception.controller.CheckedException;
import com.kh.exception.controller.UncheckedException;

public class Run {

	public static void main(String[] args) {

		/*
		 * 에러(error)
		 * 
		 * - 시스템 에러 : 컴퓨터의 오작동으로 인해 발생하는 에러
		 * 				=> (심각) 소스코드로 해결 안됨(자연재해같은 것. 내 잘못이 아님)
		 * 
		 * - 컴파일 에러 : 프로그램 실행 전 소스코드상의 문법적인 문제로 발생하는 에러
		 * 				=> 소스코드 수정으로 해결 가능.(IDE 컴파일러가 빨간줄로 알려줌)
		 * 
		 * - 런타임 에러 : 프로그램 실행 중 발생하는 에러. 문법적으로는 문제가 없는데 발생
		 * 				(스캐너로 nextInt 받았는데 문자가 입력된 경우 등)
		 * 				=> 사용자의 잘못일 가능성이 높긴 하지만
		 * 				=> 개발자가 예측 가능한 경우 처리하지 않았을 때!
		 * 				-> 예외라고 표현(내 의도와는 다르게 발생하는 오류들)
		 * 
		 * - 논리적 에러(logical error) : 소스코드 상 문제도 없고, 실행했을 때도 문제가 발생하지 않음.
		 * 							의도와는 다르게 동작함.(기획/ 설계를 잘못 했을 때)
		 * 
		 * 예외 : 시스템 에러를 제외한 나머지 컴파일 에러, 런타임에러, 로지컬 에러와 같이 비교적 덜 심한 애들.
		 * 		그 중에서도 주로 런타임에러를 의미한다.
		 * 
		 * 예외처리 방법
		 * 1. try ~ catch문을 이용한다.
		 * 2. throws 구분을 이용해서 떠넘긴다.
		 * 
		 */
		
		Date date = new Date(); // 개발자들을 위해 만들어둔 것들. 개발자는 사용만 하고 미리 제공해주는 것들을 API라고 한다.
		System.out.println(date);
		
		String[] strs = new String[]{"ae", "ee"};
		System.out.println();
		
		UncheckedException ue = new UncheckedException();
//		ue.method1();
//		ue.idCheck();
//		ue.method2();
//		ue.method3();
		
		CheckedException ce = new CheckedException();
		
		try {
			ce.method1(); // throws로 메소드를 호출하는 부분으로 IOException을 넘겨서, 여기서 예외처리 하지 않으면 에러.
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
