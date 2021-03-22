package chap12.Collection;

import java.util.*;

public class PointEx {
	public static void main(String[] args) {
	class Point{
		
		private int x;
		private int y;
		public Point(int x, int y) {
			this.x =x; this.y=y;
			
		}
		
		public String toString() {
			return String.format("Point(%d,%d)",x,y);
		}
		
			
	}
			
		ArrayList<Point> al = new ArrayList<Point>();
		al.add(new Point(2,3));
		al.add(new Point(3,4));
		al.add(new Point(1,-6));
		
		for(int i =0; i<al.size(); i++) {
			
			System.out.println(al.get(i));
		}
	}
}
