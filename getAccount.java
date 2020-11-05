package getAccount;

import java.util.Date;

public class getAccount {
	public static void main(String[] args) {
		getAccount account=new getAccount(1122,20000);
		account.setannualInterestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("Balance: "+account.getbalance()+"\n"
				+"Monthly Interest Rate: "+account.getMonthlyInterestRate()+"\n"
				+"Date Created: "+account.getdateCreated());

	}
	
	private int id=0;
	private double balance=0;	
	private double annualInterestRate=0;
	private Date dateCreated; 
	
	public Account() {
		dateCreated=new Date();
	}
	
	public getAccount(int id, double balance) {
		this.id=id;
		this.balance=balance;
		dateCreated=new Date();
	}
	
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id=id;
	}
	public double getbalance() {
		return balance;
	}
	public void setbalance(double balance) {
		this.balance=balance;
	}
	public double getannualInterestRate() {
		return annualInterestRate;
	}
	public void setannualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public Date getdateCreated() {
		return dateCreated;
	}
	public double getMonthlyInterestRate() {
		double MonthlyInterestRate = annualInterestRate/12;
		return balance*MonthlyInterestRate/100;
	}
	public void withdraw(double money) {
		balance-=money;
	}
	public void deposit(double money) {
		balance+=money;
	}
		

}
