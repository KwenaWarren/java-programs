package labs;

public class FibonnaciApp {

	public static void main(String[] args) {
		//Fibonnaci number is defined by the sum of the 2 previous fibonnaci numbers
		/*
		 * fib(0) = 0
		 * 
		 * fib(1) = 1
		 * 
		 * fib(2) = fib(1): 1 + fib(0): 0 = 1
		 * 
		 * fib(3) = fib(2): 1 + fib(1): 1 = 2
		 * 
		 * fib(4) = fib(3): 2 + fib(2): 1 = 3
		 * 
		 * fib(5) = fib(4): 3 + fib(3): 2 = 5
		 * 
		 * fib(6) = fib(5): 5 + fib(4): 3 = 8
		 * 
		 * fib(7) = fib(6): 8 + fib(5): 5 = 13
		 * 
		 * fib(8) = fib(7): 13 + fib(6): 8 = 21
		 * 
		 * fib(9) = fib(8): 21 + fib(7): 13 = 34
		 * 
		 * fibi(10) = fib(9): 34 + fib(8): 21 = 55
		 */
		
		//print
		int x = 6;
		System.out.println(fib(x));

	}
	
	//fibonnaci method: by using recursion
	public static int fib(int n) {
		if (n == 0) {
			return 0;
		
		}else if (n == 1) {
			return 1;
		}
		
		return (fib(n-1) + (fib(n-2)));
	}

}
