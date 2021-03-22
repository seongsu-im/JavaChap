package chap04.Ifelse;

import java.util.Scanner;

public class transportation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int charge = 1250;
		int i = 1;
		
		System.out.print("최초 충전금액 -->> ");
		int recharge = scan.nextInt();
		System.out.printf("%d원이 충전되었음\n",recharge);
		
		while(recharge>=1250) {
			
			recharge -= charge;
			System.out.printf("%d회 사용한 후 현재 잔액은 %d원\n",i,recharge);
			
			i++;
			
		}
		
	}

}
