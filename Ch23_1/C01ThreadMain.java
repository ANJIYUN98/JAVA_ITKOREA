package Ch23_1;

public class C01ThreadMain {

	public static void main(String[] args) throws InterruptedException {


		for(int i=0; i<5; i++) {
			System.out.println("TASK01..");
			Thread.sleep(500); //0.5초 정지
		}
		for(int i=0; i<5; i++) {
			System.out.println("TASK02..");
			Thread.sleep(500);
		}

	}

}
