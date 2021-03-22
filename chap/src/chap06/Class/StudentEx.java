package chap06.Class;

import java.util.Scanner;

class Student{
	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int getTotal() {
		return this.kor+this.eng+this.math;
	}
	double getAverage() {
		return this.getTotal()/3.;
	}
	void showInfo() {
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%d\t%.1f\n",this.name,this.ban,this.no,this.kor,this.eng,this.math,this.getTotal(),this.getAverage());
	}
	
}

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner scan = new Scanner(System.in);
	
	Student[] stdArray = new Student[3];
	
	for(int i = 0; i<stdArray.length; i++) {
	
		System.out.println("학생 정보를 이름, 반, 번호, 국어, 영어, 수학, 순서대로 입력하세요 -->> ");
		
		stdArray[i] = new Student();
		stdArray[i].name = scan.next();
		stdArray[i].ban = scan.nextInt();
		stdArray[i].no = scan.nextInt();
		stdArray[i].kor = scan.nextInt();
		stdArray[i].eng = scan.nextInt();
		stdArray[i].math = scan.nextInt();
		
	}
	
	System.out.println("=============================================================");
	System.out.println("학생이름 반 번호 국어 영어 수학 총점 평균");
	System.out.println("--------------------------------------------------------------");
	
	for(int i = 0; i<stdArray.length; i++) {
		stdArray[i].showInfo();
	}
	System.out.println("===============================================================");
	}

}
