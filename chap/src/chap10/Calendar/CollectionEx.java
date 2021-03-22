package chap10.Calendar;

import java.util.ArrayList;

public class CollectionEx {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		 
		al.add("Hello");  //0
		al.add("Hi");	  //1
		al.add("Java");   //2
		al.add("���");    //3
		al.add(2, "aaa"); //����
		
	
		for(int i =0; i<al.size(); i++) {
			
			System.out.println(al.get(i));
		}
		
		System.out.println("==========================���� for");
		for(String str : al) {
			
			System.out.println(str);
			
		}
		
		
		
//		System.out.println(al.get(2));
//		
//		
//		ArrayList<Integer> al1 = new ArrayList<Integer>();
//		
//		al1.add(1);
//		al1.add(3);
//		al1.add(100);
//		al1.add(5);
//		
//		System.out.println(al1.get(2));
//		
	}

}
