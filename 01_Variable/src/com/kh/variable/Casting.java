package com.kh.variable;

public class Casting {
	/*
	 * Type Casting (자료형 변환) : 자료형을 바꾸는 개념
	 *
	 *
	 * -- 자바에서 값을 처리하는 규칙
	 *
	 * ☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★중요☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
	 *
	 * 1. = (대입 연산자)를 기준으로 왼쪽 / 오른쪽이 같은 자료형이어야 한다.
	 * => 같은 자료형에 해당하는 리터럴값만 대입할 수 있음
	 * => 자료형이 다를 경우 ? == 값을 바꿔서 대입해야 함.
	 *
	 * 2. 같은 자료형들끼리만 연산이 가능함
	 * => 자료형이 다른데 연산이 하고싶다? 둘 중에 하나를 "형변환"해서 나머지 하나와 동일하게 맞춰야함
	 *
	 * 3. 연산의 결과물도 동일한 자료형이어야 한다.
	 * --> 1 + 1= 2 (정수), 1.1 + 1.1 = 2.2(실수)
	 *
	 * [ 표현법 ] (바꿀자료형)값
	 * 형변환 연산자 / cast연산자
	 *
	 * 형변환의 종류
	 *
	 * 1. 자동형변환(Promotion) : 자동으로 형변환이 진행됨
	 * 							작은 크기의 자료형 -> 큰 크기의 자료형
	 * 							직접 형변환을 할 필요가 없음
	 *
	 * 2. 강제형변환(Type Casting) : 자동형변환이 이루어지지 않은 경우에 진행
	 * 								직접 형변환을 해야할 때 => () 을 통해서 진행
	 *
	 */
	
	/*
	 * boolean	: 1Byte
	 * char		: 2Byte
	 * byte		: 1Byte
	 * short	: 2Byte
	 * int		: 4Byte
	 * long		: 8Byte
	 * float	: 4Byte
	 * double	: 8Byte
	 */
	
