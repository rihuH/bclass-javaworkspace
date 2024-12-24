package com.kh.chap04.galibi.run;

import com.kh.chap04.galibi.model.vo.Galbi;
import com.kh.chap04.galibi.model.vo.Hong;

public class Run {

	public static void main(String[] args) {

		// 손님관점
		/*
		khak k = new khak();
		k.makeGalbi();
		
		Hong h = new Hong();
		h.makeGalbi();
		*/
		
		System.out.println(solution("helloWorld", "3", 3));
		
		
	}
	
	public static void method() {
		
	
		String ss = "3";
		
		int num = Integer.valueOf(ss);
		System.out.println(num);
		
		String str = "abcdefg";
		String anw = str.substring(0, num);
		System.out.println(anw);
        
        
    }
	
    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        int len = Integer.valueOf(overwrite_string);
        answer = my_string.substring(s, s + len - 1);
        return answer;
    }

}
