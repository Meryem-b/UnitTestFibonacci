package fibonacci;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println(Fibonacci.fibonacciDynamic(1000));
		int n = 10;
		for(int i = 0; i <= n; i ++) {
			System.out.println(Fibonacci.fibonacciRecursion(i));
		}
	}

}