	// 자동형변환 : 작은 자료형 -> 큰 자료형
	public void autoCasting() {
		
		//System.out.println("이거 잘 돔??");
		
		// 1. int(4Byte, 정수) => double(8Byte, 실수)
		
		// 변수 선언!
		int iNum = 10;
		System.out.println(iNum);
		double dNum = (double)iNum;
		System.out.println(dNum);
		System.out.println(iNum);
		
		// 자동형변환
		
		// 2. int(4Byte, 정수) => long(8Byte, 정수)
		int iNum2 = 120;
		long lNum = /*(long)*/iNum2;
		System.out.println(lNum);
		// iNum2 = lNum; -> 큰거를 작은거에 못넣어~
		
		// 3. long(8Byte, 정수) => float(4Byte, 실수) ** 특이케이스
		// 정수가 실수로 변환될 때 큰 사이즈의 정수타입이 작은 사이즈의 실수타입으로 변환할 수 있음
		// 4Byte float형이 long형보다 표현할 수 있는 값의 범위가 더 크기 때문
		
		long lNum2 = 1000L;
		float fNum = lNum2;
		
		System.out.println("===================================");
		// 4. char(2Byte) <-> int(4Byte) ** 특이케이스
		
		char ch = 'a';
		System.out.println(ch); //a
		int num = ch;
		System.out.println(num); //97
		char ch2 = 97;
		System.out.println(ch2); // a
		char c = 'a'+5; // f
		int inch3 = 'a'+5; // 102
		
		System.out.println("===================================");
		System.out.println('a'); 			// a
		System.out.println((int)'a');		// 97 (아스키코드)
		System.out.println('a' + '3');		// 148 (char 단일문자형 - 아스키코드로 저장되는 것. 연산은 정수형태로 일어남)
		System.out.println('a' + 3);		// 100 int랑 합칠때 4byte 밑은 (char, byte, short) int로 바뀐다 // 'a'+3을 char형태로 저장하면 문자로 저장되지만 기본은 숫자형태.
				// 따라서 'a'는 문자열이고 3은 숫자여도 기본은 숫자로 연산됨.
//		System.out.println('a + 3');		// 빨간에러. 아마 기본 자료형이 int라서 char을 하지 않는다면 안되는거인듯?
		System.out.println(3);				// 3. 정수3
		System.out.println((int)'3');		// 51 문자3의 아스키코드
		System.out.println("3");			// 3  문자열3
		System.out.println('3');			// 단일문자 3
		System.out.println("===");
		System.out.println(c);				// f 변수형c의 내장값
		System.out.println('c');			// c 문자열c. 참고로 단일문자형 ch3으로 f를 저장한 경우 'ch3' 하면 에러가 나는데, 이건 ''에 3자 넣어서 에러 나온 듯.
//		System.out.println(f);				// 빨간에러
		System.out.println('f');			// f 문자열f
//		System.out.println('ch3');			// 빨간에러
		System.out.println('a'+5);			// 102
											// 자료형별로 같은 3이라도 다 다르다
		System.out.println((char)3);		// ? (char)정수3 이라 적은 것. 컴퓨터가 모름 
		System.out.println((char)'3' + (char)3); // 54 (char)는 의미가 없음. +를 쓰면 char형은 의미가 없고 정수로 바꿔서 계산. 51+3 이 된다.
		
		
		System.out.println("[byte 연산]");
		// 번외, byte 또는 short형간의 연산
		//-128~127
		byte bNum = (byte)128; // 8칸인데 맨 앞에 것은 부호를 의미하니까 최대 숫자는 127임. 그래서 이렇게 적으면 빨간 에러
		System.out.println(bNum); //-128은 됨
		byte bNum2 = (byte)129;
		System.out.println(bNum2); // -127 표현 못 하니까 깎음  

		byte b2 = 126;
		byte b3 = 3;
		System.out.println(b2+b3); // 129  => 얘는 왜 129? 결과값이 int형이라서 그럼. =>  int+int라는 것.
			//	cpu(연산장치)가 값을 처리하는 크기가 int(4Byte). 
		
		System.out.println("[비교연산자]");
		/* 비교연산자 (==)
		 좌항과 우항의 값을 비교해서 결과값을 반환(논리값으로 반환. true/ false). 실생활에서는 = . a=b. 프로그래밍에서 =는 대입. ==가 비교.
		*
		*/
		
		System.out.println(1 == 2); //false. 1==2?? 이렇게 해석됨.
		System.out.println('a'=='b'); //false
		System.out.println(2 == (int)'2'); //false. 정수2 == 정수형으로 형변환한 문자열2(=아스키코드 50) => 2==50 이라고 한 것
		System.out.println((char)2 == '2'); //false. char는 개발자가 어떤 자료형으로 쓰겠다는 선언이지 붙인다고 값이 바뀌는 것이 아니다???? 위에 문장과 같은 의미...???
		System.out.println((int)'2' == '2'); // true
		System.out.println((int)2); // 2
		System.out.println((int)'2'); // 50
		System.out.println((char)'2' == '2'); // true
		System.out.println((char)2 == '2'); // false
		System.out.println(97 == 'a'); // true
		System.out.println(97 == (int)'a'); // true
//		System.out.println(a); // 빨간에러. 자료형을 선언하지 않은 문자는 ''없이 쓸 수 없음. 
		System.out.println("2"=="2"); // true
		System.out.println("2"=="21"); // false

	}
	
	public void forceCasting() {
		
		// 명시적 형변환이라고도 함
		// (바꿀자료형)값
		
		// double(8Byte) -> int(4Byte)
		double doubleNum = 10.123123;
		
		int intNum = (int)doubleNum; // 자료형을 맞춰야 하는데 오른쪽을 왼쪽에 맞춰야겠다고 생각함. 
		
		System.out.println(intNum); // 10  => 소수점 뒷 부분이 절삭. 데이터가 손실될 수 있음. 다시 형을 double로 바꿔도 사라진 건 돌아오지 않음.
		double dNum = intNum;
		System.out.println(dNum); // 10.0
		
		
		
		
	}
}
