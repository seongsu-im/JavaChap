package chap12.Collection;

import java.util.HashMap;
import java.util.Map;

class Student{

	public String name;
	public int score;
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	@Override
	public String toString() {
		return String.format("%s : %d", name, score);
	}
}


public class StudentEx {

	public static void main(String[] args) {

		HashMap<Integer, Student> map = new HashMap<Integer, Student>(); 
		
		//key���� ���ڵ� �ǰ� String �־��
		//�ڱ� ������� ����
		//������ value ���ڴ� ������ ������ 
		//Student1 Ŭ���� ���
		
		map.put(1, new Student("kid", 55) ); 
		map.put(2, new Student("conan", 30) );
		map.put(3, new Student("rose", 100) );
		map.put(4, new Student("ran", 90) );

		System.out.println("HashMap�� ��� ���� : " + map.size());

		for(Map.Entry<Integer, Student> m : map.entrySet()) {
			//�� for���� �����ϱ� ������µ� ������ ������ map �� ������
			//Map.Entry<Integer, Student1> �̶�� ���Ŀ� �´� m�̶��
			//���� �ȿ� �����ϴ� �� ���� �׸��� (key , value) ���� 
			//���� �� �������� �ݺ����ε�
			System.out.println(m.getValue());
		}

	}

}