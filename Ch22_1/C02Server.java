package Ch22_1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class C02Server {

	public static void main(String[] args) throws Exception{

		//서버 만들기
		ServerSocket server = new ServerSocket(7000); //192.168.2.26:6000 , 전화기 연결
		System.out.println("[INFO] Server Socket Listening...");
		
		Socket client = server.accept(); //무한루프가 아닌 하나의 루트만 받기
		
		DataInputStream din = new DataInputStream(client.getInputStream());
		DataOutputStream dout = new DataOutputStream(client.getOutputStream());
		
		Scanner sc = new Scanner(System.in);
		String recv = null; //데이터 보내는 변수
		String send = null; //데이터 받는 변수
		
		while(true) {
			
			//수신
			recv = din.readUTF();
			if(recv.equals("q")||recv==null) {
				break;
			}
			System.out.println("[CLIENT] : " + recv);
			
			//송신
			System.out.print("[ME(q:종료)] : ");
			send = sc.nextLine();
			dout.writeUTF(send);
			dout.flush();
			
			if(send.equals("q"))
				break;
		} // 서버는 수신먼저 송신 나중에
		
		dout.close();
		din.close();
	}

}
