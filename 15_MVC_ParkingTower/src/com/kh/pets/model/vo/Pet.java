package com.kh.pets.model.vo;

import java.util.Objects;

public abstract class Pet {
	
	private String name;
	private String species;
	private int age;

	public Pet() {
		super();
	}
	public Pet(String name, String species, int age) {
		super();
		this.name = name;
		this.species = species;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", species=" + species + ", age=" + age + "]";
	}
	
	
	
	

}
