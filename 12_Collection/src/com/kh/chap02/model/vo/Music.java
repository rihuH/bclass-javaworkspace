package com.kh.chap02.model.vo;

public class Music {
	
	// 1. 내가 직접 씀 ->  NoNo
	// 2. 자동완성 이용함 -> (원칙) 오타 안나게. 
	private String title;
	private String artist;
	
	
	public Music() {
		super();
	}
	public Music(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}
	
	
	
	

}
