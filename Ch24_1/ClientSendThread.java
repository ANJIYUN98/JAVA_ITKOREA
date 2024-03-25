package Ch24_1;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientSendThread implements Runnable{

	Scanner sc;
	Socket socket;
	DataOutputStream dout;
	
	ClientSendThread(Socket socket){
		this.socket = socket;
		this.sc = new Scanner(System.in);
		
	}
	
	

	@Override
	public void run() {
		try {
			dout = new DataOutputStream(socket.getOutputStream());
			
			while(true) {
				System.out.print("[CLIENT(q:종료)] : ");
				String send = sc.nextLine();
				dout.writeUTF(send);
				dout.flush(); //버퍼초기화
				
				if(send.equals("q"))
					break;
			}
			System.out.println("[INFO] 종료합니다.");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
