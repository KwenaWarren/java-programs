package Basics;

public class Cities {

	public static void main(String[] args) {
		System.out.println("PROGRAM STARTING...\n");
		// declare and define an array: implicitly defining the size
		String[] cities = {"New York", "San Francisco","Miami", "Dallas"};
		
		//print
		/*System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);*/
		System.out.println("declare and define an array: implicitly defining the size");
		for(int i = 0; i <4; i++) {
			System.out.println("City: " + cities[i]);
		}
		
		//Declare and define the array, ONLY THE SIZE: Explicitly defining the size
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		
		//print
		/*System.out.println(states[0]);
		System.out.println(states[1]);
		System.out.println(states[2]);
		System.out.println(states[3]);
		System.out.println(states[4]);*/
		System.out.println("\n" + "Declare and define the array, ONLY THE SIZE: Explicitly defining the size");
		for(int x = 0; x < 5; x++) {
			System.out.println("State: " + states[x]);
		}
		
		//declare an array
		String[] countries;
		
		//define an array
		countries = new String[3];
		countries[0] = "SA";
		countries[1] = "Brazil";
		countries[2] = "China";
		/*System.out.println(countries[0]);
		System.out.println(countries[1]);
		System.out.println(countries[2]);*/
		System.out.println("\n" + "Declare and later define the array ");
		for(int y = 0; y <3; y++) {
			System.out.println("Country: " + countries[y]);
		}
		System.out.println("\nPROGRAM ENDING...");
	} 

}
