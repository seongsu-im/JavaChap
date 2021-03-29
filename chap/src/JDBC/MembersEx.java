package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class MembersEx {


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
			System.out.println("1.추가 2.조회 3.수정 4.삭제 5.모두보기 6.종료");
			System.out.println("======================================================");
			System.out.println("메뉴를 선택하시오 >>");

			int menu = scan.nextInt();

			if(menu == 1) {

				System.out.println("비밀번호, 이름, 이메일, 전화번호 순으로 입력하시오");
				sql = "INSERT INTO MEMBERS VALUES (MEMBERS_ID_SQS.NEXTVAL,?,?,?,?,sysdate)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, scan.next());
				pstmt.setString(2, scan.next());
				pstmt.setString(3, scan.next());
				pstmt.setString(4, scan.next());

				rs = pstmt.executeQuery();
			}

			else if(menu==2) {

				System.out.println("검색할 회원의 이름을 입력하시오 >>");
				String name = scan.next();		
				sql = "SELECT* FROM MEMBERS WHERE USERNAME='"+name+"'";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();

				while(rs.next()) {

					Members members = new Members(rs.getInt("userId"),rs.getString("userName"),rs.getString("userPwd"),rs.getString("email"),rs.getString("phoneNo"),rs.getString("regDate"));
					System.out.println(members.toString());

				}	
			}

			else if(menu==3) {

				System.out.println("수정할 회원 아이디와 비밀번호를 입력하시오>>");
				sql = "select * from members where userid=? and userpwd=?";
				pstmt = conn.prepareStatement(sql);

				int id = scan.nextInt();
				String pw = scan.next();

				pstmt.setInt(1, id);
				pstmt.setString(2, pw);
				rs = pstmt.executeQuery();


				if(rs.next() == false) {
					System.out.println("존재하지 않는 회원입니다.");

				}

				else {
					System.out.println("비밀번호, 이름, 이메일, 전화번호 순으로 입력하시오");
					sql = "update members set userpwd=?,username=?,email=?,phoneno=? where userid=? and userpwd=?";

					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, scan.next());
					pstmt.setString(2, scan.next());
					pstmt.setString(3, scan.next());
					pstmt.setString(4, scan.next());
					pstmt.setInt(5, id);
					pstmt.setString(6, pw);
					pstmt.execute();

				}

			}

			else if(menu==4) {

				System.out.println("삭제할 회원 아이디와 비밀번호를 입력하시오>>");
				int id = scan.nextInt();
				String pw = scan.next();
				
				sql = "delete from members where userid=? and userpwd=?";
				pstmt = conn.prepareStatement(sql);

				pstmt.setInt(1, id);
				pstmt.setString(2, pw);
				rs = pstmt.executeQuery();
				
				if(rs.next() == false) {
					System.out.println("존재하지 않는 회원입니다.");

				}
			}

		else if(menu==5) {

			sql = "SELECT* FROM MEMBERS";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while(rs.next()) {

				Members members = new Members(rs.getInt("userId"),rs.getString("userPwd"),rs.getString("userName"),rs.getString("email"),rs.getString("phoneNo"),rs.getString("regDate"));
				System.out.println(members.toString());

			}	

		}

		else if(menu==6) {

			System.exit(0);
		}

	}

}

}

