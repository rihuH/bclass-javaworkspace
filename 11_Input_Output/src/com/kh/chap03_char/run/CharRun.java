package com.kh.chap03_char.run;

import com.kh.chap03_char.model.dao.FileCharDao;

public class CharRun {

	public static void main(String[] args) {

		FileCharDao fcd = new FileCharDao();
//		fcd.fileSave();
//		fcd.diary();
		fcd.fileRead();
		
	}

}
