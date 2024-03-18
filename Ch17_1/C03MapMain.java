package Ch17_1;

import java.util.HashMap;
import java.util.Map;

public class C03MapMain {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap();
		
		//추가
		map.put("aaa", 1234);
		map.put("bbb", 2222);
		map.put("ccc", 3333);
		map.put("ddd", 4444);
		map.put("eee", 5555);
		map.put("fff", 6666);
		map.put("fff", 7777); //키 값은 동일, Value값만 다름

		
		//개수
		System.out.println("SIZE : " + map.size());
		
		
		//삭제
		map.remove("aaa");
		System.out.println("SIZE : " + map.size());
		
		
		//조회(단건)
		System.out.println(map.get("bbb"));
		
		
		//조회(전체)
		for(String key : map.keySet()) // 모든키를 받아서 반환
			System.out.println(key+" : " + map.get(key));
		
		
	}

}
