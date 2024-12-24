package com.kh.chap05.model.vo;

public class Ballad extends Music implements MusicI {
	
	public Ballad() {}
	public Ballad(int tempo, String title, String runningTime) {
		super(tempo, title, runningTime);
	}
	
	@Override
	public void play() {
		System.out.println("발라드 시작합니다~~");
	}
	
	

}
