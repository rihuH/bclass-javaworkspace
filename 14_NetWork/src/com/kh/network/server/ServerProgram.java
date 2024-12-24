package com.kh.network.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram {

	public static void main(String[] args) {

		/*
		 * - 네트워킹을 위해서는 데이터를 전송하기 이전에 서버, 클라이언트 간의 연결이 필요함.
		 * 
		 * * ServerSocket - 자바에서 제공해주는 클래스
		 * - PortNumber를 가지고 어떤 프로그램을 몇 번 포트에 올려놓을 지 지정할 수 있다.
		 * - 포트번호 연결하는 것을 바인딩(Binding) 한다고 한다.
		 * - 포트번호 연결(Bind)해서 외부의 연결요청을 기다리다가 연결요청이 들어오면 수락해줄 용도
		 * - 수락하는 순간 서버의 Socket객체 생성
		 * 
		 *  * Socket
		 *  - Process간의 통신을 담당
		 *  - Socket객체를 이용해서 통신을 위한 기반스트림 InputStream / OutputStream을 제공하고 있음
		 *  - 기반스트림만으로는 제약이 있으니 보조스트림을 사용해서 성능을 향상시킬 것.
		 *  
		 *  -- 서버측 프로그램 작성 절차
		 *  
		 *  1) 포트 번호 지정(서버측에서 몇 번 포트로 통로를 열겠냐)
		 *  2) ServerSocket객체 생성 => 인자값으로 포트번호를 전달해야함(포트결합, Binding)
		 *  
		 *  -- 연결을 언제든지 받을 수 있는 상태 -- 
		 *  3) 대기상태
		 *  4) 연결요청이 온다면 요청 수락 후 해당 클라이언트와 통신할 수 있는 Socket객체 생성(메소드가 반환해줌)
		 *  5) 4단계에서 만들어진 Socket객체를 통해 입/출력 스트림을 열어주기
		 *  6) 보조스트림을 추가하여 성능 개선
		 *  7) 스트림을 통해 입/출력
		 *  8) 자원 반납
		 * 
		 */
		
		// 서버측 프로그램
		
		// 0) 필요한 변수 세팅
		Scanner sc = new Scanner(System.in);
		
		// 자원반납을 위해 미리 참조변수 선언 및 null값으로 초기화
		ServerSocket server = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		
		// 1) 포트번호 지정
		int portNumber = 1026; // 내가 사용하고 있는 프로그램이랑 번호 겹치면 안됨
		
		try {
			// 2) ServerSocket객체 생성 및 포트결합(Bind)
			server = new ServerSocket(portNumber);
			// 항상 대기상태에 있다가 클라이언트의 연결 요청을 받아줄 용도의 객체
			// 언제든 클라이언트의 요청을 받을 수 있음.
			
			// 3) 대기상태
			System.out.println("클라이언트의 요청을 기다리는중.....");
			
			// 4) 연결요청이 오면 수락 후 해당 클라이언트와 통신할 수 있는 서버측 Socket객체 생성
			// ServerSocket클래스의 메소드로 accept() : Socket객체 반환
			Socket socket = server.accept(); // 객체 반환해줌.
			// 소켓을 이용하면 어떤 클라이언트가 나한테 요청한 건지 정보를 얻어낼 수 있다.
			// socket객체를 사용해서 어떤 Client가 연결 요청을 했는지 알아볼 수 있음
			System.out.println(socket.getInetAddress().getHostAddress() + "가 나한테 연결");
			
			// 5) 클라이언트와 통신할 수 있는 입/출력 스트림 생성
			// 6) 보조스트림을 추가해서 성능 개선
			
			// 입력용 스트림(클라이언트로부터 전달된 값을 한 줄 단위로 읽어들이는 스트림)
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			 
			// socket에서 제공하는 입력용 기반스트림 => InputStream : 1Byte
			// --- 이 사이에 2Byte짜리 문자스트림과 1Byte짜리 바이트스트림을 호환해줄 수 있는 보조스트림 => InputStreamReader
			// 속도향상, 한글 전달도 위한 입력용 보조스트림 => BufferedReader : 2Byte
			
			// 출력용 스트림(클라이언트에게 데이터를 전송해주기 위한 스트림)
			pw = new PrintWriter(socket.getOutputStream()); // PrintWriter는 나중에 나와서 바이트스트림 기반으로도 사용가능
			// PrintWriter는 2Byte짜리 문자스트림이지만 1Byte짜리 기반스트림도 사용이 가능
			
			// 7) 스트림을 통해 입/출력
			
			// Client와 Data를 주거니 받거니 할 수 있게끔 구성
			while(true) {
				
				// 7-1) 스트림을 통해 읽기
				// 클라이언트가 데이터를 전송할 경우 서버측에서 입력(Input)받기
				String message = br.readLine();
				System.out.println("클라이언트로부터 받은 메시지 : " + message);
				
				// 7-2) 스트림을 통해 쓰기
				System.out.print("클라이언트에게 전송할 메시지 > ");
				String sendMessage = sc.nextLine();
				pw.println(sendMessage); // 이러면 데이터를 내보내는게 아니고 가지고만 있음
				
				// 스트림에 있는 데이터를 강제로 내보내는 메소드
				pw.flush();
			}
			
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally { 
			// 8) 자원반납 => 생성의 역순으로
			try {
				try {
					if(pw != null) pw.close();
					
				} catch(Exception e) {
					e.printStackTrace();
				}
				try {
					if(br != null) br.close();
					
				} catch(IOException e) {
					e.printStackTrace();
				}

				try {
					if(server != null) server.close();
					
				} catch(IOException e) {
					e.printStackTrace();
				}

				try {
					if(sc != null) sc.close();
					
				} catch(Exception e) {
					e.printStackTrace();
				}

			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
