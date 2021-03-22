package chap07.Extends;


class Animal{

	public void makeSound() {

		System.out.print("�Ҹ�����\n");
	}
}

	class Dog extends Animal{
		public void makeSound() {
		System.out.print("�۸� �Ҹ�����\n");
		}
	}

	class Cat extends Animal{
		public void makeSound() {
		System.out.print("�Ŀ� �Ҹ�����\n");
		}
	}
	class Mouse extends Animal{
		public void makeSound() {
		System.out.print("���� �Ҹ�����\n");
		}
	}



	public class AnimalEx {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

//			Animal d = new Dog();
//			Animal c = new Cat();
//			Animal m = new Mouse();
//			d.makeSound();
//			c.makeSound();
//			m.makeSound();
		
			
			Animal[] aArray = {new Dog(), new Cat(), new Mouse()};
			for(int i = 0; i<aArray.length; i++) {
				
				aArray[i].makeSound();
				
			}
			
		}

	}
