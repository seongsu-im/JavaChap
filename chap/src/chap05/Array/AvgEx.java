package chap05.Array;

import java.util.Scanner;

public class AvgEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int[] value = new int[5];

		for(int i =0; i<value.length; i++) {

			value[i] = scan.nextInt();

		}

		double sum = 0;
		for(int i =0; i<value.length; i++) {

			sum += value[i];

		}

		System.out.printf("배열 원소의 평균은 %.1f",sum/value.length);
		
	}

}
