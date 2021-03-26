package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedSelect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String pwd = "tiger";

		// Class.forName() 동적으로 자바 클래스 로딩 / oracle.jdbc.driver.OracleDriver 로드 -> 드라이버 객체화
		Class.forName("oracle.jdbc.driver.OracleDriver"); 

		// DriverManager는 자바 어플리케이션을 JDBC 드라이버에 연결시켜주는 클래스 / getConnection() 메소드로 DB에 연결 후 Connection 객체로 반환
		Connection conn = DriverManager.getConnection(url,user,pwd); 

		// SQL문을 실행할 때 필요한 인자들을 동적으로 설정
		String sql ="select* from book where bookid in(?,?)";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setInt(1,2);
		pstmt.setInt(2,4);
		
				
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			
		System.out.print(rs.getInt(1));
		System.out.print(" "+rs.getString(2));
		System.out.print(" "+rs.getString(3));
		System.out.print(" "+rs.getInt(4)+"\n");
		
		}
		rs.close();
		pstmt.close();
		conn.close();


	}


}


