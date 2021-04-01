package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("09372345", 1000);
		acc1.setName("Leka");
		System.out.println("Name: " + acc1.getName());
		acc1.makeDeposit(4000);
		acc1.makeDeposit(2500);
		acc1.makeDeposit(700);
		acc1.payBill(6000);
		acc1.accrue();
		System.out.println(acc1.toString());
		
		//BankAccount acc2 = new BankAccount("53485468", 3000);
		//BankAccount acc3 = new BankAccount("56423222", 500);

	}

}

// bank account class
class BankAccount  implements IInterest{
	
	//properties of bank account
	private static int iD = 1000; // unique internal iD: separate way to identify users.
	private String accountNumber; //combination of iD + 2-digit random number + first 2 characters of SSN
	private static final String rountingNumber = "0036572254"; //can't be changed
	private String name;
	private String SSN;
	private double balance;
	
	//constructors
	public BankAccount(String _SSN, double _deposit) {
		balance = _deposit;
		
		//set the SSN
		this.SSN = _SSN;
		
		System.out.println("SSN " + SSN);
		
		//increment iD
		iD++;
		setAccountNumber();
	}
	
	// automatically generate the account number in the background.
	private void setAccountNumber() {
		//use a function: MATH
		int random = (int) (Math.random() * 100);
		
		accountNumber = iD + "" + random + SSN.substring(0,1);
		System.out.println("Account Number: " + accountNumber);
	}
	
	//set name
	public void setName(String _name) {
		this.name = _name;
	}
	
	//return name
	public String getName() {
		return name;
	}
	
	//pay bill method
	public void payBill(double amount) {
		System.out.println("Paying bill: " + amount);
		balance = balance - amount;
		showBalance();
	}
	
	//deposit method
	public void makeDeposit(double amount) {
		System.out.println("Making a Deposit: " + amount);
		balance = balance + amount;
	}
	
	//show balance method
	public void showBalance() {
		System.out.println("\nBalance: " + balance);
	}
	
	//accrue interest method
	@Override
	public void accrue() {
		//the rate is coming from the Interface class: IInterest
		balance = balance * (1 + rate/100);
		showBalance();
	}
	
	//to string method
	@Override
	public String toString() {
		return "\n[Name: " + name+ "]\n[Account Number: " + accountNumber + "]\n[Rounting Number: " + rountingNumber +"]" + "\n[Balance: " + balance + "]";
	}
	
}