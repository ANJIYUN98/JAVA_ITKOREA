package Ch19_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class C07FileCopyMain {

	public static void main(String[] args) throws Exception{
		
		InputStream in = new FileInputStream("C:\\tmp_io\\" + args[0]);
		OutputStream out = new FileOutputStream("C:\\tmp_io\\" + args[1]);
		
		byte [] buffer = new byte[4096];
		
		while(true) {
			//파일로부터 읽기
			int data = in.read(buffer); //버퍼크기만큼 읽음
			if(data == -1)
				break;
			
			
			//파일에 쓰기
			out.write(buffer, 0, data);
			out.flush();
			
		}
		in.close();
		out.close();

	}

}
