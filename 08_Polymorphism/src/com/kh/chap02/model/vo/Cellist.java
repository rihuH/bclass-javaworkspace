package com.kh.chap02.model.vo;

public class Cellist extends Musician {
	
	private int career;
	
	public Cellist() {}
	public Cellist(int career) {
		this.career = career;
	}
	
	public int getCareer() {
		return career;
	}
	public void setCareer(int career) {
		this.career = career;
	}
	
	@Override
	public void play() {
		System.out.println("첼로 연주를 시작합니다~");
	}
	@Override
	public void stop() {
		System.out.println("첼로 연주를 멈춥니다.");
	}

}
