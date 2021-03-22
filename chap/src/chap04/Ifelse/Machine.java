package chap04.Ifelse;

import java.util.Scanner;

public class Machine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("메뉴를 선택하시오 (1 - 3) ");
		int munu = scan.nextInt();
		
		switch(munu) {
		
		case 1:
			System.out.println("coke");
			break;
		case 2:
			System.out.println("sprite");
			break;
		case 3:
			System.out.println("redbull");
			break;
		default:
			System.out.println("wrong choice");
			break;
		}
	}

}
