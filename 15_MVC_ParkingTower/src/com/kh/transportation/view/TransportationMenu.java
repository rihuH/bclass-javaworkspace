package com.kh.transportation.view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import com.kh.transportation.controller.TransportationController;
import com.kh.transportation.model.vo.Transportation;

public class TransportationMenu {
	
	private Scanner sc = new Scanner(System.in);
	private TransportationController tc = new TransportationController();
	private double[] location = new double[] {0, 325, 235, 269, 139, 33.2};
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("메뉴를 선택해 주세요.");
			System.out.println("1. 이동수단 추가 | 2. 이동수단 조회 | 3. 이동수단 수정| 4. 이동수단 삭제 | 5. 이동수단 선택| 0. 프로그램 종료");
			
			try {
				int num = sc.nextInt();
				sc.nextLine();
				
				switch(num) {
				case 1 : addTransportation(); break;
				case 2 : viewTransportationList(); break;
				case 3 : updateTransportation(); break;
				case 4 : deleteTransportation(); break;
				case 5 : calculateTime(); break;
				case 0 : System.out.println("프로그램을 종료합니다."); return;
				default : System.out.println("잘못된 메뉴를 입력하셨습니다.");
				}
			} catch(Exception e) {
				sc.nextLine();
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
	// 이동수단 추가. 
	public void addTransportation() {
		while(true) {
			System.out.println("추가할 이동수단을 선택해주세요.");
			System.out.print("1. 버스 | 2. 기차 | 3. 비행기 | 0. 메인메뉴로 > ");
			
			try {
				int num = sc.nextInt();
				sc.nextLine();
				
				switch(num) {
				case 1 : addBus(); break;
				case 2 : addTrain(); break;
				case 3 : addAirplane(); break;
				case 0 : System.out.println("메인메뉴로 돌아갑니다."); return;
				default : System.out.println("잘못된 메뉴를 입력하셨습니다. 메인메뉴로 돌아갑니다.");
				}
				
			} catch(Exception e) {
				sc.nextLine();
				System.out.println("잘못된 메뉴를 입력하셨습니다. 메인메뉴로 돌아갑니다.");
				return;
			}
		}
	}
	
	public void addBus() {
		try {
			System.out.print("버스 종류를 입력해주세요 > ");
			String name = sc.nextLine();
			System.out.print("버스 속도를 입력해주세요 > ");
			double speed = sc.nextDouble();
			sc.nextLine();
			System.out.print("버스 가격를 입력해주세요 > ");
			double price = sc.nextDouble();
			sc.nextLine();
			System.out.print("창가 자리입니까?(Y/ N)> ");
			String ans = sc.nextLine();
			if(ans.equals("Y") || ans.equals("y") || ans.equals("N") || ans.equals("n")) {
				boolean isWindowSeat = (ans.equals("Y") || ans.equals("y")) ? true : false;
				tc.addBus(name, speed, price, isWindowSeat);
			} else {
				System.out.println("잘못 입력하셨습니다."); return;
			}
		} catch(Exception e) {
			sc.nextLine();
			System.out.println("잘못 입력하셨습니다."); return;
		}
	}
	public void addTrain() {
		try {
			System.out.print("기차 종류를 입력해주세요 > ");
			String name = sc.nextLine();
			System.out.print("기차 속도를 입력해주세요 > ");
			double speed = sc.nextDouble();
			sc.nextLine();
			System.out.print("기차 가격를 입력해주세요 > ");
			double price = sc.nextDouble();
			sc.nextLine();
			System.out.print("순방향입니까? 역방향입니까?> ");
			String direction = sc.nextLine();
			tc.addTrain(name, speed, price, direction);
		} catch(Exception e) {
			sc.nextLine();
			System.out.println("잘못 입력하셨습니다."); return;
		}
	}
	public void addAirplane() {
		try {
			System.out.print("비행기 종류를 입력해주세요 > ");
			String name = sc.nextLine();
			System.out.print("비행기 속도를 입력해주세요 > ");
			double speed = sc.nextDouble();
			sc.nextLine();
			System.out.print("비행기 가격를 입력해주세요 > ");
			double price = sc.nextDouble();
			sc.nextLine();
			System.out.print("좌석 종류를 입력해주세요 (1. 이코노미 2. 비즈니스) > ");
			int seatValue = sc.nextInt();
			sc.nextLine();
			if(seatValue == 1 || seatValue == 2) {
				tc.addAirplane(name, speed, price, seatValue);
			} else {
				sc.nextLine();
				System.out.println("잘못 입력하셨습니다."); return;
			}
		} catch(Exception e) {
			sc.nextLine();
			System.out.println("잘못 입력하셨습니다."); return;
		}
	}
	
	public void viewTransportationList() {
		System.out.println("조회할 이동수단을 선택해주세요.");
		System.out.println("1. 버스 | 2. 기차 | 3. 비행기 | 4. 전부 | 0. 메인메뉴로");
		
		try {
			int num = sc.nextInt();
			sc.nextLine();
			
			List<Transportation> list = new ArrayList();
			
			switch(num) {
			case 1 : list = tc.viewBus(); printList(list); break;
			case 2 : list = tc.viewTrain(); printList(list); break;
			case 3 : list = tc.viewAirplane(); printList(list); break;
			case 4 : HashMap hm = tc.viewTransportationAll(); printMap(hm); break;
			case 0 : System.out.println("메인메뉴로 돌아갑니다."); return;
			default : System.out.println("잘못된 메뉴를 입력하셨습니다.");
			}
		} catch(Exception e) {
			sc.nextLine();
			System.out.println("잘못 입력하셨습니다. 메인메뉴로 돌아갑니다.");
			return;
		}
	}
	
	public void updateTransportation() {
		System.out.println("수정할 이동수단을 선택해주세요.");
		System.out.println("1. 버스 | 2. 기차 | 3. 비행기 | 0. 메인메뉴로");
		
		try {
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1 : updateBus(); break;
			case 2 : updateTrain(); break;
			case 3 : updateAirplane(); break;
			case 0 : System.out.println("메인메뉴로 돌아갑니다."); return;
			default : System.out.println("잘못된 메뉴를 입력하셨습니다.");
			}
		} catch(Exception e) {
			sc.nextLine();
			System.out.println("잘못 입력하셨습니다. 메인메뉴로 돌아갑니다.");
			return;
		}
	}
	
