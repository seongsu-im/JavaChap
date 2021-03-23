package chap04.Ifelse;

public class ContinueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num = 0;
		for(int i =1; i<=100; i++) {
			
			if(i%2==1) {
				
				continue;
				
			}
			
			else {
				
				num += i;
											
			}
			
						
		}

		System.out.printf("1부터 100까지 짝수의 합은 %d",num);
		
	}

}
