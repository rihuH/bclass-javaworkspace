package com.kh.chap01.model.vo;

public class Child2 extends Parent {
	
	// 필드부
	private int n;
	
	// 생성자부
	public Child2() {}
	public Child2(int x, int y, int n) {
		super(x, y);
		this.n = n;
	}
	
	// 메소드부
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public void printChild2() {
		System.out.println("안녕 나는 두 번째 자식 Child2야~~");
	}
	
	@Override
	public void print() {
		System.out.println("Child2입니다.");
	}

}
