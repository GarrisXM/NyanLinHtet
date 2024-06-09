package Day1;

public class BankAccount {
	private double balance;


	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}
	public double getBalance() {
		return balance;

	}
	public void deposit(double amount) {
		System.out.println("Deposit amount:" + amount);
		balance+=amount;
	}
	
	public void withdraw(double amount) {
		if (balance> amount) { 
			balance-=amount;
			System.out.println("Withdraw amount:" + amount);
		}
		else {
			System.out.println("Error...");
		}
		
			
			
	}
	
}

