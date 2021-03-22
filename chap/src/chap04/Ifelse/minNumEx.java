package chap04.Ifelse;

public class minNumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int i = 1;
//		int sum = 0;
//		
//		while(i<=10) {
//			
//			sum += i;
//			
//			i++;
//		}
//		
//		System.out.println(sum);
		
		
	// 0 ~ 100까지 정수 중 3과 8의 공배수와 최소 공배수를 출력
		
		
		int num = 1;
		int mininum = 0;
		
		
		while(num<=100) {
			
			if(num%3 == 0 && num%8==0) {
				
				System.out.printf("공배수 : %d\n",num);
			
				if(mininum==0) {
					
					mininum=num;
				}
			}
		
	
			num++;
		}
		
		System.out.printf("최소공배수 : %d",mininum);
	}

}
