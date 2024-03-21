package Ch20_1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class C03DataInoutStreamMain {

	public static void main(String[] args) throws Exception{
		
//		FileOutputStream out = new FileOutputStream("C:\\tmp_io\\test3.txt");
//		DataOutputStream dout = new DataOutputStream(out);
//		
//		//기본스트림인 out.write에는 사용할 수 있는 것이 3개 밖에 없지만 보조스트림을 사용한 dout.write는 많은 종류를 사용할 수 있다.
//		dout.writeUTF("홍길동");
//		dout.writeDouble(95.5);
//		dout.writeInt(100);
//		dout.flush();
//		dout.close();
		
		FileInputStream in = new FileInputStream("C:\\tmp_io\\test3.txt");
		DataInputStream din = new DataInputStream(in);
		String name = din.readUTF();
		System.out.println(name);
		Double weight = din.readDouble();
		System.out.println(weight);
		int data = din.readInt();
		System.out.println(data);

	}

}
