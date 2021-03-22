package chap04.Ifelse;

import java.util.Scanner;

public class BmiUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scan = new Scanner(System.in);

		System.out.print("몸무게(kg) : ");
		int kg = scan.nextInt();
		System.out.print("신장(m) : ");
		double m = scan.nextDouble();

		int bmi = (int)(kg/Math.pow(m, 2));
		System.out.printf("BMI : %d\n",bmi);


		if(bmi<18.5) {

			System.out.println("저체중입니다.");
		}

		else if(bmi<25) {

			System.out.println("정상체중입니다.");
		}

		else if(bmi<30) {

			System.out.println("1단계 비만입니다.");
		}
		
		else if(bmi<40) {

			System.out.println("2단계 비만입니다.");
		}
		
		else {

			System.out.println("3단계 비만입니다.");
		}
		
	}

}
