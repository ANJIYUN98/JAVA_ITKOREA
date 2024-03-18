package Ch17_1Ex;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.List;

public class C02Ex {
	
	public static void main(String[] args) throws InterruptedException {
		
		// 1 ~ 45까지 숫자를 6개를 랜덤으로 받아(Random 클래스를 이용) set에 저장
		// [추가] 저장된 set의 오름차순 정렬을 해보세요(검색을 통해서 해결해봅니다)
		
		//랜덤으로 번호받는 set 생성
		Set<Integer> set = new HashSet();
		Random rnd = new Random();
		

		for (int i=0; set.size()<6; i++) {
			int num= (int)(Math.random()*45)+1;
			// 난수(math,random)는 0<난수<1 이므로 45를 각각 곱해주고 45가 나오려면 1을 더해준다.
			set.add(num);
		} // 중복되지 않는 데이터가 6개 들어갈 때까지 반복문 돌아가도록
		LinkedList list = new LinkedList(set);
		Collections.sort(list);
		System.out.println(list);
		
		
		
		
		// 2번째 방법
		
//		Set<Integer> set = new HashSet();
//		Random rnd = new Random();
//		
//		while(set.size()<6)
//			set.add(rnd.nextInt(44)+1);
//		
//		for(int num : set)
//			System.out.println(num + " ");
		
		
		
		
		// 3번째 방법 Set -> List
		
//		Set<Integer> set = new HashSet();
//		Random rnd = new Random();
//		
//		while(set.size()<6)
//			set.add(rnd.nextInt(44)+1); //nextInt는 0 ~ n까지 범위이므로 0이 출력되지 않게 1을 더해준다.
//		List<Integer> list = new ArrayList(set);
//		Collections.sort(list);
//		for(int num : list)
//			System.out.println(num+" ");
		
		
		
		
//		// 4번째 방법
//		//Collection's Stream
//		
//		Set<Integer> set = new HashSet();
//		Random rnd = new Random();
//		
//		List<Integer> list =
//		set.stream()
//		   .sorted()
//		   .collect(Collectors.toList()); //set 형태의 데이터를 list형태로 바꿈
//		for(int n : list)System.out.println(n);
		
	}

	
}
