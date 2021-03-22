package chap12.Collection;

import java.util.*;

public class ListEx {

	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("�ڳ�");
		list.add("���");
		list.add("�̶�");
		list.add("�ڳ�");

		for(String str: list) {
		System.out.println(str);
		}
	
		HashSet<String> set = new HashSet<String>();
	
		set.add("Ű��");
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			
			System.out.println(it.next());
		}
		
	}

}
