package com.kh.quiz.view;

import java.util.Scanner;

import com.kh.quiz.controller.QuizController;
import com.kh.quiz.model.vo.Quiz;

public class QuizView {

	private Scanner sc = new Scanner(System.in);
	private QuizController qc = new QuizController();
	
	public void mainMenu() {
		
		System.out.println("퀴즈퀴즈~ 숫자맞히기 게임입니다~");
		System.out.print("성함을 입력해주세요 > ");
		String name = sc.nextLine();
		
		int result = qc.saveName(name);
		
		if(result < 1) {
			System.out.println("너는 이름에 kh가 안 들어있다.");
		} else {
			System.out.println("너는 이름에 kh가 들어있다. 그래서 너는 이걸 못한다.");
			return;
		}
		
		System.out.println("숫자맞히기를 시작할게요~");
		System.out.println();
		qc.createRandomNum();
		
		System.out.print("1~10사이의 숫자가 생성되었습니다.");
		do {
			System.out.print("숫자를 입력해주세요");
			int answer = sc.nextInt();
			sc.nextLine();
			
			// 사용자가 입력한 num과 Quiz개체의 randomNum를 비교연산
			int quizResult = qc.equals(answer);
			
			if(quizResult == 1) {
				System.out.println("숫자를 낮춰보세요");
				qc.updateIncorrectCount();
				continue;
			} else if(quizResult == 0) {
				System.out.println("딩동댕 정답입니다");
				qc.updateCorrectCount();
				
				System.out.print("퀴즈퀴즈를 계속 진행하시겠습니까? (Y / N) > ");
				String con = sc.nextLine();
				
				if(!con.equals("Y")) {
					break;
				} else {
					qc.createRandomNum();
				}
				
			} else {
				System.out.println("숫자를 높여보세요");
				qc.updateIncorrectCount();
				continue;
			}
			
		
		} while(true);
		
		Quiz quiz = qc.getQuiz(); // 얕은 복사
		System.out.println("맞춰맞춰 정답 결과입니다.");
		System.out.println(quiz.getName() + "님");
		System.out.println("정답 횟수 : " + quiz.getCorrectCount());
		System.out.println("오답 횟수 : " + quiz.getIncorrectCount());
		System.out.println();
		
		if(quiz.getCorrectCount() > quiz.getIncorrectCount()) {
			System.out.println("짝짝짝 대단해~~ 어떻게 맞췄지??");
		}
		
		
		
	}

}
