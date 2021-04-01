package Basics;

public class Array_and_Loops {

	public static void main(String[] args) {
		System.out.println("PROGRAM STARTING... Welcome\n");
		// declare and define an array: implicitly defining the size
		String[] cities = {"New York", "San Francisco","Miami", "Dallas"};

		
		//Declare and define the array, ONLY THE SIZE: Explicitly defining the size
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		
		
		//declare an array
		String[] countries;
		
		//define an array
		countries = new String[3];
		countries[0] = "SA";
		countries[1] = "Brazil";
		countries[2] = "China";
	
		
		/*LOOPS:
			do loop: enters the loop THEN tests the condition
			
			while loop: tests the condition first, THEN enters the loop
			
			for loop: best structure for iterating through an array 
		
		*/
		//do loop:
		System.out.println("do loop:");
		int i = 0;
		do {
			System.out.println("City: " + cities[i]);
			i = i + 1;
		}while (i < 4);
		
		
		//while loop:
		System.out.println("\nwhile loop:");
		int n = 0;
		boolean stateFoung = false;
		while (!stateFoung) {
			String state = states[n];
			
			System.out.println(state);
			
			if (state == "Texas") {
				System.out.println("State Found!");
				stateFoung = true;
			}n++;
		}
		
		
		//for loop:
		System.out.println("\nfor loop:");
		for (int x = 0; x < 3; x ++) {
			System.out.println(countries[x]);
		}
		System.out.println("\nPROGRAM ENDING... Thank You");

	}

}
