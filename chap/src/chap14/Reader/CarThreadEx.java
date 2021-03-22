package chap14.Reader;

import java.util.Random;

class SharedCar{

	public synchronized void drive(String name, String destination) {

		System.out.println(name + "���� �������� ����");
		Random r = new Random();
		for(int i = 0; i<r.nextInt(3)+1; i++) {

			System.out.println(name + "���� �������� ������");
			
		}
			System.out.println(name + "����" + destination + "�� ��������");
		
	}

}


class CarThead extends Thread{

	private String driver;
	private	SharedCar car;
	private String destination;

	public CarThead(String driver, SharedCar car, String destination) {
		super();
		this.driver = driver;
		this.car = car;		
		this.destination = destination;
	}

	public void run() {

		car.drive(driver, destination);
	}

}


public class CarThreadEx {

	public static void main(String[] args) {

		SharedCar car = new SharedCar();
		new CarThead("�ڳ�",car, "����").start();
		new CarThead("���",car, "�λ�").start();
		new CarThead("�̶�",car, "����").start();

	}

}