	public void updateBus() {
		
		while(true) {
			try {
				List<Transportation> list = tc.viewBus();
				
				if(list.size() == 0) {
					System.out.println("수정할 데이터가 없습니다.");
					return;
				}
			
				System.out.println("수정할 버스번호를 입력해주세요.");
				printList(list);
				int num = sc.nextInt();
				sc.nextLine();
				
				if((num > list.size()) || (num <= 0)) {
					System.out.println("올바른 입력이 아닙니다.");
					continue;
				}
				
				System.out.print("버스 종류를 입력해주세요 > ");
				String name = sc.nextLine();
				System.out.print("버스 속도를 입력해주세요 > ");
				double speed = sc.nextDouble();
				sc.nextLine();
				System.out.print("버스 가격를 입력해주세요 > ");
				double price = sc.nextDouble();
				sc.nextLine();
				System.out.print("창가 자리입니까?(Y/ N)> ");
				String ans = sc.nextLine();
				if(ans.equals("Y") || ans.equals("y") || ans.equals("N") || ans.equals("n")) {
					boolean isWindowSeat = (ans.equals("Y") || ans.equals("y")) ? true : false;
					tc.updateBus(num-1, name, speed, price, isWindowSeat);
				} else {
					System.out.println("잘못 입력하셨습니다."); return;
				}
			} catch(Exception e) {
				sc.nextLine();
				System.out.println("잘못 입력하셨습니다."); return;
			}
			
		}
		
	}
	
	public void updateTrain() {
		
		while(true) {
			try {
				List<Transportation> list = tc.viewTrain();
				
				if(list.size() == 0) {
					System.out.println("수정할 데이터가 없습니다.");
					return;
				}
				
				System.out.println("수정할 기차번호를 입력해주세요.");
				printList(list);
				int num = sc.nextInt();
				sc.nextLine();
				
				if((num > list.size()) || (num <= 0)) {
					System.out.println("올바른 입력이 아닙니다.");
					continue;
				}
			
				System.out.print("기차 종류를 입력해주세요 > ");
				String name = sc.nextLine();
				System.out.print("기차 속도를 입력해주세요 > ");
				double speed = sc.nextDouble();
				sc.nextLine();
				System.out.print("기차 가격를 입력해주세요 > ");
				double price = sc.nextDouble();
				sc.nextLine();
				System.out.print("순방향입니까? 역방향입니까?> ");
				String direction = sc.nextLine();
				tc.updateTrain(num - 1, name, speed, price, direction);
			} catch(Exception e) {
				sc.nextLine();
				System.out.println("잘못 입력하셨습니다."); return;
			}
		}
		
	}
	
