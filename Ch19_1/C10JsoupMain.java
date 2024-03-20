package Ch19_1;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.UUID;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class C10JsoupMain {

	public static void main(String[] args) throws Exception{
		
		//URL 연결
//		Connection conn = Jsoup.connect("https://maplestory.nexon.com/Home/Main#today"); //import는 jsoup으로
		Connection conn = Jsoup.connect("https://www.musinsa.com/categories/item/005"); 
		
		//DOM객체 가져오기
		Document document = conn.get(); //import는 jsoup.doc으로 
//		System.out.println(document);
		
		//Img 태그만 받아오기
		Elements elements = document.getElementsByTag("img");
//		System.out.println(elements.size());
//		System.out.println(elements);
		
		//src 값 추출
		String img_url = null;
		
		for(Element el : elements) {
			System.out.println(el.getElementsByAttribute("src").attr("src"));
			img_url = el.getElementsByAttribute("src").attr("src");
//			System.out.println(img_url);
			
			System.out.println(img_url.indexOf("//"));
			if(img_url.indexOf("//")==0) {
				img_url = "http:"+img_url;
			}
			
			URL url = new URL(img_url); //src 연결 //import는 java.net으로
			InputStream in = url.openStream();
			BufferedInputStream bin = new BufferedInputStream(in);
			
			OutputStream out = new FileOutputStream("C:\\tmp_io\\" + UUID.randomUUID().toString()+".png");
			
			byte [] buff = new byte[4096];
			int data =0;
			while(true) {
				data = bin.read(buff);
				if(data == -1)
					break;
				out.write(buff,0,data);
				out.flush();	
			}
			bin.close();
			in.close();
			out.close();
			
		}

	}

}
