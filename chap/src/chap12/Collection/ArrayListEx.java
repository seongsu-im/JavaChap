package chap12.Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
			
	
		ArrayList<String> al = new ArrayList<String>();
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<4; i++) {

		System.out.print("�̸��� �Է��ϼ���>>");
		al.add(scan.next());	
						
		}
		for(int i = 0; i < al.size(); i++) {
			
		
			System.out.print(al.get(i) + " ");
			
		}
		
		String longlist = al.get(0);
		
		for(int i = 0; i < al.size(); i++) {
			
			if(longlist.length()>al.get(i+1).length()) {
				
								
			}
			
			else {
				
				longlist = al.get(i+1);
				
			}
			
			System.out.println("���� �� �̸��� --> " +longlist);
			
		}
	}
			
}
