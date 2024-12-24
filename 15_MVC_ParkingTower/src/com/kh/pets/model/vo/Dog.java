package com.kh.pets.model.vo;

import java.util.Objects;

public class Dog extends Pet{
	
	private String size;

	public Dog() {
		super();
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Dog(String name, String species, int age, String size) {
		super(name, species, age);
		this.size = size;
	}
	
	
	@Override
	public String toString() {
		return "Dog [getName()=" + getName() + ", getSpecies()=" + getSpecies() + ", getAge()=" + getAge() + ", size="
				+ size + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(size);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return Objects.equals(size, other.size);
	}

	
	

	

}
