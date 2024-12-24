package com.kh.transportation.model.vo;

import java.math.BigDecimal;
import java.util.Objects;

public class Airplane extends Transportation {
	

	private int seatValue;

	public Airplane() {
	}

	public Airplane(String name, double speed, double price, int seatValue) {
		super(name, speed, price);
		this.seatValue = seatValue;
	}

	public int getSeatValue() {
		return seatValue;
	}

	public void setSeatValue(int seatValue) {
		this.seatValue = seatValue;
	}

	@Override
	public String toString() {
		return "Airplane [getName()=" + getName() + ", getSpeed()=" + getSpeed() + ", getPrice()=" + getPrice()
				+ ", seatValue=" + seatValue + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(seatValue);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airplane other = (Airplane) obj;
		return seatValue == other.seatValue;
	}

}
