package com.kh.chap02.model.vo;

public class Violinist extends Musician {
	
	private String handside;
	
	public Violinist() {}
	public Violinist(String handside) {
		this.handside = handside;
	}
	
	public String getHandside() {
		return handside;
	}
	public void setHandside(String handside) {
		this.handside = handside;
	}
	
	@Override
	public void play() {
		System.out.println("바이올린 연주를 시작합니다~");
	}
	@Override
	public void stop() {
		System.out.println("바이올린 연주를 멈춥니다.");
	}

}
