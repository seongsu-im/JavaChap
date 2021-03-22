package chap09.Exception;

public class Exex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.print("2와 3의 합은" + sum(2,3));
	}
	
	public static int sum(int i1,int i2) {
		
		int sum = 0;
		for(int i = i1; i<=i2; i++) 
			
			sum = sum+i;
			return sum;
		}
		
	}
	

