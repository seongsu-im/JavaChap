package chap04.Ifelse;

import java.util.Scanner;

public class Mask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scan = new Scanner(System.in);

		System.out.print("출생년도를 입력하세요 -->> ");
		int year = scan.nextInt();

		if(year<=1956) {

			System.out.println("언제든 구매 가능");
		}

		else {

			if(year%5 == 1 || year%5 == 6 ) {

				System.out.println("월요일");

			}

			else if(year%5 == 2 || year%5 == 7 ) {

				System.out.println("화요일");

			}

			else if(year%5 == 3 || year%5 == 8 ) {

				System.out.println("수요일");

			}

			else if(year%5 == 4 || year%5 == 9 ) {

				System.out.println("목요일");

			}

			else {

				System.out.println("금요일");
			}
		}

	}

}
