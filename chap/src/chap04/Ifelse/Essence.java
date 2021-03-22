package chap04.Ifelse;

import java.util.Scanner;

public class Essence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("양의 정수 입력 : ");
		double essence = scan.nextDouble();
		
		
		System.out.printf("결과 : %d",Math.round(essence/3));
		
	}

}
