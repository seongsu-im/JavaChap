package chap13.Thread;


class JoinThread extends Thread{
	
	public JoinThread(String name) {
		
		super(name);
	}
	
	@Override
	public void run() {

		for(int i = 0; i<10; i++) {
			
			System.out.println(Thread.currentThread().getName()+ " "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
		
			}
		}
		
	}
	
}


public class joinEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JoinThread t1 = new JoinThread("thread1");
		JoinThread t2 = new JoinThread("thread2");
		t1.start();
		
		try {
			t1.join(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			}
		t2.start();
	}

}
