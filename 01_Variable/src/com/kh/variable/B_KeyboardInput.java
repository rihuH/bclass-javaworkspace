package com.kh.variable;

import java.util.Scanner; /*Scanner클래스 메소드를 사용하기 위해 선언.*/

public class B_KeyboardInput {
	/*키보드를 이용해서 사용자에게 입력값을 받을 예정
	 * => 하드웨어->전기신호->운영체제->eclipse->Java
	 * 자바에서는 기본적으로 Scanner라는 클래스를 제공해줌.
	 * Scanner클래스 내부에 존재하는 메소드들을 호출해서 입력받음=>import
	 */

	public void inputTest() {
		
		/*클레스의 별칭을 지어주면서 new를 해줌*/
		Scanner sc= new Scanner(System.in); // 표준입력도구에서 입력한 값들을 받겠다(Byte단위로)
		
		//사용자에게 주문할 음료를 입력 받아서 출력
		//입력받고자 하는 내용을 알려주거나 또는 먼저 질문을 해서 입력을 유도.
		System.out.println("\t====== 메뉴판 ======");
		System.out.println("1. 리프레시 자몽 캐모마일 티");
		System.out.println("2. 푸른 용 헤이즐넛 라때");
		System.out.println("3. 핑크 폼 딸기 라떼");
		System.out.println("\t===================");
		System.out.print("주문하실 음료를 입력해 주세요 > ");
		
		//사용자가 입력한 문자를 그대로 출력
		/*변수선언방법 => 타입 식별자*/

		// 임시저장공간 = buffer. 사용자 입력값을 받을 때는 얼마나 입력하게 될 지 모르므로, 저장공간에 가기 전에 입력버퍼를 거치게 된다. 
		// 입력버퍼에서는 한 글자씩 떼어서 보게 된다. 엔터도 \n로 입력버퍼로 들어간다(공백문자에 포함됨)
		
		String menu = sc.next(); // next()는 사용자가 입력한 값 중 공백이 있으면 공백문자(즉 띄어쓰기) 이전까지만 입력받음.
		System.out.println(menu + "를 주문하셨습니다.");
		
		//몇 잔 주문할건지
		// nextInt()=>정수타입. nextDouble()=>실수로 받고 싶을 때.
		System.out.println("몇 잔 주문하시겠습니까?(숫자로 입력해주세요) > ");
		int cup = sc.nextInt(); // 얘는 타입과 맞는 문자인지 식별기능이 있음(정규표현식이라 함, 주로 Javascript에서 사용). 
			// 그래서 정수타입만 골라서 보낸다. 그래서 여기서 3\n 이렇게 되었다면 \n가 남아있어서 아래에 있는 주소를 입력할 수 없다.(바로 종료되니까)
			// 정수를 무조건 찾아야 한다. 문자를 만나면 에러난다.
			// 앞에 \n이 많이 쌓여있더라도 무조건 정수 찾고 그 다음 개행문자에서 끝나게 되므로, nextInt()는 앞에 계속 사용해서 \n\n\n이렇게 쌓여있더라도 잘 실행되는 것이다.
		System.out.println(menu + "를 " + cup +"잔 주문하셨습니다.");
		
		//위에서 입력받아 남아있는 개행문자를 지워줘야함
		
		//nextLine() : 입력버퍼에서 개행문자 이전까지의 모든 값을 가져온 후 버퍼에 존재하는 개행문자를 날려주는 역할.
		sc.nextLine();
		
		System.out.println("주소지를 입력해주세요 > ");
		String address = sc.nextLine(); // nextLine() => 사용자가 입력한 값 공백과 무관하게 다 읽어옴. 개행문자를 만나기 전까지.
		System.out.println(menu + " "+cup+"잔을 " + address+ "로 배달합니다.");
		
	}
	
}
