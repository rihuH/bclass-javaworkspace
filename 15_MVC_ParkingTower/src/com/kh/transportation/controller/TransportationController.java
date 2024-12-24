package com.kh.transportation.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.kh.transportation.model.vo.Airplane;
import com.kh.transportation.model.vo.Bus;
import com.kh.transportation.model.vo.Train;
import com.kh.transportation.model.vo.Transportation;

public class TransportationController {
	
	private List<Transportation> busList = new ArrayList();
	private List<Transportation> trainList = new ArrayList();
	private List<Transportation> airplaneList = new ArrayList();
	
	// 이동수단 추가
	public void addBus(String name, double speed, double price, boolean isWindowSeat){
		busList.add(new Bus(name, speed, price, isWindowSeat));
	}
	public void addTrain(String name, double speed, double price, String direction){
		trainList.add(new Train(name, speed, price, direction));
	}
	public void addAirplane(String name, double speed, double price, int seatValue){
		airplaneList.add(new Airplane(name, speed, price, seatValue));
	}
	
	// 이동수단 조회
	public List<Transportation> viewBus() {
		return busList;
	}
	public List<Transportation> viewTrain() {
		return trainList;
	}
	public List<Transportation> viewAirplane() {
		return airplaneList;
	}
	public HashMap<Integer, Object> viewTransportationAll() {
		HashMap<Integer, Object> hm = new HashMap<>();
		for(int i = 0; i < busList.size(); i++) {
			hm.put(i, busList.get(i));
		}
		for(int i = busList.size(); i < busList.size() + trainList.size(); i++) {
			hm.put(i, trainList.get(i));
		}
		for(int i = busList.size() + trainList.size(); i < busList.size() + trainList.size() + airplaneList.size(); i++) {
			hm.put(i, airplaneList.get(i));
		}
		return hm;
	}
	
	// 이동수단 수정 메소드
	public void updateBus(int index, String name, double speed, double price, boolean isWindowSeat) {
		busList.set(index, new Bus(name, speed, price, isWindowSeat));
	}
	public void updateTrain(int index, String name, double speed, double price, String direction) {
		trainList.set(index, new Train(name, speed, price, direction));
	}
	public void updateAirplane(int index, String name, double speed, double price, int seatValue) {
		airplaneList.set(index, new Airplane(name, speed, price, seatValue));
	}
	
	// 이동수단 삭제 메소드
	public void deleteBus(int index) {
		busList.remove(index);
	}
	public void deleteTrain(int index) {
		trainList.remove(index);
	}
	public void deleteAirplane(int index) {
		airplaneList.remove(index);
	}
	public void deleteAll() {
		busList.clear();
		trainList.clear();
		airplaneList.clear();
	}

}
