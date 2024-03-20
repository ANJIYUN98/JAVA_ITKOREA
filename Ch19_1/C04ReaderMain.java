package Ch19_1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class C04ReaderMain {

	public static void main(String[] args) throws Exception {


		Reader fin = new FileReader("C:\\tmp_io//test3.txt");
		StringBuffer buffer = new StringBuffer();
		
		char[] tmp = new char[1024]; // 버퍼공간 만들기
		
		long startTime = System.currentTimeMillis();
		
		while(true) {
//			int data = fin.read(); //유니코드 문자 반환
			
			int data = fin.read(tmp);
			
			if(data==-1) // 텍스트 반환할 것이 없으면 -1 반환
				break;
//			buffer.append((char)data);
			
			buffer.append(tmp); //버퍼공간
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("소요시간 : " + (endTime-startTime)+"ms");

//		System.out.println(buffer);
		fin.close();
	}

}
