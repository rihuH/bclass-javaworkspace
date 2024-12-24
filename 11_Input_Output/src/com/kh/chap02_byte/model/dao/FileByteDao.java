package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// DAO(Data Access Object)
// 데이터가 보관되어있는 공간에 직접 접근해서
// 데이터를 입력/출력하는 메소드들을 모아놓음.

public class FileByteDao {
	
	// 파일에 데이터를 출력 ( Byte Stream 사용해보자)
	
	public void fileSave() {
		// 출력 : 프로그램 내의 데이터를 밖으로 내보내겠다.
		// 프로그램 --> 외부매체(파일) 로 데이터를 내보냄
		
		// File(file에 내보낼것이니까)OutputStream : "파일"로 데이터를 출력할 때, 1Byte단위로 출력하는 스트림.
		
		// 1. FileOutputStream객체 생성
		// => 해당 파일과 직접 연결되는 통로를 만드는 과정

		FileOutputStream fos = null; // 아래에 객체 선언하면 fos.close()를 할 수 없으므로 .
		try {
			fos = new FileOutputStream("a_byte.txt");
			// 인자값으로 파일명을 전달하는데 파일명이 존재하지 않을 경우
			// => 해당 파일을 생성하면서 통로를 연결
//			FileOutputStream fos = new FileOutputStream("a_byte.txt"); // 내 프로그램에서 외부로 통로를 만드는건데, 생성자 안 매개변수가 없으면 빨간줄
			// 통로만 만들고 어디로 연결할 것인지를 모르면 안되니까.
//			FileOutputStream fos = new FileOutputStream("a_byte.txt", true); // try안에서 선언하면 try가 끝나면 사라지므로. (catch)에서도 안됨 다른블록이니까
			// 두 번째 인자로 true값을 전달한다면 => 해당 파일의 내용이 존재할 경우 이어서 작성하고
			// true를 전달하지 않는다면(, false)가 기본값으로 되어있음/ ==> 덮어쓰기 함.
			// 그러면 이미 적힌 데이터들은 새로 실행할 때 코드를 지웠어도 이미 적힌것은 사라지지 않고
			// 남아있는 출력문은 뒤로 계속 붙어서 글자 길이가 늘어난다.
			// true가 아니라면 덮어쓰기 하는 것이므로 당연히 길이가 늘어나거나 하지 않는다.
			
			// 2. 연결통로를 통해 데이터 출력 : write() 호출
			
			// 데이터 출력
			fos.write(97);
			fos.write(98);
			fos.write(99);
			
			byte[] arr = {101, 102, 103};
			fos.write(arr);
			
			fos.write('9');
			
			fos.write('이'); //=> 이런거 하면 글자가 깨져서 출력된다.
			// 1Byte의 범위 : -128 ~ 127까지 표현할 수 있음.
			// 음수는 의미가 없고
			// 0 ~ 127 사이의 값만 Byte통로를 지나갈 수 있음
			// 한글은 2Byte기 때문에 깨짐.
			// 바이트스트림 단독사용으로는 해결이 불가능하다.
			// 문자스트림으로 해결할 예정
			
			
			// 3. 개발자들끼리 약속) 스트림사용이 끝났다면 반드시 꼭 무조건 해야만 하는 작업
			// => 코드상에서 사용이 전부 종료되었다면 자원 반납을 해줘야함 <-- 약속
			// 너무 중요함 정말정말 중요함 ****
			// 메모리누수가 얘때문에 많이 일어나기 때문
			
			// 자원반납 하는 방법
			// .close() 호출
//			fos.close(); // 꼭 해줘야 하는 작업이므로 try구문 안에 적으면 안된다. 반드시 실행되어야 하는 구문이므로.
			// Scanner할 때도 쓰고 sc.close(); 해줘야함. 지금까지 안 배웠어서 안함.
//			fos.write('7'); // 위에서 통로를 닫았으므로 실행하면 Stream Closed 에러가 뜬다.
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally { // 예외가 발생을 하건 발생을 하지 않건 간에 무조건 실행.
			try {
				if(fos != null) {
					fos.close(); // 위에서 생성이 안 되는 경우 fos가 null이기 때문에 nullpointException나올 수 있음. 컴파일러가 안 알려줌.
					// if문으로 해줌.
					
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		
			
		
		
	}
	
	
	// 프로그램 <== 외부매체(파일) 
	// 입력 : 파일로부터 데이터를 가지고 오겠다.
	// FileInputStream
	// 파일로부터 데이터를 가져와서 입력받을건데, 1Byte단위로 입력받겠다.
	public void fildRead() {
		
		// 1. 객체 생성 => 파일과의 통로 생성
		FileInputStream fis = null; //  나중에 반납해주기 위해 선언따로 대입따로
		
		
		try {
			fis = new FileInputStream("a_byte.txt");
			
			// 2. 통로로부터 데이터 입력받기.
			// read() 호출
			// 1Byte단위로 하나씩 읽어옴
			/*
			System.out.println((char)fis.read()); // 그냥 하면 맨 앞 a가 97로 입력, char로 보고 싶으면 char형 형변환연산자를 사용해서 변환합니다.
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read()); // 더 이상 읽을 게 없으면 -1을 반환함.
			*/
			// 파일의 마지막 데이터를 입력받고 나서 read() 호출 시 -1을 반환.
			
			// 일일히 안 하려면
			// for/ while 중에 일단 while 몇개인지 모르니까
			// 1. 
			/*
			while(true) {
				int value = fis.read();
				if(value != -1) {
					System.out.println((char)value);
				} else {
					break;
				}
			}
			*/
			// 2. 보편적인 자바개발자가 쓰는 법. 조건문을 쓰기 싫기 때문.
			int value = 0;
			while((value = fis.read()) != -1) { // 대입먼저 해야하니까 괄호처리. --> 변수 새로 생성하는게 조건문 쓰는 것보다 나은가봄? 어차피 value도 지역변수라서??
				System.out.println((char)value);
			}
		} catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println("입력 받으면서 문제가 발생했습니다.");
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) {
					fis.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	

}
