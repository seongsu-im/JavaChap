package chap03.Operations;

import java.util.Scanner;

public class CarSpeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("주행 속도(km/h) : ");
		int km = scan.nextInt();
		System.out.print("주행 시간(h) : ");
		int time = scan.nextInt();
		System.out.printf("주행 이동 거리(km) : %d", km*time);
		
	}

}
