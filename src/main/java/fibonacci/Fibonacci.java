package fibonacci;

public class Fibonacci {
	
	static int first_term = 0;
	static int second_term = 1;
	
	public static int fibonacciRecursion(int n) {
		
		if(n < 2) {
			return 1;
		}
		else {
			return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
		}
	}
	
	public static int fibonacciDynamic(int n) {
		
		while(second_term > 0) {
			
			int temp = second_term;
			second_term += first_term;
			first_term = temp;
			
			System.out.println(temp + " ");
			
			if(second_term > n) {
				break;
			}
			
		}
		return second_term;
	}

}