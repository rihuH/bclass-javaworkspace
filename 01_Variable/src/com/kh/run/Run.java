package com.kh.run;

import com.kh.variable.A_Variable; /*내가 사용하고 싶은 풀패키지명*/
import com.kh.variable.B_KeyboardInput;
import com.kh.variable.Casting;

public class Run {
	
	public static void main(String[] args) {
		
		/*import를 쓰지 않고 클래스를 불러오려면
		 * com.kh.variable.A_Variable a = new com.kh.variable.A_Variable(); 풀패키지명을 적어줘야함
		*/
		//import를 한 경우 같은 패키지에 있던 클래스처럼 선언해주면 된다.
		A_Variable a = new A_Variable();
		
//		a.seasonMenu();
//		a.declareVariable();
		
//		B_KeyboardInput b = new B_KeyboardInput();
//		b.inputTest();
		
		Casting c = new Casting();
		
//		c.autoCasting();
		c.forceCasting();
	}

}
