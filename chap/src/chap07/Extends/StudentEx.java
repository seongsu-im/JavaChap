package chap07.Extends;

import java.util.Scanner;

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		Student[] stuArray = new Student[3];
		
		for(int i = 0; i<stuArray.length; i++) {
			
			
			System.out.println("�л� ������ �̸�, ��, ��ȣ, ����, ����, ����, ������� �Է��ϼ��� -->>");
			
			stuArray[i] = new Student();
			stuArray[i].name = scan.next();
			stuArray[i].ban = scan.nextInt();
			stuArray[i].no = scan.nextInt();
			stuArray[i].kor = scan.nextInt();
			stuArray[i].eng = scan.nextInt();
			stuArray[i].math = scan.nextInt();
			
		}
		
		System.out.println("=====================================================================");
		System.out.println("�л��̸� �� ��ȣ ���� ���� ���� ���� ���");
		System.out.println("------------------------------------------------------------------");
	
		for(int i = 0; i<stuArray.length; i++) {
		
		stuArray[i].showInfo();
		
		}
		System.out.println("=====================================================================");
	}
	
}
