package chap08.Interface;

class Parent{
	
	static void getData() {
		
		System.out.println("�θ�");
	}
}

class Child extends Parent{
	
	static void getDate() {
		
		System.out.println("�ڽĲ�");
	}
}


public class StaticEx {

	public static void main(String[] args) {
		
		
		Parent p = new Parent();
		p.getData();
		
		Child c = new Child();
		c.getDate();
		
		Parent p1 = new Child();
		p1.getData();
		
	}

}
