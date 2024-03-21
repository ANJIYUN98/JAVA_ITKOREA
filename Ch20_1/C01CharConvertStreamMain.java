package Ch20_1;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class C01CharConvertStreamMain {

	public static void main(String[] args) throws Exception{

		String str = "문자 변환 스트림 사용";
		
		//보내기
//		OutputStream out = new FileOutputStream("C:\\tmp_io\\test.txt");
//		OutputStreamWriter wout = new OutputStreamWriter(out); //보조스트림 띄우기
//		BufferedWriter bout = new BufferedWriter(wout); //보조스트림 띄우기(버퍼는 하나정도 띄워주기 좋다)
//		bout.write(str);
//		bout.flush();
//		bout.close();
		
		
		//받아오기
		InputStream in = new FileInputStream("C:\\tmp_io\\test.txt");
		BufferedInputStream bin = new BufferedInputStream(in);
		InputStreamReader rin = new InputStreamReader(bin);
		
		//in.read 하면 byte로 받아오고 rin.read하면 char로 받아온다.
		while(true) {
			int data = rin.read();
			if(data == -1)
				break;
			System.out.print((char)data);
		}

	}

}
