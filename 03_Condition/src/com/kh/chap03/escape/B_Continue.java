package com.kh.chap03.escape;

public class B_Continue {

	/* continue : 반복문 안에서 사용하는 구문
	 * 
	 * continue문을 만나면 그 밑에 어떤 구문이 존재하던 실행하지 않고 pass
	 * 가장 가까운 반복문 블록으로 올라가는 것을 의미.
	 * 
	 */
	public void method1() {
		//10번 반복. 홀수일 경우만 출력
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 0) { continue;}
			System.out.print(i + " ");
		}
	}
	
	public void method2() {
		
		// 1부터 100까지 7배수 제외하고 총 합
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 7 == 0) {continue;}
			sum += i;
		}
		System.out.println(sum);
		
	}
	
	
	
}



