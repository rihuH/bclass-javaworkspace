package com.kh.run;

import java.util.ArrayList;

import com.kh.view.MusicView;

public class PlayListRun {

	public static void main(String[] args) {

		// MVC 패턴(소프트웨어 만들 때 디자인 패턴 중 하나)을 적용한 음악관리 프로그램

		// M : Model // 데이터를 담당하는 역할
		// model.vo : 값을 담는다. model.dao : 값의 입/출력

		// V : View // 사용자가 보는 화면을 담당(화면의 입/출력)
		// View가 아닌 곳에서는 입/출력문을 작성하지 않음
		// Scanner / print

		// C : Controller // 사용자가 View를 통해 요청한 내용을 처리하고
		// 결과를 돌려주는 역할

		// 아예 MVC나 어떤 디자인패턴으로 구조를 생성해 주는 도구들이 있음. 그 도구 틀에 맞춰서 작업하지 않으면 아예 동작하지 않음.

//		MusicView mv = new MusicView();
//		mv.mainMenu();

		ArrayList l = null;
		l.add(1);
	}

}
