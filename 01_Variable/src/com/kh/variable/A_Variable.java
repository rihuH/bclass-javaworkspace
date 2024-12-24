package com.kh.variable;

public class A_Variable {

	//변수 : Memory(RAM)에 값을 저장하기 위한 공간(값X 공간. 값이라고 생각하면 절대 안됨 그렇게 생각하면 이해가 안 될 것). Java에서 memory는 대부분 RAM을 의미함. 컴퓨터에서 memory(=저장장치+연산장치)
	
	// 변수를 사용했을 때는 어떤 좋은 점이?
	
	//카페 메뉴 변수 사용 예제(시즌 메뉴)
	public void seasonMenu() {
		
		/*1. 시즌메뉴 메뉴판 출력(메뉴명, 가격)
		 *2. 고객이 구매한 메뉴의 가격을 출력		 */
		
		System.out.println("변수를 사용하기 전"); // 참고로 system.out => 밑에 있는 console(여기선 console. 즉 표준출력도구. 다른 프로그램에선 console말고 다른 이름일 수 있음)
		
		System.out.println("시즌 메뉴 : ");
		//System.out.println("1. 푸른용 클래식 밀크티(6884)");
		System.out.println("1. 리프레싱 자몽 캐모마일 티(6886)");
		System.out.println("2. 푸른 용 헤이즐넛 라떼(6216)");
		System.out.println("3. 핑크 폼 딸기 라떼(5370)");
				
		//주문가격 = 메뉴가격 x 개수
		/*자바에서 * 기호는 값과 값을 곱할 때.
		 * 자바에서 문자열 값과 다른 형태의 값을 붙여서 사용할 때 + 기호를 사용.
		 */
		System.out.println("---------주문내역 : ");
		System.out.println("리프레싱 자몽 캐모마일티를 3개 시키셨습니다.");
		//System.out.println(6886*3);
		System.out.println(6886*3 + "원 입니다.");		
		System.out.println("리프레싱 자몽 캐모마일티를 6개 시키셨습니다.");
		System.out.println(6886*6 + "원 입니다.");
		System.out.println("리프레싱 자몽 캐모마일티를 15개 시키셨습니다.");
		System.out.println(6886*15 + "원 입니다.");
		
		System.out.println("===============================");

		System.out.println("변수를 사용하고 난 뒤");
		
		System.out.println("시즌메뉴 : ");
		
		/*메뉴명과 가격 이라는 값을 담을 공간
		 * 즉, 젼수를 선언하고 변수공간에 값을 대입해서 사용.
		 */
		String seasonMenu = "헤이즐넛 오트 아이스 쉐이큰 에스프레소";
		int price = 7317; /* 이 위에서는 price 선언 전이므로 사용X 여기부터 seasonMenu scope가 끝나는 }까지 사용할 수 있다*/
		/*=는 대입연산자. 왼쪽 공간에 오른쪽 값을 대입, 할당. 공간->공간이름 price->7317할당, 대입. 7317을 초기값이라 하고 이걸 대입하는 걸 초기화라 함*/
		
		System.out.println("메뉴명 : " + seasonMenu);
		System.out.println("가격 : " + price);
		
		System.out.println(seasonMenu + "를 17개 시키셨습니다.");
		System.out.println(price*17 + "원 입니다.");
		System.out.println(seasonMenu + "를 12개 시키셨습니다.");
		System.out.println(price*12 + "원 입니다.");
		
//		System.out.println("CASTELLA CRUMBLE STRAWBERRY BLENDED(7312)");
		
		/*변수를 사용했을 때의 장점
		 * 1. 단 한 번 값을 기록해서 필요한 순간마다 다시 사용할 수 있다 => 재사용성이 높아짐
		 * 2. 값에 의미를 부여할 수 있음 => 가독성이 높아짐.
		 * 
		 * 가독성과 재사용성이 높아지면 유지보수가 용이해짐
		 */
	}
	

