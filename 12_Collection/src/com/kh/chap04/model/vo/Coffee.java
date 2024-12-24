package com.kh.chap04.model.vo;

import java.util.Objects;

public class Coffee {

	private String bean;
	private int taste;
	
	public Coffee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Coffee(String bean, int taste) {
		super();
		this.bean = bean;
		this.taste = taste;
	}
	
	public String getBean() {
		return bean;
	}
	public void setBean(String bean) {
		this.bean = bean;
	}
	public int getTaste() {
		return taste;
	}
	public void setTaste(int taste) {
		this.taste = taste;
	}
	
	@Override
	public String toString() {
		return "Coffee [bean=" + bean + ", taste=" + taste + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(bean, taste);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coffee other = (Coffee) obj;
		return Objects.equals(bean, other.bean) && taste == other.taste;
	}
	
	
	
}
