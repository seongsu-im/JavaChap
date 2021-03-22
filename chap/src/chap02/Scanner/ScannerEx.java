package chap02.Scanner;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("당신의 이름을 입력하세요 -->>");
		String name = scan.next();
		System.out.print("당신의 주소를 입력하세요 -->>");
		String add = scan.next();
		System.out.print("당신의 나이를 입력하세요 -->>");
		int age = scan.nextInt();
		System.out.print("당신의 키(cm)를 입력하세요 -->>");
		double cm = scan.nextDouble();
		
		System.out.printf("이름 : %s\n",name);
		System.out.printf("주소 : %s\n",add);
		System.out.printf("나이 : %d\n",age);
		System.out.printf("키 : %.1f\n",cm);
	}

}
