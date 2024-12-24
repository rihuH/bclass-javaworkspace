package com.kh.chap01.model.vo;

public class ChinaFood {
	
	private String foodName;
	private String material;
	private int cookingTime;
	private String oil;
	
	public ChinaFood() {}
	public ChinaFood(String foodName, String material, int cookingTime, String oil) {
		this.foodName = foodName;
		this.material = material;
		this.cookingTime = cookingTime;
		this.oil = oil;
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
	
	public String getOil() {
		return oil;
	}
	public void setOil(String oil) {
		this.oil = oil;
	}
	
	public String information() {
		return "음식명 : " + foodName + ", 주재료 : " + material + ", 조리시간 : " + cookingTime + ", 기름진 정도 : " + oil;
	}
	
}