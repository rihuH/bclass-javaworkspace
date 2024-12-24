package com.kh.chap02.encapsulation.model.vo;

// VO(Value Object)
// 필드부, 생성자부, 메소드부
public class Computer {

	// 필드(Field)부
	
	/*
	 * 객체가 가질 수 있는 속성을 기술하는 부분
	 * 
	 * 정보를 담는 부분
	 * 
	 * 필드 == 멤버변수
	 * 
	 * 접근제한자 자료형 필드식별자;
	 */
	private int price; // 일단 private로 선언하고 필요하면 그 다음에 바꿈. 기본은 일단 private이라는 것 기억
	private String brand;
	private String caseColor;
	private String productName; 
	
	// 생성자(constructor)부
	
	// 메소드(Method)부
	/*
	 * 기능을 구현하는 부분(method) 
	 * 
	 * 접근제한자 (예약어(static 같은 것), 있을수도 있고 없을수도 있음) 반환형 메소드식별자(매개변수){
	 * 		메소드 호출 시 실행할 코드;
	 * }
	 * 
	 * 접근제한자 : 호출할 수 있는 범위를 제한해준다.
	 * public은 어디에서든지 직접접근가능/ private는 클래스'내부'에서만 직접접근할수있음
	 * 
	 * 반환형 : void => 돌려줄 값이 없음
	 * 		  메소드 결과값의 자료형을 지정해준다.
	 * 매개변수 : 메소드 호출 시 전달값을 받아주는 변수
	 * 			메소드 범위에서만 사용이 가능. 생략 가능
	 */
	
	// 데이터를 기록 및 수정하는 기능의 메소드 : setter()
	/*
	 * 규칙
	 * 1. setter메소드는 외부에서 접근이 가능해야하기 때문에 접근제한자 public을 이용
	 * 2. set필드명 으로 식별자를 작성해야함. 반드시. 낙타봉표기법(camelCase)을 꼭 지키도록 한다.
	 * 
	 * 3. (예외상황) VO클래스에서 모든 필드에 대해 전부 다 setter 메소드를 만들어주기! // 본래 setter가 있으면 VO라고 하기 좀 그럼
	 * 
	 * 4. 개발자들끼리 약속  - 하나의 값만 받기
	 *  -> 여러 값을 받는 것 ( , )  변수 여러 개 설정해서 여러 개 전달하는게 가능하긴 하지만
	 *  하나의 메소드는 하나의 기능만 수행하는 것이 원칙
	 *  set도 하나의 값만 받기로 약속
	 */
	
	// 컴퓨터의 가격정보를 기록 및 수정할 수 있는 메소드
	public void setPrice(int price) { // 지역변수는 초기화해야 쓸 수 있음. run class에서 c.price(값)을 받은 것으로 초기화하는 것
		
		//블럭 안에서는 해당 영역 안에 있는 지역변수에 대한 우선권이 있음 (지역변수우선권)
		// price라고 하면 private price가 아니고 이 블록 안의 int price를 말함. 
		// 메모리상 c 공간생성 여기에 heap영역에 있는 주소 저장, setPrice메소드 생성하면 이 공간이 c공간과 같은 곳에 생성, 변수 price 생성했으므로 이 공간도 setPrice안에 생성/ heap에 있는 price와 다른 공간이다
		System.out.println("setPrice메소드 안에서 출력해본 this : " + this); // 주소값이 나옴
		// this 키워드는 객체의 주소값을 가리키는 역할
		this.price = price;  
	}
	
	// 컴퓨터 제조사를 기록 및 수정할 수 있는 메소드
	public void setBrand(String brand) { // 매개변수를 필드명이랑 똑같이 맞춰줌. 변수가 많으면 헷갈리니까
		this.brand = brand;
	}
	
	public void setCaseColor(String caseColor) {
		this.caseColor = caseColor;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	//데이터를 반환해주는 기능의 메소드 : getter()
	
	/*
	 * 규칙!
	 * 1. getter()는 접근제한자 public을 사용한다.
	 * 2. get필드명 으로 짓되, 낙타봉표기법(camelCase)을 사용한다.
	 * 3. 모든 필드에 대해서 반드시 무조건 꼭! 만들어야함
	 * 
	 */
	
	// 나를 호출한 곳으로 price값을 돌려주고 싶음
	public int getPrice() {
		
		return price;
	}
	
	// 컴퓨터 제조사를 반환해주는 메소드
	public String getBrand() {
		return brand;
		// return 값; 
		// 값을 메소드 호출 부분으로 반환하겠다는 것. 메소드 반환형과 반환하고자 하는 값의 자료형이 일치하는지 항상 확인을 잘 해야함.
	}
	
	public String getCaseColor() {
		return caseColor;
	}
	
	public String getProductName() {
		return productName;
	}
	
	// getter와 setter 메소드를 다 만들었으면 캡슐화 끝!
	
	// 모든 필드 값을 확인할 수 있도록 반환해주는 예쁘게예쁘게 메소드
	public String information() {
		// price, brand, caseColor, productName
//		return price, brand, caseColor,,, // 반환값은 return당 한개!
		
		String info = productName + "은 " + brand + "사에서 제조하였고, " + "가격은 " + price + "원 이며, " + caseColor + "색 입니다.";
		
		return info;
		
	}
	
		
}
