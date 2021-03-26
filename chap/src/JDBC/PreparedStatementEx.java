package JDBC;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


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

			conn.setAutoCommit(false); //오토커밋 설정을 수동으로
			sql = "insert into emp1 values(100,'kid',400000)";
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
			//실행
			sql = "insert into emp1 values(200,'rose',500000)";
			//실행
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
			conn.rollback();


		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("연결 오류");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 없음");
		}

	}
}

