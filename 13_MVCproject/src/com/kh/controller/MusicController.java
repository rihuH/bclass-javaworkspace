package com.kh.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.model.dao.MusicRepository;
import com.kh.model.vo.Music;

// Controller : 사용자가 View화면을 통해 요청을 했을 때 
// 				요청을 받아서 처리해준 뒤 다시 처리결과를 View로 반환
public class MusicController {
	// 음악저장소
	private ArrayList<Music> musicList = new ArrayList(); // 이렇게만 하면 기본10칸
	
	// 클래스 블록에 블록을 작성할 수 있다. / 필드, 생성자, 메소드 제외하고 여기에 명령문을 쓸 수 없는데.
	{ // 초기화 블록 . 필드랑 생성자 사이에 작성. 필드 초기화 하고 싶은 것 작성 // new 당하면 부모생성자호출->초기화블록->내생성자블록
		
		musicList.add(new Music("Happy", "DAY6"));
	}
	
	// 사용자가 새로운 곡 추가 요청을 할 때마다 실행되는 메소드
	public boolean saveMusic(String title, String artist) {
		// 사용자가 입력한 title과 artist값을 Music객체를 생성하면서 필드값에 대입
		Music music = new Music(title, artist); // 생성자 호출해서 생성/ 이제 생성했으니까 music 객체가 있으므로 주소값도 null일 수 없다.
		int listSize = musicList.size();
		// 음악저장소에 새로운 음악을 추가
		musicList.add(music);
		
		// 리스트에 새로운 요소를 추가하는 데 성공했다면 true값 반환
		// 그렇지 않다면 false값 반환
		if(listSize != musicList.size()) {
			return true;
		} else {
			return false;
		}
	}
	
	//전체 곡 조회 요청 시 호출되는 메소드
	public ArrayList<Music> readAll() { // 반환타입 제네릭까지 같이
		return musicList; // musicList 주소값이 돌아감
	}
	
	// 특정 곡 검색 요청이 있을 때마다 실행되는 메소드
	public ArrayList<Music> searchMusic(String keyword) {
		// 검색 결과가 담길 ArrayList<Music> 객체 생성
		ArrayList<Music> searched = new ArrayList();
		// 곡 또는 가수명에 사용자가 입력한 키워드가 포함되어 있을 경우
		// 몽땅 다 들고 가서 출력해줄 것
		
		// 조회 => 사용자가 입력한 keyword가 포함된 Music객체를
		// musicList의 요소를 전부다 하나하나 조회하면서 비교연산
		
		// 1. musicList의 요소의 개수만큼 반복하면서
		for(int i = 0; i < musicList.size(); i++) {
			
			// 2. 요소를 하나하나씩 비교
			Music music = musicList.get(i);
			// 2-2. music객체의 title 필드 또는 artist필드에
			// 		사용자가 입력한 keyword가 포함되어있는가?
			if(music.getTitle().contains(keyword) || music.getArtist().contains(keyword)) {
				// 경우의 수
				// 0/ 1/ 2 ~
				searched.add(music);
			}
		}
		
		return searched;
	}
	
	public void outputFile() {
		MusicRepository mr = new MusicRepository();
		mr.outputFile(musicList);
	}
	
	public int deleteMusic(String title) {
		// 사용자가 입력한 문자열값과 일치하는 제목값을 가진 Music객체 제거
		// case1. title과 동일한 곡 제목이 존재하지 않을 경우
		// case2. title과 동일한 곡 제목이 한 개만 존재할 경우
		// case3. title과 동일한 곡 제목이 두 개 이상 존재할 경우
		
		//제거 한 후 제거된 Music의 개수를 반환
		List<Music> list = new ArrayList();
		// 요청처리
		// musicList 전체 곡 목록중에서(반복문)
		for(int i = 0; i < musicList.size(); i++) { // 여기를 .size()라고 하면 지울 때마다 List가 하나씩 줄어들어서 *****
			// 리스트의 요소의 곡 제목이 사용자가 입력한 title문자열과 동일한 경우
			if(musicList.get(i).getTitle().equals(title)) {
				// 요소를 제거하고 
				list.add(musicList.remove(i--)); // 지우는 데 성공하면 i도 감소시켜준다.
			}
		}
		return list.size(); // 리스트로 돌려주거나 개수만 필요하면 count하거나 size의 차이를 비교하거나 아무튼 등등
		// 숫자가 0이면 삭제가 안 된 것이고,,,,
	}
	
	// 사용자가 곡 수정 요청시 마다 호출되는 메소드
	public boolean updateMusic(String title, String artist, String updateTitle, String updateArtist) {
		
		// 처리
		for(int i = 0; i < musicList.size(); i++) {
			Music m = musicList.get(i);
			
			if(m.getTitle().equals(title) && m.getArtist().equals(artist)) {
				// 기존에 존재하는 요소를
				// 사용자가 입력한 새 제목과 새 가수로 갱신
				// 방법1.
//				musicList.set(i, new Music(updateTitle, updateArtist)); // 기존 객체가 사라지긴 하지만 새로 객체생성을 하는 면에서 방법2가 메모리효율측면에서 더 좋다.
				// 방법 2.
				m.setTitle(updateTitle);
				m.setArtist(updateArtist);
				return true;
			}
		}
		return false;
		
	}
	
}
