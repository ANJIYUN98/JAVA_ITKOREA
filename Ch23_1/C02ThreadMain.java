package Ch23_1;

public class C02ThreadMain {

	public static void main(String[] args) throws InterruptedException {


		//-----------------------
		// --Runnable 사용
		//-----------------------
		
		//01 작업스레드 객체 생성
		C02Worker1 worker1 = new C02Worker1();
		C02Worker2 worker2 = new C02Worker2();
		
		
		//02 스레드별 공간 분리
		Thread th1 = new Thread(worker1);
		Thread th2 = new Thread(worker2);

		
		
		//03 스레드 실행
		th1.start();
		th2.start(); //동시 실행됨
		
		
		

		//--------------------
		//--Thread 사용 new Thread(){}.start
		//--------------------
		
		new Thread(){

			@Override
			public void run() {
				
				for(int i=0; i<5; i++) {
					System.out.println("TASK03..");
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
			
		}.start(); //내부클래스에 익명처리 가능
		
		//new Thread(()->{}).start 로직에 전달
		new Thread(()->{
			for(int i=0; i<5; i++) {
				System.out.println("TASK03..");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}).start(); //익명상태 의미 , 위의 코드와 똑같음
		
	}

}
