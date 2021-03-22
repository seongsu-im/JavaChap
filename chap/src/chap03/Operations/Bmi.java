package chap03.Operations;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("몸무게(kg) : ");
		int kg = scan.nextInt();
		System.out.print("키(m) : ");
		double m = scan.nextDouble();
		
		int bmi = (int)(kg/Math.pow(m,2));
		
		System.out.printf("BMI : %d",bmi);
		
	}

}
