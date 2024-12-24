package com.kh.quiz.controller;

import com.kh.quiz.model.vo.Quiz;

// 가공작업
public class QuizController {
	private Quiz quiz;
	
	public Quiz getQuiz() {
		return quiz;
	}

	
	public int saveName(String name) { // 1메소드당 1기능으로 만드는 것이 좋음 다기능 말고
		//VO객체로 가공
		
		if(!name.contains("kh")) { // .contains는 boolean타입을 반환함. kh가 포함되어있으면 true,
			quiz = new Quiz();
			quiz.setName(name);
			return 0;
		} else {
			return 1;
		}
	}
	
	// 1-10 랜덤한 정수를 만들어서 quiz필드에 대입
	public void createRandomNum() {
		
		int randomNum = (int)(Math.random()*10) + 1;
		quiz.setRandomNum(randomNum);
	}
	
	// 사용자가 입력한 정수와 quiz객체의 randomNum필드값 비교하는 기능
	public int equals(int answer) {
		// 자료형(크다 == 1, 같다 == 0, 작다 == -1)
		int randomNum = quiz.getRandomNum(); // if문에 바로 쓰면 조건문 판단할 때마다 메모리 가서 값 가져오는 행위를 반복하기 때문에
		
		if(answer > randomNum) {
			return 1;
		} else if(answer == randomNum) {
			return 0;
		} else {
			return -1;
		}
	}
	
	// 사용자가 입력한 정수가 정답일 시 필드값을 + 1 해주는 기능
	public void updateCorrectCount(){
		quiz.setCorrectCount(quiz.getCorrectCount() + 1);
	}
	public void updateIncorrectCount() {
		quiz.setIncorrectCount(quiz.getIncorrectCount() + 1);
	}
	
	
	
}
