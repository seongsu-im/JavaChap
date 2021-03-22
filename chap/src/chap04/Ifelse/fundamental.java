package chap04.Ifelse;

import java.util.Scanner;

public class fundamental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
	
		while(true) {
			
			System.out.print("첫 번째 숫자 입력 : ");
			int one = scan.nextInt();
			System.out.print("두 번째 숫자 입력 : ");
			int two = scan.nextInt();
			System.out.print("연산 기호  입력 : ");
			String a = scan.next();
			
			if(a.equals("+")) {
			System.out.printf("계산 결과는 %d\n",one+two);
			}
			
			else if(a.equals("-")) {
				System.out.printf("계산 결과는 %d\n",one-two);
				}
			
			else if(a.equals("*")) {
				System.out.printf("계산 결과는 %d\n",one*two);
				}
			
			else if(a.equals("/")) {
				System.out.printf("계산 결과는 %d\n",one/two);
				}
			
			else if(a.equals("quit")) {
				
				System.exit(0);
				
			}
		}
		
	}

}
