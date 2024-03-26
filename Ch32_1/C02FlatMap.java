package Ch32_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C02FlatMap {

	public static void main(String[] args) {


		List<List<Integer>> numbers = Arrays.asList(
				Arrays.asList(1,2,3),
				Arrays.asList(4,5,6),
				Arrays.asList(7,8,9)
				);
		
		List<Integer> list = numbers.stream()
//									.flatMap((li)->li.stream()) //return 생략
									.flatMap(List::stream) // 윗 줄을 더 줄이기
									.collect(Collectors.toList()); //다시 리스트로 받아오기
		
		System.out.println(numbers);
		System.out.println(list); 

	}

}
