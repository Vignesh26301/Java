package javatest;

public class Account {
	
	private String accountNumber;
	private double balance;
	
	public Account() {
		this.accountNumber="000000";
		this.balance=0.0;
	}
	public Account(String accountNumber, double intialBalance) {
		this.accountNumber=accountNumber;
		this.balance=intialBalance;
	}
	public void deposit(double amount) {
		if(amount>0) {
			balance +=amount;
			System.out.println("Deposted:$"+ amount);
		} else {
			System.out.println("Deposite amount must be positive.");
		}
	}
	public void Withdraw(double amount) {
		if(amount>0) {
			if (amount<= balance) {
				balance-=amount;
				System.out.println("Withdrew: $"+ amount);
			} else {
				System.out.println("Insufficient funds.");
			}
		} else {
			System.out.println("Withdrawal amount must be positive.");
		}
	}
	
	public double checkBalance() {
		return balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccount(String accountNumber) {
		this.accountNumber=accountNumber;
	}
	public static void main(String[]args) {
		
		Account acc1 = new Account();
		System.out.println("account Number:"+ acc1.getAccountNumber());
		System.out.println("Intial Balance: $"+ acc1.checkBalance());
		
		acc1.deposit(1000.0);
		acc1.Withdraw(250.0);
		System.out.println("intial Balance:$"+ acc1.checkBalance());
		
		Account acc2=new Account("100000",500.0);
		System.out.println("Account Number:"+ acc2.getAccountNumber());
		System.out.println("Intial Balance:$" + acc2.checkBalance());
		
		acc2.deposit(200.0);
		acc2.Withdraw(100.0);
		System.out.println("Balance after transactions:$"+acc2.checkBalance());
	}
}
		
	
