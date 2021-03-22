package chap09.Exception;

import java.util.Scanner;

public class ThrowsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		
		try {
			
			square(scan.next());
			
		}
		
		catch(NumberFormatException e) {
			
			System.out.println("정수가 아닙니다.");
		}
		
		
		public static void square(String str) throws NumberFormatException{
			
			int n = Integer.parseInt(str);
			System.out.println(n * n);
		}

	}

}
