package com.kh.transportation.model.vo;

import java.util.Objects;

public class Bus extends Transportation {
	
	private boolean isWindowSeat;

	public Bus() {
	}

	public Bus(String name, double speed, double price, boolean isWindowSeat) {
		super(name, speed, price);
		this.isWindowSeat = isWindowSeat;
	}

	public boolean isWindowSeat() {
		return isWindowSeat;
	}

	public void setWindowSeat(boolean isWindowSeat) {
		this.isWindowSeat = isWindowSeat;
	}

	@Override
	public String toString() {
		return "Bus [getName()=" + getName() + ", getSpeed()=" + getSpeed() + ", getPrice()=" + getPrice()
				+ ", isWindowSeat=" + isWindowSeat + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(isWindowSeat);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bus other = (Bus) obj;
		return isWindowSeat == other.isWindowSeat;
	}

	
}
