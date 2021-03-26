package chap06.Class;

public class AccounttEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Accountt acc = new Accountt();
		
		acc.accountNo=11111;
		acc.name="코난";
		acc.balance=10000;
		
		
		System.out.println("------------------------------------------");
		acc.display();
		System.out.println("------------------------------------------");
		acc.withdraw(20000);
		 acc.checkBalance();
		acc.deposit(30000);
		acc.checkBalance();
		acc.withdraw(1500);
		acc.checkBalance();
	}

}
