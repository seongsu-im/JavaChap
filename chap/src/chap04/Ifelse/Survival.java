package chap04.Ifelse;

import java.util.Scanner;

public class Survival {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scan = new Scanner(System.in);

		System.out.print("최초 장비를 사용하기까지 걸린 시간을 입력하세요 -->> ");
		int time = scan.nextInt();

		if(time<=60) {

			System.out.print("생존율 : 85%");
		}

		else if(time<=120) {

			System.out.print("생존율 : 76%");
		}

		else if(time<=180) {

			System.out.print("생존율 : 66%");
		}

		else if(time<=240) {

			System.out.print("생존율 : 57%");
		}

		else if(time<=300) {

			System.out.print("생존율 : 47%");
		}
		
		else {
			
			System.out.print("생존율 : 25% 미만");
		}
	}

}
