package chap06.Class;

import java.util.Scanner;

class MyExp{

	int base;
	int exp;
	int getValue() {
		int result = 1;
		for(int i= 1; i<=exp; i++) {
			//result = result*base
			result*=base;

		}

		return result;

	}

}

public class MyExpEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			MyExp e1 = new MyExp();
			e1.base = 2; e1.exp=3;
			System.out.printf("%d의 %d승 = %d\n", e1.base,e1.exp,e1.getValue());
			MyExp e2 = new MyExp(); 
			e2.base = 3; e2.exp=4;
			System.out.printf("%d의 %d승 = %d\n", e2.base,e2.exp,e2.getValue());
			

	}
}
	

	