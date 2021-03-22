package chap07.Extends;

public class Student {

	
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
	
		return this.getTotal()/3.0;
	
	}
	
	void showInfo() {
		
		System.out.printf("%s %d %d %d %d %d %d %.1f\n",this.name,this.ban,this.no,this.kor,this.eng,this.math,this.getTotal(),this.getAverage());
		
	}
	
}
