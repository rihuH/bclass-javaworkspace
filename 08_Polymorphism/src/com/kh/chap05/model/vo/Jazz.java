package com.kh.chap05.model.vo;

public class Jazz extends Music implements MusicI{
	public Jazz() {}
	public Jazz(int tempo, String title, String runningTime) {
		super(tempo, title, runningTime);
	}
	
	@Override
	public void play() {
		System.out.println("재즈 시작합니다~");
	}
	
	
	

}
