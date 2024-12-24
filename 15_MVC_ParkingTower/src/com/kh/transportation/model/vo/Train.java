package com.kh.transportation.model.vo;

import java.math.BigDecimal;
import java.util.Objects;

public class Train extends Transportation {
	
	private String direction;

	public Train() {
	}

	public Train(String name, double speed, double price, String direction) {
		super(name, speed, price);
		this.direction = direction;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	@Override
	public String toString() {
		return "Train [getName()=" + getName() + ", getSpeed()=" + getSpeed() + ", getPrice()=" + getPrice()
				+ ", direction=" + direction + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(direction);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(direction, other.direction);
	}

}
