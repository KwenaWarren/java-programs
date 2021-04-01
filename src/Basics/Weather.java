package Basics;

public class Weather {
	public static void main (String[] args) {
		//gives suggestions based on weather prediction/ temperature
		int temperature = 65;
		String sunCondition = "Sunny";
		
		//if statement
		if (temperature > 80) {
			System.out.println("Pleasant day, wear shorts and t-shirts");
		}else if ((temperature > 60) && (sunCondition =="Sunny")) {
			System.out.println("Wear hat, it sunny");
		}else if ((temperature > 50) || (sunCondition == "Overcast")) {
			System.out.println("Cool day, be sure to wear warmer clothes.");
		}else {
			System.out.println("Cold day, wear a jacket");
		}System.out.println("Program is ending");
	}
}
