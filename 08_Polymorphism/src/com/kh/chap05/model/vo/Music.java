package com.kh.chap05.model.vo;

public abstract class Music { // 굳이 추상메소드가 없더라도 부모로만 사용하고 객체생성 하지 않을 거라면 추상클래스로 .
	
	private String title;
	private int tempo;
	private String runningTime;
	
	public Music() {}
	public Music(int tempo, String title, String runningTime) {
		this.tempo = tempo;
		this.title = title;
		this.runningTime = runningTime;
	}
	
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRunningTime() {
		return runningTime;
	}
	public void setRunningTime(String runningTime) {
		this.runningTime = runningTime;
	}
	
	@Override
	public String toString() {
		return "Musix[템포 = " + tempo + ", 제목 = " + title 
				+ ", 재생시간" + runningTime + "]";
	}


}
