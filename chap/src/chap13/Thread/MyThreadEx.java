package chap13.Thread;


class MyThread extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for(int i =0; i<5; i++) {
			
			try {
				Thread.sleep(1000);
				
				System.out.println(i + "��: ������");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
			}
			
		}
		
		
	}
	
	
	
}

public class MyThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MyThread thread = new MyThread();
		thread.start();
		
		for(int i =0; i<5; i++) {
		
		try {
			Thread.sleep(1000);
			System.out.println(i + "��: main ������");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
		}
	}

}
