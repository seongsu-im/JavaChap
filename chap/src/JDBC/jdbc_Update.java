package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_Update {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		// TODO Auto-generated method stub

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String pwd = "tiger";
		
		 // Class.forName() 동적으로 자바 클래스 로딩 / oracle.jdbc.driver.OracleDriver 로드 -> 드라이버 객체화
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		
		// DriverManager는 자바 어플리케이션을 JDBC 드라이버에 연결시켜주는 클래스 / getConnection() 메소드로 DB에 연결 후 Connection 객체로 반환
		Connection conn = DriverManager.getConnection(url,user,pwd); 
				
		// Statement createStatement는 SQL문을 실행하기 위해서 이용
		Statement stmt = conn.createStatement();
				
		// int executeQuery는 INSERT, UPDATE, DELETE 같은 SQL문을 실행하고 SQL문 실행으로 영향을 받은 행의 개수나 0을 반환 
		int ec = stmt.executeUpdate("update book set bookname='나나니', price=25000 where bookid=52"); // 인자의 String내용을 포맷에 맞게 변경할 것
		
		//int num = st.executeUpdate(sql) -> 몇개의 값이 수정되었는지 정수형 반환
		//System.out.println(rs);
		
		ResultSet rs = stmt.executeQuery("select* from book order by bookid");
		while(rs.next()) {
			
			System.out.print(rs.getInt(1));
			System.out.print(" "+rs.getString(2));
			System.out.print(" "+rs.getString(3));
			System.out.print(" "+rs.getInt(4)+"\n");
		}
		
		rs.close();
		stmt.close();
		conn.close();
	}

}