package chap05.Array;

import java.util.Scanner;

public class MaxEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int[] value = new int[5];

		for(int i =0; i<value.length; i++) {

			value[i]=scan.nextInt();

		}

		int max = value[0];
		for(int i =0; i<value.length-1; i++) {

			if(max<value[i+1]) {
				
				max = value[i+1];
				
			}

		}

		System.out.printf("가장 큰 수는 %d",max);
	}

}

