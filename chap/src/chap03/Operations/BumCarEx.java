package chap03.Operations;

import java.util.Scanner;

public class BumCarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan = new Scanner(System.in);
		
		System.out.print("어린이의 신장(cm)을 입력하세요 : ");
		int cm = scan.nextInt();
		
		System.out.println(cm>=125 && cm<165);
		
	}

}
