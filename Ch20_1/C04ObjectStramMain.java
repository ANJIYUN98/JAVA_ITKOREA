package Ch20_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;


class Board implements Serializable{ //직렬화 처리 (implements Serializable)
	private static final long serialVersionUID = 1L; //Board의 시리얼 번호 붙이기 (구별하기 위해)
	
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date date;     //java.util 로 import
	
	
	//모든 인자 생성 ( All Args Constructor)
		//Getter and Setter
		//toString
		
	public Board(int bno, String title, String content, String writer, Date date) {
		super();
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
	}
	
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", date="
				+ date + "]";
	}
	

	
}

public class C04ObjectStramMain {

	public static void main(String[] args) throws Exception{
		
		//object 내용넣기
//		FileOutputStream out = new FileOutputStream("C:\\tmp_io\\board.db"); //바이너리 데이터로 들어감
//		ObjectOutputStream oout = new ObjectOutputStream(out);
//		oout.writeObject(new Board(1,"제목1","하2","홍길동",new Date())); //Board의 객체 순서대로 넣기
//		oout.writeObject(new Board(2,"제목2","하3","남길동",new Date())); 
//		oout.flush();
//		oout.close();
//		out.close();
		
		
		//object 가져오기
		FileInputStream in = new FileInputStream("C:\\tmp_io\\board.db"); //바이너리 데이터로 들어감
		ObjectInputStream oin = new ObjectInputStream(in);
		
		Object obj = oin.readObject(); //역직렬화
		//Board로 받아오기때문에 다운캐스팅 작업해 줘야함
		Board down = (Board)obj;
		System.out.println(down);
		
		Object obj2 = oin.readObject(); 
		Board down2 = (Board)obj2;
		System.out.println(down2);
		
		//더 이상 읽을 것이 없으면 java.io.EOException 발생
		Object obj3 = oin.readObject(); 
		Board down3 = (Board)obj3;
		System.out.println(down3);
		

	}

}
