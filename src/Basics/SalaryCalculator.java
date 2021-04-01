package Basics;

public class SalaryCalculator {
	public static void main (String[] args) {
		//variable that defines career
		String career;
		System.out.println("Program is starting.");
		
		//define variables
		career = "Software Developer";
		System.out.println("\nMy career is: " + career);
		
		//declare and define variables
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 420.50;
		double salary = (hoursPerWeek * weeksPerYear * rate);
		
		System.out.println("\nMy salary as a " + career + " at the rate of R" + rate + " per hour is R" + salary + " per year.");
		
		//calculate annual salary: rate * hoursPerWeek * weeksPerYear
		
		//
		
	}
}
