package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	
	
	// 변수(Variable) : 메모리(RAM) 공간에 DATA(VALUE)값을 저장하는 공간
	// 변수의 특징
	// 1. 재사용 가능
	// 2. 유지보수를 용이하게 만든다
	// 3. 자료형이 정해져있다.
	// 4. 크기가 정해져있다.
	// 5. 자료형끼리의 변환이 가능하다.
	// 6. 식별자가 있어야만 사용할 수 있다.
	// 7. 초기화는 한 번만 가능하다.
	// 8. 초기화를 해야만 사용할 수 있다.
	// 9. 변수공간에 새로운 값을 대입해서 사용할 수 있다.
	// 10. 변수끼리의 연산이 가능하다.
	// 11. 지역변수의 경우 메모리의 Stack영역에 적재된다.
	// 12. 지역변수의 경우 Scope 안에서만 선언되고 사용된다.
	// 13. 하나의 변수공간에는 하나의 값만 대입될 수 있다 ******
	
	public void method1() {
		//임의의 정수 6개를 만들어서 기록해야지
		/*int num1 = 12;
		int num2 = 16;
		int num3 = 33;
		
		
		
		
		int num4 = 22;
		int num5 = 1;
		int num6 = 9;
		
		int sum = num1+num2+num3+num4+num5+num6;
		*/
	
	
	/* 배열(Array) : 하나의 공간에 여러 개의 값을 담을 수 있음. 단, "같은 자료형의 값들"만 담을 수 있음.
	 * 				=> 배열의 각 인덱스에 실제 값이 담김. ** index는 '0'부터 시작한다.
	 * 
	 * 1. 배열 선언 
	 *	1) 	자료형 배열식별자[];
	 *  2)	자료형[] 배열식별자; --> 이 방법이 보편적
	 *  
	 * 2. 배열 할당 : 공간이 어느정도 필요한지 명시
	 * 	- 배열에 몇 개의 값이 들어갈지 배열의 크기를 정해주는 과정
	 *  - 지정한 개수만큼 값이 들어갈 공간이 만들어짐
	 *  - 동적할당 
	 *  [표현법]
	 *  int[] arr;// 배열선언
	 *  arr = new int[5];// 할당
	 *  
	 *  int[] arr = new int[5]; // 선언과 동시에 할당
	 *  double[] dArr;
	 *  char[] cArr; 등등 다 가능
	 *  
	 *  3. 배열은 참조자료형이다. (기본자료형은 8개)
	 *  
	 *  4. 배열의 각 인덱스에 값 대입
	 *  [표현법]
	 *  배열식별자[인덱스] = 값;// 
	 */
	
	/* 변수선언!
		int num;
		// 1번 방법으로 int형 배열을 선언!
		int nums[];
		// 2번 방법으로 int형 배열을 선언!
		int[] nums2;
		*/
		
		//nums라는 정수형배열 선언하고 6칸을 할당받음
		int[] nums = new int[6];
		//배열의 각 인덱스에 값 대입.
		
		nums[0] = 1;
		nums[1] = 14;
		nums[2] = 22;
		nums[3] = 28;
		nums[4] = 33;
		nums[5] = 41;
		
//		System.out.println(nums); //X
		System.out.println(nums[1]); //index 넣어서 접근
		
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		System.out.println(sum);
		// 지금단계에서 배열을 사용하는 장점 : 반복문 사용 가능.
	}
	
	public void methodA() {
/*		
		// 1. 배열선언 및 할당
		int[] iArr = new int[3]; // index는 0,1,2 3개.
		double[] dArr = new double[4]; // index는 0,1,2,3 -> 4개. 
				
		//배열식별자.length : 배열의 크기(길이) => 정수형태로 반환. 몇 칸짜리인지. 몇 개의 값이 들어갈 수 있는지 반환
		System.out.println(iArr.length); // 3 -> 3개의 공간
		System.out.println(dArr.length); // 4 -> 4칸의 공간
	*/
		
		/*
		 * 기본자료형 : boolean, char, byte, short, int, long, float, double
		 * => 실제 값을 바로 담을 수 있음 : (지역)변수
		 * 
		 * 참조자료형 : boolean[], char[], byte[], int[] ... String
		 * => 주소값을 담고 있는 변수 : 참조 변수(레퍼런스)
		 * 
		 * 
		 * 
		 * 크게 3 영역 static/ stack/ heap // 영역
		 * (static은 나중에)
		 * stack은 밑에서부터 위로 쌓이고 heap은 위에서부터 아래로 쌓인다. 엄밀하게 구조를 말하자면
		 * heap
		 * stack
		 * 
		 * 이렇게 그려야.
		 * 
		 * stack메모리 : LIFO -> Last In First Out. 나중에 들어온 애가 먼저 나감.
		 * heap은 공간이 얼마나 남아있는지 모르고, 선언하면 운영체제에서 할당해줌.
		 * stack은 공간이 어떻게 되어있고 남아있는지 알 수 있음.
		 * 
		 */
		
		int[] testArray = new int[2]; // run의 mainmethod에서 함수 호출하면 stack영역에 methodA자리 만들어줌.
		// 그 methodA 블록 안에서 testArray 자리를 만들어줌
		// new -> new를 보면 heap영역에 공간을 할당함.(heap은 자바프로그램만 사용하는 공간이 아님) -> 이 할당한 공간의 주소값이 생김.
		// 그 주소값이 stack영역의 testArray공간에 대입되는 것.
		// testArray = 2; // 빨간 에러. 같은 자료형이 아니기 때문. testArray는 주소값이 저장될 수 있는 자료형인데 정수값인 2를 대입했기 때문.
		testArray[0] = 2; // testArray 주소를 찾아가서(포인터와 개념이 같음) 0번 인덱스 공간에 2를 대입.
		// 참고로 boolean[] 등등은 해당되지만 String은 예외. String은 나중에설명.
		
		int[] intNumbers = new int[3];
		int[] intNumbers2 = new int[3];
		// heap영역은 값이 비어있을 수 없음. 그래서 내가 초기화하지 않아도 자동으로 값이 저장되어 있음.
		// int형은 0이, 실수형은 0.0이 들어있다. intNumbers[0] = 0 이다. 초기화하지 않아도.
		System.out.println(intNumbers == intNumbers2); // false -> 주소끼리 비교한 셈
		
		// 참조자료형에서는 == (동등비교 연산자) 사용 시
		// 주소값을 비교하기 때문에 원하는 결과를 얻을 수 없음
		// 문자열.equals("비교할 문자열");
		
		// 사실 엄밀히 주소값은 아니다. @뒤에 16진수는 주소값이라고 할 수도 있긴 한데, 자바에선 메모리에 직접 접근할 수 없기 때문에 직접 주소값을 알 수 없다.
		// 해시코드 : 주소값을 십진수(int형) 형태로 나타낸 것.
		System.out.println("intNumbers의 해시코드 값 : " + intNumbers.hashCode());
		System.out.println("intNumbers2의 해시코드 : " + intNumbers2.hashCode());
		
		// 해시코드가 일치하지 않다 -> 절대 같은 애가 아님
		// 해시코드가 똑같다 -> 똑같은 애가 아닐수도 있음. 해시충돌. 자리 없어서 중복된 해시값이 있을 수도 있기 때문에. (비둘기집의 원리처럼)
		
		//반복문
		for(int i = 0; i < intNumbers.length; i++) {
			System.out.println(intNumbers[i]);
		}
		
	}
	
	public void lotto() {
		
		int[] lottoNumbers = new int[6];
		
		for(int i = 0; i < lottoNumbers.length; i++) {
			lottoNumbers[i] = (int)(Math.random() * 45) + 1;
		}
		
		// Arrays.toString(배열식별자)
		System.out.println(Arrays.toString(lottoNumbers));
		
	}
	
	public void method2() {
		
		// 5개의 요소를 저장할 수 있는 String형 배열을 선언하시오.
		// 동물 5종
		String[] zoos = new String[5]; // num -> nums/ 배열은 단수에 s를 붙여서 이름 붙인다.
		zoos[0] = "lion";
		zoos[1] = "sheep";
		zoos[2] = "bear";
		zoos[3] = "panda";
		zoos[4] = "tiger";
		// 참조자료형들은 모두 4byte다. 주소값만 포함하면 되니까. string도 4byte.
		
		
		
//		zoos[10] = "dog"; // 빨간 에러 안 뜸 -> 문법적으로는 문제가 없다는 것. 
		System.out.println(Arrays.toString(zoos)); // 하지만 실제로 호출해본다면 에러가 남./ ArrayIndexOutOfBounds/ 에러도 친절함. 에러 난 대로 스택이 쌓여있다 보면 됨.
		
		for(int i = 0; i < zoos.length; i++) {
			System.out.printf("여러분들이 좋아하시는 동물들은 %d번 %s 입니다.", i+1, zoos[i]);
		}
		// 메인메소드는 static 영역에 있음. 
		// 
		
		
	}
	
	public void method3() {
		//사용자에게 3개의 정수값을 입력받아서 입력받은 값 중 최소값 구하기
		//배열 선택의 기준
		// 1. 두 개 이상의 같은 자료형의 값을 다룰 것
		// 2. 다룰 값의 개수가 명확히 정해져 있을 것.
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[3];
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println("정수를 입력해 주세요 > ");
			nums[i] = sc.nextInt();
		}
		//확인용 
		System.out.println(Arrays.toString(nums));
		
		int min = (nums[0] < nums[1]) && (nums[0] < nums[2]) ? nums[0] : (nums[1] < nums[2]) ? nums[1] : nums[2];
		System.out.println("삼항연산자 사용 최소 정수 : " + min);
		
		int min2 = nums[0];
		if(min2 > nums[1]){
			min2 = nums[1];
		}
		if(min2 > nums[2]) {
			min2 = nums[2];
		}
		System.out.println("if문 사용 최소정수 : " + min2);
		// 여기까지 삼항연산자와 if문은 직접 단순작업해주는 것과 같다.
		
		int min3 = nums[0];
		for(int i = 1; i < nums.length; i++) {
			if(min3 > nums[i]) {
				min3 = nums[i];
			}
		}// 나중에 숫자가 변경될 수도 있기 때문에 이 쪽이 낫다.
		System.out.println("for문 사용 최소 정수 : " + min3);
		

}
	
