package JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Create_Insert2_Ex {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"scott","tiger");
			conn.setAutoCommit(false);//오토커밋 설정을 수동으로
			String sql = "insert into emp1 values(?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			String yes = "y";
			String no = "n";
			String n;
			do {
				
			System.out.println("사번,이름,월급 순서로 입력하시오.");
			pstmt.setInt(1, scan.nextInt());
			pstmt.setString(2, scan.next());
			pstmt.setInt(3, scan.nextInt());
			pstmt.execute();
			System.out.println("최종적으로 DB에 저장하겠습니까?(y/n)");
			String store = scan.next();
			if(store.equals(yes)) {
				conn.commit();
				System.out.println("정보가 추가되었습니다.");
			}else if(store.equals(no)){
				conn.rollback();
				System.out.println("정보가 추가되지 않았습니다.");
			}
			
			System.out.println("입력을 계속 하시겠습니까?(y/n)");
			n = scan.next();
			
			
			}while(n.equals(yes));
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 없음");
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("연결 오류");
		}

	}

}