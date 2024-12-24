package com.kh.chap03.run;

import java.util.Scanner;

import com.kh.chap03.model.vo.Water;

public class Run {

	public static void main(String[] args) {

		//Water라는 클래스를 가지고 객체 생성
		Water water = new Water(); // <-객체생성/ 객체가 메모리에 올라가는 걸 instance화 한다고 말하기도 함. 의미를 가지고 논란이 있음
		// 1. 참조자료형
		// 2. 주소값을 저장
		// 3. 여러 개의 자료형에 여러 개의 값을 보관 + 기능
		// == 사용자 정의 자료형
		
		System.out.println(water.information());
		// 기본값이 들어있음 => 기본형 0, 0.0, '', false/ 참조형 null
		//-> null도 값이다. 아무것도 없음을 의미하는 값
		
		Scanner sc = new Scanner(System.in);
		System.out.print("제품명은 무엇인가요 > ");
		String productName = sc.nextLine();
		water.setProductName(productName);
		System.out.print("가격은 얼마인가요 > ");
		int price = sc.nextInt();
		water.setPrice(price);
		sc.nextLine(); // nextInt() 쓰고 나서 남은 개행문자 날려주기
		System.out.print("용기재질은 무엇인가요 > ");
		String material = sc.nextLine();
		water.setMaterial(material);
		System.out.print("뚜껑색깔은 무슨 색 인가요? > ");
		String topColor = sc.nextLine();
		water.setTopColor(topColor);
		
		String information = water.information();
		System.out.println("-----------------------");
		System.out.println(information);
		
	}

}
