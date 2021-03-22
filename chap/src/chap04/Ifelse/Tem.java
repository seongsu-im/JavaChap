package chap04.Ifelse;

import java.util.Scanner;

public class Tem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("기계의 온도를 입력하세요.");
		double tem = scan.nextDouble();
		
		if(tem>=40) {
			
			System.out.println("팬(Fan) 가동");
			
		}
		
		else {
			System.out.println("팬(Fan) 중지");
					}
		
	}

}
