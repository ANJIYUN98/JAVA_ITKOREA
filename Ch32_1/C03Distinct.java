package Ch32_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C03Distinct {

	public static void main(String[] args) {


		List<Integer> list = Arrays.asList(1,2,2,3,3,3,4,5,5); //중복값 넣기
		System.out.println(list);
		
		List<Integer> distinctedList = 
		list.stream().distinct().collect(Collectors.toList()); //collect로 다시 리스트로 받아오기
		
		System.out.println(distinctedList);

	}

}
