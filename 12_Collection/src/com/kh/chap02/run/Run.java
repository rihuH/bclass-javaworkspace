package com.kh.chap02.run;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.kh.chap02.model.vo.Music;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * 컬렉션(Collection Framework)
		 * 
		 * 자바에서 제공하는 "데이터구조"를 담당하는 "프레임워크"
		 * 
		 * - 데이터 구조 : 데이터들을 효율적으로 다루는데(데이터 조회, 정렬, 추가, 수정, 삭제) 필요한 개념
		 * 
		 * - 프레임 워크 : 효율적인 기능들이 이미 정의되어 있는 틀
		 * 
		 * 
		 * 배열과 컬렉션의 차이점
		 * - 배열의 불편한 점
		 * 1. 배열을 사용하려고 할 때 우선적으로 크기를 할당해야 함 -> 한 번 지정된 크기는 변경이 불가능
		 * 2. 한 타입의 자료형들만 저장할 수 있음
		 * 3. 배열 중간 위치에 새로운 값을 추가하거나 삭제하는 경우 기존값을 땡기거나 밀어주는 코드를 작성해야함
		 * 
		 * - 컬렉션
		 * 1. 크기의 제약이 없음
		 * => 처음 컬렉션을 사용할 때 크기를 할당하지 않더라도 사용할 수 있음.
		 * => 만약 크기지정을 했음에도 불구하고, 크기를 넘어서는 값을 추가하고자 할 때 알아서 크기가 확장된다.
		 * 2. 기본적으로 여러 타입의 데이터들을 저장 가능
		 * => 같은 타입의 데이터들만 묶어서도 사용 가능
		 * (제네릭 설정을 통해 한 타입의 데이터들만 저장할 수 있겠끔도 만들 수 있음)
		 * 3. 중간에 값을 추가하거나 삭제하는 경우 값을 땡겨주거나 밀어주는 코드가 이미 메소드로 정의되어있음
		 * => 그때그때 필요한 메소드들을 호출해서 사용할 수 있어서 편함.
		 * 
		 * 사용할 데이터의 개수가 명확히 정해져있고, 이 데이터를 "조회"만 할 목적 => 배열
		 * 많은 데이터를 추가, 수정, 삭제 할 경우 => 컬렉션
		 * 
		 * 컬렉션의 종류
		 * 
		 * - List 계열 : 담고자 하는 값(Value)만 저장 / 저장 시 순서 유지(Index), 중복값 허용
		 * 				예 ) ArrayList, LinkedList, Vector
		 * 				-> ArrayList 실무에서 많이 사용
		 * 
		 * - Set 계열 : 담고자하는 값(Value)만 저장 / 저장 시 순서 유지X. 중복값X, (수학의 집합과 같다)
		 * 				예 ) HashSet, TreeSet
		 * 					-> HashSet을 본격적으로 배울 것
		 * 
		 * - Map 계열 : 키(Key) - 값(Value)세트로 저장 / 저장 시 순서 유지X, 중복키X/ 중복값O
		 * 						예 ) HashMap, HashTable, TreeMap, Properties
		 * 						-> HashMap, Properties 배울것
		 * 
		 */
		
		// ArrayList
		// 객체 생성 방법
		// ArrayList 식별자 = new ArrayList();
		// 1. 크기를 따로 지정하지 않는 방법 => 기본크기는 10칸 됨.
		// ArrayList 식별자 = new ArrayList(정수값);
		// 2. 인자로 전달한 정수값만큼의 크기를 가진 리스트를 생성하겠다.
		
		ArrayList list = new ArrayList(3);
		// 내부적으로 크기가 3칸짜리인 List를 만들겠다.
		// 배열타입[] arr = new 배열타입[3]; 과 의미가 같음.
		
		System.out.println(list); // 이 toString도 오버라이딩 됨.
		
		// 1. 비어있는 List에 요소를 추가하자 => Music 객체를 만들어서 추가해볼 것!
		/* 배열은
		 * arr[0] = new Music();
		 */
		// add(E e) : 해당 리스트 마지막에 인자로 전달된 요소를 추가해주는 메소드
		// E -> element. 리스트에 추가될 요소 : 제네릭 이라고 표현. E보고 Object타입이구나 하고 알아보면 됨.
		
		list.add(new Music("Happy", "Day6"));
		list.add(new Music("내 이름 맑음", "QWER"));
		list.add(new Music("Welcome to the Show", "Day6"));
		// 순서가 유지되면서 요소가 추가됨 (배열의 Index개념 동일하게 존재한다는 것)
		// 즉, Object형 배열로 값을 관리하는 것
		
		list.add("끝!");
		// 크기를 넘어서는 요소가 추가될 경우 자동으로 크기가 늘어난다. (1.5배 배열 새로 만들고 기존 값들을 집어넣는다.)
		// 여러 타입의 요소를 담을 수 있다.
		
		System.out.println(list.toString());
		
		// add 메소드 호출 시 오버로딩 된 형태를 사용
		// add(int index, E e) : List의 index위치에 전달된 요소를 추가해줌
		list.add(0, "시작~");
		list.add(3, new Music("한 페이지가 될 수 있게", "Day6"));
		System.out.println(list);
		
		// 중간에 요소를 추가했을 때 기존의 값들을 뒤로 한 칸씩 밀어주는 작업이 내부적으로 구현되어있음.
		
		// 2. 요소를 수정하는 메소드
		// set(int index, E e) : List의 index 위치에 값을 전달된 요소(e)로 변경해주는 메소드
		list.set(0, "시~작");
		System.out.println(list);
		Vector vector;
		LinkedList linkedList; // 모두 사용법 동일
		
		// 3. 요소 삭제
		// remove(int index) : List의 index위치에 담긴 요소를 삭제해주는 메소드
		list.remove(0);
