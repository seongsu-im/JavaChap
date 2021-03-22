package chap09.Exception;

class Rect {

	int width;
	int height;
	Rect(int width, int height){

		this.width = width; this.height = height;

	}

	@Override
	public boolean equals(Rect r) {
		if(this.width*this.height == r.width*r.height)
			return true;

		else 
			return false;
		
	}

}


	public class RectEx {

		public static void main(String[] args) {
		
//			String str = new String("abc");
//			class clazz = str.getClass();
//			Sytem.out.println(clazz);
//			Sytem.out.println(clazz.getName());
//			Sytem.out.println(clazz.getSimpleName());
			
			
			try {
				Sytem.out.println(clazz);
				Sytem.out.println(clazz.getName());
				Sytem.out.println(clazz.getSimpleName());
				
			}
			
			catch(ClassNotFoundException e) {
				
				Sytem.out.println("해당클래스는 존재하지 않음");
				e.printStackTrace();
			}
			
		}

	}
