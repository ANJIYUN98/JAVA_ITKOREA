package Ch17_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class C05PropertiesMain {

	public static void main(String[] args) throws IOException {
		
		Properties properties = new Properties();
		FileInputStream fin = new FileInputStream("C:\\JAVA_IT_KOREA\\workspace\\JAVA_BOOK\\src\\Ch17_1\\application.properties"); //내용받아올때 사용
		
		//어떤 파일꺼내올껀지 지정
		properties.load(fin);
		
		String url=properties.getProperty("url");
		String username=properties.getProperty("username");
		String password=properties.getProperty("password");
		
		System.out.printf("%s\n%s\n%s\n",url,username,password);

	}

}
