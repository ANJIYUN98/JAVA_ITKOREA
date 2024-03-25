package Ch24_1;

import java.net.ServerSocket;
import java.net.Socket;

public class ClientMain {

public static void main(String[] args) throws Exception{
		
		
		
		//소캣 객체 만들기 (무한으로 받지 x)
		Socket client = new Socket("192.168.2.25",7000);
		
		//
		ServerSendThread send = new ServerSendThread(client);
		ServerRecvThread recv = new ServerRecvThread(client);
		
		//
		Thread th1 = new Thread(send);
		Thread th2 = new Thread(recv);
		
		//
		th1.start();
		th2.start();
		
		//
		th1.join();
		th2.join();

	}

}
