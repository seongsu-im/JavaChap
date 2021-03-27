package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetaDataEx {

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
		String sql ="select* from book";

		PreparedStatement pstmt = conn.prepareStatement(sql);
					
		ResultSet rs = pstmt.executeQuery();
		
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println("컬럼의 갯수: " +rsmd.getColumnCount());
		System.out.println("2번째 컬럼 이름: " +rsmd.getColumnName(2));
		System.out.println("2번째 칼럼 타입: " +rsmd.getColumnTypeName(2));
		
	}

}

