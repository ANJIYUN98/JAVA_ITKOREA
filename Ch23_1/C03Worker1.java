package Ch23_1;

public class C03Worker1 implements Runnable{
	
	C01GUI gui;
	
	C03Worker1(C01GUI gui){
		this.gui = gui;
	} //생성자
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
	@Override
	public void run() {
		while(true) {
			try {
			System.out.println("TASK01..");
			gui.area1.append("TASK01\n");
			
				Thread.sleep(500);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			} //0.5초 정지
		}
		
	}

}
