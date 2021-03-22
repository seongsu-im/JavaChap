package chap08.Interface;


public interface Soundable{
	
	String sound();
	
}

public class SoundableEx {

	public static void printSound(Soundable soundable) {
		// TODO Auto-generated method stub

		
		
	}
	
	public static void main(String[] args) {
		
		printSound(new Cat());
		printSound(new Dog());
		
		
		
	}
	

}
