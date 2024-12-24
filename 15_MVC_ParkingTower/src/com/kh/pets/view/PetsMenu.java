package com.kh.pets.view;

import java.util.HashMap;
import java.util.Scanner;

import com.kh.pets.controller.PetsController;
import com.kh.pets.model.vo.Pet;

public class PetsMenu {
	
	private Scanner sc = new Scanner(System.in);
	private PetsController pc = new PetsController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("애완동물 관리 화면입니다. 메뉴를 선택해 주세요.");
			System.out.println("1. 애완동물 추가\n2. 애완동물 보기\n3. 애완동물 수정\n4. 애완동물 삭제\n0. 프로그램 종료");
			
			try {
				int num = sc.nextInt();
				sc.nextLine();
				
				switch(num) {
				case 1 : addNewPet(); break;
				case 2 : readPetList(); break;
				case 3 : updatePetInform(); break;
				case 4 : deletePetInform(); break;
				case 0 : System.out.println("프로그램을 종료합니다."); return;
				default : System.out.println("잘못 입력하셨습니다. 메인메뉴로 돌아갑니다.");
				}
				
				
			} catch(Exception e) {
				sc.nextLine();
				System.out.println("잘못 입력하셨습니다. 메인메뉴로 돌아갑니다.");
			}
		}
	}
	
	public void addNewPet() {
		while(true) {
			System.out.println("애완동물 추가 화면입니다. 메뉴를 선택해주세요.");
			System.out.println("1. 개 추가 | 2. 말 추가 | 0. 메인메뉴로");
			
			try {
				int num = sc.nextInt();
				sc.nextLine();
				
				String name = null;
				String species = null;
				int age = 0;
				
				if((num == 1) || (num == 2)) {
					System.out.print("이름 > ");
					name = sc.nextLine();
					System.out.println("종 > ");
					species = sc.nextLine();
					System.out.println("나이 > ");
					age = sc.nextInt();
					sc.nextLine();
				}
				
				switch(num) {
				case 1 : System.out.print("개 사이즈를 입력해주세요 > ");
						String size = sc.nextLine();
						pc.addDog(name, species, age, size); break;
				case 2 : System.out.print("말 빠르기를 입력해주세요 > ");
						int speed = sc.nextInt();
						sc.nextLine();
						pc.addHorse(name,species,age,speed); break;
				case 0 : System.out.println("메인 메뉴로 돌아갑니다."); return;
				default : System.out.println("잘못 입력하셨습니다. 메인메뉴로 돌아갑니다."); return;
				}
				
			} catch(Exception e) {
				sc.nextLine();
				System.out.println("잘못 입력하셨습니다. 메인메뉴로 돌아갑니다.");
				return;
			}
			
		}
	}
	
	public void readPetList() {
		HashMap<Integer, Pet> petMap = pc.readPetList();
		for(int i = 0; i < petMap.size(); i++) {
			System.out.println(i + 1 + "번 애완동물 >> " + petMap.get(i));
		}
	}
	
	public void updatePetInform() {
		while(true) {
			
			int[] petCount = pc.petCount();
			
			System.out.println("어떤 애완동물을 수정하시겠습니까?");
			readPetList();
			System.out.println("수정할 애완동물 번호를 입력해주세요(메인메뉴는 0번) > ");
			
			try {
				int num = sc.nextInt();
				sc.nextLine();
				
				String name = null;
				String species = null;
				int age = 0;
				
				
				if((num >= 1) && (num <= petCount[0] + petCount[1])) {
					System.out.print("이름 > ");
					name = sc.nextLine();
					System.out.println("종 > ");
					species = sc.nextLine();
					System.out.println("나이 > ");
					age = sc.nextInt();
					sc.nextLine();
					
					if(num <= petCount[0]) {
						System.out.print("개 사이즈를 입력해주세요 > ");
						String size = sc.nextLine();
						pc.setDog(num -1, name, species, age, size);
						
					} else {
						System.out.println("말 빠르기를 입력해주세요 > ");
						int speed = sc.nextInt();
						sc.nextLine();
						pc.setHorse(num - 1 - petCount[0], name, species, age, speed);
						
					}
				} else if(num == 0){ 
					System.out.println("메인메뉴로 돌아갑니다.");
					return;
				} else {
					System.out.println("잘못 입력하셨습니다. 메인메뉴로 돌아갑니다.");
					return;
				}
				
				
			} catch(Exception e) {
				sc.nextLine();
				System.out.println("잘못 입력하셨습니다. 메인메뉴로 돌아갑니다.");
				return;
			}
		}
		
	}
	
	public void deletePetInform() {
		while(true) {
			int[] petCount = pc.petCount();
			
			System.out.println("어떤 애완동물을 삭제하시겠습니까?");
			readPetList();
			System.out.print("삭제할 번호를 입력해주세요 (메인메뉴는 0번) > ");
			
			try {
				int num = sc.nextInt();
				sc.nextLine();
				
				if(num == 0) {
					System.out.println("메인메뉴로 돌아갑니다.");
					return;
				} else if((num > 0) && (num <= petCount[0] + petCount[1])) {
					if(num <= petCount[0]) {
						pc.delDog(num -1);
					} else {
						pc.delHorse(num - 1 - petCount[1]);
					}
				} else {
					System.out.println("잘못 입력하셨습니다. 메인메뉴로 돌아갑니다.");
					return;
				}
				
			} catch(Exception e) {
				sc.nextLine();
				System.out.println("잘못 입력하셨습니다. 메인메뉴로 돌아갑니다.");
				return;
			}
			
		}
	}

}
