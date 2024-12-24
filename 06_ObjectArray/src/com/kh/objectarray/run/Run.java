package com.kh.objectarray.run;

import java.util.Calendar;
import java.util.Scanner;
import java.util.Timer;

import com.kh.objectarray.model.vo.Restaurant;

public class Run {
	public static void main(String[] args) { // 메인메소드는 JVM이 호출

		Restaurant r = new Restaurant(); // 지역변수 중 잠깐만 쓰고 없앨 변수들은 r 이렇게 써도 됨
//		System.out.println(r.information());
		
		// 식당의 정보를 사용자에게 입력받아서 입력받은 식당의 정보를 출력해주는 프로그램
		// 3개의 식당 정보를 입력받겠다고 가정
		// 입력은 스캐너 사용
		Scanner sc = new Scanner(System.in);
		
		double d2 = 6.456459;
		double d1 = 3.123127;
		System.out.println(d2+d1);
		

}
}