package JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Create_table_Ex {
	
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      try {//자바로부터 오라클 테이블에 데이터 입력 insert
         Connection conn = DriverManager.getConnection
               ("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");

         String sql = "CREATE TABLE EMP1(\r\n EMPNO_L NUMBER,\r\n ENAME_L VARCHAR2(30),\r\n SAL_L NUMBER)";
         PreparedStatement pstmt = conn.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery();   

      }catch (SQLException e) {
         e.printStackTrace();
         System.out.println("연결 오류");
      }
   }
}