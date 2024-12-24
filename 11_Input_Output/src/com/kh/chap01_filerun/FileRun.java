package com.kh.chap01_filerun;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {

		// 입출력은 내가 만든 프로그램이 기준으로. 소스코드가 기준으로 판단.
		// 소스코드에 적은 데이터 "가나다라" 를 밖으로 빼냄. 내 프로그램에서 밖으로 빼낸 것은 출력.
		// 밖에 있는 것을 내 프로그램 안으로 넣은 것은 입력임.
		// 예로 밖에 있는 텍스트를 내 소스코드 안으로 넣은 것은 입력이라고 하는 것.
		
		// 간단하게 파일을 만드는 과정
		// File클래스를 가지고 작업
		// java.io 패키지에 존재
		
		// 파일클래스를 가지고 객체 생성
		// 파일(일반 컴퓨터쓸 때 만드는 그 파일을 말함)을 생성하려면 반드시 파일명이 있어야함. 이름없는 파일은 존재할 수 없음.
		File file1 = new File("test.txt");// 따라서 생성자에도 파일명이 인자로 들어감. 비어있는 인자로 파일을 만들 수 없음.
		
		try {
			file1.createNewFile(); // Checked(컴퓨터가 체크해줌)Exception IOException 발생할거라고 해줌.
			//파일을 만든다는 것의 의미
			// -> SSD/ HD/ USB 등등 RAM에 올라가있는 데이터들을 프로그램이 종료돼도 지속적으로 저장되어있는/ 사라지지 않는 공간에 올리겠다는 것
			// 그래서 이 예외처리가 발생함. 왜냐면 JVM이 아니라 메모리상에서 일어날 일이라서 JVM이 제어할 수 없기 때문.
			// createNewFile(); --> 파일을 생성해주는 메소드.
			// 11_Input_Output 가면 test.txt 파일 생성되어있음.  또는 왼쪽 프로젝트이름을 F5하거나 리프레시 버튼 누르면 파일 생성된 것을 확인할 수 있음.
			
			// 폴더 만드는 방법
			// makeDirectory  -> 약자는 아래
			// mkdir()
			File folder = new File("folder"); // 소스코드 실행하면 이름똑같은 파일 계속 덮어쓰기 됨.
			folder.mkdir();
			
			// 경로지정을 통해 특정 경로에 파일 생성
			File file2 = new File("folder/test.txt"); // folder에다가 txt파일을 만들 것이라고 경로 지정
			file2.createNewFile();
			
			// File에서 제공하는 메소드
			System.out.println("파일이니? " + file2.isFile()); // 파일인지 구분하는 메소드
			System.out.println("파일 명 : " + file2.getName()); // 파일명을 얻는 메소드
			System.out.println("상위 폴더  : " + file2.getParent()); // 상위폴더 하나만
			System.out.println("절대 경로 : " + file2.getAbsolutePath()); // 절대경로
			System.out.println("파일 크기 : " + file2.length()); // 파일크기. 데이터 없으면 크기 0
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		/*
		 *  => IO(Input & Output), 입/출력
		 *  프로그램 상의 데이터를 외부매체(모니터, 스피커, DB, 웹브라우저, 콘솔, "파일") 등등으로 출력하거나
		 *  입력장치(마우스, 키보드, 마이크, "파일")로 입력받는 과정
		 *  
		 *  IO를 진행하고 싶으면 
		 *  우선적으로 반드시 프로그램과 외부매체간의 "통로"를 만들어야함.
		 *  => 스트림(Stream) - 통로를 표현하는 단어.
		 *  
		 *  스트림의 특징
		 *  1. 단방향 : 입력이면 입력 / 출력이면 출력
		 *  		입력용스트림과 출력용스트림이 따로 존재함.
		 *  (출력스트림은 출력만 하고 입력스트림은 입력만 할 수 있다)
		 *  
		 *  2. 선입선출(First In First Out. FIFO) -> 큐(Queue)
		 *  시간지연 문제가 발생할 수 있음.
		 *  (앞 데이터가 나가야 뒤에 데이터가 나갈 수 있다. 한 줄로 서있음)
		 *  
		 *  스트림을 구분
		 *  
		 *  - 스트림의 사이즈
		 *  
		 *  바이트 스트림 : 1Byte짜리가 이동할 수 있는 통로들을 전부 바이트스트림이라고 한다.
		 *  => 입력(XXXInputStream) XXX는 입력매체 따라 다르지만 끝날 때는 인풋스트림 하고 끝남
		 *  => 출력(XXXOutputStream) 하고 끝남.
		 *  문자 스트림 : 2Byte짜리가 이동할 수 있는 통로
		 *  => 입력(XXXReader) 끝날 때 Reader
		 *  => 출력(XXXWriter) 
		 *  
		 *  - 외부매체와의 직접적인 연결 여부
		 *  
		 *  기반 스트림 : 외부매체와 직접적으로 연결되는 통로
		 *  
		 *  보조 스트림 : 기반스트림만으로 부족한 성능 향상시켜주는 용도로 만들어진 스트림
		 *  		=> 단독 사용 불가(반드시 기반스트림이 존재해야만 기반스트림에 추가해줄 수 있음)
		 *  		=> 속도 향상, 자료형에 맞춰서 변환, 객체단위로 입출력하게 도움
		 *  
		 *  
		 *  
		 * 
		 *  
		 */
		
		
		
	}

}
