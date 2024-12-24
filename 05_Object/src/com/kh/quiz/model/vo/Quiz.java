package com.kh.quiz.model.vo;

public class Quiz {
	
	// 필드
	private String name; // 사용자가 입력할 이름을 저장할 공간
	private int correctCount; // 정답횟수를 저장할 공간
	private int incorrectCount; //오답횟수를 저장할 공간
	private int randomNum; // 임의의 정수를 저장할 공간.
	
	// 생성자
	public Quiz() {}
	
	// 메소드
	// setter()
	public void setName(String name) {
		this.name = name; // this가 이 클래스의 주소 -> .으로 참조, 직접접근 필드의 name 공간에 받아온 name값을 대입
	}
	public void setCorrectCount(int correctCount) {
		this.correctCount = correctCount;
	}
	public void setIncorrectCount(int incorrectCount) {
		this.incorrectCount = incorrectCount;
	}
	public void setRandomNum(int randomNum) {
		this.randomNum = randomNum;
	}
	// getter()
	public String getName() {
		return name;
	}
	public int getCorrectCount() {
		return correctCount;
	}
	public int getIncorrectCount() {
		return incorrectCount;
	}
	public int getRandomNum() {
		return randomNum;
	}
	

}