	public void updateAirplane() {
		
		while(true) {
			try {
				List<Transportation> list = tc.viewAirplane();
				
				if(list.size() == 0) {
					System.out.println("수정할 데이터가 없습니다.");
					return;
				}
				
				System.out.println("수정할 비행기번호를 입력해주세요.");
				printList(list);
				int num = sc.nextInt();
				sc.nextLine();
				
				if((num > list.size()) || (num <= 0)) {
					System.out.println("올바른 입력이 아닙니다.");
					continue;
				}
				
				System.out.print("비행기 종류를 입력해주세요 > ");
				String name = sc.nextLine();
				System.out.print("비행기 속도를 입력해주세요 > ");
				double speed = sc.nextDouble();
				sc.nextLine();
				System.out.print("비행기 가격를 입력해주세요 > ");
				double price = sc.nextDouble();
				sc.nextLine();
				System.out.print("좌석 종류를 입력해주세요 (1. 이코노미 2. 비즈니스) > ");
				int seatValue = sc.nextInt();
				sc.nextLine();
				if(seatValue == 1 || seatValue == 2) {
					tc.updateAirplane(num - 1, name, speed, price, seatValue);
				} else {
					sc.nextLine();
					System.out.println("잘못 입력하셨습니다."); return;
				}
			} catch(Exception e) {
				sc.nextLine();
				System.out.println("잘못 입력하셨습니다."); return;
			}
		}
		
	}
	
	public void deleteTransportation() {
			try {
				System.out.println("삭제할 이동수단을 선택해주세요.");
				System.out.println("1. 버스 | 2. 기차 | 3. 비행기 | 4. 전부 |  0. 메인메뉴로");
				int num = sc.nextInt();
				sc.nextLine();
				
				switch(num) {
				case 1 : deleteBus(); break;
				case 2 : deleteTrain(); break;
				case 3 : deleteAirplane(); break;
				case 4 : tc.deleteAll(); break;
				case 0 : System.out.println("메인메뉴로 돌아갑니다."); return;
				default : System.out.println("잘못된 메뉴를 입력하셨습니다.");
				}
			} catch(Exception e) {
				sc.nextLine();
				System.out.println("잘못 입력하셨습니다. 메인메뉴로 돌아갑니다.");
				return;
			}
	}
	
	public void deleteBus() {
		while(true) {
			try {
				List<Transportation> list = tc.viewBus();
				if(list.size() == 0) {
					System.out.println("삭제할 데이터가 없습니다.");
					return;
				}

				System.out.println("삭제할 버스번호를 입력해주세요.");
				printList(list);
				int num = sc.nextInt();
				sc.nextLine();
				
				if((num > list.size()) || (num <= 0)) {
					System.out.println("올바른 입력이 아닙니다.");
					continue;
				}
				
					tc.deleteBus(num - 1);
					System.out.println("삭제가 완료되었습니다.");
					return;
				
			} catch(Exception e) {
				sc.nextLine();
				System.out.println("잘못 입력하셨습니다."); return;
			}
			
		}
		
	}
	public void deleteTrain() {
		while(true) {
			try {
				List<Transportation> list = tc.viewTrain();
				if(list.size() == 0) {
					System.out.println("삭제할 데이터가 없습니다.");
					return;
				}
				System.out.println("삭제할 기차번호를 입력해주세요.");
				printList(list);
				int num = sc.nextInt();
				sc.nextLine();
				
				if((num > list.size()) || (num <= 0)) {
					System.out.println("올바른 입력이 아닙니다.");
					continue;
				}
				tc.deleteTrain(num - 1);
				System.out.println("삭제가 완료되었습니다.");
				return;
				
			} catch(Exception e) {
				sc.nextLine();
				System.out.println("잘못 입력하셨습니다."); return;
			}
		}
	}
	public void deleteAirplane() {
		while(true) {
			try {
				List<Transportation> list = tc.viewBus();
				if(list.size() == 0) {
					System.out.println("삭제할 데이터가 없습니다.");
					return;
				}
				System.out.println("삭제할 비행기번호를 입력해주세요.");
				printList(list);
				int num = sc.nextInt();
				sc.nextLine();
				
				if((num > list.size()) || (num <= 0)) {
					System.out.println("올바른 입력이 아닙니다.");
					continue;
				}
				
					tc.deleteAirplane(num - 1);
					System.out.println("삭제가 완료되었습니다.");
					return;
				
			} catch(Exception e) {
				sc.nextLine();
				System.out.println("잘못 입력하셨습니다."); return;
			}
		}
	}
	
