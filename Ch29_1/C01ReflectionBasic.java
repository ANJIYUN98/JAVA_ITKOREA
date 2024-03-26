package Ch29_1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class TEST{
	String name;
	String addr;
	int age;
	
	//생성자
	public TEST(){}
	public TEST(String name){this.name = name;}
	public TEST(String name,String addr){this.name = name; this.addr = addr;}
	
	
	//getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		System.out.println("GETAGE FUNC...");
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "TEST [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}
	
	
	
}

public class C01ReflectionBasic {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchFieldException {
		
		Class<?>clazz = Class.forName(String.valueOf(TEST.class).split(" ")[1]);
//		System.out.println(String.valueOf(TEST.class));
		
//		//클래스의 필드 정보 확인
//		Field[]fields = clazz.getFields();
//		for(Field field : fields) {
//			System.out.println(field);
//		}
		
		Method method = clazz.getDeclaredMethod("getAge", null);
		
		System.out.println("method : " + method);
		Object result = method.invoke(new TEST(), null);
		
		Constructor<?> constructor = clazz.getConstructor(String.class); //String 클래스를 받는 하나의 생성자를 꺼내온다.
		System.out.println("생성자 : " + constructor);
		
		Object obj = constructor.newInstance("홍길동");
		System.out.println("INSTNCE : " + obj);
		
		Field field = clazz.getDeclaredField("addr");
		TEST ob = new TEST();
		field.set(ob, "대구");
//		field.set(new TEST(), "대구"); //위에 두줄을 이렇게 해도 된다.
		System.out.println(ob);
		
	}

}
