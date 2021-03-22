package chap04.Ifelse;

import java.util.Scanner;

public class Support {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scan = new Scanner(System.in);

		System.out.print("인원 수를 입력하시오 -->> ");
		int people = scan.nextInt();

		if(people==1) {

			System.out.println("400,000만원 지원");

		}

		else if(people==2) {

			System.out.println("600,000만원 지원");

		}
		
		else if(people==3) {

			System.out.println("800,000만원 지원");

		}

		else {

			System.out.println("1,000,000만원 지원");

		}
	}

}
