package Ch22_1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C01Server {

	public static void main(String[] args) throws IOException {


		//서버 만들기
		ServerSocket server = new ServerSocket(7000); //192.168.2.26:6000 , 전화기 연결
		System.out.println("[INFO] Server Socket Listening...");
		
		while(true) {
			Socket client = server.accept(); //연결들어오면 client 정보 담아줌
			System.out.println("[INFO] " + client.getInetAddress()+" 접속하셨습니다.");
			OutputStream out = client.getOutputStream(); // 메세지 전달
			DataOutputStream dout = new DataOutputStream(out);
			dout.writeUTF("WELCOME TO SERVER!");
			dout.flush();
			dout.close();
			out.close();
			
			//메세지 받는 작업 추가
			InputStream in = client.getInputStream();
			DataInputStream din = new DataInputStream(in);
			String recv = din.readUTF();
			System.out.println("[RECV] : "+ recv);
		}// 무한 루프

	}

}
