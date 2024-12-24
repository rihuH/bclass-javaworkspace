package com.kh.chap01.model.vo;

public class Parent {
	
	// 필드부
	private int x;
	private int y; // 예시를 위해 이렇게 쓰면 안되지만 변수명 정함
	
	// 생성자부
	public Parent() {}
	public Parent(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 메소드부
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void printParent() {
		System.out.println("안녕 ~ 나는 부모클래스야~");
	}

	public void print() {
		System.out.println("부모 클래스입니다.");
	}

}
