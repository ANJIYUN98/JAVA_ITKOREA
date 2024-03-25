package Ch23_1;

public class C03Worker2 implements Runnable{

	
	C01GUI gui;
	
	C03Worker2(C01GUI gui){
		this.gui = gui;
	} //생성자
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		while(true) {
			System.out.println("TASK02..");
			gui.area2.append("TASK02..\n");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
