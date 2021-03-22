package chap13.Thread;


class TimerrThread extends Thread{
	
	int n = 0;
	
	@Override
	public void run() {
	
		while(true) {
			
			System.out.println(n);
			n++;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				return;
			}
			
		}
		
	}
	
}


public class TimerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TimerrThread th= new TimerrThread();
		th.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		th.interrupt();
	}

}
