package co.dy.prj;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	private Map<String, String> map = new HashMap<String, String>();
	
	public void setMap(String id, String password) {	//맵 구조에 데이터 삽입.
		map.put(id, password);
	}
	
	public String getMap(String id) {	//맵에서 Key에 맞는 데이터를 가져온다.
		return map.get(id);
	}
}
