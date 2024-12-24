package com.kh.chap04_assist.run;

import com.kh.chap04_assist.model.dao.BufferedDao;
import com.kh.chap04_assist.model.dao.ObjectDao;

public class AssistRun {

	public static void main(String[] args) {

		BufferedDao bd = new BufferedDao();
//		bd.fileSave();
//		bd.fileRead();
		
		ObjectDao od = new ObjectDao();
//		od.fileSave();
		od.fileRead();
		
	}

}
