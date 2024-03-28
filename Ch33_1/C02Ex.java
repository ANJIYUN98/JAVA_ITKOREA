package Ch33_1;

import java.util.Arrays;

interface functional{
	int execute(int ...args);
}
class Calc{
	functional sum;
	functional sub;
	functional mul;
	functional div;
	
	Calc(){
		//덧셈로직
		sum = (numbers)->Arrays.stream(numbers).reduce((a,b)->a+b).getAsInt();
		//뺄셈로직
//		sub = (numbers)->Arrays.stream(numbers).reduce((a,b)->b-a).getAsInt();
		sub = (numbers)->Arrays.stream(numbers)
								.sorted() // 오름차순
								.reduce((a,b)->b-a)
								.getAsInt();
								
		//곱셈로직
		mul = (numbers)->Arrays.stream(numbers).reduce((a,b)->a*b).getAsInt();
		//나눗셈로직
		div = (numbers)->Arrays.stream(numbers).reduce((a,b)->a/b).getAsInt();
		
		//stream.reduce(accumulator) 함수는 Stream의 요소들을 하나의 데이터로 만드는 작업을 수행함
		//연산을 수행하는 부분은 accumulator 함수고 직접 구현해서 인자로 전달해야함 
	}
}


public class C02Ex {

	
	public static void main(String[] args) {
		Calc calc = new Calc();
		System.out.println("합 :"+ calc.sum.execute(10,20,30,40,50,60));
		System.out.println("뺄셈 :"+ calc.sub.execute(1,4,3,7)); //1,3,4,7로 정렬
		System.out.println("곱 :"+ calc.mul.execute(3,5,6));
		System.out.println("나눗셈 :"+ calc.div.execute(30,2,5));
		
		
		
	}
}
