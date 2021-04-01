package OOP;

// inherits the object class
public class CDAccount extends BankAccount implements IRate {
	//this is a sub-class
	
	String interestRate;
	
	void compount() {
		System.out.println("Compounding interest.");
	}
	
	//default constructor
	public CDAccount() {
		
	}
}
