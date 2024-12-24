package com.kh.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.controller.MusicController;
import com.kh.model.vo.Music;

// View : 시각적인 요소, 화면 입/출력
public class MusicView {
	private Scanner sc = new Scanner(System.in); // 필드에 스캐너 선언하면 자원반납 해줄 수 없음. 지금 수업단계에서 어쩔 수 없이 편의를 위해 사용하는 것
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		
		while(true) {
			// ArrayList<Music> - 저장소역할
			System.out.println();
			System.out.println("재생 목록 관리 프로그램입니다.");
			// 기본소양 (CRUD) -> 우리가 만드는 프로그램이 갖추어야 하는 기본 소양.
			// Create : 재생목록을 생성(추가)해내는 작업
			// Read : 만들어진 재생목록를 조회하는 작업
			// Update : 기존의 재생목록을 수정하는 작업
			// Delete : 재생목록을 삭제하는 작업
			System.out.println("1. 새로운 곡 추가"); // add()
			System.out.println("2. 전체 곡 조회"); // 반복문 + get()/toString()...
			System.out.println("3. 특정 곡 검색"); // 반복문 + 조건문 + get()
			System.out.println("4. 특정 곡 삭제"); // 반복문 + 조건문 + remove
			System.out.println("5. 특정 곡 수정"); // 반복문 + 조건문 + set()
			System.out.println("6. 재생목록을 파일로 출력"); // FileWriter
			// FileOutputStream -- 내보내려는 파일들이 영어만 있는지
			// FileWriter -- 한글이 들어있는지
			System.out.println("0. 프로그램 종료");
			System.out.println();
			
			System.out.print("어떤 기능을 이용하시겠습니까? > ");
			
			try {
				int menuNo = sc.nextInt();
				sc.nextLine(); // 윗줄에서 에러가 발생하는 경우 개행문자 날리기가 안 되기 때문에 스캐너가 정상적으로 동작하지 않는 문제.
				
				switch(menuNo) {
				case 0 : System.out.println("프로그램을 종료합니다."); return;
				case 1 : saveMusic(); break;
				case 2 : readAll(); break;
				case 3 : searchMusic(); break;
				case 4 : deleteMusic(); break;
				case 5 : updateMusic(); break;
				case 6 : mc.outputFile(); break;
				default : System.out.println("없는 메뉴입니다. 다시 선택해주세요.");
				
				}
				
			} catch(InputMismatchException e) {
				System.out.println("메뉴를 숫자로 입력해주세요");
				e.printStackTrace();
				sc.nextLine(); // 여러 번 써줘도 된다.
			}
		}
	}
	
	// 1. 새롭게 곡을 추가할 수 있는 화면을 보여주는 메소드
	private void saveMusic() {
		
		System.out.println("\n재생목록 추가 서비스입니다.");
		
		System.out.print("곡 명을 입력해주세요 > ");
		String title = sc.nextLine();
		System.out.print("가수 명을 입력해주세요 > ");
		String artist = sc.nextLine();
		
		// 재생목록에 추가할 값 두 개를 입력 받았기 때문에 View는 일단 할 일이 끝남.
		// 내가 입력한 노래제목하고 가수명을 가지고 재생목록에 추가해줘 => 곡 추가 요청
		// 요청처리는 컨트롤러의 메소드를 호출하면서 위임
		boolean result = mc.saveMusic(title, artist);
		
		// View는 컨트롤러로부터 요청 처리 결과를 받아
		// 사용자에게 출력
		if(result) {
			System.out.println("재생목록에 새로운 곡을 추가했습니다!");
		} else {
			System.out.println("재생목록에 곡을 추가하는 데 실패했습니다.");
		}
		
	}
	
	// 2. 전체 재생목록을 출력해 줄 수 있는 메소드
	private void readAll() {
		
		System.out.println();
		System.out.println("재생목록 전체 조회 서비스입니다.");
		
		ArrayList<Music> musicList = mc.readAll();
		
		// 경우의 수
		// case 1. 값이 없을 경우
		// case 2. 값이 하나일 경우
		// case 3. 값이 여러 개일 경우
		
		// 음악 저장소에 Music객체가 하나도 없을 경우
		if(musicList.isEmpty()) {
			System.out.println("리스트에 곡이 존재하지 않습니다.");
			// else 하나라도 있을 경우
		} else {
			for(Music m : musicList) {
				System.out.println("곡 제목 : " + m.getTitle() + ", 가수 : " + m.getArtist());
			}
		}
		System.out.println();
	}
	
	// 3. 곡을 검색할 수 있는 화면을 출력해주는 메소드
	private void searchMusic() {
		
		// 1. 제목을 가지고 검색
		// 2. 가수를 가지고 검색
		// 3. 제목과 가수를 둘 다 검색
		
		// 4. 제목이 사용자가 입력한 값과 일치하는 것만
		// 5. 가수가 사용자가 입력한 값과 일치하는 것만
		// 6. 제목 또는 가수가 사용자가 입력한 값과 일치하는 것만
		
		// 7. 제목에 사용자가 입력한 키워드가 포함되는 것들을
		// 8. 가수에 사용자가 입력한 키워드가 포함되는 것들을
		// *** 우리는 9번
		// 9. 제목과 가수에 사용자가 입력한 키워드가 포함되는 것들을 
		
		System.out.println();
		System.out.println("재생목록 검색 서비스입니다.");
		System.out.println("검색어를 입력해주세요 > ");
		String keyword = sc.nextLine();
		// View가 할 일 일단 끝남
		
		ArrayList<Music> list = mc.searchMusic(keyword);
		
		System.out.println("검색결과");
		
		// 검색결과가 없을 경우
		if(list.isEmpty()) { 
			System.out.println("검색 결과가 존재하지 않습니다.");
		// 검색결과가 존재할 경우
		} else {
			System.out.println("조회 결과는 " + list.size() + "건 입니다.");
			
			for(Music m : list) {
				System.out.println("제목 : " + m.getTitle() + ", 가수 : " + m.getArtist());
			}
		}
		
	}
	
	// 4. 특정 곡을 삭제할 수 있는 화면을 출력해주는 메소드
	private void deleteMusic() {
		
		System.out.println();
		System.out.print("재생목록에서 제거할 곡 제목을 입력해주세요. > ");
		String title = sc.nextLine();
		
		int count = mc.deleteMusic(title);
		
		if(count > 0) { // 문제가 되는 변수를 앞에 적는 것을 선호한다.
			System.out.println("삭제 성공!");
			System.out.println("제목이 " + title + "인 곡을 총 " + count + "개 삭제했습니다!");
		} else {
			System.out.println("삭제할 곡을 검색하지 못했습니다.");
		}
		
	}
	
	// 5. 특정 곡을 수정할 수 있는 화면을 출력해주는 메소드
	// 곡명 / 가수명 == 둘 다 받아서 둘 다 바꾸기
	private void updateMusic() {
		System.out.println();
		// 사용자에게 기존 곡명과 기존 가수명을 입력받아서
		// 새로운 곡명과 가수명으로 재생목록을 갱신
		
		// 기존 곡명, 기존 가수명(검색의 용도)
		// 수정할 곡명, 수정할 가수명(갱신의 용도)
		System.out.println("재생목록 갱신 서비스입니다");
		System.out.print("기존 곡 명 > ");
		String title = sc.nextLine();
		
		System.out.print("기존 가수명 > ");
		String artist = sc.nextLine();
		
		System.out.print("수정할 곡 명 > ");
		String updateTitle = sc.nextLine();
		
		System.out.print("수정할 가수명 > ");
		String updateArtist = sc.nextLine();
		
		boolean result = mc.updateMusic(title, artist, updateTitle, updateArtist);
		
		if(result) {
			System.out.println("재생목록 갱신에 성공했습니다.");
		} else {
			System.out.println("수정할 곡을 찾지 못했습니다.");
		}
		
	}
	
	
	

}
