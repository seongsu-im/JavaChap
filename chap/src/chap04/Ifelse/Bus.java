package chap04.Ifelse;

import java.util.Scanner;

public class Bus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.월~금, 2.토요일, 3.공휴일");
		System.out.print("요일을 선택하세요(1~3) --> ");
		int num = scan.nextInt();
		
		if(num==1) {
			
			System.out.println("버스 전용차로 단속 중입니다.");			
			System.out.println("1.버스, 2.승용차");			
			System.out.print("차종을 선택하세요(1,2) --> ");			
			int sel = scan.nextInt();
			
			if(sel==1) {
				
				System.out.println("버스임");
				
			}
			
			else {
				
				System.out.println("버스 전용차로 위반!!");
				
			}
		}
	
		else {
			
			System.out.println("토요일, 공휴일은 단속하지 않아요~");
			
		}
	
	}
	
}
