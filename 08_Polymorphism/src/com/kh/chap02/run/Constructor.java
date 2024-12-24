package com.kh.chap02.run;

import com.kh.chap02.model.vo.Cellist;
import com.kh.chap02.model.vo.Musician;
import com.kh.chap02.model.vo.Pianist;
import com.kh.chap02.model.vo.Violinist;

public class Constructor {

	public static void main(String[] args) {
		/*
		Violinist v1 = new Violinist("오른손잡이");
//		Violinist v2 = new Violinist("왼손잡이");
		Cellist c1 = new Cellist(10);
		Pianist p1 = new Pianist(10);
		
		
		v1.play();
//		v2.play();
		p1.play();
		c1.play();
		
		v1.stop();
//		v2.stop();
		p1.stop();
		c1.stop();
		*/
		/*
		Musician m1 = new Violinist("오른손");
		Musician m2 = new Pianist(10);//new Violinist("왼손");
		Musician m3 = new Cellist(10);
		
		m1.play();
		m2.play();
		m3.play();
		m1.stop();
		m2.stop();
		m3.stop();
		*/
		
		Musician[] musicians = new Musician[4];
		musicians[0] = new Violinist("오른손");
		musicians[1] = new Pianist(10);
		musicians[2] = new Cellist(10);
		musicians[3] = new Violinist("왼손");
		
		for(int i = 0; i < musicians.length; i++) {
			musicians[i].play();
		}
		for(int i = 0; i < musicians.length; i++) {
			musicians[i].stop();
		}
		
		// 상속도 정보은닉. 내 타입을 숨기고 상속받은 부모의 타입으로 사용
		// 캡슐화는 속성을 숨김. 
		
		
	}

}