	// 걸리는 시간 계산 메소드
	public void calculateTime() {
		
		while(true) {
			
			System.out.println("이동수단을 선택해 주세요.");
			System.out.println("1. 버스 | 2. 기차 | 3. 비행기 | 0. 메인메뉴로");
			
			
			try {
				int num = sc.nextInt();
				sc.nextLine();
				
				List<Transportation> list = new ArrayList();
				
				if(num == 0) {
					return;
				}
				
				switch(num) {
				case 1 : list = tc.viewBus(); break;
				case 2 : list = tc.viewTrain(); break;
				case 3 : list = tc.viewAirplane(); break;
				case 0 : System.out.println("메인메뉴로 돌아갑니다."); return;
				default : System.out.println("잘못된 메뉴를 입력하셨습니다."); 
				}
				
				if(list.size() == 0) {
					System.out.println("조회할 수단이 없습니다.");
					continue;
				}
				printList(list);
				System.out.print("이용할 수단의 번호를 입력해주세요 > ");
				int num2 = sc.nextInt();
				sc.nextLine();
				
				System.out.println("출발지를 설정해 주세요. > ");
				System.out.print("출발지 : 1. 서울 | 2. 부산 | 3. 대구 | 4. 광주 | 5. 대전 | 6. 수원 > ");
				int departure = sc.nextInt();
				sc.nextLine();
				
				if((departure <= 0) || (departure > 6)) {
					System.out.println("잘못된 메뉴를 입력하셨습니다.");
					return;
				}
				
				System.out.println("도착지를 설정해 주세요.");
				int arrival = 0;
				switch(departure) {
				case 1 : System.out.print("도착지 : 2. 부산 | 3. 대구 | 4. 광주 | 5. 대전 | 6. 수원 > ");
				arrival = sc.nextInt(); sc.nextLine(); break;
				case 2 : System.out.print("도착지 : 1. 서울 | 3. 대구 | 4. 광주 | 5. 대전 | 6. 수원 > ");
				arrival = sc.nextInt(); sc.nextLine(); break;
				case 3 : System.out.print("도착지 : 1. 서울 | 2. 부산 | 4. 광주 | 5. 대전 | 6. 수원 > ");
				arrival = sc.nextInt(); sc.nextLine(); break;
				case 4 : System.out.print("도착지 : 1. 서울 | 2. 부산 | 3. 대구 | 5. 대전 | 6. 수원 > ");
				arrival = sc.nextInt(); sc.nextLine(); break;
				case 5 : System.out.print("도착지 : 1. 서울 | 2. 부산 | 3. 대구 | 4. 광주 | 6. 수원 > ");
				arrival = sc.nextInt(); sc.nextLine(); break;
				case 6 :System.out.print("도착지 : 1. 서울 | 2. 부산 | 3. 대구 | 4. 광주 | 5. 대전  > ");
				arrival = sc.nextInt(); sc.nextLine(); break;
				}
				
				if((departure == arrival) || (arrival <= 0) || (arrival > 6)) {
					System.out.println("잘못된 메뉴를 입력하셨습니다.");
					return;
				}
				
				BigDecimal arrBig = new BigDecimal(String.valueOf(location[arrival-1]));
				BigDecimal depBig = new BigDecimal(String.valueOf(location[departure-1]));
				BigDecimal distance = arrBig.subtract(depBig).abs();
				BigDecimal speedBig = new BigDecimal(String.valueOf(list.get(num2-1).getSpeed()));
				
				System.out.println("선택하신 수단으로 걸리는 시간은 " + distance.divide(speedBig, 2, RoundingMode.HALF_EVEN) + "시간 입니다.");
				System.out.println("티켓 가격은 " + list.get(num2 - 1).getPrice() + "입니다.");
				
			} catch(Exception e) {
				e.printStackTrace();
				sc.nextLine();
				System.out.println("잘못 입력하셨습니다."); return;
			}
		}
	}
	
	// 이동수단 출력메소드
	public void printList(List<Transportation> list) {
		if(list.size() == 0) {
			System.out.println("조회할 수단이 없습니다.");
			return;
		}
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + "번째 : " + list.get(i));
		}
	}
	public void printMap(HashMap hm) {
		if(hm.size() == 0) {
			System.out.println("조회할 수단이 없습니다.");
			return;
		}
		for(int i = 0; i < hm.size(); i++) {
			System.out.println(i + 1 + "번째 : " + hm.get(i));
		}
	}
	
}
