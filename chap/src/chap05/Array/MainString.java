package chap05.Array;

public class MainString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if("http://dev.hamletshu.com".equals(System.getenv("API_URL"))) {
			//개발 서버일 경우 돌아가는 로직
		}else {
			//운영 서버일 경우 돌아가는 로직
		}
		
		if(args.length ==2) {
			
			int i = Integer.parseInt(args[1]);
			nPrintln(args[0],i);
			
		}else
			
		System.out.println("입력 정보 오류!");
		
	}

	public static void nPrintln(String s, int n) {
		
		for(int i =0; i<n; i++)
		System.out.println(s);
	}
	
}
