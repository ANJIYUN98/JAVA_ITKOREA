package Ch19_1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class C02ReaderMain {

	public static void main(String[] args) throws Exception {


		Reader fin = new FileReader("C:\\tmp_io//test1.txt");
		StringBuffer buffer = new StringBuffer();
		
		while(true) {
			int data = fin.read(); //유니코드 문자 반환
			if(data==-1)
				break;
			buffer.append((char)data);
//			System.out.print((char)data);
		}

		System.out.println(buffer);
		fin.close();
	}

}
