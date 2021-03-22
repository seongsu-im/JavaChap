package chap13.Thread;


class PriorityThread extends Thread{

	public PriorityThread(String name) {
		super(name);
	}

	public void run() {

		for(int i =0; i<50; i++) {
			
			System.out.print(i+"��°");
			System.out.print("�������� ������ �̸�:" + Thread.currentThread().getName());
			System.out.println("--> ������ �켱 ����: " + Thread.currentThread().getPriority());
			
		}
		
	}

}


public class PriorityEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityThread p1 = new PriorityThread("����");
		PriorityThread p2 = new PriorityThread("�߰���");
		PriorityThread p3 = new PriorityThread("����");
		
		p1.setPriority(Thread.MAX_PRIORITY);
		p2.setPriority(Thread.NORM_PRIORITY);
		p3.setPriority(Thread.MIN_PRIORITY);
		p1.start();
		p2.start();
		p3.start();
		
	}

}
