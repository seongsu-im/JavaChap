package JDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_Select {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		// TODO Auto-generated method stub

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String pwd = "tiger";
		
		 // Class.forName() 동적으로 자바 클래스 로딩 / oracle.jdbc.driver.OracleDriver 로드 -> 드라이버 객체화
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		
		// DriverManager는 자바 어플리케이션을 JDBC 드라이버에 연결시켜주는 클래스 / getConnection() 메소드로 DB에 연결 후 Connection 객체로 반환
		Connection con = DriverManager.getConnection(url,user,pwd); 
				
		// Statement createStatement는 SQL문을 실행하기 위해서 이용
		Statement stmt = con.createStatement();
				
		// ResultSet executeQuery는 SQL문을 실행해서 ResultSet 객체를 생성 / 현재 데이터의 행을 가리키는 커서를 관리 / 커서의 초기 값은 첫 번째 행 이전 
		ResultSet rs = stmt.executeQuery("select* from book order by bookid"); // 특정 열만 검색 or 조건 검색은 select문을 이용해서 변경
		
		//ResultSet의 getXXX() 메소드는 해당 데이터 타입으로 열 값을 읽어옴 / 인자로 열의 이름이나 인덱스를 줄수 있음 / 모든 데이터를 읽으면 close() 호출 후 자원해제
		while(rs.next()) {
		
			System.out.print(rs.getInt(1));
			System.out.print(" "+rs.getString(2));
			System.out.print(" "+rs.getString(3));
			System.out.print(" "+rs.getInt(4)+"\n");
		}
				
		rs.close();
		stmt.close();
		con.close();
				
	}

}
