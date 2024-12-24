package com.kh.chap02.model.vo;

public class Pianist extends Musician {
	
	private int fingerLength;
	
	public Pianist() {}
	public Pianist(int fingerLength) {
		this.fingerLength = fingerLength;
	}
	
	public int getFingerLength() {
		return fingerLength;
	}
	public void setFingerLength(int fingerLength) {
		this.fingerLength = fingerLength;
	}
	
	@Override
	public void play() {
		System.out.println("피아노 연주를 시작합니다~");
	}
	@Override
	public void stop() {
		System.out.println("피아노 연주를 멈춥니다.");
	}

}
