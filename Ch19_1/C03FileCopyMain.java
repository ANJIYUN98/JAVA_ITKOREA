package Ch19_1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class C03FileCopyMain {

	private static String FileDir = "C:\\tmp_io\\";
	
	public static void main(String[] args) throws Exception{
		
		//명령어 원본 파일 대상파일(c:\\tmp_io)
		for(String arg : args)
			System.out.println(arg);
		
		Reader in = new FileReader(FileDir + args[0]); //파일 경로 잡기, 파일 꺼내오기
		Writer out = new FileWriter(FileDir + args[1]); // 파일 저장하기

		while(true) {
			int data = in.read();
			if(data==-1)
				break;
			
			//지정된 위치로 데이터 넣기
			out.write((char)data);
			out.flush();
		}
		in.close();
		out.close();
	}

}
