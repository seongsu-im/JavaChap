package JDBC;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Image {

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
		FileInputStream fin = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,user,pwd);
			fin = new FileInputStream("d:/temp/onn.png");
			sql = "insert into images values(?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "conan");
			pstmt.setBinaryStream(2, fin,fin.available());
			
			int i = pstmt.executeUpdate();
			System.out.println(i+ "개의 레코드가 삽입됨");
	

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("연결 오류");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("드라이버 없음");
		}catch(IOException e) {}

	}
}

