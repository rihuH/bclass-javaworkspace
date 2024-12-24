package com.kh.carParking.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.carParking.model.dao.carParkingDao;
import com.kh.carParking.model.vo.Car;

public class ParkingTowerManager {
	
	private List<Car> carList = new ArrayList<>();
	
	public int insertCar(Car car) {
		carList.add(car);
		carList.get(carList.size()-1).setParkingNum(carList.size()-1);
		return new carParkingDao().insertCar(car);
	}
	
	public int deleteCar(String carNum) {
		for(int i = 0; i < carList.size(); i++) {
			if(carList.get(i).getCarNum() == carNum) {
				carList.remove(i);
				return 1;
			}
		}
		return 0;
	}
	
	public List<Car> searchCar(String owner){
		List<Car> ownerCars = new ArrayList<>();
		for(int i = 0; i < carList.size(); i++) {
			if(carList.get(i).getOwner().equals(owner)) {
				ownerCars.add(carList.get(i));
			}
		}
		return ownerCars;
	}
	
	public List selectList() {
		return carList;
	}
	

}
