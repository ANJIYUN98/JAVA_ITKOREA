package Ch33_1;

import java.util.HashMap;
import java.util.Map;

class Person{
	private String name;
	private Integer age;
	
	//디폴트 생성자
	Person() {
		System.out.println("디폴트 생성자 호출!");
	}
	
	//name 받는 생성자
	Person(String name) {
		this.name = name;
		System.out.println("Person(String name) 생성자 호출!");
	}
	
	//name, age 받는 생성자
	Person(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("Person(String name, int age) 생성자 호출!");
	}
	
	Person(Object obj){
		Map<String, String> map = (Map<String, String>)obj;
		String name= map.get("name");
		int age = Integer.parseInt(map.get("age"));
		this.name = name;
		this.age = age;
		System.out.println("Person(Object obj) 생성자 호출!");
	} //object 생성자
	

	//toString 재정의
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}	
}


interface Printer1<T>{
	void show(T message);
	
}

interface Printer2<T>{
	T show(T obj);
	
}

interface Printer3<T>{
	T show(Object param);
	
}



public class C05Main {

	public static void main(String[] args) {
		

//		Printer1<String> func1 = (m)->{System.out.println(m);}; //메세지 출력
//		Printer1<String> func1 = m->System.out.println(m); //위에 코드 줄임
		Printer1<String> func1 = System.out::println; // '::' 사용 해서 더 줄임 단, 조건 함수의 반환자료형 void
		func1.show("HELLO WORLD");
		
		
//		Printer2<String> func2 = (str)->{return str.toUpperCase();}; //대문자로 변환
//		Printer2<String> func2 = str->str.toUpperCase(); //대문자로 변환
		Printer2<String> func2 = String::toUpperCase; //위 코드들이랑 같음
		String r1 = func2.show("hello");
		System.out.println(r1);
		
		
//		Printer2<String> func3 = (str)->{return new String(str);}; //이 람다식을 줄이면 밑에 코드가 됨
		Printer2<String> func3 = String::new; //String(Object data); 를 받음. 인자를 받는 생성자를 통해서 객체를 받음
		String r2 = func3.show("HAHAHAHAHA");
		System.out.println(r2);
		
//		Printer3<Person> func4 = (obj)->{return new Person(obj);}; //obj가 파라미터로 전달
		Printer3<Person> func4 = Person::new; //위의 코드를 줄였음
		Map<String,String> params = new HashMap();
		params.put("name","홍길동");
		params.put("age", "55");
		Person ob1 = func4.show(params);
		System.out.println(ob1);
	}

}
