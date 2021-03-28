package chap12.Collection;


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> alist = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);

		for(int i = 0; i<4; i++) {

			System.out.print("이름을 입력하세요>>");
			alist.add(scan.next());

		}
		for(int i = 0; i<alist.size(); i++) {
			System.out.print(alist.get(i)+" ");
		}


		int longlist = 0;

		for(int i = 1; i<alist.size(); i++) {

			if(alist.get(longlist).length()<alist.get(i).length()) {
		
				longlist = i;
				
			}

		}
		System.out.printf("\n가장 긴 이름은 : %s",alist.get(longlist));
	}	
}