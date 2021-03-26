package chap06.Class;

public class Accountt {

	
	int accountNo;
	String name;
	double balance;
	
	void insert(int a, String n, double amnt) {
		
		this.accountNo = a;
		this.name = n;
		this.balance = amnt;
	}
	
	
	void deposit(double amnt) {
		
		 balance += amnt;
		
	}
	
	
	void withdraw(double amnt) {
		
		if(balance<amnt) {
			
			System.out.println("잔액이 부족하여 출금할 수 없음!");
		
		}
		
		else {
			
			balance -= amnt;
			
		}
				
	}
	
	void checkBalance() {
		
		System.out.printf("%s님의 잔액은 %.1f원 입니다.\n",name,balance);
		
	}
	
	void display() {
		
		System.out.printf("계좌번호: %d\n 예금주: %s\n 잔액 : %.1f원\n",this.accountNo,this.name,this.balance);
		
	}
	
}
