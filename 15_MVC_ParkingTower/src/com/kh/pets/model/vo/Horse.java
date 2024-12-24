package com.kh.pets.model.vo;

import java.util.Objects;

public class Horse extends Pet {
	
	private int speed;

	public Horse() {
		super();
	}
	public Horse(String name, String species, int age, int speed) {
		super(name, species, age);
		this.speed = speed;
	}



	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Horse [getName()=" + getName() + ", getSpecies()=" + getSpecies() + ", getAge()=" + getAge()
				+ ", speed=" + speed + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(speed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Horse other = (Horse) obj;
		return speed == other.speed;
	}
	
	
	

}