public void method4() {
		
		/*
		 * 한 번 할당받은 배열의 크기를 변경할 수 없음!
		 */
		
		String[] name = new String[3];
		
		name[0] = "이";
		name[1]	= "승";
		name[2] = "철";
		
		for(int i = 0; i < name.length; i++) {
			System.out.print(name[i]);
		}
		
		System.out.println("name의 해시코드 : " + name.hashCode());
		
		name = new String[4];
		
		name[3] = "B강의장";
		
		for(int i = 0; i < name.length; i++) {
			System.out.print(name[i]);
		}
		
		System.out.println("name의 해시코드 : " + name.hashCode());
		
		/*
		 * 연결이 끊긴 기존의 배열은?
		 * 일정시간이 지나면
		 * G.C가 삭제시켜준다 : 자동 메모리 관리
		 *
		 * 배열은 항상 고유한 주소값이 부여됨
		 * 기존 배열식별자에 할당만 새롭게 한다면
		 * -> 기존에 참조하고 있던 연결이 끊기고 새로운 배열을 참조함
		 */
		
		// Garbage Collector가 알아서 처리해서 코드 회수를 하지 않아도 된다.
		
		// null : 아무것도 존재하지 않음을 의미하는 값
		
		name = null; // 현재 연결고리만 끊고싶다.
		System.out.println(name);
		//name[0] = "이승철";
		
		// NullpointerException <--
		// 가리키고 있는 대상이 null인데 주소가 없는데 어디에 접근하라고!!
		
		/*
		 * 기본자료형 할 때는 없던 개념
		 *
		 * 참조자료형에는 null이라는 개념이 추가!!! => 주소값이 존재하는가 그렇지 않은가
		 *
		 * 기본값
		 * 정수 = 0
		 * 실수 = 0.0
		 * 문자 = ''
		 *
		 * 참조자료형의 기본값이 => null
		 */
	}
	
	public void method5() {
		
		// 배열은 선언과 동시에 요소를 대입을 해서 사용하곤함
		
		int[] arr = new int[4]; // 1, 2, 3, 4
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		
		// 방법 1.
		int[] arr1 = new int[] {1, 2, 3, 4};
		
		// 방법 2.
		int[] arr2 = {1, 2, 3, 4};
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
	
	/*
	 * 배열 복사
	 *
	 * 1. 얕은 복사
	 *
	 * 2. 깊은 복사
	 */
	public void method6() {
		
		// 얕은 복사 ***** 중요 ☆☆☆☆☆
		int[] origin = {1, 2, 3, 4, 5};
		// new int[5];
		System.out.println("원본 배열 : " + Arrays.toString(origin));
		
		// 얕은 복사로 배열 복사
		int[] copy = origin;
		System.out.println("복사본 배열 : " + Arrays.toString(copy));
		
		origin[2] = 33;
		System.out.println("원본 배열 : " + Arrays.toString(origin));
		System.out.println("복사본 배열 : " + Arrays.toString(copy));
		
		// 얕은복사 => 주소값을 대입하기 때문에 가리키고 있는 대상이 같다.
		// reference counter 2개 => RC2
		
		System.out.println("원본의 해시코드 : " + origin.hashCode());
		System.out.println("복사본의 해시코드 : " + copy.hashCode());
	}
	
	// 2. 깊은 복사
	public void method7() {
		
		int[] origin = {1, 2, 3, 4, 5};
		
		// 1단계. 복사하고자 하는 기존 배열과 동일한 크기의 새 배열을 선언하고 할당
		
		int[] copy = new int[origin.length];
		
		// 2단계.
		// copy[복사하고자 하는 인덱스] = origin[인덱스]
		/*
		copy[0] = origin[0];		// 공간 = 값
		copy[1] = origin[1];
		copy[2] = origin[2];
		copy[3] = origin[3];
		copy[4] = origin[4];
		*/
		for(int i= 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}
		origin[2] = 99;
		
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));
		
		System.out.println("원본의 해시코드 : " + origin.hashCode());
		System.out.println("복사본의 해시코드 : " + copy.hashCode());
	}
	
	// 깊은 복사 2. arraycopy() 호출
	public void method8() {
		
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = new int[10];
		
		// 배열의 깊은 복사의 경우
		// 기존 배열의 크기보다 큰 배열로 복사를 하는 경우가 많음
		
		/*
		 * 클래스 네이밍 컨벤션 == 첫 글자가 대문자
		 * arraycopy() == System클래스
		 * 옵션이 많음
		 *
		 * System.arraycopy(원본 배열식 별자, 원본 배열에서 복사를 시작할 인덱스,
		 * 					복사본 배열 식별자, 복사본 배열에서 복사가 시작될 인덱스, 복사할 개수);
		 */
		System.arraycopy(origin, 0, copy, 0, 5);
		System.arraycopy(origin, 0, copy, 3, 5);
		
		System.out.println(Arrays.toString(copy));
	}
	
	// 깊은복사 3. copyof() 호출
	public void method9() {
		
		int[] origin = {1, 2, 3, 4, 5};
		
		// Arrays클래스에서 제공하는 copyof()
		// [ 표현법 ]
		// 복사본배열식별자 = Arrays.copyOf(원본배열식별자, 복사할개수);
		
		int[] copy = Arrays.copyOf(origin, 10);
		
		// 원본배열보다 큰 값을 명시해서 배열을 복사하게되면 복사본배열에 빈 공간을 생성해줌
		
		System.out.println(Arrays.toString(copy));
		
		/*
		 * System.arraycopy()
		 * 몇 번 인덱스부터 몇 개를 어떤 위치의 인덱스에 복사할것이다.
		 *
		 * Arrays.copyOf()
		 * 무조건 원본배열의 0번 인덱스부터 복사
		 *
		 * Arrays.toString(내용을 출력하고 싶은 배열의 식별자);
		 * 배열의 요소를 출력
		 * 예시 )  [1, 2, 3, 4, 5]
		 * toString => 예쁘게 보여줘~~~~
		 */
	}
	
	// 4. 깊은 복사 clone()
	public void method10() {
		
		int[] origin = {1, 2, 3, 4, 5};
		
		// int[] copy = origin; // 얕은 복사
		
		int[] copy = origin.clone();
		// 인덱스를 지정 X, 복사할 개수 X, 복사본 배열의 크기를 지정 X
		// 원본 배열과 완전히 똑같은 배열을 새로 생성해서 복사(깊은복사)
	
	
}
}
