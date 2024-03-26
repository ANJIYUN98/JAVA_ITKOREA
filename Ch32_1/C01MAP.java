package Ch32_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C01MAP {

	public static void main(String[] args) {
		
		
		List<Integer> numberList = Arrays.asList(1,2,3,4,5);
		System.out.println(numberList);

		//짝수만 가져오기
//		numberList.stream().filter((n)->{return n%2==0;}); //중괄호 벗기고 return 생략가능
//		numberList.stream().filter((n)->n%2==0); // 이렇게
		
		List<Integer> evenList = numberList.stream()
											.filter((n)->n%2==0)
											.collect(Collectors.toList());
		System.out.println(evenList);
		
	}

}
