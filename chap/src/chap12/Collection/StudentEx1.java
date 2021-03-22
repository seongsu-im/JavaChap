package chap12.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student1{
	private String name;
	private int id;
	private String phoneNo;
	
	public Student1(String name, int id, String phoneNo) {
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
	
	@Override
	public String toString() {
		return String.format("%s : %d %s", name,id,phoneNo);
	}
	
}

public class StudentEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		HashMap<String,Student1> map = new HashMap<String,Student1>();
		
		System.out.println("�̸� ���̵� ��ȭ��ȣ ������ �Է��Ͻÿ�.");
		for(int i=0; i<4; i++) {
			//��ĵ���� �Է��� �� �� Student Ŭ���� ������ name �ʵ��
			//HashMap�� �Է����ִ� key ���� ���ƾ� �ϹǷ� 
			//String uName���� ���� �������ְ� �� ���� ���� ���ش�.
			String uName = scan.next();
			map.put(uName, new Student1(uName, scan.nextInt(), scan.next()));
		}
		
		System.out.println("��ϵ� �л��� �� : "+map.size());
		
		for(Map.Entry<String, Student1> m : map.entrySet()) {
			System.out.println(m.getValue());
			//��� �Ǵ� ���� toString �޼ҵ尡 �Ǿ�� �ϹǷ� ���� �ҷ���
		}
		
		
	}

}