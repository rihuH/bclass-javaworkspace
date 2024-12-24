package com.kh.chap03.model.vo;

public class Water {
	
	// 상품명, 가격, 용기재질, 뚜껑색깔
	
	//필드부
	private String productName;
	private int price;
	private String topColor;
	private String material;
	
	//생성자부
	
	//메소드부
	public int getPrice() {
		return price;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public String getTopColor() {
		return topColor;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void setTopColor(String topColor) {
		this.topColor = topColor;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	//information()
	public String information() {
		String info = "상품명 : " + productName + ", 뚜껑색상 : " + topColor + ", 용기재질 : " + material + ", 가격 : " + price;
		return info;
	}
	

}
