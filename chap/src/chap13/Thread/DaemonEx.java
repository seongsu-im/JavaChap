package chap13.Thread;


class AutoSaveThread extends Thread{

	public void save() {
		System.out.println("�۾� ���� ����..");

	}


	@Override
	public void run() {


		while(true) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
			}

			save();
		}

	}


}



public class DaemonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		AutoSaveThread at = new AutoSaveThread();
		at.setDaemon(true);

		at.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("���ξ����� ����");

	}

}
