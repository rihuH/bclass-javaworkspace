package com.kh.chap01.model.vo;

public class KoreaFood {
	
	private String foodName;
	private String material;
	private int cookingTime;
	private int spicy;
	
	public KoreaFood() {}
	public KoreaFood(String foodName, String material, int cookingTime, int spicy) {
		this.foodName = foodName;
		this.material = material;
		this.cookingTime = cookingTime;
		this.spicy = spicy;
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
	
	public int getSpicy() {
		return spicy;
	}
	public void setSpicy(int spicy) {
		this.spicy = spicy;
	}
	
	public String information() {
		return "음식명 : " + foodName + ", 주재료 : " + material + ", 조리시간 : " + cookingTime + ", 맵기 정도 : " + spicy + "단계";
	}
	
	
}
