package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MembersDAO {

		public static void main(String[] args) {
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
			String dbUserId = "scott"; 	String dbPwd = "tiger";
			Scanner scan = new Scanner(System.in);
			int menu=0;  //선택된 메뉴 저장용 변수
			//DB 연동에 필요한 객체들 참조변수 초기화 
			Connection conn = null; 
			PreparedStatement pstmt=null; 
			ResultSet rs = null; 
			//DML 작업에 필요한 변수들 초기화
			int userId = 0;
			String userPwd = null;
			Members mem = null; 
			List<Members> al = null; //회원들을 저장할 수 리스트(ArrayList, LinkedList)를 참조하는 변수
			//DB 연결
			conn = getConnectivity(url, dbUserId, dbPwd);
			BREAK:
				while(true) {
					System.out.println("================================================");
					System.out.println("1.추가\t2.조회\t3.수정\t4.삭제\t5.모두 보기\t6.종료");
					System.out.println("================================================");
					System.out.println("메뉴를 선택하시오 >>");
					menu = scan.nextInt();
					switch(menu) {
					case 1: //추가 
						System.out.println("비밀번호, 이름, 이메일, 전화번호 순으로 입력하시오>> ");
						mem = new Members(scan.next(), scan.next(), scan.next(), scan.next() );
						insertMember(conn, pstmt, mem); 
						break;
					case 2: //조회 
						System.out.println("검색할 회원의 이름을 입력하시오>> ");
						al = getMembers(conn, pstmt, rs, scan.next()); 
						showAll(al); 
						break;
					case 3: //수정
						System.out.println("수정할 회원의 아이디와 비밀번호를 입력하시오>> ");
						userId = scan.nextInt(); userPwd=scan.next();
						if(isMember(conn, pstmt, rs, userId, userPwd)) {
							System.out.println("비밀번호, 이름, 이메일, 전화번호 순으로 입력하시오>> ");
							mem = new Members(userId, scan.next(), scan.next(), scan.next(), scan.next() );
							updateMembers(conn, pstmt, mem);
						}
						else {System.out.println("존재하지 않는 회원입니다."); 
						}
						break;
					case 4: //삭제
						System.out.println("삭제할 회원의 아이디와 비밀번호를 입력하시오>> ");
						userId = scan.nextInt(); userPwd=scan.next();
						if(isMember(conn, pstmt, rs, userId, userPwd)) {
							System.out.println("비밀번호, 이름, 이메일, 전화번호 순으로 입력하시오>> ");
							mem = new Members(userId, scan.next(), scan.next(), scan.next(), scan.next() );
							deleteMembers(conn, pstmt, userId);
							}
						else {System.out.println("존재하지 않는 회원입니다."); 
						} break;
					case 5: //모두보기 
						al = getMemberListAll(conn, pstmt, rs); 
						showAll(al); 
						break;
					case 6:
						break BREAK;
					}
				}
		
	}//main

		public static Connection getConnectivity(String url,String dbId,String dbPwd) {
			Connection conn = null;

			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url,dbId,dbPwd);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return conn;  
		}

		public static boolean isMember(Connection conn, PreparedStatement pstmt, ResultSet rs,
				int userId, String userPwd) {
			String sql = "select * from members where userid = ? and userpwd = ?";
			
			//회원이면 true 비회원이면 false 반환
			boolean result = true;
			try {

				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, userId);
				pstmt.setString(2, userPwd);
				rs = pstmt.executeQuery();
				result = rs.next();

			}catch(Exception e) {
				e.printStackTrace();
			}
			return result;
		}

		public static void showAll(List<Members> al) {
			//Members 객체 리스트의 정보들을 모두출력
			
			List<Members> members = al;
			
			for(Members m : members) {
				System.out.println(m.toString());
			}

		}

		public static List<Members> getMembers(Connection conn, PreparedStatement pstmt, ResultSet rs, String userName){
			List<Members> members = new ArrayList<Members>();
			
			String sql = "select * from members where username like '%'||?||'%'";
			try {

				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, userName);
				rs = pstmt.executeQuery();

				while(rs.next()) {
					members.add(new Members(rs.getInt("userid"), rs.getString("userpwd"),
							rs.getString("username"), rs.getString("email"),
							rs.getString("phoneno"),rs.getString("regdate")));
				}

			}catch(Exception e) {
				e.printStackTrace();
			}
			return members;
		}

		public static int insertMember(Connection conn, PreparedStatement pstmt, Members mem) {
			String sql = "insert into members values(MEMBERS_ID_SQS.NEXTVAL,?,?,?,?,to_char(sysdate, 'yyyy/MM/dd-hh:mi:ss'))";
			int result = 0;
			try {

				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, mem.getUserPwd());
				pstmt.setString(2, mem.getUserName());
				pstmt.setString(3, mem.getEmail());
				pstmt.setString(4, mem.getPhoneNo());
				result = pstmt.executeUpdate();

			}catch(Exception e) {
				e.printStackTrace();
			}
			return result;
		}

		public static int updateMembers (Connection conn, PreparedStatement pstmt, Members mem) {

			String sql = "update members set userpwd=?,username=?,email=?,phoneno=? where userid=?";
			int result = 0;
			try {

				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, mem.getUserPwd());
				pstmt.setString(2, mem.getUserName());
				pstmt.setString(3, mem.getEmail());
				pstmt.setString(4, mem.getPhoneNo());
				pstmt.setInt(5, mem.getUserId());
				result = pstmt.executeUpdate();

			}catch (Exception e) {
				e.printStackTrace();
			}return result;
		}


		public static int deleteMembers(Connection conn, PreparedStatement pstmt, int userId) {

			String sql = "delete from members where userid=?";
			int result = 0;
			
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, userId);
				result = pstmt.executeUpdate();

			}catch(Exception e) {
				e.printStackTrace();
			}return result;
		}

		public static List<Members> getMemberListAll(Connection conn, PreparedStatement pstmt, ResultSet rs){
			List<Members> members = new ArrayList<Members>();
			String sql = "select * from members";
			
			try {
				
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					members.add(new Members(rs.getInt("userid"), rs.getString("userpwd"),
							rs.getString("username"), rs.getString("email"),
							rs.getString("phoneno"),rs.getString("regdate")));
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return members;
		}
	
} // class
