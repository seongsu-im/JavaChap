package chap12.Collection;

import java.util.HashMap;
import java.util.Map;



public class MapEx {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1,"�ٳ���");
		map.put(2,"���");
		map.put(3,"������");
		map.put(1,"����"); //Ű�� �ߺ��� ������� �����Ƿ� , ���߿� �߰��� �͸� ����

		for(Map.Entry m : map.entrySet()) {

			System.out.println(m.getKey()+" : " +m.getValue());

		}


		map.remove(1);

		System.out.println("���� �� -------------------------------");
		for(Map.Entry m : map.entrySet()) {

			System.out.println(m.getKey()+" : " +m.getValue());

		}

	}

}
