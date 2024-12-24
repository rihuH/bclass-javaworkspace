package com.kh.transportation.model.vo;

public abstract class Transportation {
	
	private String name;
	private double speed;
	private double price;

	public Transportation() {
	}
	public Transportation(String name, double speed, double price) {
		this.name = name;
		this.speed = speed;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Transportation [name=" + name + ", speed=" + speed + ", price=" + price + "]";
	}
	
	

}
