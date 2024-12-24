package com.kh.network.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Run {

	public static void main(String[] args) {

		/*
		 * 네트워크(Network)
		 * 
		 * 통신이 가능한 두 대 이상의 장치(device)들을 물리적 또는 논리적으로 연결한 환경
		 * (물리적은 실제 있는 것, 논리적은 없는 것 스마트폰은 주파수, 전기신호로 연결하며 유선이 없으니까 논리적 연결
		 * 강의실에 있는 컴퓨터들은 유선으로 전부 연결되어있어서 물리적연결)
		 * 네트워크의 목적 -> 데이터 교환
		 * 
		 * 하나의 환경은 하나의 네트워크
		 * 
		 * 강의실마다 switch 포트에 다 연결해둠
		 * 물리적 연결
		 * 그리고 switch 선을 모두 떼서 서버실에 연결해둠
		 * 일단 2층에 있는 통신장치는 서로 데이터교환이 가능하게 됨
		 * 
		 * 이런식으로 각 건물끼리는 지하에 다 연결해둠
		 * 건물사이에서도 지하에서 다 연결해둠
		 * 남대문로 1가 지역은 다 연결함
		 * 동네끼리 서로 연결함
		 * 우리나라는 작아서 땅밑으로 다 연결함
		 * 나라끼리 해저테이블을 설치
		 * 지구상 네트워크를 인터넷이라고 함
		 * 
		 * 
		 * 통신이 가능한 장치를 Host라고 표현함
		 * 
		 * MAC(Media Access Control) Address와 IP(Internet Protocol) Address
		 *  - MAC Address : NIC(Network Interface Card)에 실제 제조시 붙여지는 물리적인 주소
		 *  
		 *  - IP Address : Internet상에서 각 Host들을 식별할 수 있는 논리적인 주소
		 *  
		 *  - Port Number (이거는 주소라고 안하고 번호라고 함) : Host 내부에서 작동하는 Process를 식별할 때 사용하는 내부 번호
		 *  
		 *  => IP주소와 Port번호는 항상 고정값이 아니라 변동이 가능한 유동적인 값이다.
		 * 		단, 값을 바꿀 때 IP주소같은 경우 같은 네트워크 범위 안에서, Port번호는 컴퓨터 내부에서(프로세스 사이에서) 중복이 발생해선 안 됨! 충돌이 일어남.
		 *  
		 *  (MAC Address는 제조시 붙여서 나오는 값이고, IP, Port Number는 개발자가 바꿀 수 있다)
		 *  - Server와 Client
		 *  - Server : Client(사용자)에게 서비스를 제공해주는 물리적인 컴퓨터 또는 프로그램
		 *  			즉, Client의 요청에 대한 응답을 해주는 서비스 제공자
		 *  - Client : Server에게 서비스를 요청하는 컴퓨터 또는 프로그램
		 *  			즉, 서비스를 제공받는 고객
		 *  
		 *  => 서버는 자기 혼자서 응답을 보낼 수 없음! 클라이언트의 요청이 들어와야만 응답을 보낼 수 있는 구조
		 *  => 클라이언트 입장에서는 서버에 요청을 보내기 위해서 서버의 IP주소와 Port번호를 알아야함 
		 * 
		 * 
		 */
		
		// InetAddress : 네트워크 정보를 확인할 수 있는 클래스
		
		try {
			InetAddress localHost = InetAddress.getLocalHost();
									// localhost : 현재 프로그램을 동작시킨 PC를 지칭
									// getLocalHost() : 작업하고 있는 Host의 정보를 반환해주는 메소드
			System.out.println(localHost); // 내PC이름/IP주소
			
			System.out.println(localHost.getHostName());
			System.out.println(localHost.getHostAddress());
			
			System.out.println("=====================================");
			
			// 내가 알고 있는 도메인네임을 통해서 서버컴퓨터와 관련된 정보를 얻어 낼 수 있음
			// DomainName : 사용자가 웹 사이트를 접속할 때 매 번 해당 서버의 IP주소를 외우기 어렵기 때문에
			//				외우기 쉬운 구조로 사용자에게 제공되는 이름
			// 주소창에 www.google.com -> hosts파일 -> DNS(Domain Name System)
			// 구글서버의 IP주소를 가지고 웹서버로 HTTP(s) 요청
			
			InetAddress googleHost = InetAddress.getByName("www.google.com");
			//getByName() : 도메인 이름이라는 고유한 이름을 통해 해당 서버의 정보를 얻어내서 반환
			System.out.println(googleHost.getHostName());
			System.out.println(googleHost.getHostAddress());
			// 서버가 보통 한 개가 아닌 분산구조로 이루어져있음!
			// 그래서 142.250.66.36 같은 구글이라도 이 숫자가 다른 것. 이 숫자를 주소창에 입력하면 모두 같은 구글로 감.
			// 여러개의 서버에서 요청을 처리함.
			
			
			
		} catch(UnknownHostException e) {
			e.printStackTrace();
		}
		
		/*
		 * 현재 구동중인 서버가 존재한다면 클라이언트는 언제든 서버로 요청을 보낼 수 있음
		 * => 항상 응답결과를 돌려줌
		 * 
		 * Client-Server모델에서 프로그램 동작 방식
		 * 
		 * "요청(request)"과 "응답(response)"에서 의해서 프로그램 동작(통신한다)
		 * 웹에서 통신 방식 : HTTP(Hyper Text Transfer Protocol) S(Secure --> 보안관련 내용추가)
		 * 
		 * 순수 자바만을 사용해서 클라이언트와 서버간의 간단한 통신 해보기
		 * 
		 * 소켓(Socket) 
		 *  : Process(프로그램이 메모리에 적재된 상태) 간의 통신을 담당
		 * 
		 * 
		 * 
		 */
		
				
	}

}
