package Ch22_1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class C02Client {

	public static void main(String[] args) throws Exception{
		
		
				
		Socket client = new Socket("192.168.2.25",9000); 
				
		DataInputStream din = new DataInputStream(client.getInputStream());
		DataOutputStream dout = new DataOutputStream(client.getOutputStream());
				
		Scanner sc = new Scanner(System.in);
		String recv = null; //데이터 보내는 변수
		String send = null; //데이터 받는 변수
				
		while(true) {
					
			//송신
			System.out.print("[ME(q:종료)] : ");
			send = sc.nextLine();
			dout.writeUTF(send);
			dout.flush();
					
			if(send.equals("q"))
				break;
			
			//수신
			recv = din.readUTF();
			if(recv.equals("q")||recv==null) {
				break;
			}
			System.out.println("[SERVER] : " + recv);
					
			
		}// 클라이언트는 송신먼저 수신 나중에
		dout.close();
		din.close();

	}

}
