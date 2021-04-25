package main;

import main.Account;

public class Account {

	
	private String accountId;
	private int pwd;
	private String name;
	private int balance=0;
	
	public Account() {
		super();
	}
	
	

	public Account(String accountId, int balance) {
		super();
		this.accountId = accountId;
		this.balance = balance;
	}




	public Account(String accountId, int pwd, int balance) {
		super();
		this.accountId = accountId;
		this.pwd = pwd;
		this.balance = balance;
	}




	public Account(String accountId, int pwd, String name, int balance) {
		super();
		this.accountId = accountId;
		this.pwd = pwd;
		this.name = name;
		this.balance = balance;
	}



	public String getAccountId() {
		return accountId;
	}



	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}



	public int getPwd() {
		return pwd;
	}



	public void setPwd(int pwd) {
		this.pwd = pwd;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}


	public int deposit(int amount) {
		System.out.printf("%s님이 %d원을 입금하였음\n", name, amount);
		return balance+=amount; //balance = balance+amount
	}
	public int withdraw(int amount) {
		if(balance>=amount){
			balance -=amount;
			System.out.printf("%s님이 %d원을 출금하였음\n", name, amount);
		}else {
			System.out.printf("출금액이 잔액초과");
		}
		return balance;
	}
	public int transferTo(Account another, int amount) {
	
		if(balance>=amount){
			balance -=amount;
			another.balance+=amount;//상대계좌는 +(플러스)
			System.out.printf("%s님이 %s님에게 %d원을 송금하였음\n", name, another.name, amount);
		}else {System.out.printf("송금액이 잔액초과\n");
		}
		return balance;
	}
	

	@Override
	public String toString() {
		return String.format("Account[accountId=%s,pwd=%d,name=%s,balance=%d]",accountId,pwd,name,balance);
	}
	
	
	
	
}
