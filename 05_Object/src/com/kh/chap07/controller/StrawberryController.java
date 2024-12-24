package com.kh.chap07.controller;

import com.kh.chap07.model.vo.Menu;

// 요청처리 (데이터가공, 연산, 결과값반환, 저장소) -> 컨트롤러는 원래 일 많이 안하는데 지금 배운게 없어서. 원래 제어역할만 함.
public class StrawberryController {
	//필드부
	private Menu[] menu = new Menu[3]; // 메뉴모양 영역의 주소를 담을 수 있는 공간
	private int count = 0;
	//생성자부
	public StrawberryController() {}
	
	//메소드부
	public Menu addMenu(String menuName, String material, int price, int stock) {
		
		if(count < menu.length) {
		Menu menu = new Menu(); // Menu 모양 객체가 필요하니까 객체생성 -> 생성자 호출.
		menu.setMenuName(menuName);
		menu.setMaterial(material);
		menu.setPrice(price);
		menu.setStock(stock);
		
		this.menu[count] = menu;
		/* 만약에 객체생성 안 하고 직접 파란메뉴에 담으면 (파란메뉴가 가진 값은 null이니까) 직접접근연산자 써도 null값밖에 없어서 아무 일도 안 일어남
		menu.setMenuName(menuName);		
		menu.setMaterial(material);
		menu.setPrice(price);
		menu.setStock(stock);*/
		return this.menu[count++];
		} else {
			return null;
		}

		
	}
	
	public Menu getMenu(int i) {
		return menu[i-1];
	}
	public int getCount() {
		return count;
	}
	public String getMenuName(int i){
		return menu[i].getMenuName();
	}
	
	
	public int buyMenu(int i, int buyNum) {
		// 1. 구매개수가 재고보다 많을 경우
		// 2. 구매개수가 재고와 같거나 적을 경우
		
		if(buyNum > menu[i].getStock()) {
			return 0;
		} else {
			menu[i].setStock(menu[i].getStock()-buyNum);
			int totalAmount = buyNum * menu[i].getPrice();
			if(menu[i].getStock() == 0) {
				for( ; i < menu.length-1; i++) {
					menu[i] = menu[i+1];
				}
				count--;
			}
			return totalAmount;
		}
		
		
	}
	
	public void clean() {
		for(int i = 0; i < menu.length; i++) {
			menu[i] = null;
			count = 0;
		}
	}
	
	

}
