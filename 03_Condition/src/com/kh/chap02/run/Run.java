package com.kh.chap02.run;

import com.kh.chap02.loop.A_For;
import com.kh.chap02.loop.B_While;

public class Run {

	public static void main(String[] args) {
		
		A_For a = new A_For();
//		a.method0();
//		a.method1();
//		a.gugudan();
//		a.method2();
//		a.method3();
//		a.method4();
		
		B_While b = new B_While();
//		b.method1();
//		b.method2();
//		b.method3();
//		b.method4();
//		b.lotto();
		
		byte bNum = (byte)128; // -128
		byte bNum2 = (byte)(128+128); // 0
		byte bNum3 = (byte)(128+128+128); // -128
		byte bNum4 = (byte)(129); // -127
		byte bNum5 = -128; // -128/ -0으로 하면 0
		System.out.println(bNum + " " + bNum2 + " " + bNum3 + " " + bNum4 + " " + bNum5);
/*

10000001 129
10000000 128
01111111 127
00000011 3
00000010 2
00000001 1
00000000 0


		*/

	}
}
