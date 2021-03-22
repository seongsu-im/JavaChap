package chap03.Operations;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1분에 60초 1시간에 3600초
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시간을 초단위로 입력하세요 : ");
		int time = scan.nextInt();
		System.out.printf("%d초는 %d시간 %d분 %d초입니다.",time,time/60/60,time/60%60,time%60%60);
		
	}

}

