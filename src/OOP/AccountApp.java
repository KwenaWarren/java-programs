package OOP;

public class AccountApp {

	public static void main(String[] args) {
		// Overriding example
		LoanAccount la1 = new LoanAccount();
		la1.increaseRate();
		la1.setRate();
		la1.setTerm(20);
		la1.setAmmortSchedule();
		
		// Polymorphism as well: changing where we're pointing
		IRate account1 = new LoanAccount();
		account1.increaseRate();
		account1.setRate();
			
	}

}
