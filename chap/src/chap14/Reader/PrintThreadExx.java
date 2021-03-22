package chap14.Reader;

import java.util.concurrent.SynchronousQueue;

class PrintTable{

	synchronized public void printTable(int n) {

		System.out.println(n+ "�� ���");
		for(int i=1; i<10; i++) {

			System.out.printf("%d * %d = %d\n",n,i,n*i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}
	}

}



class PrintThread extends Thread{

	PrintTable pt;
	int n;
	PrintThread(PrintTable pt, int n){

		this.pt=pt;
		this.n = n;
	
	}
	
	@Override
	public void run() {
	pt.printTable(n);
	}

}



public class PrintThreadExx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintTable pt = new PrintTable();
		PrintThread  th1 = new PrintThread(pt,2);
		PrintThread  th2 = new PrintThread(pt,5);
		th1.start();
		th2.start();
		
	}

}
