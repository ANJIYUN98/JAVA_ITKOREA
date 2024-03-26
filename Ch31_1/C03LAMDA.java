package Ch31_1;


//덧셈, 뺄셈, 곱셈, 나눗셈을 수행하는 함수형 인터페이스 정의
interface Calculator {
	int calculate(int num1, int num2);
//	void calculate(int num1, int num2);
}

public class C03LAMDA {
	public static void main(String[] args) {
		
		Calculator addition = (num1,num2)->{int result = num1 + num2; return result;};
//		Calculator addition = (num1,num2)-> num1 + num2; // 이렇게도 가능
		System.out.println("Addition: " + addition.calculate(5, 3));
		

//		Calculator subtraction = (num1, num2)->{int result = num1 - num2; return result;};
		Calculator subtraction = (num1, num2)->{
			if(num1 >num2)
				return num1 - num2;
			else
				return num2 - num1;
		};
		System.out.println("Subtraction: " + subtraction.calculate(5, 3));	
		
		
		Calculator multiplication = (num1, num2)->{int result = num1*num2; return result;};
		System.out.println("Multiplication: " + multiplication.calculate(5, 3));
		
		
		Calculator division =  (num1, num2)->{int result = num1/num2; return result;};
		System.out.println("Division: " + division.calculate(5, 3));
		
//		Calculator addition = (num1, num2)->{System.out.println("addition : " + (num1+num2) );};
//		addition.calculate(5, 3);
//		//반환자료형을 void로 할 때 이렇게 구현할 수 있다.
		
		
	}
}
