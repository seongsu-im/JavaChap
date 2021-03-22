package chap12.Collection;

import java.util.*;
public class hashSetEx {

	public static void main(String[] args) {

		
		HashSet<String> set = new HashSet<String>();
		   
		set.add("�ڳ�");
		set.add("���");
		set.add("�̶�");
		set.add("Ű��");
		set.add("��Ž��");
		set.add("���");
		
		Iterator<String> it = set.iterator();	//��̸� 2�� �߰������� set�� �ߺ� ���� �ȵǸ� HashSet�� ����������� �����
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
	}

}
