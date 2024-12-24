package com.kh.chap02.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap02.model.vo.Music;

public class GenericRun {

	public static void main(String[] args) {
		
		/*
		 *  제네릭 < Generic > 
		 *  <E> <K> <V> <T> <O> 등등을 제네릭이라 한다(Element, Key, Value, Type...)
		 *  컬렉션의 용도 : 데이터를 다루고 싶은데 너무 많아서 배열보다 효율적으로 사용하기 위한 것
		 *  제네릭은 컬렉션 안에서 다룰 타입들을 미리 지정할 수 있는 기능
		 *  >> 명시적으로 <Music>, <String> 등
		 *  => 컬렉션을 이용해서 특정 타입만 사용할 수 있도록 해줌
		 *  (사용하는 쪽에서 타입을 정할 수 있게 된다)
		 *  
		 *  별도의 제네릭 없이 컬렉션 객체 생성하면 (E == Object)를 의미하게 됨.
		 *  
		 *  
		 *  
		 */
		/*
		ArrayList musicList = new ArrayList();
		*/
		List<Music> musicList = new ArrayList(); // 다른 리스트로 바꾸고 싶을 수 있으니 부모타입인 List로 선언해주는게 좋다. 
		// 타입선언을 부모자료형으로 하면 고칠 부분이 줄어든다. 다형성 적용
		musicList.add(new Music("Happy", "DAY6"));
//		musicList.add("뮤직");
		musicList.add(new Music("내 이름 맑음", "QWER"));
//		String title = (((Music)musicList.get(1)).getTitle()); // 예상치 못한 타입이 들어온다면 프로그램 에러가 나올 수 있다.
//		ArrayList<Music> musicList = new ArrayList<Music>(); // 정석은 <> 써줘야 하는데 7버전 이상부터는 new뒤에 <>를 생략해도 되도록 업데이트됨.
		// 제네릭 사용의 장점
		// 1. 저장할 타입에 제한을 둘 수 있다. => 실수를 줄일 수 있다.
		// 2. 매 번 형변환 하는 절차를 없앨 수 있다 => 나올 때도 Music 객체로 나옴. 코드 짤 때 편함
		
		for(Music music : musicList) {
			System.out.println(music);
		}
		
		
		// 수업-> 값 저장소 변천사.  '어떤값'을 '어디에(어떻게)' 저장할 것인지
		// 1. 변수 : 값 1개를 1공간에 저장
		// 2. 배열 : 여러 개 묶어서 저장
		// 3. 클래스 : 다른 타입들도 묶어서 저장
		// 4. 객체배열 : 클래스 여러 개를 배열로 다루기
		// 5. 컬렉션 : 배열 크기 고정, 데이터 몇 개인지 알 수 없는 것을 해결하게 됨.
		// 값의 종류
		// 1. 기본자료형 / 2. 주소값
		
		
		
		
		
	}

}
