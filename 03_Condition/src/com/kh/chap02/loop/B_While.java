package com.kh.chap02.loop;

public class B_While {
	
	/* while문
	 * [표현법]
	 * 초기식; // while 전 미리 선언. 필수는 아님
	 * while(조건식){
	 * 	반복적으로 실행하고자 하는 코드;
	 * 	증감식; // 필수는 아님
	 * }
	 * 
	 * while문의 조건식의 결과값이 true일 경우 반복적으로 실행하고자 하는 코드가 실행
	 * 
	 * for		=> 개발자가 반복의 횟수를 명확하게 알고 있다.
	 * while	=> 개발자가 반복의 횟수를 가늠할 수 없음.
	 * 
	 * 
	 * 무한반복
	 * 
	 */
	
	public void method1() {
		
		while(true) {
			System.out.println("반복해서 출력하고 싶어요.");
		}
	}
	
	public void method2() {
		
		// 초기식, 조건식, 증감식
		
		int i = 0; 
		
		while(i < 3) {
			//i++; 012, 123 중 뭐로 출력하고 싶은지에 따라서
			System.out.println(i + "번째 반복");
			i++;
		}
		
		i = 10;
		while(i > 6) {
			System.out.println(i);
			i--;
		}
		
		i = 1;
		while(i < 10) {
			System.out.println(i);
			i += 2;
		}
	}
	
	public void method3() {
		// 1단계. 1부터 100까지 정수 더한 합계 출력
		
		int i = 1;
		int sum = 0;
		
		while(i <= 100) {
			sum += i;
			i++;
			//100번 반복 후에 합을 출력하고 싶음. 이 곳에 if문을 작성하거나,
				//	if(i == 0)
			//while문 밖에 작성하거나.
			//while문 밖에 작성하는 것이 좀 더 낫다. 왜냐하면 if문이 출력되지 않더라도 if문이 있으면 무조건 조건식을 판단하기 때문.
			
		}
		
		System.out.println("합계 : " + sum);
		
		// 1~100까지의 정수 중 짝수만 더해서 결과 출력!
		
		i = 2;
		sum = 0;
		while(i <= 100) {
			if(i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		
		System.out.println("짝수들의 합 : " + sum);
		
	}
	
	public void method4() {
		
		// 1부터 10 사이 랜덤한 정수까지를 모두 더한 합계 출력
		// random : 무작위 => 임의난수
		// Random이라는 클래스가 존재
		// Math라는 클래스가 가지고 있는 random() 활용 -> import + 별칭짓기 를 해야한다고 배웠는데 얘는 그냥 씀.
		// Math.random(못 넣음); => M 대문자 주의
		
		System.out.println(Math.random());
		// random()의 결과값 : 0.0 ~ 0.99999999999999999 사이의 값
		
		// 1단계. random() 호출 결과체크
		double num = Math.random();
		System.out.println("무작위 실수 : " + num);
		// 2_1단계. num에 10을 곱
		// 2_2단계. int형으로 강제 형변환 -> 0~9
		// 2_3단계. +1
		
		System.out.println("1-10 : " + ((int)(10 * num) + 1));
		
		// 3단계. 누적합계 구하기.
		// 1부터 10까지 랜덤한 수들을 더한 합계.
		
		int randomNum = (int)(Math.random() * 10 + 1);
		int i = 1;
		int sum = 0;
		while(/*1부터 10까지 중 무작위*/ i < randomNum) {
			sum += i;
			i ++;
		}
		System.out.println("i = " + i);
		System.out.println("1부터 무작위 수까지 더한 결과 : " + sum);
	}
	
	public void lotto() {
		// 로또번호 생성기 ver_0.1
		// 번호범위 : 1~45
		// 6개 선택
		
		int num1 = (int)(Math.random() * 45) + 1;
		int num2 = (int)(Math.random() * 45) + 1;
		int num3 = (int)(Math.random() * 45) + 1;
		int num4 = (int)(Math.random() * 45) + 1;
		int num5 = (int)(Math.random() * 45) + 1;
		int num6 = (int)(Math.random() * 45) + 1;
		
		System.out.println(num1 + "\n" + num2 + "\n" + num3 + "\n" + num4 + "\n" + num5 + "\n" + num6);
		
		byte bNum= (byte)132;
		System.out.println(bNum);
	}
	
	/* do-while
	 * 별도 조건검사 없이, 조건이 true값이 아니더라도 무조건 한 번은 꼭 수행!
	 * [표현법]
	 * 초기식; // 필수x
	 * do{
	 * 		실행할 코드;
	 * 		증감식; // 필수x
	 * }while(조건식);
	 * 
	 */
	

	
	
	
	
	

}
