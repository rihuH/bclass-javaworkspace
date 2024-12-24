package com.kh.model.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.kh.model.vo.Music;

// dao에는 view에서 바로 오면 안되고 
// 제어자, 명령하는 애인 controller를 거쳐서 와야 한다
// vier -> controller -> dao
public class MusicRepository {
	
	public void outputFile(ArrayList<Music> musicList) {
		
		try(BufferedWriter wr = new BufferedWriter(new FileWriter("play-list.txt"))){ // 자동자원반납 하고 싶을 떄
			wr.write("\t\t\t\t 재 생 목 록");
			wr.newLine();
			wr.newLine();
			wr.write("\t\t\t곡명\t\t\t\t\t가수명");
			
			
			for(int i= 0; i < musicList.size(); i++) {
				
				wr.write((i + 1) + "번 : " + musicList.get(i).getTitle() + "\t\t\t\t\t" + musicList.get(i).getArtist());
				wr.newLine();
			}
			
			
		} catch(IOException e) { // 뭔지 잘 모르겠으면 exception계의 object인 exception으로 잡으면 된다. 
			e.printStackTrace();
		}
		
	}
	

}
