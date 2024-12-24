package com.kh.chap05.run;

import com.kh.chap05.model.vo.Ballad;
import com.kh.chap05.model.vo.Jazz;
import com.kh.chap05.model.vo.MusicI;

public class Run {

	public static void main(String[] args) {

		
//		Music music = new Music(); // 추상클래스이므로 객체 생성이 불가능하다
		
		MusicI jazz = new Jazz();
		MusicI ballad = new Ballad();
		
		jazz.play();
		ballad.play();
		
		
		
	}

}
