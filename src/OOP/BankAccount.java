package OOP;

//bank account BLUEPRINT
public class BankAccount implements IRate {
	// static variable
	private static final String routingNumber = "028144"; // static means: this variable belongs to the class not any other particular class, final static means: it cannot be changed
	
	//instance variables
	String accountNumber;
	private String name = "Luke";
	private String ssn; //social security number
	String accountType;
	double balance = 0;
	
	/*Constructor:
	 * is used define, setup, initialize properties of an object
	 * Implicitly called upon instantiation --> called automatically
	 * is the same name as the class itself
	 * have no return type
	 * we can have any number of constructors
	 */
	
	BankAccount(){
		System.out.println("Default --> Constructor example: \nNew Account Created.");
	}
	
	// overloading constructor: call same method with different  arguments
	BankAccount(String accounttype){
		System.out.println("\nOverload --> Construtor example: \nNew Account Created: " + accounttype);
	}
	
	// another overload constructor
	BankAccount(String accounttype, double initdeposit){
		//Local variables: initdeposit | accounttype | msg
		
		System.out.println("\nAnother Overload --> Constructor example: \nNew Account Created: " + accounttype);
		System.out.println("Initial Deposit: R" + initdeposit);
		
		//if statement: to validate if the initial deposit is not less than R1 000 000
		String msg = null;
		if (initdeposit < 1000000) {
			msg = "ERROR: The Minimum Deposit is a Million.";
		}else {
			msg = "\nThanks for your initial deposit of: R" + initdeposit + "\nCongradulations you're a Millionaire";
		}
		System.out.println(msg);
		balance = balance + initdeposit;
	}
	
	// Encapsulation: Getters & Setters
	
		//allow the user to define the name
	public void setName(String _name) {
		this.name = "Mr. " + _name;
	}
	
		//allow the user to receive name
	public String getName() {
		return name;
	}
		
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	// interface methods
	public void setRate() {
		System.out.println("Set Rate");
	}
	
	public void increaseRate() {
		System.out.println("Increase Rate.");
	}

	//methods
	void deposit(double amount) {
		balance = balance + amount;
		showActivity("Deposit: R" + amount);
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("Withdraw: R" + amount);
	}
	
	// Private method: can ONLY be called from the class.
	private void showActivity(String activity) {
		System.out.println("\n............Showing recent acitivity............ \n" + activity);
		System.out.println("New balance: R" + balance);
	}
	
	//access balance
	void checkBalance() {
		System.out.println("Your Balance is: R" + balance);
	}
	
	void getStatus() {}
	
	
	//to string method
	@Override
	public String toString(){
		return "\ntoString Method..........."+"\n[Name: " + name + "\nAccount Number: " + accountNumber + "\nRouting Number: " + routingNumber + "\nAccount Type: " + accountType + "\nBalance: R" + balance + "]";
	}
}
