package com.kh.carParking.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.kh.carParking.model.vo.Car;

public class carParkingDao {
	
	public int insertCar(Car car) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		String carTypeStr = null;
		switch(car.getCarType()) {
		case 1 : carTypeStr = "경차"; break;
		case 2 : carTypeStr = "세단"; break;
		case 3 : carTypeStr = "SUV"; break;
		case 4 : carTypeStr = "트럭"; break;
		}
		
		String sql = "INSERT "
					 + "INTO "
					 	   + "TB_CAR_PARKING "
				   + "VALUES "
					 	   + "("
					 	   + car.getParkingNum() + ", "
					 	   + "'" + car.getCarNum() + "', "
					 	   + "'" + carTypeStr + "', "
					 	   + "'" + car.getOwner() + "'"
					 	   + ")";
		
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver"); // ClassNotFoundException
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HOMEWORK", "HOMEWORK"); //SQLException 
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
			if(stmt != null) {
				try {
					stmt.close(); // SQLException
				} catch(SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close(); // SQLException
				} catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return result;
		
		
	}
	
	

}
