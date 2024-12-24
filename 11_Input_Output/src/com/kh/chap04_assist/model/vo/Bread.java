package com.kh.chap04_assist.model.vo;

import java.io.Serializable;

public class Bread implements Serializable{ // 직렬화하는 방법. Serializable interface를 implements해준다.

	// 필드
	// 필드는 개발자가 만드는 공간이니까 직접 작성해야한다.
	private int price;
	private String name;
	private String color; // 예쁜 계단식으로
	
	// 생성자
	// 기본생성자 : Alt + Shift + s -> o -> Alt + d -> Alt + g
	public Bread() {
		super();
	}

	
	// 모든 필드를 매개변수로 갖고 있는 매개변수 생성자
	// Alt + Shift + s -> o -> Alt + g (그냥 엔터도 됨)
	public Bread(int price, String name, String color) {
		super();
		this.price = price;
		this.name = name;
		this.color = color;
	}


	//메소드
	// getter()/ setter()/ toString()
	// Alt + Shift + s -> Alt + a -> Alt + r
	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

	// toString도 똑같음/ Alt + Shift + s
	@Override
	public String toString() {
		return "Bread [price=" + price + ", name=" + name + ", color=" + color + "]";
	}
	
	
	
	
	
}
