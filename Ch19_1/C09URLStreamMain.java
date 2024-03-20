package Ch19_1;

import java.io.BufferedInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;

public class C09URLStreamMain {

	public static void main(String[] args) throws Exception{
		
		URL url = new URL("https://sports.news.naver.com/news?oid=311&aid=0001704484");
		InputStream bin = url.openStream();
		
		BufferedInputStream buffIn = new BufferedInputStream(bin);  //보조스트림
																	//버퍼공간 추가
		
		Reader in = new InputStreamReader(buffIn);					//보조스트림
																	//byte단위 -> char단위로 변환시켜 받음
		
		Writer wout = new FileWriter("C:\\tmp_io\\index.html");
		
		while(true) {
			int data = in.read();
			if(data == -1)
				break;
			
			wout.write((char)data);
			
		}
		
		
	}

}
