package Ch23_1;

public class C02Worker1 implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("TASK01..");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //0.5초 정지
		}
		
	}

}
