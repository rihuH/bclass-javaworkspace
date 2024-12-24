package com.kh.chap03.model.vo;

import java.util.Objects;

public class SeasonFood {
	
	private String foodName;
	private String season;
	private String flavor;
	
	public SeasonFood() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SeasonFood(String foodName, String season, String flavor) {
		super();
		this.foodName = foodName;
		this.season = season;
		this.flavor = flavor;
	}
	
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	@Override
	public String toString() {
		return "SeasonFood [foodName=" + foodName + ", season=" + season + ", flavor=" + flavor + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(flavor, foodName, season);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SeasonFood other = (SeasonFood) obj;
		return Objects.equals(flavor, other.flavor) && Objects.equals(foodName, other.foodName)
				&& Objects.equals(season, other.season);
	}
	
	// haseCode() + equals() 오버라이딩
	// 필드값이 모두 동일하다면 
	// 같은 hash값이 반환되도록.
	// 필드값이 모두 동일하다면
	// equals호출 결과가 true값을 반환하도록 오버라이딩
	/*
	// equals() 원래 Object거 - 원래는 주소값비교 this == obj로 되어있음. (this는 나(클래스)의 주소)
	@Override
	public boolean equals(Object obj) {
		// 필드값이 모두 같으면 true
		SeasonFood sf = (SeasonFood)obj;// 이제 내 지역변수니까 getter 말고 직접 접근할 수 있다.
		if(foodName.equals(sf.getFoodName()) && season.equals(sf.season) && flavor.equals(sf.flavor)) {
			return true;
		}
		return false;
		
	}
	
	@Override
	public int hashCode() {
		// 객체를 가지고 알아서 10진수로 만들어서 반환
		// 필드 값이 동일하면 같은 hashCode값이 나오도록
		return (foodName + season + flavor).hashCode();
	}
	// 여기 뿐만 아니라 VO객체는 필드값이 같다면 같은 객체로 판단되도록 해야 함.
	// 그래서 다른 VO에서도 equals랑 hashCode를 오버라이딩해줘야함
	*/
	// Alt + Shift + s에 equals, hashCode 자동완성 있음.
	
	
	

	
}
