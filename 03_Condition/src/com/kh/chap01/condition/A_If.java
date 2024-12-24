package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	
	/* (단일) if문
	 * 
	 * [표현법]
	 * 
	 * if(조건식) { 조건식이 true 일 경우 실행하고자 하는 코드; }
	 * 
	 * 	=> 조건식의 결과가 true일 경우 if문 뒤에 붙은 {} 중괄호 안의 코드 수행
	 * 	=> 조건식의 결과가 false일 경우 if문 뒤에 붙은 {} 중괄호 건너뜀.
	 * 
	 */
	
	public void method1() {
		
		// if문의 조건식 자리에는 결론적으로 true/ false 논리값이 들어가야 함!
		if(true) {
			System.out.println("여러분 조금 있으면 점심시간입니다.");
			
		}
		
		if(false) { 
			System.out.println("얘는 출력 안 됩니다.");
		}
		
	}
	
	public void method2() {
		
		boolean loginCheck = false; // 로그인 상태를 저장해 둘 변수
		
		if(loginCheck == false) {
			System.out.println(" 네이버를 더 안전하고 편리하게 이용해보세요.");
			System.out.println(" NAVER 로그인");
			System.out.println("아이디찾기 | 비밀번호 찾기 | 회원가입");
		}
		
		if(loginCheck == true) {
			System.out.println("홍길동님 환영합니다 :)");
			System.out.println("메일 | 카페 | 블로그 | 쇼핑 | 예약");
		}
		
	}
	
	public void lunchMenu() {
		
		//오늘의 날씨를 입력받아서 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("오늘의 날씨를 입력해주세요(맑음/ 비옴/ 눈옴) > ");
		String weather = sc.nextLine();
		// 문자열 값 비교
		// 동등비교연산자(==)는 사용이 불가능.  비교 하긴 하는데 value값을 비교하는 것이 아님.
		// => 그래서 문자열이 가지고 있는 '비교하는 기능'을 이용해야함.
		// 비교하려는문자열.equals(비교대상)를 호출해야함
		
//		System.out.println(weather == "맑음"); // 맑음을 쳐도 false라고 나옴
//		System.out.println("맑음".equals(weather)); // weather와 맑음 둘 다 앞뒤상관 없는데 / weather.equals("맑음")/ 정석은 맑음이 앞에
		
		//점심메뉴를 추천해주는 프로그램
		// 맑음/ 비옴/ 눈옴
		/*
		// 조건 
		// 만약에 사용자가 입력한 문자열이 "맑음"과 일치한다면 영춘옥
		//  if     weather			"맑음"   .equals()
		if(weather.equals("맑음")) {
			System.out.println("영춘옥 가서 김두한씨 싸인보고 곰탕드세요.");
		}
		
		// 조건
		// 만약에 사용자가 입력한 문자열이 "비옴"과 일치한다면
		if(weather.equals("비옴")) {
			System.out.println("정원순두부에가서 차돌 와규 순두부를 드세요.");
		}
		
		if(weather.equals("눈옴")) {
			System.out.println("1982컵밥에 가서 컵밥 드세요");
		}
		*/
		
		String menu = (weather.equals("맑음")) ? "영춘옥" : "정원순두부";
		System.out.println("오늘의 점심 추천 가게는 " + menu + "입니다.");
		
	}
	
	public void method3() {
		// 사용자에게 정수 값을 입력받아서 홀/짝을 판별 => 출력
		// if문을 이용해서 출력!
		// 단, 입력받은 정수가 0보다 클 경우에만 조건문을 실행!
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수주세요 > ");
		int num = sc.nextInt();
		
		// if num> 0 
		// num % 2 == 0;
		
		boolean flag = num > 0;
		
		// 만약에 사용자가 입력한 값이 0보다 크고, 사용자가 입력한 값이 짝수라면
		//							AND			num
		/*
		if(flag && num % 2 == 0) {System.out.println("even");} // 수행할 게 하나밖에 없다면 한 줄로 해도 됨.
		// 사용자가 입력한 값이 홀수 	 사용자가 입력한 값이 0보다 큼
		if(flag && num % 2 != 0) {System.out.println("odd");} // 코드 상에 중복은 가능하다면 무조건 없어야 함. 여기선 num > 0 같은 애.
		 =>  이렇게 하면 if문을 최소 2번*/
		
		if(flag) {
			if(num % 2 == 0) System.out.println("짝수");
			if(num % 2 == 1) System.out.println("홀수");
		} // 이렇게 하면 최소 1번

	}

	
	// 푸른 용 라떼 가격 알려주기
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 메뉴판 보여주기 -> 출력문. System.out.prinln();
		// 2. 메뉴번호로 메뉴 입력받기
		// 3. 수량 입력받기
		// 4. 진짜 주문할건지 물어보기
		// 5. 메뉴명/ 수량/ 가격 출력
		
		System.out.println("===🐱‍🐉🐱‍🐉메뉴판 🐱‍🐉🐱‍🐉===");
		System.out.println("1. 얼그레이 바닐라 티 라떼(1000)");
		System.out.println("2. 블랙 글레이즈드 라떼(1500)");
		System.out.println("3. 에스프레소 쿠키 라떼(2000)");
		System.out.println("주문하실 메뉴 번호를 입력해주세요 > ");
		int num = sc.nextInt();
		
		if((0 < num) && (num < 4)) {
			System.out.println("수량을 입력해주세요 > ");
			int cup = sc.nextInt();
		

			System.out.println("주문하시겠습니까? y/n");
			sc.nextLine();
			String confirm = sc.nextLine();
			boolean yes = (confirm.equals("y")) ? true : false;

			if(yes) {				
				String menu = (num == 1) ? "얼그레이 바닐라 티 라떼" : (num == 2) ? "블랙 글레이즈드 라떼" : "에스프레소 쿠키 라떼";
				int price = (num == 1) ? 1000 : (num == 2) ? 1500 : 2000;
				System.out.println(menu + " 총 " + cup + "잔 " + (price*cup) + "원 입니다.");
				System.out.println(".A__A    ✨🎂✨    A__A\r\n"
					+ "( •⩊•)   _______   (•⩊• )\r\n"
					+ "(>🍰>)   |     |   (<🔪<)\r\n"
					+ "");
		}
	}
		
		String menuName = ""; // 빈칸선언 가능. 이것도 빈 문자열로 초기화 한 것. 밑에서 if로 대입하더라도 if에 해당하지 않는 값이 들어올 수 있으므로.
		if(num == 1) {menuName = "얼그레이 바닐라 티 라떼";} // 와 같은 방식도 가능
		// =>  if 외의 값을 입력해서 menuName에 아무 값도 안 들어가있다면 출력해도 빈칸이 나올 것.
		
		if((num < 1) || (3 < num)) { 
			System.out.println("없는 메뉴를 주문하셨습니다.");
			System.out.println("    … @ @ . .\r\n"
					+ ". . (‘ o ‘) . .\r\n"
					+ " .  º(___)º .\r\n"
					+ "");
		}
		
	}
	
	/* Java를 사용함으로 인해서 컴퓨터상 memory공간에서 일어나는 일을 이해하는 것이 목적 (어떤 값이 어떤 공간에 어떻게 저장되는가? 언제 들어가고 언제 사라지는지? - 문법은 따라쓰면 됨. 공간과 값은 내가 이해해야 함)
	 * main method가 올라가는 공간/ 호출되는 method가 자리잡는 공간/ 호출되는 메소드가 저장되어 있는 공간  다 다른 공간에 존재
	 * 변수 선언하면 먼저 선언한 순서대로 밑에서부터 차곡차곡
	 * 메소드 닫는 }를 만나면 그 끝난 메소드를 부른 곳으로 돌아감. (메소드는 무조건 호출해야 일 하니까 메소드가 작동했다는 건 누가 호출했다는거)
	 * 메모리에 있던 끝난 메소드데이터는 전부 사라짐
	 * 
	 */
	
	/* 컴퓨터
	 * 컴퓨터 구성요소 크게 3분류로 나누면 -> H/W(하드웨어) - CPU, RAM,  + SSD, HDD,(저장장치), GPU(그래픽카드), NIC(램카드), 마우스, 키보드, 모니터, 스피커... 실체가 있는 것들., 
	 * 프레임 역할 - main board(마더보드라고도 함) - 여기에 위 부품들을 장착. 메인보드 내장된 프로그램은 메인보드에 장착된 부품이 컴퓨터 켤 때 잘 실행되고 있는가, 호환되는가 확인
	 * 2. 운영체제 O/S : 사용자들이 컴퓨터를 다룰 수 있게. 메인보드만 있는 상태로 컴퓨터 실행하면 아무 일도 안 나타남. 이걸 다룰 수 있도록 해주는 것
	 *  - windows, linux, mac os, -- 하드웨어를 운영체제가 다룰 수 있도록 커널, 다리를 놔주는데 이걸 드라이버(driver)라고 함. 메인보드 드라이버, 운영체재에서 드라이버 설치해서 사용하면 메인보드를 사용할 수 있게 됨
	 *  예컨대 그래픽 드라이버, 등의 인터페이스 제공. 
	 *  프로그램은 시스템프로그램과 응용프로그램/ OS에 포함되지 않는 프로그램은 전부 응용프로그램이고 거의 대부분 개발자는 응용프로그램 개발자이다
	 *  응용프로그램은 3번짜 구분인 운영체제 위에서 동작, 즉 S/W , - 운영체제에서 동작하는 프로그램을 만들게 된다.
	 *  운영체제가 더 먼저 만들어졌으니까 운영체제에는 응용프로그램을 다룰 방법이 없음 - 응용프로그램에서 운영체제가 자기 결과물을 다룰 수 있도록 파일이라는 형태로 배포 즉 다리역할
	 *  응용프로그램에 파일을 거쳐서  운영체제 거쳐서 드라이버를 거쳐서 cpu, ram에 저장되어 작동하는 것
	 *  자바는 소프트웨어 상에 레이어를 하나 더 만들어(jvm)서 작동 하도록. 그래서 hw로 가지 않고 프로그램이 jvm에서 동작. jvm 자체는 운영체제별로 다르지만
	 *  ram에 있는 실행에 쓰였던 메모리를 비우는 일은 개발자가 해야 함. java는 그 기능이 내장되어있어서 java는 메모리관리를 신경쓰지 않아도 된다고 함. 그래서 자바가 쉽다고 함.
	 *  cpu는 멀티 안됨, 엄청 짧은 초를 각 할당해서 순차적으로 여러 개 작동시키고 있을 뿐,
	 *  프로그램이 메모리에 올라가면 프로세스. 스레드는 실행 흐름을 하나 더 만드는 작업 
	 * 
	 */
}
