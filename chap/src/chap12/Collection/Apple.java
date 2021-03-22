package chap12.Collection;

import java.util.HashMap;
import java.util.Scanner;

public class Apple {

	public static void main(String[] args) {
		
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("love", "사랑");
		map.put("apple", "사과");
		map.put("baby", "아기");
	
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("찾고 싶은 단어는?");
//			String key = scan.next();
//			String value = map.get(key);
//			System.out.println(value);
			
			System.out.println(map.get(scan.next()));
			
		}
		
	}
	
}
