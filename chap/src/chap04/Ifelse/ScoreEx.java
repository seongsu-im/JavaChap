package chap04.Ifelse;

import java.util.Scanner;

public class ScoreEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학점을 입력하시오 --> ");
		int credit = scan.nextInt();
		
		
		switch(credit/10) {
		
		case 9 :
		case 8 :
			
		System.out.println("참 잘했음");	
		break;
		
		case 7 :
		case 6 :
			
		System.out.println("좀 더 노력해");	
		break;
		
		default:
			System.out.println("다음 학기에 다시 만나요.");	
			break;
		}
	}

}