package com.kh.chap04.run;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap04.model.vo.Coffee;

public class Run {

	public static void main(String[] args) {
		//잠깐다른얘기
		// LinkedList -> 배열처럼 일렬로 저장하지 않고 요소를 2등분 된 공간에 저장해서 밑에는 실제 값을 저장하고
		// 요소가 추가되면 새로 추가된 요소의 주소값을 이전 객체공간의 위의 공간에 저장해둔다. 
		// 이런 방식을 seperate chain이라고 함.
		
		// ArrayList - Object[] 배열가지고 만듦
		// ArrayList는 배열과 비슷하게 Object타입 객체만 저장될 수 있다는 것이고 기본자료값/주소값 중 주소값만 저장한다.
		
		// Map은
		// Key + Value 세트로 저장한다
		// Key가 식별자의 역할을 한다. 중복X
		// Value는 중복이어도 상관없다.

		// HashMap
		// [표현법]
		// HashMap 객체이름 = new HashMap();
		
		// 키 == 식별자 => 커피이름
		// 밸류 == 커피객체 
		HashMap<String, Coffee> map = new HashMap();
		
		// 비어있는 해시맵에 요소를 추가해보자!
		// List, Set => add()
		// Collection 구현 클래스였으므로
		
		// HashMap --> put()
		// => key + value 함께 추가
		
		// 1. put(K key, V value) : Map에 key + value 세트로 요소를 추가해줌
		map.put("아메리카노", new Coffee("자바콩", 3));
		map.put("라떼", new Coffee("콜롬비아콩", 1));
		map.put("녹차", new Coffee("찻잎", 3));
		map.put("말차", new Coffee("찻잎가루", 4));
		
		System.out.println(map);// Key = Value모양으로 출력됨
		// 저장 순서 유지X, Key = Value
		map.put("아이스코히", new Coffee("자바콩", 3));
		// Value값의 경우 중복 저장 허용
		map.put("말차", new Coffee("가루", 1));
		// 키값이 똑같으면 대체된다.
		// Key값이 식별자의 역할 --> 기존에 존재하는 Key값을 가지고 새로운 Value를 추가한다면 덮어씌워짐.
		System.out.println(map);
		
		
		// 2. get(Object key) : Object
		// 전달된 key 값에 해당하는 value값을 반환해주는 메소드.
		// key는 식별자 개념 => key를 가지고 value를 찾음.
		
//		HashMap m = new HashMap();
//		m.put("a",  "b");
//		String str = m.get("a"); // 이러면 반환값이 Object라서 안 됨. 제네릭을 안 했다면.
		
		System.out.println("888888" + map.get("아이스코"));
		Coffee iceCoffee = map.get("아이스코히");
		
		// 3. size() : Map에 담겨있는 요소의 개수
		System.out.println(map.size());
		
		// 4. replace(K key, V value) : 키값으로 요소를 찾아서 받은 Value값으로 바꿔줌.
		map.replace("녹차", new Coffee("녹차잎", 3));
		// key 똑같이 해서 put 하면 되는데 얘는 왜 있지
		// put으로 하면 key가 새로울 경우 내가 원하지 않는 값이 들어갈 수 있다.
		// replace로 하면 없는 key를 적으면 추가되지 않으므로.
		// 기존에 존재하지 않는 키값을 제시하면 추가하지 않음.
		System.out.println(map);
		
		
		//5. 지우기 remove(Object key) => 해당 키 값을 찾아서 => 키 + 밸류 세트로 지워주는 메소드
		map.remove("아이스코히");
		System.out.println(map);
		
		// HashMap에 들어있는 모든 요소들에 순차적으로 접근해야 한다면?
		// for문 X, 향상된 for문 X, while문 X
		// List에 addAll(Collection c) => X / Map은 Collection 상속 안 받음
		// Iterator로 바꾸기 => X. List랑 Set에만 됨.
		
		// Map이 가지고 있는 Key값들만 Set계열로 바꿀 수 있음.
		// => Set계열로 변경하면 Iterator를 사용할 수 있기 때문에 Iterator로 반복
		
		// 1) keySet()을 이용하는 방법
		// => Set에다가 Key만 담아줌 : Set
		
		// 1단계 > Map에 존재하는 Key들만 Set에 담는다.
		Set<String> keySet = map.keySet(); // 우리가 해준 key의 <String> 까지 포함해서 반환
		// Set도  import 해야함
		System.out.println(keySet);
		
		// 2단계 > 1단계에서 만들어진 Set의 내용물들을 Iterator에 담기
		Iterator<String> itKey = keySet.iterator();
		
		// 3단계 > Iterator 반복문을 이용해서 순차적으로 출력
		// 출력형식 : key - value\n 형태
		//
		// 라떼 - Coffee [bean = 콜롬비아콩, taste = 1]
		// 녹차 - Coffee [bean = 녹차잎, taste = 3]
		
		while(itKey.hasNext()){
			String str = itKey.next();
			System.out.println(str + " - " + map.get(str));
		}
		
		// 2) entrySet()을 이용하는 방법
		// 1. Map에 존재하는 Key + Value세트를
		// Entry형식으로 Set에 담기
		
		Set<Entry<String, Coffee>> entrySet = map.entrySet();
		System.out.println(entrySet); // 키 = 밸류로 전부 나옴.
		
		for(Entry<String, Coffee> e : entrySet) {
			System.out.println(e.getKey() + " - " + e.getValue()); // 키값 따로 밸류값 따로 사용할 수도 있음.
		}
	
	}

}
