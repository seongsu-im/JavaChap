package chap09.Exception;

import java.util.Calendar;
import java.util.StringTokenizer;

public class token {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String query = "홍길동/장화/홍련/콩쥐/팥쥐";
		StringTokenizer st = new StringTokenizer(query,"/");
		
	while(st.hasMoreTokens()) {
		
		System.out.println(st.nextToken());
	}
		
	
	}

}
