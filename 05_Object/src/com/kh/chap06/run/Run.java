package com.kh.chap06.run;

import java.util.Scanner;

import com.kh.chap06.controller.MethodController;
import com.kh.chap06.controller.OverloadingController;

public class Run {

	public static void main(String[] args) {

		MethodController mc = new MethodController();
		
//		mc.abc();
//		System.out.println(mc.abc());
		
		Scanner sc = new Scanner(System.in);
		
		/*
		int count = 0;
		int correct = 0;
		while(true) {
	
		System.out.println("더하기 퀴즈 프로그램~~~🧠🧠🧠🧠🧠🧠🧠🧠");
		System.out.println("두 개의 정수를 입력해주세요! ");
		System.out.print("첫 번째 정수 > ");
		int firstNum = sc.nextInt();
		System.out.print("두 번째 정수 > ");
		int secondNum = sc.nextInt();
		System.out.print("두 수의 합은 얼마입니까 > ");
		int answer = sc.nextInt();
		
		int sum = mc.add(firstNum, secondNum);
		
		if(sum == answer) {
			System.out.println("딩동댕 정답입니다! 정답 : " + sum);
			count++;
			correct++;
			
		} else {
			System.out.println(answer + "은 오답입니다. 땡. 정답 : " + sum);
			count++;
		}
		System.out.println("지금까지 정답률 : " + correct + " / " + count + "( " + ((correct * 100 / count)) + " %)");
		
		
	}*/
		
//		mc.method1(); // 반환값이 없고 메소드가 실행되기만 함
//		mc.method2(); // 코드는 실행되고 return값은 저장되지 않아 날아감
//		System.out.println(mc.method2()); // method2구문을 수행하고, return값을 출력하게 된다.
//		System.out.println(mc.method3()); // method2구문를 실행하고, return값을 출력하는 것과 같은 결과
//		mc.setController(40);
//		int returnInt = mc.method4(5);
//		System.out.println(returnInt);
		/*
		mc.test(mc);// 스택에는 위에서의 객체생성에 의해 mc영역이 생성되어있음. test를 호출하면서 test 영역이 위에 쌓임.
		// test영역 안에 할당받아야 하는 mc영역 생성됨. 각 mc영역은 저장된 공간의 위치는 다르나, 둘 다 heap영역에 있는 mc를 가리키고 있다. 같은 주소값을 저장하고 있다.
		// method3은 heap영역에 올라가있고, method2도 heap영역에 있어서 호출할 수 있는 것.
		// static은 heap영역에 없고 다른 영역에 존재하기 때문에 static함수만 부를 수 있음.
	
		
		int[] nums = {1, 2, 3};
		System.out.println(Arrays.toString(nums));
		*/
		
		OverloadingController oc = new OverloadingController();
		oc.test();
		oc.test(5);
		
		
	}
	
	

}
