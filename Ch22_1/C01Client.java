package Ch22_1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class C01Client {

	public static void main(String[] args) throws Exception{

		Socket client = new Socket("192.168.2.254",7000); // 해당위치로 연결 요청
		System.out.println("[INFO] SERVER와 연결완료...");
		
		InputStream in = client.getInputStream();
		DataInputStream din = new DataInputStream(in);
		String msg = din.readUTF(); //메세지 받기
		System.out.println("[SERVER] " + msg);
		
		OutputStream out = client.getOutputStream();
		DataOutputStream dout = new DataOutputStream(out); 
		dout.writeUTF("문자열"); //메세지 보내기
		
		dout.flush();
		dout.close();
		out.close();
		
		din.close();
		in.close();

	}

}
