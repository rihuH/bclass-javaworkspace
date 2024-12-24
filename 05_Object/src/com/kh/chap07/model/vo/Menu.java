package com.kh.chap07.model.vo;

// 값을 저장
public class Menu {

	private String material;
	private String menuName;
	private int price;
	private int stock;
	
	// 기본 생성자, 모든 필드를 매개변수로 갖는 생성자, getter(), setter() 
	public Menu() {}
	public Menu(String material, String menuName, int price, int stock) {
		this.material = material;
		this.menuName = menuName;
		this.price = price;
		this.stock = stock;
	}
	
	public String getMaterial() {
		return material;
	}
	public String getMenuName() {
		return menuName;
	}
	public int getPrice() {
		return price;
	}
	public int getStock() {
		return stock;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
