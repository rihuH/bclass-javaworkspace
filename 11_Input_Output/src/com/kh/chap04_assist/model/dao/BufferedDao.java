package com.kh.chap04_assist.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedDao {
	// 기반스트림이 Input/Output 계열일 경우
	// 보조스트림도 Input/Output 계열을 사용
	
	// 기반스트림이 Reader / Writer 계열일 경우
	// 보조스트림도 Reader / Writer 계열을 사용
	
	// BufferedReader / BufferedWriter
	// -> 속도 향상 목적의 보조스트림
	// -> 임시공간을 제공해서 한 번에 모아두었다가 한꺼번에 입/출력 진행
	// 기반스트림이 먼저 존재해야 보조스트림을 사용할 수 있음
	// [표현법 ]
	// 기반스트림클래스이름 객체이름 = new 기반스트림생성자();
	// 보조스트림클래스이름 보조스트림 = new 보조스트림생성자(기반스트림);
	
	// 출력
	public void fileSave() {
		// BufferedWriter
		
		// 0. 객체 선언
		FileWriter fw = null; 
		BufferedWriter bw = null;
		
		try {
			// 1. 객체 생성
			fw = new FileWriter("c_buffer.txt"); // 생성도 기반스트림 먼저
			bw = new BufferedWriter(fw); // 기반스트림을 인자값으로 가진다
			
			// 2. 파일에 출력 =>  write()
			bw.write("안녕하세요"); // 보조스트림으로 write
			bw.newLine(); // 줄바꿈을 해주는 메소드
			bw.write("반갑습니다");
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally { 
			// 3. 자원반납 => close()
			// 자원반납은 반드시 생성의 역순으로 반납한다.
			// 지금같은 경우 기반스트림을 먼저 닫으면 보조스트림을 닫을 수 없다.
			try {
				if(bw != null) bw.close();
				if(fw != null) fw.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 입력
	public void fileRead() {
		// FileReader를 기반으로 BufferedReader를 추가해서 사용
		/*
		// 0. 객체 선언
//		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			// 1. 객체 생성
//			fr = new FileReader("c_buffer.txt");
//			br = new BufferedReader(fr);
			br = new BufferedReader(new FileReader("c_beffer.txt")); // 이러면 출력에는 문제가 없지만 반납할 때 close를 호출할 수 없는 문제.
			//2. 입력 받기 => read()
			
			System.out.println(br.readLine()); // 버퍼에 임시저장공간이 있어서 라인별로 읽어올 수 있음.
			System.out.println(br.readLine());
			System.out.println(br.readLine()); // 출력이 없으면 null이 나온다. BufferedReader의 readLine()은 String형태값이라서. 
			
			
			String value = null;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
			
		} catch(IOException e) { // IOException이 FileNotFoundException의 상위 클래스라서 일단 받아줌.
			System.out.print("예외발생");
		}  
		*/
		
		/*
		 * try ~ with ~ resource 구문
		 * 
		 * - JDK 7버전 이상부터 사용 가능
		 * 
		 * [ 표현법 ]
		 * 
		 * try(스트림객체생성; 스트림객체2생성; ..여러개생성;) { // try 뒤에 괄호 있음// try구문, catch구문이 끝날 때 (스트림)들은 자동으로 반납을 해줌. 밑에 자원반납구문을 쓸 필요가 없음
		 * 		예외가 발생할 수도 있는 구문;
		 * } catch(예외클래스 e){
		 * 		예외가 발생했을 때 실행할 구문;
		 * }
		 * 
		 */
		try(BufferedReader bfr = new BufferedReader(new FileReader("c_buffer.txt"));
			Scanner sc = new Scanner(System.in)){
			
			String str = "";
			while((str = bfr.readLine()) != null) { 
				System.out.println(str);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
