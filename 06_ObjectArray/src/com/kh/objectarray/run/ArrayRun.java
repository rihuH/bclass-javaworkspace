package com.kh.objectarray.run;

import java.util.Scanner;

import com.kh.objectarray.model.vo.Restaurant;

public class ArrayRun {

	public static void main(String[] args) {
		
		// 배열의 특징
		// 논리적인 구조와 물리적인 구조가 동일하다. (메모리상 일렬로 저장된다)
		// 여러 개의 값을 담을 수 있다 => 같은 자료형끼리만 담을 수 있다 -> 동종모음(homogeneous vowels)
		// 인덱스라는 개념 존재
		// 명확한 크기를 명시해야한다. -> 크기를 바꿀 수 없다.
		// 참조자료형
		// 객체배열 -> String[] 등등
		
		// 객체배열의 선언 및 할당
		// [표현법]
		// 클래스이름[] 배열식별자 = new 클래스이름[배열크기];
		
		// 자바에서 기본자료형을 제외한 나머지는 모두 참조자료형
		// 참조자료형을 이용해서 사용할 수 있는 값은 주소값 뿐.
		 
		Restaurant[] restaurants = new Restaurant[3];

		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < restaurants.length; i++) { // restaurants객체에 접근해서 .length 필드값을 받음. 메소드였으면 ()였을거고.
			System.out.print("주소를 입력해주세요 > ");
			String address = sc.nextLine();
			
			System.out.print("상호를 입력해주세요 > "); // for문에 선언된 이 지역변수들은 for문이 있는 stack영역에 올라가고
			String storeName = sc.nextLine();
			
			System.out.print("대표메뉴를 입력해주세요 > ");
			String signatureName = sc.nextLine();
			
			System.out.print("평점을 입력해주세요 > ");
			double rating = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("방송에 나온적이 있나요?(네/아니오) > ");
			boolean program = sc.nextLine().equals("네");
			
			restaurants[i] = new Restaurant(address, storeName, signatureName, rating, program); // new 붙은 얘는 heap영역에 생성됨. 그래서 for문 한 번 돌면
			// 위에 있는 지역변수들은 사라지지만 얘는 (누가 주소를 가리키고 있는 한) 사라지지는 않는다.
			
		}
		
//		System.out.print(restaurants[1].getSignatureName()); // . 전에 주소가 완성되어야함. restaurants까지만 쓰고 . 찍으면 restaurants(stack)가 가진 heap영역의 배열로 가게 됨.
		// 배열이 가리키고 있는 객체에 접근하려면 인덱스 []까지 접근해서 그 주소를 적어줌
		
		for(int i = 0; i < restaurants.length; i++) {
			System.out.println(restaurants[i].information());
		}
		
		//가게들의 평점의 합계와 평균을 출력
		
		int sum = 0;
		for(int i = 0; i < restaurants.length; i++) {
			sum += restaurants[i].getRating();
		}
		System.out.println("가게 평점의 총 합 : " + sum + ", 평균 : " + (sum/restaurants.length));
		// 8byte 64칸(비트로) 바이트로 8칸. 맨앞은 양수정수/ 앞 3개는 정수/ 뒤 4개에 소수점값 저장(. 포함해서 총 16비트칸. 숫자는 15비트칸). // 근사치를 저장하게 된다.
		// 근사치로 계산하면 정확한 값이 나오지 않아서 일반적으로 자바에서 double, float으로 연산하지 않는다.
		// 소수점 자리만큼 적은 것을 유효값으로 보고, 그 다음의 값에서 반올림하면 본래의 숫자가 나오도록 연산되는 것 같다.
		// 그래서 9999 또는 00001이 나머지 자리를 채워서 붙는다.
		// 저런 값이 안 붙고 제대로 나오는 경우도 있다(왜 그런지는 모르겠음)
		// 소수점 없는 정수로 계산하더라도 .0으로 결과값을 내보내기 때문에 그 불확실성때문에 쓰지 않는 듯 한다.
		// 원하는 만큼 *10^x 를 곱해서 int로 만들어준 뒤 계산하게 된다. int는 소수점이 없기 때문에 그런 유효값계산을 하지 않기 때문이다.
		
		System.out.print("어떤 가게를 찾으시나요 > ");
		String searched = sc.nextLine();
		
		for(int i = 0; i < restaurants.length; i++) {
			if(searched.equals(restaurants[i].getStoreName())){
				System.out.println("대표메뉴 : " + restaurants[i].getSignatureName());
			}
		}
		
		// 운영체제/ 컴퓨터구조/ 네트워크/ 알고리즘/ 자료구조 -> 개발자가 되기 위해 꼭 필요한 지식 , 게임, 서버 시스템개발자 무관하게 무조건 알아야함
		// 웹개발자는 5개 몰라도 일은 할 수 있음(네트워크 빼고)
		

		
	}
}
