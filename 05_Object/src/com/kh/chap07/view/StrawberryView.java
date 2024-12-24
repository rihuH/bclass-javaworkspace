package com.kh.chap07.view;

import java.util.Scanner;

import com.kh.chap07.controller.StrawberryController; // 얘네는 view가 생성될 때 같이 공간이 생성된다. view를 사용하는 동안 계속 쓰겠다는 것으로 이 클래스들의 필드들을 계속 쓸 수 있게 된다.
import com.kh.chap07.model.vo.Menu;

// 화면 (출력문 print(), println(), printf()/ 입력 nextInt(), nextLine(), next() 등등) 
public class StrawberryView {
	
	private Scanner sc = new Scanner(System.in); // 각 메소드마다 중복해서 쓰이므로 메모리영역 낭비를 막기 위해 필드영역에 선언. 
	//코드 작성할 때는 항상 메모리영역을 생각하면서 작성한다.
	// 이 클래스 내에서는 스캐너를 사용할 수 있음.
	
	private StrawberryController sbc = new StrawberryController(); // 컨트롤러가 이 화면클래스가 살아있는 동안도 계속 유지되어야 하니까 얘도 필드로.
	

	// 기본생성자 - StrawberryView클래스로 객체 만들 때 사용
	public StrawberryView() {
		
		while(true) {
			System.out.println();
			System.out.println("🍓🍒🍓🍒딸기딸기 chocochoco 스트로스트로 베리입니다~🍒🍓🍒🍓");
			System.out.print("1. 음료 추가하기 | ");
			System.out.print("2. 음료 구매하기 | ");
			System.out.print("3. 음료 초기화 | ");
			System.out.println("4. 프로그램 종료하기");
			System.out.println("메뉴를 선택해 주세요 > ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : addMenu(); break;
			case 2 : buyMenu(); break;
			case 3 : sbc.clean(); break;
			case 4 : System.out.println("🙋‍♀️🙋‍♂️💁‍♀️💁‍♂️🙋‍프로그램을 종료합니다.🙋‍♀️🙋‍♂️💁‍♀️💁‍♂️🙋"); return; // 프로그램 종료
			default : System.out.println("❌❌❌❌❌❌❌❌잘못 선택하셨습니다. 1-3까지 선택해주세요.❌❌❌❌❌❌❌❌");
			}
			
		}
	}
	
	
	// 메뉴추가하는 화면을 출력해주는 기능을 가진 메소드
	private void addMenu() {
		
		System.out.println("메뉴 추가 화면입니다.");
		System.out.println("추가하실 메뉴의 정보를 입력해주세요.");
		System.out.print("추가하실 메뉴의 이름을 입력해주세요 > ");
		String menuName = sc.nextLine();
		System.out.print("재료를 입력해주세요(, 구분) > ");
		String material = sc.nextLine();
		System.out.print("가격을 입력해주세요 > ");
		int price = sc.nextInt();
		System.out.print("재고를 입력해주세요 > ");
		int stock = sc.nextInt();
		sc.nextLine();
		
		// 메소드 호출 -> 인자값으로 전달
		Menu menu = sbc.addMenu(menuName, material, price, stock);
		// 메뉴 대입이 잘 되었으면 주소값이 대입되어있을 것. 안 되었다면 (필드) 참조자료형의 기본값인 null이 있을 것
		if(menu != null) {
			System.out.println("메뉴 등록에 성공했어요");
			System.out.println("등록된 메뉴명 > " + menu.getMenuName());
			System.out.println("등록된 재료 > " + menu.getMaterial());
			System.out.println("등록된 가격 > " + menu.getPrice());
			System.out.println("등록된 수량 > " + menu.getStock());
		} else {
			System.out.println("메뉴 등록에 실패!! 메인메뉴로 돌아갑니다.");
		}
	}
	
	private void buyMenu() {
		
		System.out.println("구매화면입니다.");
		if(sbc.getCount() != 0) {
			System.out.println("현재 등록된 메뉴의 정보입니다.");
			for(int i = 0; i < sbc.getCount(); i++) {
				System.out.print("| " + (i+1) + "번 : " + sbc.getMenuName(i) + "\t");
			}
		
			System.out.print("몇 번 메뉴를 구매하시겠습니까? (종료는 0번) > ");
			int menuNumber = sc.nextInt();
			sc.nextLine();
		
			if((0 < menuNumber) && (menuNumber <= sbc.getCount())) {
				Menu menu = sbc.getMenu(menuNumber); // private 필드 반환해주는 메소드의 이름은 항상 get
			
				System.out.print("메뉴명 > " + menu.getMenuName());
				System.out.print("\t | 재료 > " + menu.getMaterial());
				System.out.print("\t | 가격 > " + menu.getPrice());				System.out.print("\t | 재고 > " + menu.getStock());
			
				System.out.println("\t | 몇 개 구매하시겠습니까 > ");
				int buyNum = sc.nextInt();
				sc.nextLine();
		
				int totalAmount = sbc.buyMenu(menuNumber-1, buyNum);
				
				if(totalAmount > 0) {
					System.out.println(buyNum + "잔, 총 결제 금액은 " + totalAmount + "원 입니다. 맛있게 드세요.");
				} else {
					System.out.println("남아있는 수량은 " + menu.getStock() + "입니다. 메인 메뉴로 돌아갑니다.");
				}
			
			} else if(menuNumber == 0) {
				System.out.println("초기 메뉴로 돌아갑니다.");
			} else {
				System.out.println("등록되지 않은 메뉴입니다. 초기 메뉴로 돌아갑니다.");
			}
		} else {
			System.out.println("등록된 메뉴가 존재하지 않습니다. 메인메뉴로 돌아갑니다.");
		}
		
	}
	
	
	
	
}