//		list.remove(5);// 실수하기 좋은. 위에서 하나 지웠으니 하나 줄어들었음. IndexOutOfBoundsException -> index값을 잘 고려해서 인자값을 전달해야함
		
		String end = (String)list.remove(4); // remove하면 지운 값을 반환해준다
		
		System.out.println(list);
		
		Music music = (Music)list.remove(1);
		
		System.out.println(music.getArtist() + "의 " + music.getTitle() + "이 제거되었습니다.");
		
		// 4. 리스트의 크기를 반환받기
		// size() : 리스트에 담겨있는 요소의 개수
		System.out.println("리스트에 담겨있는 요소의 개수 : " + list.size());
		
		System.out.println("리스트의 마지막 인덱스 번호 : " + (list.size()-1));
		
		// 5. List의 해당 index위치에 담긴 요소를 반환해주는 메소드
		// get(int index) : E
		
		System.out.println(list);
		Music m = (Music)list.get(0);
		System.out.println(m.getTitle());
		
		// 1번 인덱스에 있는 곡 제목을 반환받아서 사용하고 싶다.
		String firstIndexTitle = ((Music)list.get(1)).getTitle(); // 클래스형변환 전에는 Object타입이라서 자식객체의 메소드를 사용할 수 없다.
		// 자식객체의 메소드를 사용하고 싶으면 반드시 자식객체로 변환
		// 참고로 '참조연산자'는 우선순위가 굉장히 높아서 괄호를 꼭 쳐줘야 한다.
		
		System.out.println(firstIndexTitle);
		System.out.println("\n반복문돌리기");
		// index 개념 + get() ==> 반복문
		// 1번째 곡 : Happy
		// 2번째 곡 : 한 페이지가 될 수 있게
		// 3번째 곡 : Welcome to the show
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + "번째 곡 : " + ((Music)list.get(i)).getTitle());
		}
		
		// 향상된 for문 => 값을 조회, 출력하는 목적으로 사용
		// for(값을 받아줄 변수 : 순차적으로 요소에 접근할 배열 또는 컬렉션) {}
		System.out.println("향상된 for문으로 돌리기");
		for(Object obj : list) {
			System.out.println(obj.toString()); // Object로 toString 호출했는데 실제 나오는 것은 Music의 toString이 나옴.
			// 자바의 동적바인딩 때문. 실행 전에는 부모타입을 가리키고 있었는데 실행할 때 보니까 실제로는 Music타입을 가리키고 있어서 자식의 메소드를 호출하게 되는 것.
			// 오버라이딩 된 경우에 적용되는 것이다. 위에처럼 getTitle을 호출하고 싶다면 자식타이틀을 바꿔줘야한다. 부모객체에 메소드가 없어서 실행자체가 되지 않기 때문.
		}
		
		// 6. 리스트의 부분만 추출
		// subList(int index1, int index2) : List
		// index1부터 index2까지의 데이터값들을 추출해서 새로운 리스트타입으로 반환(지금 ArrayList로 쓰지만 다른 리스트에도 쓸 수 있음)
		List sub = list.subList(0, 1); // 0부터 1 앞까지 추출하게 되는데, 인덱스는 공간의 가장 앞에 붙어 있으므로 그림그려서 구간을 설정해보면 이해하기 쉽다
		System.out.println(sub);
		
		// 7. 리스트 + 리스트
		// addAll(Collection c) : 해당 리스트에 다른 컬렉션에 있는 데이터들을 몽땅 추가해주는 메소드
		list.addAll(sub); // list에 sub가 맨 뒤에 붙는다.
		System.out.println(list); //데이터 값(Value)이 중복될 수 있다.
		
		// 8. 리스트가 비어있는지 확인하는 메소드
		// isEmpty() : 리스트에 요소가 없다면 true/ 요소가 하나라도 존재한다면 false
		list.clear(); // 전부 삭제
		System.out.println(list.isEmpty()); // true 나옴
		

	}

}
