package com.kh.chap02.model.vo;

public class VietnamFood extends Food {
	
	// 필드부
	private boolean gosu;

	
	
	// 생성자부
	public VietnamFood() {
		super();
	}
	
	//매개변수 생성자
	public VietnamFood(String foodName, String material, int cookingTime, boolean gosu) {
//		this.foodName = foodName; // 기존에 했던 것처럼 할 수 없다. this는 '나'를 의미하는데 나는 foodName이 없다.
		// super.foodName = foodName;
		// 접근제한자가 private이기 때문에 보이지 않음
		// 해결방법
		// 1. 부모클래스의 접근제한자를 바꾼다 -> protected, default (하지만 캡슐화원칙이 깨짐. 적합한 방법이 아님)
//		super.foodName = foodName;
		// 2. 부모클래스의 setter메소드를 호출한다. 이것도 잘 안 씀.
//		super.setMaterial(material);
		// 3. 부모클래스가 가지고 있는 매개변수 생성자를 호출.
		super(foodName, material, cookingTime); // 부모클래스를 기본생성자가 아닌 부모클래스의 매개변수생성자로 생성하게 됨.

		this.gosu = gosu;
	}

	// 메소드부
	public boolean isGosu() {
		return gosu;
	}
	public void setGosu(boolean gosu) {
		this.gosu = gosu;
	}
	

	
}
