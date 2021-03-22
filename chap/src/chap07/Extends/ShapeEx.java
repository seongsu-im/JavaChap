package chap07.Extends;


abstract class Shape{
	
	Shape(){
		
	}
	abstract double calArea();	
}

class Circle extends Shape{
	double radius;

	Circle(double radius){
		this.radius = radius;
	}

	
	public double calArea() {
		return Math.PI * radius * radius; 
	}
}
class Rectangle extends Shape{
	double width, height;
	
	Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	public double calArea() {
		return width * height;
	}
}

public class ShapeEx {

	public static void main(String[] args) {
		double sum = 0.0;
		Shape[] a = {new Circle(5.0), new Rectangle(3,4),new Circle(1)};
		
		for(int i = 0 ; i < a.length ; i++) {
			
			sum += a[i].calArea(); // ������ �ձ��ϱ�
		}
		
		System.out.println("������ ��: " +sum);

	}

}
