package JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Create_Insert_Ex {
	
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      try {//자바로부터 오라클 테이블에 데이터 입력 insert
         Connection conn = DriverManager.getConnection
               ("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");

                        

         boolean y = true; 
         while (y) {
            System.out.println("사번, 이름, 월급 순서로 입력하세요");
            int empno_l = scan.nextInt();
            String ename_l = scan.next();
            int sal_l = scan.nextInt();

            String sql = "INSERT INTO EMP1 VALUES (?,?,?)";
                        
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, empno_l);
            pstmt.setString(2, ename_l);
            pstmt.setInt(3, sal_l);
 
            ResultSet rs = pstmt.executeQuery();   
            
            System.out.println("입력을 계속하시겠습니까? (y/n) ");
            if(scan.next().equals("n")) {
               y=false;
            }else {
               y=true;
            }
         }
      }catch (SQLException e) {
         e.printStackTrace();
         System.out.println("연결 오류");
      }
   }
}