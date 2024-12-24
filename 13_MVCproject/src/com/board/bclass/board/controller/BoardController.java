package com.board.bclass.board.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.board.bclass.board.model.vo.Board;
import com.board.bclass.member.model.vo.User;

// controller의 기능 3개
// 1. 데이터가공/ 2. 요청처리/ 3. 결과값 반환
public class BoardController {
	// 필드부
	private List<User> userList = new ArrayList();
	private List<Board> boardList = new ArrayList();
	private int boardNo;
	
	{ // BoardController객체 생성시 필드에 추가해놓을 관리자계정
		userList.add(new User("admin", "1234"));
	}
	
	// 메소드부
	// 사용자가 아이디를 입력했을 때 입력한 아이디가 
	// userList에 있는 요소의 userId 필드값과 중복이 되는지 체크해주는 메소드
	public boolean checkId(String userId) {
		for(int i = 0; i < userList.size(); i++) {
			if(userId.equals(userList.get(i).getUserId())) {
				return true;
			}
		}
		return false;
	}
	
	// 사용자가 입력한 아이디값과 비밀번호값을 가지고 새로운 회원객체를 리스트의 요소로 추가해주는 메소드
	public boolean join(String userId, String userPwd) {
		// 1. 데이터 가공
		// 유저 생성자를 호출합니다.
		User newUser = new User(userId, userPwd);
		// 2. 요청처리
		// 전 중복체크
		boolean result = checkId(userId);
		if(!result) {
			userList.add(newUser);
			return true;
		}
		return false;
		// 3. 결과값 반환
	}
	
	// 사용자가 로그인 요청 시 호출되는 메소드
	public User login(String userId, String userPwd) {
		// 컨트롤러가 가지고 있는
		// 회원의 정보를 저장하는 userList필드의 요소들을 하나하나 접근하여
		// 요소의 userId필드 / userPwd필드를
		// 사용자가 입력한 userId값 / userPwd값과 각각 비교하여
		// 둘 다 일치하는 User객체가 존재한다면 사용자의 정보가 담긴 User객체를 반환
		for(int i = 0; i < userList.size(); i++) {
			// 반복하면서 순차적으로 접근하는 요소객체
			User user = userList.get(i);
			if(user.getUserId().equals(userId) && user.getUserPwd().equals(userPwd)) {
				return user;
			}
		}
		return null;
	}
	
	// 사용자의 글 쓰기 요청이 들어올 때마다 호출되는 메소드
	public void insertBoard(String boardTitle, String boardContent, String userId) {
		// 1. 데이터 가공
		// 게시글 번호, 제목, 내용, 작성자Id, 작성일
		String createDate = new SimpleDateFormat("yyyy년 MM월 dd일").format(new Date());
		Board board = new Board();
		board.setCreateDate(createDate);
		board.setUserId(userId);
		board.setBoardContent(boardContent);
		board.setBoardTitle(boardTitle);
		board.setBoardNo(++boardNo);
		// 2. 요청처리
		boardList.add(board);
	}
	
	public List<Board> findAll() {
		return boardList;
	}
	
	// 게시글 상세보기 요청이 들어왔을 때 호출되는 메소드
	public Board findByBoardNo(int boardNo) {
		if(boardNo > this.boardNo) {
			return null;
		} 
		return boardList.get(boardNo);
	}
	
	
	

}
