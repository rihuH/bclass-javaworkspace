package com.kh.chap03.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap03.model.vo.SeasonFood;

public class Run {

	public static void main(String[] args) {

		// HashSet
		// Value값만 저장, index개념 없음 == 순서보장X, 중복X
		// [표현법]
		// HashSet 객체 이름 = new HashSet(); // 빈 HashSet이 생성 - 기본크기 16, 용량의 0.75가 차면 2배로 늘림. ( ArrayList는 기본크기10, 용량이 다 차면 1.5배 늘림)
		
		// 문자열만 담을 수 있는 HashSet
		HashSet<String> set = new HashSet();
		// ArrayList 선언과 같다
		
		System.out.println(set); // ArrayList와 같은 결과. HashSet 자체에는 오버라이딩 된 toString이 없음.
		// 부모클래스에서 toString을 찾게 된다. AbstractSet이라는 추상클래스를 상속받고 얘가 상속받는 AbstractCollection 에 구현되어있는 toString이 출력된다.
		// ArrayList클래스에도 toString이 없음. ArrayList의 부모부모.. AbstactList의 AbstractCollection. 
		
		// Collection 은 interface
		// interface를 사용?? 하는 클래스들은 interface가 가지고 있는 메소드들을 반드시 구현해야하므로, 그 메소드는 반드시 존재해야한다.
		// interface를 조상으로 하는??
		
		// List, Set은 Collection이 조상. 그래서 비슷한 메소드들이 있음. / Map은 조금 다르고.
		
		
		// 요소추가
		// add(추가할요소)
		set.add("안녕하세요");
		set.add("반갑습니다");
		set.add("목요일은 또 평가입니다.");
		set.add("오늘은 복습겸 숙제도 드릴게요");
		set.add("내일은 학원 나오면 안됩니다.");
		set.add("안녕하세요"); // 중복은 허용하지 않는다.
		set.add(new String("반갑습니다")); // 
		
		System.out.println(set); // 저장 순서 보장 X, 중복 허용X
		
		// 요소 개수 구하기 size()
		System.out.println("set의 요소 개수 : " + set.size());
		
		// 요소 제거하기 remove() , 전부 삭제 clear()
		set.remove("내일은 학원 나오면 안됩니다."); // index개념이 없어서 지울 요소를 넘겨야한다.
		System.out.println(set);
		
		// SeasonFood 객체
		HashSet<SeasonFood> foods = new HashSet();
		foods.add(new SeasonFood("전어" , "가을", "고소"));
		foods.add(new SeasonFood("수박", "여름", "안달다"));
		foods.add(new SeasonFood("망고", "여름", "안달다"));
		foods.add(new SeasonFood("전어", "가을", "고소"));
		// 위 String과는 다르게 왜 같은 값을 가진 SeasonFood가 두 개 들어갔을 까
		
		System.out.println("ABC");
		System.out.println(new String("ABC"));
		// 문자열 형태와 객체생성 형태가 각 다른 메모리 영역에 올라가긴 하지만
		// String은 비교할 때 사용하는 equals, hashCode() 메소드 들이 '실제 값'을 비교해서 반환하도록 오버라이딩되어 있음.
		
		// HashSet은 equals, hashCode를 사용해서 양 값이 이전 값과 같으면 중복이라고 판단함.
		// 따라서 중복된 클래스값을 넣고 싶지 않다면 String처럼 SeasonFood클래스에서 equals hashCode() 메소드를 오버라이딩해야함.
		
		
		
		System.out.println(foods);
		
		SeasonFood sf = new SeasonFood("귤", "겨울", "맛있음");
		SeasonFood sf1 = new SeasonFood("귤", "겨울", "맛있음");
		
		System.out.println(sf.equals(sf1));
		
		/*
		 * HashSet의 특징
		 * 
		 * HashSet은 요소를 추가할 때마다 내부적으로 equals()와 hashCode()반환값을 기준으로
		 * 값이 일치하는지 비교를 함
		 * 
		 * --> equals() == true 이고 hashCode()반환값을 동등비교 연산자를 통해 비교했을 때 
		 * 		값이 일치한다면 => 동일 객체로 판단(중복 저장을 하지 않음)
		 * 
		 * Object 클래스
		 * equals : 두 객체의 주소값을 비교해서 일치하면 true
		 * hashCode : 객체의 실제 메모리 주소값을 해싱해서 10진수 형태로 반환
		 * 
		 * 내용물은 같은데 주소값이 달라서 동일 객체가 아닌 것으로 판단되는 것을 방지하기 위해
		 * VO클래스 내부에 equals()와 hashCode()를 오버라이딩
		 * 
		 * 
		 */
		
		System.out.println("-------------------");
		// 1. 반복문
		/*
		for(int i = 0; i < foods.size(); i++) {
			System.out.println(foods...)
		}
		*/
		// hashSet은 인덱스 개념도 없고 for문을 돌릴 수 없다.
		
		// 향상된 for문은 collection에 다 사용할 수 있어서 이거로는 할 수 있다.
		for(SeasonFood food : foods) {
			System.out.println(food);
		}
		
		
		// for문을 꼭 쓰고싶거나 요소값을 알고 싶다면??
		// 2. HashSet의 내용물을 ArrayList에 옮겨담아서
		// 인덱스를 이용
		// 1단계) ArrayList 생성
		ArrayList list = new ArrayList();
		// 2단계) addAll(Collection c)
		list.addAll(foods);
		
		// 1+ 2단계
		ArrayList<SeasonFood> list2 = new ArrayList(foods); // *****
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 3. Iterator(반복자) 클래스. 
		// StringTokenizer와 비슷한 원리
		Iterator it = foods.iterator(); // foods를 iterator라는 객체로 만들어서 반환해주는 메소드.
		// java.util.Iterator
		/*
		System.out.println(it.next()); // next는 Tokenizer와 같이 위에서부터 하나씩 뽑아준다.
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next()); // 초과해서 뽑으면 NoSuchElementException 예외발생
		*/
		
		while(it.hasNext()) { // iterator에 있는 hasNext 메소드. 
			// it에 next로 더 빼올 값이 남아있나? 있다면 true/ 없다면 false
			System.out.println(it.next());
		}
		
		// iterator() : List계열 Set계열에서는 호출이 가능한 메소드
		// Iterator iterator= new Iterator();
		// 타입(자료형)
		// List도 그렇고 Set도 그렇고 전부 다 Iterator를 구현하고 있음.
		// ==> 모든 실제 객체를 Iterator타입으로 사용할 수 있음(다형성 적용 -> 타입숨기기-> 정보은닉)
		
		// 그런데 => Map계열에서는 바로 호출이 불가능하다.
		
		
		
		
		// 잠깐 다른설명
		/*
		ArrayList list = new ArrayList();
		
		list.add(1); // Object형 ArrayList인데 왜 1,2,3 등 기본자료형이 대입이 되는 이유는 --> WrapperClass를 통해서 변환돼서 들어감
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		*/
	}

}
