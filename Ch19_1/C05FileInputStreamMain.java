package Ch19_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class C05FileInputStreamMain {

	public static void main(String[] args) throws Exception {
		
		InputStream fin = new FileInputStream("c:\\tmp_io\\data.xlsx");
//		StringBuffer buffer = new StringBuffer(); //버퍼공간 만들기
		
//		//1byte 받기
//		while(true) {
//			int data = fin.read();
//			if(data==-1)
//				break;
//			System.out.print((char)data);
//		}		

		byte [] buffer = new byte[4096];
		
		while(true) {
			int data = fin.read(buffer);
			if(data == -1)
				break;

			for(int i=0; i<data; i++) {
				System.out.println((char)buffer[i]);
			}
		}
		
		
	}

}
