package Ch31_1;

import java.util.ArrayList;
import java.util.List;

class Person{
	private String name;
	private int age;
	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}//default 생성자
	
	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	//toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
}


public class C01LAMDA {

	public static void main(String[] args) {
		
		//Person 클래스에 값 넣기
		List<Person> list = new ArrayList();
		list.add(new Person("Jone",25));
		list.add(new Person("Alice",30));
		list.add(new Person("Bob",20));

		//sort 스트림함수를 이용해서 나이 순으로 정렬
		//list.sort(()->{});
		list.sort((person1,person2)->{return person1.getAge()-person2.getAge();}); //오름차순 정렬
		//person2.Age() - person1.Age() 는 내림차순정렬 (뒤에서 앞에껄 빼는 것이므로)
		
		for(Person person : list)
			System.out.println(person);
	}

}
