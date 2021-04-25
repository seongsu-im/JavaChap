package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import main.Account;

public class Main {
	


	public static void main(String[] args) throws SQLException {
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

		Scanner scan = new Scanner(System.in);
		conn = DriverManager.getConnection(url,user,pwd);

		while (true) {

			System.out.println("======================================================");
			System.out.println("1.계좌개설 2.입금 3.출금 4.송금 5.잔액조회 6.전체계좌조회 7.프로그램종료");
			System.out.println("======================================================");
			System.out.println("메뉴를 선택하세요 >>");

			int menu = scan.nextInt();

			if(menu == 1) {

				System.out.println("계좌번호, 비밀번호, 이름, 최초 입금액 순으로 입력하시오");
				sql = "INSERT INTO Account VALUES (?,?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, scan.next());
				pstmt.setInt(2, scan.nextInt());
				pstmt.setString(3, scan.next());
				pstmt.setInt(4, scan.nextInt());

				rs = pstmt.executeQuery();
			}

			/*
			 * else if(menu==2) {
			 * 
			 * System.out.println("계좌번호,입금액을 입력하세요>>");
			 * 
			 * 
			 * 
			 * String id = scan.next(); int deposit = scan.nextInt(); Account acc = new
			 * Account("11-111-111", "코난", 20000); Account acc = new Account();
			 * acc.deposit(deposit);
			 * 
			 * 
			 * sql = "update members set accountId='"+id+"' where balance= '"+deposit+"'";
			 * 
			 * pstmt = conn.prepareStatement(sql); pstmt.execute();
			 * 
			 * }
			 */
				   
			  
			 
			/* else if(menu==3) {
			 * 
			 * 
			 * 
			 * }
			 * 
			 * else if(menu==4) {
			 * 
			 * 
			 * }
			 */

			else if(menu==5) {
				

				System.out.println("검색할 회원의 계좌번호와 비밀번호를 입력하시오 >>");
				String id = scan.next();
				int password = scan.nextInt();
				sql = "SELECT* FROM Account WHERE accountId='"+id+"' and pwd='"+password+"'";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();

				while(rs.next()) {

					Account account = new Account(rs.getString("accountId"),rs.getInt("pwd"),rs.getString("name"),rs.getInt("balance"));
					System.out.printf("%s님의 잔액은 %d원입니다.\n",account.getName(),account.getBalance());

				}	
			}

			else if(menu==6) {

				sql = "SELECT* FROM Account";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				
				while(rs.next()) {

					Account account = new Account(rs.getString("accountId"),rs.getInt("pwd"),rs.getString("name"),rs.getInt("balance"));
					System.out.println(account.toString());
				}
			}	

			else if(menu==7) {

				
				System.exit(0);
			}

		}

	}
}



