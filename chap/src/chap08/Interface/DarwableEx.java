package chap08.Interface;


interface Printable{
	
	void print();
	
}

interface Showabel{
	
	void show();
}

class B implements Printable, Showabel{
	
@Override
	public void show() {
		// TODO Auto-generated method stub
	System.out.println("Hello")	;
	}

@Override
	public void print() {
		// TODO Auto-generated method stub
	System.out.println("Welcome")	;
	}

}

class C extends B implements Printable{
	
	public void print() {
		
		System.out.println("Hello");
	}
	
}
public class DarwableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b = new B();
		b.show();
		b.print();
		
		
	}

}
