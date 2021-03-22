package chap03.Operations;

import java.util.Scanner;

public class Sea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 해수면 10m 마다 0.7도씩 내려감
		// 해수면의 현재온도 20도
		Scanner scan = new Scanner(System.in);
		
		int tem = 20;  // 해수면 온도 
			
		System.out.print("수심을 입력하세요 : ");
		int sea = scan.nextInt();
		
		double ondo = (sea/10)*0.7;
		
		System.out.printf("수온 : %.1f",tem-ondo);
		
		
	}

}
