package OOP;

public class BankAccountApp {

	public static void main(String[] args) {
		// creating a new bank account ---> by Instantiating an object
		//BankAccount acc1 = new BankAccount();
		
				//POLYMORPHISM through overload constructors
		//another bank account
		//BankAccount acc2 = new BankAccount("Savings Account"); //called only: when the argument is of type -- String
		
		//another bank account that takes two arguments
		BankAccount acc3 = new BankAccount("Cheque Account", 1000);
		/*acc3.accountNumber = "1587225164";
		acc3.checkBalance();*/
		acc3.accountNumber = "158 722 5164";
		
		System.out.println("\nDefault Name: "+acc3.getName());
		acc3.setName("Warren Mongatane");
		System.out.println("\nFull Name: "+acc3.getName());
		acc3.setSsn("8573235");
		System.out.println("SSN: " + acc3.getSsn());
		
		acc3.balance = 5000;
		acc3.accountType = "Cheque Account";
		
			// POLYMORPHISM through overriding
		//System.out.println(acc3.toString());
		
		//interface methods
		acc3.setRate();
		acc3.increaseRate();
		
		acc3.deposit(3000);
		acc3.deposit(4000);
		acc3.deposit(5000);
		acc3.withdraw(5500);
		
		//demo for inheritance
		/*CDAccount cd1 = new CDAccount();
		cd1.name = "Kwena Mongatane";
		cd1.balance = 2000000;
		cd1.accountNumber = "158 722 5164";
		cd1.accountType = "CD Account";
		cd1.compount();
		System.out.println(cd1.toString());*/
	}

}
