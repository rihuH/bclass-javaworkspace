package com.kh.objectarray.model.vo;

public class Restaurant {
	
	// 상호,  평점, 주소, 시그니처 메뉴명, 방송출연 여부
	private String storeName;
	private double rating;
	private String address; 
	private String signatureName;
	private boolean program;
	/* 필드명을 sName 이라거나 x라거나 압축해서 하면 안됨. 누가 봐도 알 수 있도록 지어야함. 길어지면 그냥 길어져야됨. 
	 * 만약 sName처럼 앞에를 외자로 해서 짓는다면 getter, setter할 때 프로그램이 얘를 찾지 못해서 에러가 발생함
	 * getSName 라고 써야하는데 대문자두개가 튀어나오면 안 됨, 그러면 getSname이라 해야하는데 프로그램을 찾지 못하게 됨*/
	
	// 기본생성자/ 모든 필드를 매개변수로 갖는 생성자
	public Restaurant() {}
	public Restaurant(String address, String storeName, String signatureName, double rating, boolean program) {
		this.storeName = storeName;
		this.rating = rating;
		this.address = address;
		this.signatureName = signatureName;
		this.program = program;
	}
	// getter()
	public String getStoreName() {
		return storeName;
	}
	public double getRating() {
		return rating;
	}
	public String getAddress() {
		return address;
	}
	public String getSignatureName() {
		return signatureName;
	}
	// 예외상황! - boolean 타입의 필드를 반환하는 메서드의 경우 
	// 일반적으로 메소드명을 get으로 시작하지 않는다.
	// boolean onAir => isOnAir (getOnAir말고) 이거 방송중? 이런 의문형 이름으로
	public boolean isProgram() {
		return program;
	}
	// setter()
	public void setString(String storeName) {
		this.storeName = storeName;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setSignatureName(String signatureName) {
		this.signatureName = signatureName;
	}
	public void setProgram(boolean program) {
		this.program = program;
	}
	// information
	public String information() {
		String info = storeName + " -> 평점 : " + rating + "점, 주소 : " + address + ", 시그니처메뉴 : " + signatureName + ", 방송출연여부 : " + program;
		return info;
	}
	
	
}
