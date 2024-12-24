package com.kh.employee.controller;

import com.kh.employee.model.dao.EmployeeDao;
import com.kh.employee.model.vo.Employee;

public class EmployeeController {
	
	public int save(String empName, String empNo, String email, String phone, String deptCode, String jobCode, String salary, String bonus, int managerId) {
		Integer sal = Integer.parseInt(salary);
		String salLevel = null;
		if(sal >= 6000000) {
			salLevel = "S1";
		} else if(sal >= 5000000) {
			salLevel = "S2";
		} else if(sal >= 4000000) {
			salLevel = "S3";
		} else if(sal >= 3000000) {
			salLevel = "S4";
		} else if(sal >= 2000000) {
			salLevel = "S5";
		} else {
			salLevel = "S6";
		}
		
		
		return new EmployeeDao().save(new Employee(empName, empNo, email, phone, deptCode, jobCode, salLevel, salary, bonus, managerId));
		
	}

}
