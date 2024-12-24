package com.kh.chap03.model.vo;

public class Hanok extends House{

	public String giwaColor;
	
	public Hanok() {}
	public Hanok(int toiletCount, int roomCount, int windowCount, double size, String giwaColor){
		super(toiletCount, roomCount, windowCount, size);
		this.giwaColor = giwaColor;
	}
	
	public String getGiwaColor() {
		return giwaColor;
	}
	public void setGiwaColor(String giwaColor) {
		this.giwaColor = giwaColor;
	}
	
	public void information() {
		System.out.println("[한옥의 정보 : 방개수 = " + super.getRoomCount() + ", 창문개수 = " + super.getWindowCount() + ", 화장실개수 = " + super.getToiletCount()
							+ ", 크기 = " + super.getSize() + ", 기와색깔 = " + giwaColor + "]");
	}
	
	public String toString() {
		return "[한옥의 정보 : 방개수 = " + super.getRoomCount() + ", 창문개수 = " + super.getWindowCount() + ", 화장실개수 = " + super.getToiletCount()
		+ ", 크기 = " + super.getSize() + ", 기와색깔 = " + giwaColor + "]";
	}
	
}
