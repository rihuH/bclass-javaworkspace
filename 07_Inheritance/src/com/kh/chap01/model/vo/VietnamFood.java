package com.kh.chap01.model.vo;

public class VietnamFood {
	
	private String foodName;
	private String material;
	private int cookingTime;
	private boolean gosu;
	
	public VietnamFood() {}
	public VietnamFood(String foodName, String material, int cookingTime, boolean gosu) {
		this.foodName = foodName;
		this.material = material;
		this.cookingTime = cookingTime;
		this.gosu = gosu;
	}
	
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public int getCookingTime() {
		return cookingTime;
	}
	public void setCookingTime(int cookingTime) {
		this.cookingTime = cookingTime;
	}
	
	public boolean isGosu() {
		return gosu;
	}
	public void setGosu(boolean gosu) {
		this.gosu = gosu;
	}
	
	public String information() {
		return "음식명 : " + foodName + ", 주재료 : " + material + ", 조리시간 : " + cookingTime + ", 고수여부 : " + gosu;
	}
}
