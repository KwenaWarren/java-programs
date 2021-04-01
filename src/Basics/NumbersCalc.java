package Basics;

public class NumbersCalc {
	public static void main(String[] args) {
		//call the name function
		printName();
		
		//variables for: addNumbers function
		int numA = 10;
		int numB = 20;
		
		//call the addNumbers function
		addNumbers(numA, numB);
		
		//call the multipleNummbers function
		System.out.println("\nThe product of: "+numA + " * "+numB + " is: " + mutipleNumbers(numA, numB));
		
		/*or
		 * int product = mutipleNumbers(numA, numB);
		 * System.out.println("\n\nThe product of: "+numA + " * "+numB + " is: " + product);
		 * */
	}
	
	//function: static
	static void printName() {
		String name = "...........Program is Starting...........\nMy name is Kwena";
		System.out.println(name);
	};
	
	static void addNumbers(int numberA, int numberB){
		//add two numbers: get numbers from the main class
		int sum = numberA + numberB;
		
		//print the total/ sum
		System.out.println("\nSum of: NumberA: " + numberA + " NumberB: " + numberB + "\nis: " + sum);
	};
	
	static int mutipleNumbers(int numOne, int numTwo){
		int product = numOne * numTwo;
		
		//can also call function from function. Note: have to call it before the return keyword
		System.out.print("\nCalling FUNCTION from ANOTHER function!!!");
		addNumbers(numOne, numTwo);
		
		return product;
	};
}
