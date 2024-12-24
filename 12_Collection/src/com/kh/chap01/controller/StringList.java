package com.kh.chap01.controller;

import java.util.Arrays;

public class StringList {
	
	private String[] strs;
	private int size;
	
	public StringList() {
		strs = new String[5];
	}
	
	// 스트링 값을 전달받아서 필드로 가지고 있는 배열의 인덱스에 대입하는 기능
	public void add(String element) {
		if(strs.length == size) { // 배열이 꽉 차있으면 배열의 크기를 늘리는 조건문 추가
			strs = Arrays.copyOf(strs, strs.length * 2);
		}
		strs[size++] = element;
	}
	
	// 인덱스를 전달받아서 배열의 인덱스의 접근해서 인덱스에 존재하는 문자열 요소를 반환
	public String get(int index) {
		if(strs[index] == null) {
			// 예외발생 하도록 만들고싶음./ 던지기할 땐 throws, 내가 발생시킬때는 throw.
			throw new IndexOutOfBoundsException(); // 발생시키고 싶은 예외
		}
		
		return strs[index];
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public String toString() {
		return Arrays.toString(strs);
	}

}
