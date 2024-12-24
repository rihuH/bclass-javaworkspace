package com.kh.chap02.model.vo;

// 자식클래스 extends 부모클래스
public class ChinaFood extends Food {

	// 필드부
	// 부모로부터 상속받는 부분은 기술하지 않는다
	private String oil;
	
	// 생성자부
	public ChinaFood() {}
	// foodName, material, cookingTime : 부모클래스인 Food의 필드에 대입해야함.
	// oil : 내 필드에 대입해아함
	public ChinaFood(String foodName, String material, int cookingTime, String oil) {
		super(foodName, material, cookingTime);
		this.oil = oil;
	}
	
	// 메소드부
	public String getOil() {
		return oil;
	}
	public void setOil(String oil) {
		this.oil = oil;
	}
	
	private String foodName;
	
	// 메소드를 상속받았는데 재정의하고싶다 => 다시 기술할 수 있음.
	public String information() {
		return super.information() + ", 기름진 정도 : " + oil;
	}
	
	
}
