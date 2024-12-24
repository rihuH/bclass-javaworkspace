package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// FileCharDataAccessObject 단어가 4-5개 이상이 되면 너무 길어져서 가독성이 떨어지므로 약자로
// 5개는 안 넘어가는것이 좋음
// 그리고 이름이 너무 길어지면 기능이 너무 많아서 그런것은 아닌지 고민해봐야함 - 1기능만 해야함
public class FileCharDao {

	// 프로그램 --> 외부매체(파일)
	// 출력
	public void fileSave() {
		// FileWriter : 파일로 데이터를 2Byte단위로 출력하는 스트림.
		
		// 1. 스트림 생성. 생성과 선언을 따로.
		FileWriter fw = null; // 선언과 
		
		try {
			fw = new FileWriter("b_char.txt"); // 객체생성을 따로.
			
			// 2. 데이터 출력 => write()
			fw.write("와.... IO... 신기하당...");
			char[] arr = {'a', 'b', 'c', 'd'};
			fw.write(arr);
			fw.write("E");
			
		} catch(IOException e) {
			System.out.println("문제가 발생해서 출력 못 했어요..");
			e.printStackTrace();
		} finally {
			// 3. 자원반남 => close()
			try {
				if(fw != null) 	fw.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public void diary() {
		// 사용자에게 기록하고 싶은 내용을 입력받아
		// 외부 파일에 내용을 출력
		
		Date now = new Date(); // 순수하게 날짜데이터를 사용시 java.util 패키지에 있는 데이트./ sql에 있는 것 말고
		System.out.println(now);
		//2024년 10월 4일
		// 날짜 형식을 변환할 때 사용하는 클래스 .format()
		String titleDate = new SimpleDateFormat("yyyy년 MM월 dd일").format(now); // Month는 minute와 차이를 둬야해서 대문자
		System.out.println(titleDate);
		
		/* 과거
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		// System.in이 인풋스트림이고 buffer는 보조스트림. 원래 같은 계열끼리만 보조할 수 있음. System.in이랑 버퍼리더는 타입이 달라서
		// 사이에 inputstreamreder라는 보조스트림을 붙이고 버퍼리더라는 보조스트림을 붙여서 사용했던 것.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(titleDate + "_오늘의 한 줄.txt");
			System.out.print("기록하고 싶은 내용을 입력해주세요 > ");
			String content = sc.nextLine(); // Method영역 안에 들어있는 Constant Pool 안에 있는 String Pool에 있는 주소값
			fw.write("오늘의 한 줄 : \t" + content);
			
			
			
		} catch(IOException e) {
			System.out.println("무언가.. 문제가 발생했습니다.");
		} finally {
			try {
				if(fw != null) fw.close();
				if(sc != null) sc.close(); // 두 개 이상의 자원을 반납해야 한다면, 생성의 역순으로 반납해줘야한다.
			} catch(IOException e) {
				System.out.println("자원을 반납하다가 예외가 발생했습니다.");
			}
		}
	}
	
	// 프로그램 <-- 외부매체(파일)
	// 입력
	public void fileRead() {
		
		// FileReader : 데이터를 2Byte단위로 입력받는 스트림
		// 0. 객체 선언
		FileReader fr = null;
		
		
		try {
			// 1. 객체생성
			fr = new FileReader("b_char.txt");
			
			// 2. 입력받기 => read()
			// while문을 사용하자 => 데이터가 얼마나 입력될 지 알 수 없으니까
			// => 반복을 몇 번 해야할 지 알 수 없음
			
			while(true){
				int value = fr.read();
				if(value != -1) {
					System.out.println((char)value);
				} else {
					break;
				}
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			// 3. 자원반납
			try {
				if(fr != null) fr.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
