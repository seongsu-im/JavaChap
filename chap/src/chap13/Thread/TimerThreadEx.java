package chap13.Thread;


class TimerThread extends Thread{

	int n = 0;

	@Override
	public void run() {
		super.run();

		while(true) {

			System.out.println(n);
			n++;

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
			}


		}

	}	
}


public class TimerThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		TimerThread timer = new TimerThread();

		timer.start();

	}

}
