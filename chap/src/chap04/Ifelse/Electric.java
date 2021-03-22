package chap04.Ifelse;

import java.util.Scanner;

public class Electric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("전기 사용량을 입력하세요 -->> ");
		double kmh = scan.nextDouble();
		
		if(kmh<=200) {
			
			System.out.printf("사용량 : %.1f kmh\n",kmh);
			System.out.println("기본요금 : 910 원");
			System.out.println("단가 : 99.3 원");
			System.out.printf("전기 요금: %.1f 원",(kmh*99.3)+910);
			
		}

		else if(kmh<=400) {
			
			System.out.printf("사용량 : %.1f kmh\n",kmh);
			System.out.println("기본요금 : 1600 원");
			System.out.println("단가 : 187.9 원");
			System.out.printf("전기 요금: %.1f 원",(kmh*187.9)+1600);
			
		}
		
		else {
			
			System.out.printf("사용량 : %.1f kmh\n",kmh);
			System.out.println("기본요금 : 7300 원");
			System.out.println("단가 : 208.6 원");
			System.out.printf("전기 요금: %.1f 원",(kmh*280.6)+7300);
			
		}
	}

}
