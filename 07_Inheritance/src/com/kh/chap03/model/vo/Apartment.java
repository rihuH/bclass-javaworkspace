package com.kh.chap03.model.vo;

public class Apartment extends House{
	
	private int floor;
	
	public Apartment() {}
	public Apartment(int toiletCount, int roomCount, int windowCount, double size, int floor) {
		super(toiletCount, roomCount, windowCount, size);
		this.floor = floor;
	}
	
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	public void information() {
		System.out.println("[아파트정보 : 화장실개수 = " + super.getToiletCount() + ", 방개수 : " + super.getRoomCount() + 
				", 창문개수 : " + super.getWindowCount() + ", 평수 : " + super.getSize() + ", 층수 : " + floor + "]");
	}
	
	public String toString() {
		return "[아파트정보 : 화장실개수 = " + super.getToiletCount() + ", 방개수 : " + super.getRoomCount() + 
				", 창문개수 : " + super.getWindowCount() + ", 평수 : " + super.getSize() + ", 층수 : " + floor + "]";
	}

}
