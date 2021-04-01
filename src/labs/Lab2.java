package labs;

public class Lab2 {

	public static void main(String[] args) {
		// create object student
		Student stud1 = new Student("Betty", "12345678");
		stud1.enroll("Java X");
		stud1.enroll("Java Y");
		stud1.payTuition(1300);
		stud1.showCourses();
		stud1.checkBalance();
		System.out.println(stud1.toString());
				
		Student stud2 = new Student("Kwena", "98765432");
		Student stud3 = new Student("Sam", "24680531");
	}

}

class Student {
	// properties
	private static int iD = 10;
	private String userId;
	private String name;
	private String ssn;
	private String email;
	
	private String phone;
	private String city;
	private String state;
	
	private String courses = "";
	private static final double courseCost = 2500;
	private double balance = 0;
	
	// overloading constructor
	public Student(String name, String ssn) {
		iD++;
		
		this.name = name;
		this.ssn = ssn;
		
		setUserId();
		setEmail();
	}

	// method to set email
	private void setEmail() {
		email = name.toLowerCase() + "." + iD+ "@mail.za";
		System.out.println(name + ", your email address is: " + email);
	}
	
	public String getEmail() {
		return email;
	}
	
	//method to set user iD
	private void setUserId() {
		int min = 1000;
		int max = 9000;
		
		int randomNum = (int) (Math.random() * (max - min)); // function to generate random number.
		randomNum = randomNum + min; //making sure the random number is above 1000 --> minimum
		
		userId = iD + ""+ randomNum + ssn.substring(5);
		
		System.out.println("\n" + name + ", your User ID is: " + userId);
	}
	
	//other getters and setters
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
	//method to enroll
	public void enroll(String course) {
		this.courses = this.courses + "\n"+ course;
		System.out.println("Course enrolled: " + course);
		balance = balance + courseCost;
	}

	//method to pay tuition
	public void payTuition(double amount) {
		balance = balance -amount;
		System.out.println(name + "'s payment is: R" + amount);
	}
	
	//method to check balance
	public void checkBalance() {
		System.out.println(name+", your Outstanding Balance is: R" + balance);
	}
	
	//method to show courses
	public void showCourses() {
		System.out.println("\n"+name + ", Enrolled courses: " + courses);
	}
	
	//to String method
	public String toString() {
		return "\n[Name" + name + "\nCourses: " + courses+ "\nBalance Due: " + balance + "]";
	} 
	
}