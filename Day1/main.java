package Day1;

public class main {
	public static void main(String[] args) {
		BankAccount myacc= new BankAccount(1000);
		System.out.println("Opening balance: $" + myacc.getBalance());

 
        myacc.deposit(500);
        System.out.println("New balance: $" + myacc.getBalance());

        myacc.withdraw(200);
        System.out.println("New balance: $" + myacc.getBalance());
    
        myacc.withdraw(1800);
        System.out.println("Remaining balance: $" + myacc.getBalance());
	}

}
