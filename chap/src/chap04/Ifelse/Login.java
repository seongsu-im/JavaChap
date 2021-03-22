package chap04.Ifelse;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String realid = "conan";
		String realpw = "1111";

		
		System.out.print("사용자의 아이디 입력 : ");
		String id = scan.next();
		System.out.print("사용자의 패스워드 입력 : ");
		String pw = scan.next();
		
		if(id.equals("conan")) {
			
			if(pw.equals("1111")) {
				
				System.out.println("로그인에 성공하셨습니다.");
				
			}
			
			else {
				
				System.out.println("비밀번호가 틀렸습니다.");
			}
			
		}
		
		
		else {
			
			System.out.println("등록된 사용자가 아닙니다. 회원 정보를 확인하세요");
			
		}
		
	}

}
