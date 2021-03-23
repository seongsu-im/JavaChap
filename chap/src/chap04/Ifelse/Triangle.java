package chap04.Ifelse;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double width = 0;
		double height = 0;
		
		while(true) {
			
			width = width+2;
			height = height+3;
			
			
			if(width*height/2>150) {
				
				break;
			}
			
			System.out.printf("삼각형의 넓이 : %.1f\n",width*height/2);
			
		}
		
	}

}
