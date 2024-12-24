package com.kh.chap01.run;

import com.kh.chap01.controller.StringList;

public class Run {

	public static void main(String[] args) {

		/*
		 * 순수 Java (객체지향 제외)
		 * 자료형 변수 50/ 컬렉션이 30
		 * 
		 * 중요한 내용.
		 */
		
		// 컴퓨터는 수학에서 출발
		// 집합 
		// 옛날에는 메모리가 귀하고 중요해서 값을 어떻게 저장해둘 것인가가 중요
		// 자료를 어떻게 저장할까
		// 추상적 자료형 즉 개념만 있는 집합, 리스트, 스택, 큐, 트리, 그래프 등등을 실제로 구현한 것을 자료구조라고 한다.
		
		// 스트링을 여러 개 다루고 싶은데 정확히 몇 개의 문자열을 다룰 지 알 수 없음.
		StringList s1 = new StringList();
		s1.add("첫 번째");
		s1.add("두 번째");
		s1.add("세 번째");
		s1.add("네 번째");
		s1.add("다섯번째");
		s1.add("여섯번째");
		System.out.println(s1);
		
		try {
			String returnValue = s1.get(11);
			
		} catch(IndexOutOfBoundsException e) {
			System.out.println("존재하지 않는 요소입니다.");
		}
		
//		System.out.println(returnValue);
		System.out.println("요소의 개수 : " + s1.size());
		System.out.println("리스트가 비어있나요?" + s1.isEmpty());
		System.out.println(s1);
		
		// 이런식으로 개발자가 구현하지 않아도 사용할 수 있도록 만들어진 것들을 컬렉션이라고 한다.
		// 자료구조를 클래스를 가지고 알고리즘을 포함해서 구현을 해 둔 것.
	}

}
