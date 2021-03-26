package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class BookEx1 {

	public static void main(String[] args) {


		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String pwd = "tiger";
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		ResultSetMetaData rsmd = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,user,pwd);

			sql = "select * from book";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			rsmd = rs.getMetaData();
			System.out.println("컴럼의 갯수 : "+ rsmd.getColumnCount());
			System.out.println("2번째 컬럼 이름: " + rsmd.getColumnName(2));
			System.out.println("2번째 컬럼 타입: " + rsmd.getColumnTypeName(2));


		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("연결 오류");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 없음");
		}

	}
}

