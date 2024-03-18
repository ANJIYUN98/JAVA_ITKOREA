package Ch16_1;

class Animal{
	
}

class Tiger extends Animal{
	String name;
	
	//생성자
	public Tiger(String name) {
		super();
		this.name = name;
	}

	//toString
	@Override
	public String toString() {
		return "Tiger [name=" + name + "]";
	}
	
}


class Panda extends Animal{
	String name;

	//생성자
	public Panda(String name) {
		super();
		this.name = name;
	}

	
	// toString
	@Override
	public String toString() {
		return "Panda [name=" + name + "]";
	}
	
	
}


//Generic은 다운캐스팅이 필요없다.

public class C04GenericMain {

	// Generic
	public static <T extends Animal> void printInfo(T[] arr) {
		for(T el : arr)
			System.out.println(el);
	}//반환자료형 앞에 어떤 타입을 사용할 껀지 적으면 됨.
	
	
	// Object
	public static void printInfo2(Object[] arr) {
		for(Object el : arr) {
			System.out.println(el);
			if(el instanceof Tiger) {
				Tiger down = (Tiger)el;
			}
		}
	}
	
	
	public static void main(String[] args) {
		Tiger[] arr = {new Tiger("시베리안호랑이"), new Tiger("호랭이"), new Tiger("호호호")};
//		printInfo(arr);
		Panda[] arr2 = {new Panda("중국팬더"), new Panda("래서팬더")};
//		printInfo(arr2);
		
		Object [] arr3 = {new Tiger("호랭랭"), new Panda("팬더다")};
		// 다 받아서 사용하기 때문에 유연성이 있음 (호랑이와 팬더를 제외한 동물들도 받을 수 있음)
//		printInfo(arr3); // extends를 걸면 오류가 나온다.
		printInfo2(arr3);

	}

}
