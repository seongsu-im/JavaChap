package chap09.Exception;

class Point{
	
	int x,y;
	public Point(int x, int y) {
		
		this.x = x; this.y = y;
	}
	
	public String toSting() {
		
		return "Point(" + x + " ," + y + ")";
	}
	
}



public class objectEx {
	
	
	public static void main(String[] args) {
	
		Point P = new Point(2,3);
		System.out.println(P);
		
	}

}
