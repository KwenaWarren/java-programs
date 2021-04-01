package Basics;

public class Strings {

	public static void main(String[] args) {
		String validateEmail;
		//String charActa = "@";
		validateEmail = "kwena@gmail.com";
		
		//evaluate
		if (validateEmail.contains("@")) {
			System.out.println("The email address is valid");
			System.out.println("Your email is: " + validateEmail);
		}
		
		//second example: case sensitivity
		String name = "KWENA";
			
		//	evalulate: if the name exists
		if (name.equalsIgnoreCase("kwena")) {
			System.out.println("\nName found: " + name);
		}
		
		//other string methods: print the - initials and last four digits of IDnumber
		String firstName = "Kwena";
		String lastName = "Mongatane";
		String iDnumber = "9604175845080";
		
		//print
		System.out.println("\nString Method API\n");
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0, 1));
		System.out.println(iDnumber.substring(9));
		
		String gender = iDnumber.substring(6, 10); // find the gender using the idnumber. Hint: 
		
		/*A RSA ID number has 13 digits
		 * first 6 digits (YYMMDD): are based on birthday
		 * next 4 digits define the gender. female: 0000-4999, male: 5000 - 9999
		 * next digit classify citizenship. 0: born in RSA, 1: permanent resident
		 */
		System.out.println("\nFinding the gender of a RSA citizen using the ID number....");
		//960417 5845 080
		
		System.out.println("Substring of gender: " + gender.length());
		
		/*if (iDnumber.substring(6, 10) => 5000) {
			System.out.println("\nGender of "+ iDnumber + " is: Male" );
			
		}else if(gender.length() < 4999) {
			System.out.println("\nGender of " + iDnumber + " is: Female " );
		}else {
			System.out.println("Gender Undefined.");
		}	*/
	}

}
