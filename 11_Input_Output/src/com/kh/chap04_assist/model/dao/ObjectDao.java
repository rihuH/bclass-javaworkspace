package com.kh.chap04_assist.model.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.model.vo.Bread;

public class ObjectDao {
	
	// 출력
	// 프로그램에서 만들어낸 객체 데이터 --> 파일
	
	
	// ObjectOutputStream
	// 객체단위로 출력하려고 할 때 필요한 보조스트림 
	
	public void fileSave() {
		
		Bread bread = new Bread(1200, "맛있는 빵", "깜장");
		
		// 1. 기반스트림 => FileOutputStream
		// 2. 보조스트림 => ObjectOutputStream
		// 3. 객체를 파일에 출력 => writeObject()
		// 4. 자원반납 => close()
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_object"))){
			oos.writeObject(bread); // NotSerializableException -> Serial 직렬화.
			// 1Byte짜리 통로로 저 객체가 나갈수가 없음.
			// 작업은 Bread 객체클래스에다가 해줘야한다.
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		// ObjectInputStream : 객체 단위로 읽어올 때 사용하는 보조스트림.
		// FileInputStream : 파일에서 데이터를 입력받을 때 사용하는 기반 스트림.
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_object"))){
			// 입력 : readObject()
//			Object bread = ois.readObject(); // 오른쪽은 Object클래스이고 어떤 타입이어도 받을 수 있도록 하려면 bread를 Object로, -> 가능한 이유 다형성
			// 오른쪽을 브레드로 바꾸고 싶으면 클래스형변환.(Bread)
			Bread bread = (Bread)ois.readObject();
			System.out.println(bread);
		} catch(IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
