package chap07.Extends;

import java.util.Collections;
import java.util.LinkedList;

public class CollectionsEx {

	public static void main(String[] args) {


		LinkedList<String> myList = new LinkedList<String>();
		myList.add("Ʈ��������");
		myList.add("��Ÿ����");
		myList.add("��Ʈ����");
		myList.add(0,"�͹̳�����");
		myList.add(2,"�ƹ�Ÿ");
		for(String str : myList) {

			System.out.printf("%s",str);
			System.out.println();
			Collections.sort(myList);
		}

		for(String str : myList) {

			System.out.printf("%s",str);
			System.out.println();
			Collections.reverse(myList);
		}
		for(String str : myList) {

			System.out.printf("%s",str);
		}
	}


}
