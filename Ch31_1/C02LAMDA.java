package Ch31_1;


interface Printer{
//	void print(String message);   //01
//	String print(String message); //02
//	String print(); 			  //03 파라미터 안받음
	void print(String message);   //04
}


public class C02LAMDA {

	public static void main(String[] args) {
		
		//01
//		Printer printer = (message)->{System.out.println(message);};
		
		
//		//02 리턴형 ()->{} 구조시에 {}안에 return 예약어를 사용
//		Printer printer = (message)->{
//			System.out.println(message);
//			return message;
//		};
//		printer.print("HELLO WORLD");
		
		
//		//02 리턴형 ()-> 구조사용시 return 예약어 생략가능
//		Printer printer2 = (message)->message+"!"; //{}로를 사용하지 않을땐 한 라인으로 끝내야한다.
//		String str = printer2.print("HELLOWORLD");
//		System.out.println(str);
		
		
		//03
//		Printer printer = ()->{System.out.println("HELLOWORLD"); return "";}; //리턴할 것이 없으면 밑에 처럼 가능
//		Printer printer = ()->"HELLOWORLD";
//		String str = printer.print();
//		System.out.println(str);
		
		
		//04
		Printer printer = (message)->System.out::println; //void가 반환자료형으로 잡혀있기 때문에 return 할 필요 x
		printer.print("HELLO?");
		

	}

}
