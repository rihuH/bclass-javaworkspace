package com.board.bclass.board.view;

import java.util.List;
import java.util.Scanner;

import com.board.bclass.board.controller.BoardController;
import com.board.bclass.board.model.vo.Board;
import com.board.bclass.member.model.vo.User;

public class BoardView {
	
	// 필드부
	private Scanner sc = new Scanner(System.in);
	private BoardController bc = new BoardController();
	// 로그인 된 회원의 정보를 담을 필드
	private User loginUser = null;
	
	// 생성자
	
	// 메소드부
	// 프로그램을 실행했을 때 가장 먼저 보이게 될 화면을 출력해주는 기능
	public void mainMenu() {
		
		// while문 무한반복
		while(true) {
			
			System.out.println("\n\n게시판 서비스에 오신 것을 환영합니다.");
			System.out.println("이용하실 서비스를 선택해주세요.");
			
			System.out.println("1. 회원가입");
			
			/*
			String inOut = "";
			if(loginUser == null) {
				// 비로그인상태
				System.out.println("2. 로그인");
				inOut = "2. 로그인";
			} else {
				// 로그인상태
				System.out.println("2. 로그아웃");
				inOut = "2. 로그아웃"
			}
			System.out.println(inOut);
			*/
			
			System.out.println(logInCheck());
			
			System.out.println("3. 게시글 작성");
			System.out.println("4. 게시글 전체조회");
			System.out.println("5. 게시글 상세조회");
			System.out.println("9. 프로그램 종료");
			
			System.out.println("이용할 서비스 번호 > ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : join(); break;
			case 2 : 
				if(loginUser == null) {
					// 비로그인 상태일 때
					login(); 
				} else {
					loginUser = null;
					System.out.println("로그아웃 성공~");
				}
				break;
			case 3 : insertBoard(); break;
			case 4 : findAll(); break;
			case 5 : findByBoardNo(); break;
			case 9 : System.out.println("게시판 서비스를 종료합니다."); break;
			default : System.out.println("없는 메뉴를 선택하셨습니다. 다시 입력하세요!");
			}
			
			
		}
	}
	
	private String logInCheck() {
		return loginUser != null ? "2. 로그아웃" : "2. 로그인";
	}
	
	private void join() { // private으로 하는 이유, 다른 곳에서 많이 부르게 되면 join()의 이름 등이 수정되었을 때 다른 곳도 전부 바뀌어야 함. 접근제한 해두어야 유지보수에 용이.
		System.out.println("\t ==== 회원가입 서비스입니다.");
		// 입력 ( 사용자에게 아이디값과 비밀번호값)
		String userId;
		while(true) {
			System.out.print("아이디를 입력해주세요 > ");
			userId = sc.nextLine();
			
			//중복체크
			if(bc.checkId(userId)) {
				System.out.println("사용이 불가능합니다. 다른 아이디를 입력해주세요!");
				continue;
			} else { 
				System.out.println("사용이 가능한 아이디입니다.");
				break;
			}
		}
		System.out.println("비밀번호를 입력해주세요 > ");
		String userPwd = sc.nextLine();
		// 사용자가 입력한 아이디와 비밀번호를 가지고 User객체를 생성해서
		// Controller에 있는 userList 필드에 요소로 추가!
		if(bc.join(userId, userPwd)) {
			System.out.println("회원가입에 실패했습니다. ");
		} else {
			System.out.println("회원가입 성공");
		}
	}
	
	private void login() {
		System.out.println("\n로그인 서비스 입니다.");
		System.out.print("아이디를 입력해주세요 > ");
		String userId = sc.nextLine();
		System.out.println("비밀번호를 입력해주세요 > ");
		String userPwd = sc.nextLine();
		User user = bc.login(userId, userPwd);
		if(user != null) {
			System.out.println("로그인 성공 ~  " + userId + "님 환영합니다.");
			loginUser = user;
		} else {
			System.out.println("로그인 실패. 아이디 또는 비밀번호를 확인하세요");
		}
	}
	
	private void insertBoard() {
		System.out.println("\n게시글 작성 서비스입니다.");
		if(loginUser != null) {
			loginUser.getUserId();
			System.out.print("게시글 제목을 입력해주세요 > ");
			String boardTitle = sc.nextLine();
			System.out.print("게시글 내용을 입력해주세요 > ");
			String boardContent = sc.nextLine();
			bc.insertBoard(boardTitle, boardContent, loginUser.getUserId());
			System.out.println("게시글 작성에 성공했습니다.");
		} else {
			System.out.println("로그인 후 이용 가능한 서비스입니다.");
		}
	}
	
	private void findAll() {
		System.out.println("\n게시글 목록입니다.");
		List<Board> boardList =  bc.findAll();
		if(boardList.isEmpty()) {
			System.out.println("게시글이 아직 존재하지 않습니다.");
			System.out.println("새로운 게시글을 작성해주세요!");
		} else {
			for(Board b : boardList) {
				System.out.print("글번호 :  " + b.getBoardNo() + "\t");
				System.out.print("제목 :  " + b.getBoardTitle() + "\t");
				System.out.print("작성자 :  " + b.getUserId() + "\t");
				System.out.print("작성일 :  " + b.getCreateDate() + "\t");
				System.out.println();
			}
		}
	}
	
	
	private void findByBoardNo() {
		System.out.println("\n게시글 상세보기 서비스입니다.");
		findAll();
		System.out.print("상세보기를 할 게시글의 번호를 입력해주세요 > ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		Board board = bc.findByBoardNo(boardNo - 1);
		if(board != null) {
			System.out.println("\n================================");
			System.out.println(boardNo + "번 게시글 상세보기");
			System.out.println("제목 : "+ board.getBoardTitle());
			System.out.println("내용 : "+ board.getBoardContent());
			System.out.println("작성자 : "+ board.getUserId() + "\t작성일 : " + board.getCreateDate());
			System.out.println("================================");
		} else {
			System.out.println(boardNo + "번 게시글은 존재하지 않습니다.");
		}
	}
	
	
	
	
	
	
	
}
