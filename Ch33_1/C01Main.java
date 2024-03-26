package Ch33_1;


@FunctionalInterface
interface Func{
	void say(String message);
}

@FunctionalInterface
interface Func2{
	int sum(int n1, int n2);
} //03

@FunctionalInterface
interface Func3{
	int sum(int ...args);
} //04 가변인자



public class C01Main {

	public static void main(String[] args) {
		

		//01
		Func t1 = (m)->{System.out.println(m);};
		t1.say("HELLO");
		
		
		//02
		Func t2 = System.out::println;
		t2.say("HELLOWORLD");
		
		
		//03 합구하기
		Func2 t3 = (n1, n2)->{return n1+n2;};
		System.out.println(t3.sum(10, 20));
		
		
		//04 가변인자 사용
		Func3 t4 = (numbers)->{
			int sum = 0;
			for(int n : numbers) {
				sum += n;
			}
			return sum;
		};
		int result = t4.sum(10,33,4656,567,3,2,1111);
		System.out.println(result);
	}

}
