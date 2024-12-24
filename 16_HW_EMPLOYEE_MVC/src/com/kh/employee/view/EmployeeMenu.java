package com.kh.employee.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.employee.controller.EmployeeController;

public class EmployeeMenu {
	
	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("============ 사원 관리 프로그램입니다. =============");
			System.out.print("메뉴를 선택해주세요 > ");
			System.out.println("1. 사원 추가 | 0. 프로그램 종료");
			
			try {
				int num = sc.nextInt();
				sc.nextLine();
				
				switch(num) {
				case 1 : save(); break;
				case 0 : System.out.println("프로그램을 종료합니다."); return;
				default : System.out.println("잘못된 번호를 입력하셨습니다.");
				}
				
			} catch(InputMismatchException e) {
				System.out.println("잘못된 번호를 입력하셨습니다.");
				e.printStackTrace();
			}
		}
	}
	
	public void save() {
		String exit = "0";
		while(!exit.equals("-1")) {
			System.out.println("사원 추가 화면입니다 (중간에 그만두려면 -1 입력)");
			
			try {
				
				System.out.print("사원 이름을 입력해주세요 > ");
				String empName = sc.nextLine();
				if(empName.length() == 0) {
					System.out.println("잘못된 형식을 입력하셨습니다.");
					return;
				}
				System.out.print("사원 주민번호를 입력해주세요(xxxxxx-xxxxxxx) > "); // 검토
				// StringIndexOutOfBoundsException
				String empNo = sc.nextLine();
				if(empNo.length() != 14 || empNo.equals("null") || empNo.charAt(6) != '-' || empNo.replaceAll("[0-9-]", "").length() != 0) {
					System.out.println("잘못 입력"); return;
				}
				System.out.print("사원 이메일 아이디를 입력해주세요 (영소문자, 숫자, 특수기호(-, _) 만 사용가능| 없으면 null 입력) > ");
				String email = sc.nextLine();
				if(email.replaceAll("[a-zA-Z0-9-_]", "").length() != 0) {
					System.out.println("잘못 입력"); return;
				}
				if(!email.toLowerCase().equals("null")) {
					email = email + "@kh.or.kr";
					System.out.println(email);
				}
				System.out.print("사원 핸드폰 번호를 입력해주세요 (숫자만 입력, 없으면 엔터) > "); // 검토
				String phone = sc.nextLine();
				if(!(phone.equals("null") || (phone.length() == 11 && phone.replaceAll("[0-9]", "").length() ==0))) {
					System.out.println("잘못 입력"); return;
				} 
				System.out.print("사원 부서를 입력해주세요(번호만 입력) (없으면 엔터 입력)> "); // 검토
				String deptCode = sc.nextLine();
				if(!(deptCode.equals("null") || (deptCode.length() == 1 && deptCode.replaceAll("[0-9]", "").length() == 0))) {
						System.out.println("잘못된 형식을 입력하셨습니다."); return;
					}
				deptCode = "D" + deptCode;
				
				System.out.print("사원 직급을 입력해주세요 (번호만 입력) > "); // 검토
				int code = sc.nextInt();
				sc.nextLine();
				if(code <= 0 || code > 9) {
					System.out.println("잘못된 형식을 입력하셨습니다."); return;
				}
				String jobCode = "J" + code;
				System.out.print("사원 월급을 입력해주세요 (없으면 엔터 입력) > ");
				String salary = sc.nextLine();
				if(!(salary.equals("null") || (salary.replaceAll("[0-9]", "").length() == 0))) {
							System.out.println("잘못된 형식을 입력하셨습니다."); return;
				} 
				System.out.print("사원 보너스 비율을 입력해주세요 (없으면 null 입력) > ");
				String bonus = sc.nextLine();
				if(!(bonus.equals("null") || bonus.replaceFirst(".", "").replaceAll("[0-9]", "").length() == 0)) {
							System.out.println("잘못된 형식을 입력하셨습니다."); return;
					}
				
				System.out.print("사수 아이디를 입력해주세요 (없으면 0 입력) > ");
				int managerId = sc.nextInt();
				sc.nextLine();
				
				int result = ec.save(empName, empNo, email, phone, deptCode, jobCode, salary, bonus, managerId);
				if(result != 0) {
					System.out.println("입력 성공");
				} else { 
					System.out.println("입력 실패");
				}
				
			} catch(InputMismatchException e) {
				System.out.println("잘못된 형식을 입력하셨습니다.");
				e.printStackTrace();
			} catch(StringIndexOutOfBoundsException e) {
				System.out.println("잘못된 형식을 입력하셨습니다.");
				e.printStackTrace();
			}
			
			
		}

		
		
	}

}
