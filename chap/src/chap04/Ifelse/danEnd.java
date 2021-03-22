package chap04.Ifelse;

import java.util.Scanner;

public class danEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.print("구구단의 시작단 입력 --> ");
		int startDan = scan.nextInt();
		System.out.print("구구단의 끝단 입력 --> ");
		int endDan = scan.nextInt();


		if(startDan<endDan) {

			for(int i = 1; i<10; i++,System.out.println()) {

				for(int dan = startDan; dan<=endDan; dan++) {

					System.out.printf("%d * %d = %2d\t",dan,i,dan*i);

				}

			}

		}

		else if(startDan>endDan) {

			for(int i = 1; i<10; i++,System.out.println()) {

				for(int dan = startDan; dan>=endDan; dan--) {

					System.out.printf("%d * %d = %2d\t",dan,i,dan*i);

				}

			}

		}

	}

}
