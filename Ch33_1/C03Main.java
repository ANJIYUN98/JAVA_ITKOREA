package Ch33_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;


//제공되는 함수형 인터페이스들
//Function<T, R>:
//apply 메서드를 가지고 있어서 하나의 인자(T)를 받아서 결과(R)를 반환하는 함수형 인터페이스입니다.

//Supplier<T>:
//get 메서드를 가지고 있어서 어떠한 인자도 받지 않고 결과만을 제공하는 함수형 인터페이스입니다.
//
//Consumer<T>:
//accept 메서드를 가지고 있어서 어떠한 인자를 받아서 결과를 반환하지 않는 함수형 인터페이스입니다.
//
//Predicate<T>:
//test 메서드를 가지고 있어서 어떠한 인자를 받아서 불리언 결과를 반환하는 함수형 인터페이스입니다.
//
//UnaryOperator<T>:
//apply 메서드를 가지고 있어서 하나의 인자를 받아서 동일한 타입의 결과를 반환하는 함수형 인터페이스입니다.
//
//BinaryOperator<T>:
//apply 메서드를 가지고 있어서 두 개의 인자를 받아서 동일한 타입의 결과를 반환하는 함수형 인터페이스입니다.



public class C03Main {

	//01 합, 곱셈
	public static Function<Integer, Integer> func1 = (x)->{return x*x;};
	public static Function<Integer, Integer> func2 = (x)->{return x+x;};
	
	//02 누적합
	public static Function<List<Integer>,Integer> func3=x->x.stream().reduce((a,b)->a+b).get();
	
	//03 정수형 데이터만 필터링해 list로 반환
	public static Function<List<Object>, List<Integer>> func4 = x->{
		
		return x.stream()
				.filter(item->{return item instanceof Integer;}) //필터링
//				= .filter(item->item instanceof Integer) 위에서 라인, return지운거라 동일
				.map(item->{return (Integer)item;}) //Integer로 형변환
//				= .map(item->(Integer)item) 위에서 라인, return지운거라 동일
				.collect(Collectors.toList());
		
	}; // 어떤 데이터가 들어올지 몰라 object로 받음
	
	//04 null 체크 기능
	public static Function<List<Object>, List<Integer>> func5 = x->{
		
		return Optional.ofNullable(x) //null을 한번 걸러내는 작업, null이 아니라면!
						.map(list -> list.stream()
								.filter(item->item instanceof Integer)
								.map(item->(Integer)item)
								.collect(Collectors.toList())
								)
						.orElse(Collections.emptyList()); //프로그램이 중간에 종료되는 것을 막음
								
	};
	
	//05 인터페이스간 조합
	public static Function<Integer,Integer> f1Andf2 = func1.andThen(func2);
	public static Function<Integer,Integer> f2Andf1 = func2.andThen(func1);
	public static Function<List<Object>,Integer> f4Andf3 = func4.andThen(func3);
	//func4에 맞는 반환형인 List<Object>를 사용해야함
	
	//06
	public static BinaryOperator<Integer> func6 = (a,b)->a+b;
	public static BiFunction<Integer,Integer,Integer> func7 = (a,b)->a+b;
	
	//07
	public static Function<Integer,Function<Integer,Integer>> func8=(x)->{return (y)->{return x+y;};};
//	public static Function<Integer,Function<Integer,Integer>> func8=x->y-> x+y; 위에를 줄이면 이렇게 됨

	public static Function<Integer,Function<Integer, Function<Integer,Integer>>> func9=x->y->z-> x+y+z;
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		//01
		System.out.println(func1.apply(10));
		System.out.println(func2.apply(10));
		
		//02
		List<Integer> li1 = new ArrayList();
		li1.add(10);
		li1.add(20);
		li1.add(30);
		li1.add(40);
		li1.add(50);
		System.out.println(func3.apply(li1));
		
		//03
		List<Object> li2 = new ArrayList();
		li2.add(10);
		li2.add(20);
		li2.add("HELLO");
		li2.add(30.33);
		li2.add('A');
		li2.add(50);
		System.out.println(func4.apply(li2));
		
		//04
//		List<Object> li3 = new ArrayList();
		List<Integer> result1 = func5.apply(null);
		System.out.println(result1);
		
		List<Integer> result2 = func5.apply(null);
		System.out.println(result2);
		
		//05
		System.out.println(f1Andf2.apply(5));
		System.out.println(f2Andf1.apply(5));
		System.out.println(f4Andf3.apply(li2));
		
		//06
//		System.out.println(func6.apply(3,4));
//		System.out.println(func7.apply(5,7));
		
		//07
		System.out.println(func8.apply(10).apply(20));
							//func8.apply(10)는 (y)->return 10+y;} 가 된다.

		System.out.println(func9.apply(10).apply(20).apply(30));
		
	}

}
