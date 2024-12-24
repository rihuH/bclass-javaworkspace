package com.kh.chap03.model.vo;

public class House {
	
	private int toiletCount;
	private int roomCount;
	private int windowCount;
	private double size;
	
	public House() {}
	public House(int toiletCount, int roomCount, int windowCount, double size) {
		this.toiletCount = toiletCount;
		this.roomCount = roomCount;
		this.windowCount = windowCount;
		this.size = size;
	}
	
	public int getToiletCount() {
		return toiletCount;
	}
	public void setToiletCount(int toiletCount) {
		this.toiletCount = toiletCount;
	}
	
	public int getRoomCount() {
		return roomCount;
	}
	public void setRoomCount(int roomCount) {
		this.roomCount = roomCount;
	}
	
	public int getWindowCount() {
		return windowCount;
	}
	public void setWindowCount(int windowCount) {
		this.windowCount = windowCount;
	}
	
	public double getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public void information() {
		System.out.println("[집의 정보 : 화장실개수 = " + toiletCount + "방개수 = " + roomCount + ", 창문개수 = " + windowCount + ", 평수 = " + size + "]");
	}
	
	

	
}
