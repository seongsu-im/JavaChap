package JDBC;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	public class PreparedInsert {

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
			String sql ="insert into book values(?,?,?,?)";
			
			// 실행이 빠르고 가독성이 좋으며 코드의 재사용 가능
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, 59);
			pstmt.setString(2, "행복한 왕자");
			pstmt.setString(3, "와일드출판사");
			pstmt.setInt(4, 12000);
			pstmt.executeQuery();
			pstmt=conn.prepareStatement("select* from book where bookid=?");
			pstmt.setInt(1,33);
			
			ResultSet rs = pstmt.executeQuery("select* from book order by bookid");
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
