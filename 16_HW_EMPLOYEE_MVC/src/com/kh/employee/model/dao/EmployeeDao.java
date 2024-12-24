package com.kh.employee.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.kh.employee.model.vo.Employee;

public class EmployeeDao {
	
	public int save(Employee employee) {
		
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		
		String empEmail = (employee.getEmail().toLowerCase().equals("null")) ? "NULL, " : "'" + employee.getEmail() + "', ";
		String empPhone = (employee.getPhone().toLowerCase().equals("null")) ? "NULL, " : "'" + employee.getPhone() + "', ";
		String empDeptCode = (employee.getDeptCode().toLowerCase().equals("null")) ? "NULL, " : "'" + employee.getDeptCode() + "', ";
		String empSalary = (employee.getSalary().toLowerCase().equals("null")) ? "NULL, " : "'" + employee.getSalary() + "', ";
		String empBonus = (employee.getBonus().toLowerCase().equals("null")) ? "NULL, " : "'" + employee.getBonus() + "', ";
		String empManagerId = (employee.getManagerId() == 0) ? "NULL, " : "'" + String.valueOf(employee.getManagerId()) + "', ";
		
		
		String sql = "INSERT "
				+ "INTO "
				+ "EMPLOYEE "
				+ "VALUES "
				+ "("
				+ "SEQ_EID.NEXTVAL, " // NEXTVAL는 한 번 쓰면 INSERT가 실패해도 무조건 올라감
				+ "'" + employee.getEmpName() + "', "
				+ "'" + employee.getEmpNo() + "', "
				+ empEmail
				+ empPhone
				+ empDeptCode
				+ "'" + employee.getJobCode() + "', "
				+ "'" + employee.getSalLevel() + "', "
				+ empSalary
				+ empBonus
				+ empManagerId
				+ "SYSDATE, "
				+ "NULL, "
				+ "'N'"
				+ ")";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // ClassNotFoundException
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "KH", "KH"); // SQLException
			conn.setAutoCommit(false);
			
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			
			if(result != 0) {
				conn.commit();
			} else {
				conn.rollback();
			}
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) {
					stmt.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
			
			try {
				if(conn != null) {
					conn.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return result;
		
	}

}
