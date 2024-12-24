package com.kh.chap05.constructor.model.vo;

public class Member {
	
	// [필드부]
	// 아이디, 비밀번호, 이름, 전화번호, 
	private String userId;
	private String userPwd;
	private String userName;
	private String phoneNumber;
	private int num;
	private double num2;
	private float num3;
	
	
	
	// [생성자부]
	/*
	 * 생성자(Constructor) : 식별자가 클래스식별자와 동일하고 반환형이 존재하지 않는 메소드
	 * 
	 * 참고사항 : 메소드
	 * 접근제한자 반환형 메소드식별자(매개변수(생략가능)){
	 * 
	 * }
	 * 
	 * [표현법]
	 * public (반환타입없음) 클래스이름(매개변수(생략가능)){
	 * 		해당 생성자를 통해서 객체 생성 시 실행하고자 하는 코드;
	 * }
	 * 
	 * 생성자를 작성하는 목적
	 * -- 기술적관점 : 객체를 생성해주기 위해서 
	 * -- 개념적관점 : 객체를 생성하는 것 뿐만 아니라 유효성 있는 개체로 만들어주기 위해서
	 * 
	 * 생성자의 종류
	 * 1. 매개변수가 없는 생성자 => 기본생성자 // new 다음에 썼던 것들
	 * 2. 매개변수가 존재하는 생성자 // scanner 할 때 썼던 것.
	 *  => 차이점 : 필드에 값을 대입할 수 있느냐 없느냐 차이
	 *  
	 *  생성자 작성할 때 주의할 점.
	 *  1. 반드시 생성자의 이름을 클래스의 이름과 동일하게 작성해야함!(대/소문자까지)
	 *  2. 반환형이 존재해서는 안됨! (반환형 적으면 메소드로 판단)
	 *  3. 매개변수 생성자를 명시적으로 작성하면 기본생성자를 만들어주지 않음!
	 *   	=> 꼭 기본생성자를 만드는 버릇을 들이자!
	 *  4. 생성자를 여러 개 생성이 가능하지만 매개변수가 중복되면 안 됨! =>오버로딩
	 * 
	 * 
	 */
	
	public Member() {} // <- 무조건 꼭 만들기!
		// 기본생성자(매개변수가 없음)
//		System.out.println("회원가입 성공~");
		/*
		 * 단지 객체를 생성할 목적으로 사용 => heap영역에 할당할 때 공간을 확보하는 문법!
		 * 기본 생성자는 생략해도 오류가 나지 않음
		 * 클래스 내에 생성자를 '하나도' 작성하지 않으면 컴파일러가 기본생성자를 자동으로 만들어줌!
		 *  ->  기본생성자를 "항상" 작성하는 버릇을 들이는 것이 좋음(자동으로 안 만들어주는 곳도 있음, 에러도 이유 안 알려줌)
		 */
	
	// 매개변수 있는 생성자
	public Member(String userId) { // 대문자까지 똑같이 써야 생성자로 인식. 아니면 그냥 메소드로 인식
		// 필수 변수를 매개변수로 작성할 수 있음.
		System.out.println("매개변수가 한 개인 생성자");
	}
	
	public Member(String userId, String userPwd) { // 매개변수의 개수로 식별하기 때문에, 하나는 id를 매개변수, 아래는 pwd를 매개변수로 받더라도 이중적이라 둘 다 선언할 수 없다.
		System.out.print("매개변수가 두 개인 생성자 => ");
		System.out.print("전달받은 아이디 : " + userId);
		System.out.print(", 전달받은 비밀번호 : " + userPwd);
		this.userId = userId;
		this.userPwd = userPwd; // setter의 역할을 생성자가 대신 함
	} 
	
	public Member(String userId, String userPwd, String userName, String phoneNumber) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
	}
	
	public Member(int num) { // string이랑 int로 변수 달라도 됨.
		
	}
	public Member(double num2) {// int랑 double도 됨....
		
	}
	public Member(float num3) { // 얘도 됨.
		
	}
		
	
	
	
	
	
	
	
	// [메소드부]

	public String getUserId() {
		return userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String information() {
		String info = "아이디 : " + userId + ", 비밀번호 : " + userPwd + ", 이름 : " + userName + ", 전화번호 : " + phoneNumber;
		return info;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
