package com.kh.chap04.run;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun {

	public static void main(String[] args) {
		
		// Properties : Map계열 -> Key + Value 세트로 저장함
		// Key와 value 모두 String으로 다뤄야 한다.
		
		// [표현법]
		// Properties 식별자 = new Properties();
		Properties prop = new Properties();
		
		/* map계열이므로 똑같이 쓸 수 있지만.
		prop.put("아메리카노", new Coffee("자바원두", 3));
		System.out.println(prop);
		System.out.println(prop.get("아메리카노"));
		이렇게 쓸 거면 다른 Map 쓰지 properties 안 쓴다.
		얘는 존재 이유가 따로 있음.*/
		
		// properties
		/*
		 * Properties 객체 => 파일 입/출력하기 위함.
		 * key + value 세트로 파일에 출력한다던가
		 * 파일로부터 입력받는 용도로 사용
		 * => .properties 확장자를 가진 파일을 얻을 수 있다.
		 * 
		 * 자주 변경하지 않는 설정정보
		 * 해당 프로그램이 기본적으로 가져야 할 정보들을 담는 파일
		 * 
		 * 한글 넣으면 안됨
		 * white space라고 하는 백지문자를 사용하면 안됨(공백문자 띄어쓰기 개행 탭)
		 */
		
		// 키, 밸류를 둘 다 String으로 담게 된다.
		// String, String
		// prop.put("몰라", 2); 실수할 수 있음. 그래서 요소추가할 때 put메소드를 잘 안 씀.
		prop.setProperty("List", "ArrayList"); // 를 사용하게 됨.
		// 자바개발자 - 값을 반환-> get// 값을 대입 -> set ==> 암묵적인 약속
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		
		System.out.println(prop);
		
		// prop.store(OutputStream os, String comment) : 파일을 기록할 때 사용하는 메소드
		// key = value 형태로 파일이 출력
		// Outputstream은 바이트스트림, 기반스트림/ String comment는 주석같은 것.
		
		try {
			prop.store(new FileOutputStream("test.properties"), "주석에 적고싶은 내용");
			
			// 입력
			// load(inputStream is) : 입력받을 때 사용하는 메소드
//			prop.load(new FileInputStream("test.properties"));
//			System.out.println(prop.get("Array")); //밖에서 읽어온 데이터를 맵처럼 사용할 수 있다.
			
			// .xml
			// eXtention Markup Language
			// storeToXML(OutputStream os, String comments)
			// Properties의 키 + 밸류 세트를 XML 파일로 출력
			prop.storeToXML(new FileOutputStream("test.xml"), "메롱");
			// 불러오기 loatFromXML(InputStream is);
			
			
			
			
		} catch(IOException e) {
			e.printStackTrace();
		} 
		
		
		
	}

}