	// 변수 선언 방법
	public void declareVariable() {
		
		/*변수 선언 방법
		 * 
		 * int price; (변수 선언)
		 * 타입(자료형) 변수식별자;
		 * 
		 * 권장하는 방법은 아니지만 동일한 타입의 변수를 선언할 때는 한꺼번에 선언 가능 int a, b, c;(권장은 다 따로)
		 * 변수 선언하고 난 뒤 처음 값을 대입하는 것을 초기화(initialization)라 한다. 세팅의 의미
		 * 초기화를 진행해서 대입한 값을 초기값****이라고 함.
		 */
		
		/*변수는 {} 중괄호 안에서만 선언되고 사용할 수 있다.*/
		// (지역 local)변수
//		System.out.println(price); 그래서 여기서 못 쓰는 것.
		
		/*식별자(Identifier)
		 * 
		 * 클래스명, 메소드명, 변수명 등 사용자가 만들어서 이용하는 고유의 이름
		 * 
		 * - 식별자를 생성할 때 꼭 지켜야 하는 규칙!(안 지키면 안 만들어짐)
		 * 
		 * 1. 대, 소문자 구분하고 길이제한X. => price. Price. pRice 다 다르게 인식
		 * 2. 문자, 숫자, _, $를 포함할 수 있음. => 특수기호, 공백은 안됨. 한글도 됨(권장X)
		 * 3. 문자, _, $로만 시작할 수 있음 => 숫자로 시작X
		 * 4. 공백 포함X
		 * 5. keyword(예약어)는 식별자로 사용할 수 없음.
		 * 
		 * - 개발자들끼리의 암묵적인 약속(안지키면 욕먹음, 외워야돼서 더 중요) => 영어 외엔 쓰지 말자
		 * 
		 * 1. 클래스/ 인터페이스 명명 규칙
		 *  - 첫 글자를 대문자로 표기
		 *  - 명사, 형용사를 서술적으로 연결해서 사용 => 연결된 단어들의 첫 글자는 대문자로 표기 HelloJavaWorld (camel case라고 부름)
		 * 
		 * 2. 변수 명명 규칙
		 *  - 명사적 의미를 갖게 만들어 줌 (그런데 lower camel case) => 첫 글자는 소문자, 연결된 단어는 대문자. phoneNumber
		 * 
		 * 3. 메소드 명명 규칙
		 *  - 동사적 의미를 갖게 만들어 줌
		 *  - 첫 글자를 소문자로 표기, 연결된 단어들은 첫글자를 대문자로.(여기까진 변수와 동일한데)
		 *  - (다른 점)메소드 식별자의 경우 식별자 뒤에 반드시 한 쌍의 괄호"()"를 붙임. calPay().
		 *  - 메소드명은 일반적으로 _를 사용하지 않음. (_는 보통 임시로 사용하는 경우 사용. 변수때는 가끔 쓰기도 함. 메소드는 임시로 쓰는 경우가 없으니까)
		 * 
		 * 4. 상수 명명 규칙 (수학 상수 말고. 프로그램언어의 상수)
		 *  - 모든 문자를 대문자로 표기. 그럼 구분이 안되니까 단어사이에 _ => LOGIN_OK
		 */
		
		/*기본 변수 선언법
		 *  자료형 변수식별자;
		 */
		/* 변수의 자료형*/
		/* 1. 논리 자료형(논리 값 : true/false) => boolean type 불 수학자가 만들었으니까
		 *  - boolean 변수명; 
		 */
		boolean isTrue; //변수선언, 노란줄- 에러는X, 뭐 잘못하고 있는 것 같으니 확인해보라
//		System.out.println(isTrue); // 변수는 초기화를 진행하지 않으면 사용할 수 없다.(빨간줄 에러)
		isTrue = true; //초기화, true는 초기값
		System.out.println(isTrue); //변수라고 생각함. 문자열은 ""붙여서 쓰니까. 선언 안 된 상태 예로 isFalse라고 적어도 "" 없으면 변수라고 생각하고, 선언-초기화 되어 있지 않으면 출력되지 못함
		isTrue = false; // 대입, 할당
		System.out.println(isTrue);

		/*2. 숫자 자료형
		 *  - 정수형예약어 4가지 유형=> byte(1Byte-공간8칸), short(2Byte), int(4Byte), long(8Byte)
		 *  	- 참고로 Byte의 맨 앞자리는 양수, 음수를 구분하는 역할임. 그래서 1Byte의 경우 8칸이지만 7칸만 나타낼 수 있어서 +-2^7까지만 나타낼 수 있음
		 *  	- int형을 주로 사용
		 *  	- long형을 사용할 때는 대입할 숫자 뒤에 "L"을 붙여야 함.
		 *  - 실수형예약어 2가지 유형 => float(4Byte), double(8Byte)
		 *  	- float 숫자 뒤에는 F
		 */
		// 2_1. 정수형
		 byte byteNum = 1;
		 short shortNum = 2;
		 int intNum = 3;
		 long longNum = 4L; /*소문자 l도 되지만 숫자1이랑 헷갈리니까 L 권장*/
		 
		 // 2-2. 실수형
		 float floatNum = 2.22F; // 4Byte
		 double doubleNum = 3.333; //8Byte
		 // 변수선언과 동시에 초기화중. 오른쪽에 있는 값들은 literal이라고 함. int형 literal. long형 literal.
		 
		 /*3. 문자형 => char(2Byte)
		  * - 단일문자형을 의미한다.
		  * - 반드시 '' 
		  */
		 char ch; // 2Byte
		 ch = 'a'; // char형 literal.
		 
		 //여기까지 8개가 기본자료형/원시자료형(Primitive Type)
		 
		 /*4. 문자열 : 참조 자료형 */
		 String str;
		 str = "aBc"; // 문자열 반드시 ""
		 
		 //9개의 자료형을 가지고 변수 선언
		 //각각의 변수에 초기값을 대입 초기화를 진행함
		 // 9개의 변수에 값이 잘 들어갔는지 확인을 해보고 싶음.
		
		 System.out.println("논리자료형 : "+isTrue);
		 System.out.println("정수자료형 4개 : byte형 정수 " +byteNum); 
		 System.out.println("short형 정수 "+ shortNum); 
		 System.out.println("int형 정수: "+ intNum);
		 System.out.println("long형 정수 : " +longNum);
		 System.out.println("실수자료형 2개 : float형 변수 " + floatNum); 
		 System.out.println("double형 변수 " +doubleNum);
		 System.out.println("문자형 1개: char형 " + ch);
		 System.out.println("문자열형 : string "+str);
		 /*출력문의 종류 =>print, println 표준출력도구 2개
		  * 	System.out.print()
		  * 	System.out.println() => 개행(줄바꿈)해줌, ln은 line이라는 뜻
		  */
		 
		 // System.out.printf() => f는 format. 출력형식을 지정해준다는 뜻. 개행하지 않음.
		 System.out.printf("intNum이라는 변수에 대입한 값 : %d, ch는 : %C, string은 : %S", intNum, ch, str); // d : decimal, c : character, 사용빈도는 낮음. 유용한 상황 가끔 존재. 
		 //cC와 sS에 따라 대소문자가 일관되게 프린트되어서 사용빈도가 낮은 것 같다. print,println은 입력한 그대로 섞여 출력되고, 사용빈도는 string이 가장 많기 때문에?? 
		/* %b : true/false 타입의 변수 공간용
		 * %d : byte, short, int, long 정수형 변수 공간용
		 * %f : float, double 실수형 변수 공간
		 * %c, %C : char문자형 변수, 소문자/대문자로 담느냐의 차이. 내가 'a'로 해 두었어도 %C로 출력하면 A로 출력된다.
		 * %s, %S : String문자열형 변수 공간. 대/소문자출력은 cC와 같다.
		 */
		 
		 System.out.printf("\ndoubleNum에 대입된 값은 : %f", doubleNum); //\n 개행문자. \t 탭문자
		 System.out.printf("\ndoubleNum에 대입된 값은 : %.2f", doubleNum); // .2 소수점 2자리까지만 표현하겠다.
		 
		 System.out.println("------------------------");
		 
		 //상수(수학상수 말고 프로그래밍언어에서) : 값을 변경하지 않을 변수(공간).
		 
		 //kh그룹 설립연도 저장할 공간 필요
		 int startYear = 1998; // 변경할 수 있음
		 final int START_YEAR = 1998; //final 붙이면 안 바꾼다는 듯. 상수명명규칙
//		 START_YEAR = 1889; 이러면 빨간 오류 남. 값 새로 대입, 변경 불가능.
		 
		 
	}
}