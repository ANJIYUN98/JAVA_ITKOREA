package Ch21_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C04DELETE {

	public static void main(String[] args) throws SQLException {
		
		//DB Conn Data
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/testdb"; //jdbc:db명://접속하려는 위치(mysql은 localhost가 3306이다)/db명
				
		//JDBC 참조변수
		Connection conn = null; 		//DBMS의 특정 DB연결을 위한 참조변수
		PreparedStatement pstmt = null; //SQL 쿼리 전송용 참조변수
		ResultSet rs = null;			//SQL 쿼리 중 조회결과(ex. SELECT) 수신용 참조변수
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver"); //드라이브 파일을 메모리공간에 적재, mysql_connector의 경로
			System.out.println("Driver Loading Success..");
			
			//conn = Connection객체;
			conn= DriverManager.getConnection(url, id, pw);
			System.out.println("DB Conneted..");
			
			pstmt = conn.prepareStatement("delete from tbl_std where userid=?"); //쿼리문 전달
			pstmt.setString(1, "user1"); 
			 
			
			int result = pstmt.executeUpdate(); //쿼리 보내기
			
			if(result>0)
				System.out.println("DELETE 성공");
			else
				System.out.println("DELETE 실패");
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}finally {
			try{ conn.close(); //자원 제거
				}catch (SQLException e) {e.printStackTrace();}
			try{ pstmt.close(); //자원 제거
			}catch (SQLException e) {e.printStackTrace();}
		}

	}

}

