package com.kh.carParking.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.carParking.controller.ParkingTowerManager;
import com.kh.carParking.model.vo.Car;

public class ParkingTowerMenu {
	
	private Scanner sc = new Scanner(System.in);
	private ParkingTowerManager ptm = new ParkingTowerManager();
	
	public void mainMenu() {
		while(true) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1. 차량 주차\n2. 차량 출차\n3. 주차된 차량 검색\n4. 전체 출력\n0. 프로그램 종료하기");
			
			try {
				int num = sc.nextInt();
				sc.nextLine();
				
				switch(num) {
				case 1 : insertCar(); break;
				case 2 : deleteCar(); break;
				case 3 : searchCar(); break;
				case 4 : selectList(); break;
				case 0 : System.out.println("프로그램을 종료합니다."); return;
				default : System.out.println("잘못 입력하셨습니다."); 
				}
				
			} catch(InputMismatchException e) {
				sc.nextLine();
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
	// 차량 주차
	public void insertCar() {
		
		try {
			System.out.print("차량 번호를 입력해주세요 > ");
			String carNum = sc.nextLine();
			System.out.print("차량 타입을 입력해주세요 (1. 경차| 2. 세단 | 3. SUV | 4. 트럭) > ");
			int carType = sc.nextInt();
			sc.nextLine();
			System.out.print("차량주를 입력해주세요 > ");
			String owner = sc.nextLine();
			
			int result = ptm.insertCar(new Car(0, carNum, carType, owner));
			
			if(result != 0) {
				System.out.println("insertCar 성공");
			} else {
				System.out.println("insertCar 실패");
			}
			
		} catch(InputMismatchException e) {
			System.out.println("입력이 잘못되었습니다.");
		}
		
	}
	
	// 차량 출차
	public void deleteCar() {
		
		System.out.println("출차할 차량 번호를 입력해주세요 > ");
		
		try {
			String carNum = sc.nextLine();
			
			int result = ptm.deleteCar(carNum);
			
			if(result == 1) {
				System.out.println(carNum + "차량 출차 완료되었습니다.");
			} else {
				System.out.println("해당 차량이 존재하지 않습니다.");
			}
		} catch(InputMismatchException e) {
			System.out.println("입력이 올바르지 않습니다.");
		}
	}
	
	// 주차된 차량 검색
	public void searchCar() {
		
		System.out.print("검색할 차량주명을 입력하세요 > ");
		String owner = sc.nextLine();
		
		List<Car> list = new ArrayList<>();
		list = ptm.searchCar(owner);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
	
	// 전체 출력
	public void selectList() {
		List list = new ArrayList();
		list = ptm.selectList();
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	

}
