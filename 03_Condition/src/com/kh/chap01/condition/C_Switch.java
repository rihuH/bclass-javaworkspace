package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {
	
	public void method0() {
		
		// ctrl + shift + o(알파벳) ->import단축키
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 층에 가시나요 > ");
		int floor = sc.nextInt();
		
		switch(floor) { // 실제 값으로 비교
		case 1 : System.out.println("지하 1층입니다. 문이 열립니다."); break; // break switch문 자체를 멈추고 }바깥으로 빠져나감
		case 2 : System.out.println("지하 2층입니다. 문이 열립니다."); break;
		case 3 : System.out.println("지하 3층입니다. 문이 열립니다."); break;	
		}
	}
	
	/* Switch문
	 * 
	 * [표현법]
	 * 
	 * switch(case에 기술할 동등비교할 대상자){
	 * case 정수, 문자, 실수, 문자열 .. : 실행할 코드;
	 * }
	 * 
	 * switch(정수 || 문자 || 문자열 - 변수) {
	 * case 값1 : 실행할 코드; // 동등비교대상 == 값1 true일 경우 실행할 코드를 수행
	 * break; // switch영역을 빠져나감.
	 * case 값2 : 실행할코드; // 동등비교대상 == 값2 true일 경우 실행할코드를 수행
	 * break;
	 * case 값n : 실행할코드;
	 * break;
	 * default : 실행할 코드; // ==else와 같은 역할
	 * }
	 * 
	 */
	
	public void method1() {
		// 사용자에게 값을 입력받아서 홀수/짝수 판별
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 > ");
		int num = sc.nextInt();
		
		int oddEven = num % 2; // 0 : 짝수, 1 : 홀수
		
		switch(oddEven) {
		case 0 : System.out.println("짝수입니다."); break; // break가 없으면 [짝수입니다/홀수입니다] 둘 다 출력이 됨. 
		case 1 : System.out.println("홀수입니다."); break; // 홀수일 때 break 없으면 case0은 건너뛰고 1 수행하고 탈출해서 문제 없음.
		}
	}
	
	// 샌드위치, 햄버거, 김밥, 돈까스, 우동, 떡볶이
	public void method2() {
		// 사용자에게 구매할 음식의 이름을 입력받아
		// 각 음식마다의 가격을 출력해줄 것
		// 6000 7000 4000 15000 5000 8000
		
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴를 선택해주세요(샌드위치, 햄버거, 김밥, 돈까스, 우동, 떡볶이) > ");
		String menu = sc.nextLine();
		
		
		// 행이동 alt + ↑,↓
		/*
		switch(menu) {
		case "샌드위치" : System.out.println("6000원 입니다."); break; // if문으로 했더라면 menu.equals("")를 사용했을텐데, switch문은 타입 맞춰주면 알아서 그 함수로 계산해준다.
		case "햄버거" : System.out.println("7000원 입니다."); break;
		case "잔치국수" : 										// break 없으면 아래로 내려간다 했으니까 여기를 지워버릴 수 있음. 그러나 이렇게 하지 않는게 권장. 다른사람도 봐야하니까.
		case "김밥" : System.out.println("4000원 입니다."); break;
		case "돈까스" : System.out.println("15000원입니다.");break;
		case "우동" : System.out.println("5000원입니다."); break;
		case "떡볶이" : System.out.println("8000원입니다."); break;
		default : System.out.println("그런 메뉴는 존재하지 않습니다."); // 마지막은 break 없어도 문제 없으므로 보통 붙여주지 않는다.
		}
		*/
		
		int price = 0;
		switch(menu) {
		case "김밥" : price = 4000; break;
		case "우동" : price = 5000; break;
		case "떡볶이" : price = 8000; break;
		case "햄버거" : price = 7000;break;
		case "돈까스" : price = 15000; break;
		case "샌드위치" : price = 6000; break;
		default : System.out.println("그런건 없어요~"); return; // return - 나(메소드. 메소드 블록 어디에서 만나든 상관없음). 현재 실행되고 있는 메소드 영역을 아예 빠져 나간다. method2()의 끝}으로. 
			// 그리고 메소드를 호출한 부분으로 돌아간다.
		}
		
		if(price != 0) {
		System.out.println(price + "원 입니다");
		}
	}// return을 만나면 빠져나오는 부분. 메인메소드로 가는게 아니고 메소드 호출하는 부분으로 가는 것
	
	
	public void login() {
		
		// 로그인 기능 만들기
		// 사용자가 입력한 아이디 값, 비밀번호 값
		
		//로그인 시 필요한 선행 작업 : 회원가입
		
		//1. 회원가입 시 사용자가 원하는 아이디값과 비밀번호 값을 입력하여 회원가입을 진행함
		//2. 가입 시 입력했던 아이디와 가입 시 입력했던 비밀번호값을 둘 다 정확히 입력한다면 로그인 성공 화면 출력
		//3. 가입 시 입력했던 아이디 또는 비밀번호가 하나라도 일치하지 않다면 로그인 실패 화면 출력
		
		// 하단의 정보로 회원가입을 진행했다고 가정함!
		String id = "user01";
		String password = "pass01";
		String nickName = "홍길동";
		
		//-----------------------------------//
		System.out.println("한가인이 선택한 에셀라이트");
		System.out.println("====================");
		System.out.println("로그인 서비스입니다.");
		System.out.println("==============");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------------------");
		System.out.print("아이디 > ");
		String userId = sc.nextLine();
		
		System.out.print("비밀번호 > ");
		String userPwd = sc.nextLine();
		
		System.out.println("-----------------");
		
		// 로그인 성공 시
		// 만약에 사용자가 입력한 아이디값과 회원가입시 입력했던 아이디값을 비교
		// 만약에 사용자가 입력한 비밀번호 값과 회원가입시 입력했던 비밀번호 값이 동일하다면
		if(userId.equals(id) && userPwd.equals(password)) {
			System.out.println("로그인 성공! " + nickName + "님 환영합니다~");
		// 사용자가 입력한 아이디값이 회원가입 시 입력했던 아이디값과 동일하지 않다면
		} else if(!userId.equals(id)) { 
			System.out.println("아이디가 존재하지 않습니다.");
		} else { 
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
		// 로그인 실패 시
	}
	
	// 기본자료형 : boolean byte short int long float double char
	// => 기본자료형같은 경우 동등비교 연산자를 수행하는 데 문제가 없음(==, !=) 잘 됨
	
	// 참조자료형 String의 경우
	// => 동등비교연산자(==, !=) 연산자를 통해서 값을 비교하는 것이 불가능
	// 참조자료형의 경우 실제 변수에 담기는 값이 리터럴값이 아니고 '주소값'이기 때문.
	// 문자열의 값을 비교 : equals()를 사용함 => true, false

}
