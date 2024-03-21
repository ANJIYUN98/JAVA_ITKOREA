package Ch20_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class C02ReadLineMain {

	public static void main(String[] args) throws Exception{
		
//		Writer out = new FileWriter("C:\\tmp_io\\test2.txt"); //test2.txt 만들어짐 근데 개행처리가 안되어있음
//		out.write("HELLO");
//		out.write("HELLO");
//		out.write("HELLO");
//
//		out.flush();
//		out.close();
		
		
//		//개행 처리하기
//		Writer out = new FileWriter("C:\\tmp_io\\test2.txt");
//		BufferedWriter bout = new BufferedWriter(out);
//		
//		PrintWriter pout = new PrintWriter(bout);
//		pout.println("HELLO");
//		pout.println("HELLO");
//		pout.println("HELLO");
//		pout.flush();
//		pout.close();
		
		Reader in = new FileReader("C:\\tmp_io\\test2.txt");
		BufferedReader bin = new BufferedReader(in);
		 
		while(true) {
			String data = bin.readLine(); //문자열이기 때문에 String으로 받아야한다.
			if(data == null)
				break;
			System.out.println(data);
		}
	}

}
