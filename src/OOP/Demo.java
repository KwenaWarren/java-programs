package OOP;

// blueprint or template of a person.
class Person {
	String name;
	String email;
	String phone;
	
	//methods
	void readingBook() {
		System.out.println(name + " is reading a book.");
	}
	
	void email() {
		System.out.println(name + "'s email address is: " +email);
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
	
}

public class Demo {
	
	public static void main(String[] args) {
		
		// This process is called Instantiating an object
		Person person1 = new Person();
		
		// Then here we -- define some properties
		person1.name = "kwena";
		person1.email = "kwena@mail.za";
		person1.phone = "0713749379";
		
		// This process is called Abstraction
		person1.readingBook();
		person1.email();
		person1.sleep();
		
		System.out.println("\n.............................\n");
		//create another person: person2.
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.phone = "0761384930";
		person2.sleep();
		
		
	/* Attributes, variables, adjectives, descriptors
	String name = "Kwena";
	String email = "kwena@email.com";
	String phone = "07137499379";
	
	// Action, activity, behavior
	System.out.println(name + " is coding java.");
	System.out.println(name + " is learning Object-Oriented programming.");
	
	// what if we wanted to do this for another person
	String name2 = "Sarah";
	String email2 = "sarah@mail.za";
	String phone2 = " 0657844325";
	
	// Action, activity, behavior
	System.out.println(name2 + " drinking coffee");*/
	
	}
	
}
