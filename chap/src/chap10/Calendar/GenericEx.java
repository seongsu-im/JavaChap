package chap10.Calendar;



//class MyClassInt{
//	
//	Integer val;
//	void set(Integer a) {
//		
//		val = a;
//	
//	}
//	
//	Integer get() {
//		
//		return val;
//	}
//	
//}
//
//
//class MyClassString{
//	
//	String val;
//	void set(String a) {
//		
//		val = a;
//	
//	}
//	
//	String get() {
//		
//		return val;
//	}
//	
//	
//}


class MyClass<T>{
	T val;			//Student val;

	MyClass(){

	}

	void set(T a) {   //set(Student a)

		val = a;   //student get()
	}

	T get() {

		return val;
	}

}

class Student{
	public String name;
	public Student(String name) {
		this.name=name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}


}

public class GenericEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass<Integer> my = new MyClass<Integer>();
		my.set(10);
		System.out.println(my.get()); // 10
		my.set(20);
		System.out.println(my.get()); // 20


		MyClass<String> myStr = new MyClass<String>();

		myStr.set("aaa");
		System.out.println(myStr.get());


		MyClass<Student> myStu = new MyClass<Student>();
		myStu.set(new Student("conan")); 
										

		System.out.println(myStu.get()); 	
		
	}

}
