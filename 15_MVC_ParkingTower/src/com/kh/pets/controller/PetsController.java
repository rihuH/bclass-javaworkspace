package com.kh.pets.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.kh.pets.model.vo.Dog;
import com.kh.pets.model.vo.Horse;
import com.kh.pets.model.vo.Pet;

public class PetsController {
	
	ArrayList<Pet> dogList = new ArrayList<>();
	List<Pet> horseList = new ArrayList<>();
	
	public void addDog(String name, String species, int age, String size) {
		dogList.add(new Dog(name, species, age, size));
	}
	
	public void addHorse(String name, String species, int age, int speed) {
		horseList.add(new Horse(name, species, age, speed));
	}
	
	public HashMap readPetList() {
		HashMap<Integer, Pet> hm = new HashMap();
		
		for(int i = 0; i < Math.max(dogList.size(), horseList.size()); i++) {
			if(i < dogList.size()) {
				hm.put(i, dogList.get(i));
			}
			if(i < horseList.size()) {
				hm.put(i + dogList.size(), horseList.get(i));
			}
		}
		return hm;
	}
	
	public int[] petCount() {
		int[] petCount = new int[] {dogList.size(), horseList.size()};
		return petCount;
	}
	
	public void setDog(int index, String name, String species, int age, String size) {
		dogList.set(index, new Dog(name, species, age, size));
	}
	
	public void setHorse(int index, String name, String species, int age, int speed) {
		horseList.set(index, new Horse(name, species, age, speed));
	}
	
	public void delDog(int index) {
		dogList.remove(index);
	}
	
	public void delHorse(int index) {
		horseList.remove(index);
	}
	

}
