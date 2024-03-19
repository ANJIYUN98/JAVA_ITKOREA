package Ch17_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class C05PropertiesMain {

	public static void main(String[] args) throws IOException {
		
		String classPath = System.getProperty("java.class.path");
//		System.out.println("ClassPath : " + classPath);
		
		String dirPath = System.getProperty("user.dir");
//		System.out.println("DirPath : " + dirPath);
		
		String pakagePath = C05PropertiesMain.class.getPackageName();
//		System.out.println("PakagePath : " + pakagePath);
		
		String filePath = dirPath + File.separator + "src" + File.separator + pakagePath + File.separator + "application.properties";
//		System.out.println("FilePath : " + filePath);
		
		
		Properties properties = new Properties();
		FileInputStream fin = new FileInputStream(filePath); //내용받아올때 사용
		
		//어떤 파일꺼내올껀지 지정
		properties.load(fin);
		
		String url=properties.getProperty("url");
		String username=properties.getProperty("username");
		String password=properties.getProperty("password");
		
		System.out.printf("%s\n%s\n%s\n",url,username,password);

	}

}
