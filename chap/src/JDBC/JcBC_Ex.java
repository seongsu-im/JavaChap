package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JcBC_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		try {
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
//			System.out.print("도서의 제목을 입력하세요>>");
//			
			Statement stmt = conn.createStatement();
			
//			String sql = "Select * from book where bookid in(?,?,?)";
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			
//			pstmt.setInt(1, 3);
//			pstmt.setInt(2, 7);
//			pstmt.setInt(3, 10);
			
//			String sql = "Select * from book where bookname =?";
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, "축구의 역사");
			
			String sql = "insert into book values(?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, 50);
			pstmt.setString(2, "행복한 왕자");
			pstmt.setString(3, "와일드 출판사");
			pstmt.setInt(4, 20000);
			pstmt.execute();
			
			sql="select * from book where bookid =50";
			pstmt= conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				System.out.printf("%s\t%s\t%s\t%s\n",rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt("price"));
				
			}
							
			
			
			//stmt.executeLargeUpdate("insert into book values(20,'AAAAA','BBBBB','13000')");
			//stmt.executeLargeUpdate("update book set bookname='CCCC' where bookid=20");
//			stmt.executeLargeUpdate("delete from book where bookid=20");
//			String sql = String.format("select * from book");
//			ResultSet rs = stmt.executeQuery(sql);
//			
			
			while(rs.next()) {
				
				System.out.print(rs.getString("bookid"));
				System.out.print(" " + rs.getString("bookname"));
				System.out.print(" " + rs.getString("publisher"));
				System.out.println(" " + rs.getString(4));
				
			}
			
			//System.out.println("연결 완료");
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 없음");
		}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("연결 오류");
		}

						
	}

}
