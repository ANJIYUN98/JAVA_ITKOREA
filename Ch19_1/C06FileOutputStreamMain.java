package Ch19_1;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class C06FileOutputStreamMain {

	public static void main(String[] args) throws Exception{
		
		
		OutputStream out = new FileOutputStream("C:\\tmp_io\\test4.xlsx"); //새파일 만들기
//		out.write("가"); //문자열은 안됨
		out.write("가".getBytes(StandardCharsets.UTF_8)); //바이트 단위로 변환
		out.write('a');
		out.write('b');
		out.write('c');
		
		out.flush();
		out.close();
		

	}

}
